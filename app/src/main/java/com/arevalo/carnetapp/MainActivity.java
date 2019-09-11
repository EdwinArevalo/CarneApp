package com.arevalo.carnetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.zxing.BarcodeFormat;
import com.journeyapps.barcodescanner.BarcodeEncoder;

public class MainActivity extends AppCompatActivity {

    private ImageView imageViewQrCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {

            String DNI = "78546321";

            BarcodeEncoder barcodeEncoder = new BarcodeEncoder();
            Bitmap bitmap = barcodeEncoder.encodeBitmap(DNI, BarcodeFormat.CODE_128, 400, 160);
            imageViewQrCode = findViewById(R.id.app_code);
            imageViewQrCode.setImageBitmap(bitmap);
        } catch(Exception e) {
            Toast.makeText(this,"Error"+e.getMessage(),Toast.LENGTH_LONG);
        }
    }
}
