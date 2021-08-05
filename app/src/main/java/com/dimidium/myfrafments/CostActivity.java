package com.dimidium.myfrafments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;

public class CostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cost);


    if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
        finish();
        return;
    }

    if (savedInstanceState == null){
        CoatsFragment details = new CoatsFragment();
        details.setArguments(getIntent().getExtras());
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container,details).commit();
    }


}
}