package com.example.weili.hellotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private Button zeroButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.show_count);
        zeroButton = findViewById(R.id.button_zero);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_LONG);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
        if (mCount % 2 == 0) {
            view.setBackgroundColor(0XFFFF0000);
        } else {
            view.setBackgroundColor(0XFF00FF00);
        }
        if (zeroButton != null)
            zeroButton.setBackgroundColor(0xFF0000FF);
    }

    public void countZero(View view) {
        mCount=0;
        if (mShowCount != null)
            mShowCount.setText("0");
        if (zeroButton != null)
            zeroButton.setBackgroundColor(0xFFAAA000);
    }
}
