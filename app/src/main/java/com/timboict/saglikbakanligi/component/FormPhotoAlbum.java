package com.timboict.saglikbakanligi.component;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.GridView;

import com.timboict.saglikbakanligi.R;
import com.timboict.saglikbakanligi.adapter.GridViewAdapter;
import com.timboict.saglikbakanligi.util.FileUtil;

import java.io.File;
import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

/**
 * Created by mustafaguven on 24.05.2015.
 */
public class FormPhotoAlbum extends GridLayout {

    private static final int MAX_PHOTO_SIZE = 4;

    private Context mContext;
    View view;

    @InjectView(R.id.gvPhotoAlbum)
    GridView gvPhotoAlbum;

    @InjectView(R.id.btnTakePhoto)
    public Button btnTakePhoto;

    private String mFolderName;

    public FormPhotoAlbum(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        this.mContext = context;
        view = LayoutInflater.from(getContext()).inflate(R.layout.form_photo_album, this);
        ButterKnife.inject(this, view);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int heightSpec;

        if (getLayoutParams().height == LayoutParams.WRAP_CONTENT) {

            // The two leftmost bits in the height measure spec have
            // a special meaning, hence we can't use them to describe height.
            heightSpec = MeasureSpec.makeMeasureSpec(
                    Integer.MAX_VALUE >>2, MeasureSpec.AT_MOST);
        }
        else {
            // Any other height should be respected as is.
            heightSpec = heightMeasureSpec;
        }

        super.onMeasure(widthMeasureSpec, heightSpec);
    }

    private ArrayList<ImageItem> getData(String folderName) {
        final ArrayList<ImageItem> imageItems = new ArrayList<>();
        //String path = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Pictures/1430833275576.jpg";
        String path = String.format("%s/%s/%s", Environment.getExternalStorageDirectory().getAbsolutePath(), "sb_photo", folderName);
        File f = new File(path);
        File[] files = f.listFiles();

        if(files.length<MAX_PHOTO_SIZE)

        for (int i = 0; i < (files.length<MAX_PHOTO_SIZE ? files.length : MAX_PHOTO_SIZE); i++) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            options.inScaled = false;
            Bitmap bitmap = BitmapFactory.decodeFile(files[i].getPath(), options);
            bitmap = Bitmap.createScaledBitmap(bitmap, 50, 50, false);
            imageItems.add(new ImageItem(bitmap, String.format("Fotoğraf %s", (i + 1))));
        }
        return imageItems;
    }

    public void getPhotos(String folderName) {
        gvPhotoAlbum.setAdapter(new GridViewAdapter(mContext, R.layout.grid_item_layout, getData(folderName)));
    }

    public void takePhoto(String folderName){
        this.mFolderName = folderName;
        __takePhoto();
    }

    @OnClick(R.id.btnTakePhoto)
    public void __takePhoto(){
        Uri outputFileUri = Uri.fromFile(FileUtil.newFile(mFolderName));

        Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, outputFileUri);

        ((Activity)mContext).startActivityForResult(cameraIntent, 1);
    }



}
