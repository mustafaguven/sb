package com.timboict.saglikbakanligi;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.nispok.snackbar.Snackbar;
import com.nispok.snackbar.enums.SnackbarType;
import com.timboict.saglikbakanligi.cache.SBData;
import com.timboict.saglikbakanligi.enums.GirisTipi;
import com.timboict.saglikbakanligi.manager.LoginManager;
import com.timboict.saglikbakanligi.model.User;
import com.timboict.saglikbakanligi.service.ResponseListener;
import com.timboict.saglikbakanligi.service.Retrofit;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by mustafaguven on 17.05.2015.
 */
public class LoginActivity extends BaseActivity {

    @InjectView(R.id.chooseRel)
    LinearLayout lnLoginType;

    @InjectView(R.id.loginRel)
    LinearLayout loginRel;

    @InjectView(R.id.textUserName)
    EditText txtUsername;

    @InjectView(R.id.textUserPassword)
    EditText txtPassword;

    @InjectView(R.id.seciniztv)
    TextView lblSeciniz;

    private LoginManager loginManager = null;
    private GirisTipi mGirisTipi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.login);
        ButterKnife.inject(this);
        loginManager = new LoginManager(this);
        registerForContextMenu(lnLoginType);
        if(SBData.getUser()!=null){
            lblSeciniz.setText(getResources().getString(SBData.getUser().getGirisTipi() == GirisTipi.ICME_SUYU_ISLEMLERI ?
                    R.string.icme_suyu_islemleri : R.string.ambalajli_su_islemleri));
            onClicked_Login();
        }
    }

    @OnClick(R.id.loginRel)
    public void onClicked_Login() {
        if (validated()) {
            showProgress();

            loginManager.login(txtUsername.getText().toString(), txtPassword.getText().toString(), new ResponseListener<User>() {
                @Override
                public void onSuccess(User user) {
                    Retrofit.clear(); // authenticated builder icin madapter'ın yeniden yaratılması gerekli
                    user.setGirisTipi(mGirisTipi);
                    SBData.setUser(user);
                    startActivity(new Intent(LoginActivity.this, IKBSActivity.class));

                }

                @Override
                public void onFailure(Exception e) {

                }
            });
        }
    }

    @OnClick(R.id.chooseRel)
    public void onClicked_LoginType(View view) {
        openContextMenu(view);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.add(getResources().getString(R.string.icme_suyu_islemleri));
        menu.add(getResources().getString(R.string.ambalajli_su_islemleri));
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if (item.getTitle().toString().contentEquals("İçme Suyu İşlemleri")) {
            lblSeciniz.setText("İçme Suyu İşlemleri");
            //menuChooseItem = 1;
        }
        if (item.getTitle().toString().contentEquals("Ambalajlı Su İşlemleri")) {
            lblSeciniz.setText("Ambalajlı Su İşlemleri");
            //menuChooseItem = 2;
        }
        return super.onContextItemSelected(item);
    }

    private boolean validated() {
        String error = "";
        if (TextUtils.isEmpty(lblSeciniz.getText().toString())
                || lblSeciniz.getText().toString().contentEquals(getResources().getString(R.string.secim_yapiniz))) {
            error += "Giriş tipi seçilmedi. ";
        } else {
            mGirisTipi = lblSeciniz.getText().toString().contentEquals(getResources().getString(R.string.icme_suyu_islemleri)) ? GirisTipi.ICME_SUYU_ISLEMLERI : GirisTipi.AMBALAJLI_SU_ISLEMLERI;
            SBData.setGirisTipi(mGirisTipi);
        }

        if (TextUtils.isEmpty(txtUsername.getText().toString())) {
            error += "Kullanıcı adı belirtilmedi. ";
        }
        if (TextUtils.isEmpty(txtPassword.getText().toString())
                || txtPassword.getText().toString().contentEquals(getResources().getString(R.string.password_hint))) {
            error += "Şifre belirtilmedi.";
        }

        if (!TextUtils.isEmpty(error)) {
            Snackbar.with(getApplicationContext())
                    .type(SnackbarType.MULTI_LINE)
                    .color(Color.RED)
                    .text("Hata: " + error)
                    .show(this);
        }
        return TextUtils.isEmpty(error);
    }
}
