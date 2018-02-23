package com.xuyj.databinding.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_basicUsage).setOnClickListener(this);
        findViewById(R.id.btn_list).setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.btn_basicUsage:
                start(BasicUsageActivity.class);
                break;
            case R.id.btn_list:
                start(ListActivity.class);
                break;
        }
    }

    /**
     * start target activities
     *
     * @param target
     */
    private void start(Class<?> target)
    {
        Intent intent = new Intent(this, target);
        startActivity(intent);
    }
}
