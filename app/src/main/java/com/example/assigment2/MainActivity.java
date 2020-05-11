package com.example.assigment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final int MY_PERMISSIONS_REQUEST = 1 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //permission
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE)!= PackageManager.PERMISSION_GRANTED) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(this,Manifest.permission.READ_EXTERNAL_STORAGE)) {
                Toast.makeText(this,"explanation",Toast.LENGTH_LONG).show(); }
            else { ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},MY_PERMISSIONS_REQUEST);
                Toast.makeText(this,"explanation no need ",Toast.LENGTH_LONG).show();}}
    }


    public  void startService(View v){
        Intent serviceIntent = new Intent(this, ExmpleService.class);
        startService(serviceIntent);

    }
    public void stopService(View v){
        Intent serviceIntent = new Intent(this, ExmpleService.class);
        stopService(serviceIntent);
    }


}
