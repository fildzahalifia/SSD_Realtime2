package org.tensorflow.lite.examples.detection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class Tampilan_awal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_tampilan_awal);
    }

    public void pindah(View view) {
        Intent intent = new Intent(Tampilan_awal.this,DetectorActivity.class);
        startActivity(intent);
    }

    public void pindahh(View view){
        Intent intent = new Intent(Tampilan_awal.this,zingiber.class);
        startActivity(intent);
    }
}