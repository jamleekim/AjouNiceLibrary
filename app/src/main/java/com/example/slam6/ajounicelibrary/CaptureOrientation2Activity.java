package com.example.slam6.ajounicelibrary;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.journeyapps.barcodescanner.CaptureActivity;

public class CaptureOrientation2Activity extends CaptureActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);

        TextView title_view = new TextView(this);
        title_view.setLayoutParams(new LinearLayout.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT));
        title_view.setBackgroundColor(Color.parseColor("#00FFFFFF"));
        title_view.setPadding(200, 200, 100, 100);
        title_view.setTextColor(Color.parseColor("#add8e6"));
        Typeface typeface = Typeface.createFromAsset(getAssets(),"BMJUA_ttf.ttf");
        title_view.setTypeface(typeface);
        title_view.setTextSize(30);
        title_view.setText("도서관 인증 모드");

        this.addContentView(title_view, layoutParams);

    }
}
