package co.edu.unal.barcodes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class ZXingActivity extends AppCompatActivity{

    public static TextView barcodeInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zxing);
        barcodeInfo = (TextView) findViewById(R.id.zxing_result);
    }

    public void scan(View view){
        startActivity(new Intent(this, ZXing.class));
    }
}
