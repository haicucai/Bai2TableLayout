package it.hai.bai2tablelayout;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.TelecomManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 private Button btncl1,btncl2,btncl3,btnclear;
    private TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
        btncl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setBackgroundColor(Color.RED);
            }
        });
        btncl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setBackgroundColor(Color.YELLOW);
            }
        });
        btncl3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setBackgroundColor(Color.BLUE);
            }
        });
        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setBackgroundColor(Color.BLACK);
            }
        });
    }


    private void initialize(){
        tv1=(TextView)findViewById(R.id.tv1);
        btncl1=(Button)findViewById(R.id.btncl1);
        btncl2=(Button)findViewById(R.id.btncl2);
        btncl3=(Button)findViewById(R.id.btncl3);
        btnclear=(Button)findViewById(R.id.btnclear);

    }
}
