package com.mcwilliams.passbook;

import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.gson.Gson;
import com.mcwilliams.passbook.models.PassbookPass;

import org.json.JSONObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * Created by jrclark on 7/10/15.
 */
public class PassbookParser extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        Uri uri = intent.getData();
        String scheme = uri.getScheme();

        if(ContentResolver.SCHEME_CONTENT.equals(scheme)) {
            try {
                InputStream attachment = getContentResolver().openInputStream(uri);
                handleZipInput(attachment);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        else {
            String path = uri.getEncodedPath();
            try {
                FileInputStream fis = new FileInputStream(path);
                handleZipInput(fis);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    private void handleZipInput(InputStream in) {
        try {
            ZipInputStream zis = new ZipInputStream(in);
            ZipEntry entry;
            while((entry = zis.getNextEntry()) != null) {
                String filename = entry.getName();
                if(filename.equals("pass.json")) {
                    StringBuilder s = new StringBuilder();
                    int read = 0;
                    byte[] buffer = new byte[1024];
                    while((read = zis.read(buffer, 0, 1024)) >= 0)
                        s.append(new String(buffer, 0, read));

                    JSONObject pass = new JSONObject(s.toString());
                    Log.d("", pass.toString());

                    Gson gson = new Gson();
                    PassbookPass passbookPass = gson.fromJson(pass.toString(), PassbookPass.class);

                    Log.d("", passbookPass.getDescription());

                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
