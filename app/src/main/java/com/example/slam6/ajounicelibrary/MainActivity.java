package com.example.slam6.ajounicelibrary;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends FontBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView qrscanbutton = (TextView)findViewById(R.id.qrscanbutton);
        qrscanbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( getApplicationContext(), BookScanActivity.class);
                startActivity(intent);
            }
        });
        TextView borrowtextview = (TextView)findViewById(R.id.borrowtextview);
        borrowtextview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( getApplicationContext(), LibraryAuthActivity.class);
                startActivity(intent);
            }
        });
        TextView returnbooktextview = (TextView)findViewById(R.id.returnbooktextview);
        returnbooktextview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( getApplicationContext(), ReturnbookActivity.class);
                startActivity(intent);
            }
        });

    }
}
