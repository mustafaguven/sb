package com.timboict.saglikbakanligi;

import android.graphics.Color;
import android.os.Bundle;
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
import com.timboict.saglikbakanligi.manager.LoginManager;
import com.timboict.saglikbakanligi.model.User;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by mustafaguven on 17.05.2015.
 */
public class LoginActivity extends ActionBarActivity {

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

    LoginManager loginManager = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        ButterKnife.inject(this);
        loginManager = new LoginManager();
        registerForContextMenu(lnLoginType);
    }

    @OnClick(R.id.loginRel)
    public void loginClicked(View view) {
        if (validated()) {
            loginManager.getApi().login(txtUsername.getText().toString(), txtPassword.getText().toString(), new Callback<User>() {
                @Override
                public void success(User user, Response response) {
                    Snackbar.with(getApplicationContext())
                            .type(SnackbarType.MULTI_LINE)
                            .color(Color.GREEN)
                            .text(user.getUsername() + " " + user.getAuthToken())
                            .show(LoginActivity.this);
                }

                @Override
                public void failure(RetrofitError error) {
                    Snackbar.with(getApplicationContext())
                            .type(SnackbarType.MULTI_LINE)
                            .color(Color.RED)
                            .text("Hata: " + error)
                            .show(LoginActivity.this);
                }
            });
        }
    }

    @OnClick(R.id.chooseRel)
    public void lnLoginType_Clicked(View view) {
        openContextMenu(view);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.add("İçme Suyu İşlemleri");
        menu.add("Ambalajlı Su İşlemleri");
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
