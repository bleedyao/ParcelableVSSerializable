package cn.bleedyao.parcelable_vs_serializabledemo;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final UserForParcelable user = new UserForParcelable("张三", 28);
        TextView mTextView = findViewById(R.id.textview);
        Button mButton = findViewById(R.id.button);
        mTextView.setText(user.toString());
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Main2Activity.class)
                        .putExtra("user", user)
                        .putExtra("startTime", SystemClock.elapsedRealtime()));
            }
        });
    }
}
