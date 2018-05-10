package com.example.slam6.ajounicelibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getWindow().setWindowAnimations(0);
        Button LoginButton = (Button)findViewById(R.id.LoginButton); //로그인버튼id가져오기
        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( getApplicationContext(), MainActivity.class);
                startActivity(intent); // 메인 화면으로 넘어간다
            }
        });
        Button RegisterButton = (Button)findViewById(R.id.RegisterButton); //회원가입버튼id가져오기
        RegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( getApplicationContext(), RegisterActivity.class);
                startActivity(intent); // 다음 화면으로 넘어간다
            }
        });

    }
}
