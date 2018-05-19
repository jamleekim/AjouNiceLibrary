package com.example.slam6.ajounicelibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends FontBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView borrowtextview = (TextView)findViewById(R.id.borrowtextview); //로그인버튼id가져오기
        borrowtextview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( getApplicationContext(), BorrowActivity.class);
                startActivity(intent); // 메인 화면으로 넘어간다
            }
        });
        TextView returnbooktextview = (TextView)findViewById(R.id.returnbooktextview); //로그인버튼id가져오기
        returnbooktextview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( getApplicationContext(), ReturnbookActivity.class);
                startActivity(intent); // 메인 화면으로 넘어간다
            }
        });

    }
}
