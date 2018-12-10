package com.example.weili.shoppinglist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ItemsActivity extends AppCompatActivity {
    public static final String EXTRA_ITEM = "com.example.weili.shoppinglist.extra.ITEM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);
    }

    public void cheeseClick(View view) {
        Intent intent = new Intent();
        intent.putExtra(EXTRA_ITEM, "Cheese");
        setResult(RESULT_OK, intent);
        finish();
    }

    public void appleClick(View view) {
        Intent intent = new Intent();
        intent.putExtra(EXTRA_ITEM, "Apple");
        setResult(RESULT_OK, intent);
        finish();
    }

    public void riceClick(View view) {
        Intent intent = new Intent();
        intent.putExtra(EXTRA_ITEM, "rice");
        setResult(RESULT_OK, intent);
        finish();
    }
}
