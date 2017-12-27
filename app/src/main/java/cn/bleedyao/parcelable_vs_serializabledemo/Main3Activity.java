package cn.bleedyao.parcelable_vs_serializabledemo;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent intent = getIntent();

        TextView mTextview = findViewById(R.id.textView1);

        if (intent != null) {
            mTextview.setText(intent.getSerializableExtra("user").toString());
            mTextview.append((SystemClock.elapsedRealtime() -
                    intent.getLongExtra("startTime", 0)) + "");
        }
    }
}
