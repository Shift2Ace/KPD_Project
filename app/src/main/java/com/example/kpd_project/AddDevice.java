package com.example.kpd_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddDevice extends AppCompatActivity {
    private Button applyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_device);

        applyButton = (Button) findViewById(R.id.wifi_cancel_button);
        applyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFirst();
            }
        });
    }

    public void openFirst() {
        Intent intent = new Intent(this, FirstFragment.class);
        startActivity(intent);
    }

}