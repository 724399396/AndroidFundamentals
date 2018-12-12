package com.example.weili.pickerfortime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void TimePickerFragment(int hourOfDay, int minute) {
        String hour_string = Integer.toString(hourOfDay);
        String minute_string = Integer.toString(minute);
        String dateMessage = (hour_string + ":" + minute_string);
        Toast.makeText(this, getString(R.string.time) + dateMessage, Toast.LENGTH_SHORT).show();
    }

    public void showTimePicker(View view) {
        TimePickerFragment timePickerFragment = new TimePickerFragment();
        timePickerFragment.show(getSupportFragmentManager(), getString(R.string.timepicker));
    }
}
