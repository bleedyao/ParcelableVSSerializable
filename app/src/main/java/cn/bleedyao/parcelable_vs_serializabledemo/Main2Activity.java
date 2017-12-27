package cn.bleedyao.parcelable_vs_serializabledemo;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();

        TextView mTextView = findViewById(R.id.textView);
        Button mButton = findViewById(R.id.button2);

        if (intent != null) {
            mTextView.setText(intent.getParcelableExtra("user").toString());
            mTextView.append((SystemClock.elapsedRealtime() -
                    intent.getLongExtra("startTime", 0)) + "");
        }


        final UserForSerializable user = new UserForSerializable("张三",29);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main2Activity.this,Main3Activity.class)
                .putExtra("user",user)
                .putExtra("startTime",SystemClock.elapsedRealtime()));
            }
        });
    }
}
