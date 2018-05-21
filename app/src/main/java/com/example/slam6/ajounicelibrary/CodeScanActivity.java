package com.example.slam6.ajounicelibrary;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class CodeScanActivity extends AppCompatActivity {
    private IntentIntegrator qrScan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /* QR code Scanner Setting */
        qrScan = new IntentIntegrator(this);
        qrScan.setOrientationLocked(false);
        qrScan.setPrompt("QR 코드를 스캔하세요");
        qrScan.initiateScan();
    }
    /* Getting the Scan Results */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        // QR코드/ 바코드를 스캔한 결과
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        // result.getFormatName() : 바코드 종류
        // result.getContents() : 바코드 값
        //mTextMessage.setText( result.getContents() );
        if(result.getContents()!=null) //바코드 인식을 한 경우.
            Toast.makeText(getApplicationContext(), result.getContents(), Toast.LENGTH_LONG).show();
    }
}
