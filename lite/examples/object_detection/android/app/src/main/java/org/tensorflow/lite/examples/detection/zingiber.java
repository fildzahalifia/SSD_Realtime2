package org.tensorflow.lite.examples.detection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class zingiber extends AppCompatActivity {
    private long backPress;
    private Toast backToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zingiber);
    }

    @Override
    public void onBackPressed() {
        if(backPress + 2000 > System.currentTimeMillis()){
            backToast.cancel();
            super.onBackPressed();
            return;
        }else{
            backToast = Toast.makeText(getBaseContext(), "Ketuk sekali lagi untuk keluar", Toast.LENGTH_LONG);
            backToast.show();
        }
        backPress = System.currentTimeMillis();
    }

}