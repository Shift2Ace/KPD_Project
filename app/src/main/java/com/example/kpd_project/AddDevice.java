package com.example.kpd_project;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.util.Log;


public class AddDevice extends AppCompatActivity {
    EditText ssidInput, passwordInput;
    private Button cancelButton;
    private Button applyButton;
    BluetoothAdapter mBtAdapter = BluetoothAdapter.getDefaultAdapter();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_device);

        cancelButton = (Button) findViewById(R.id.wifi_cancel_button);
        applyButton = (Button) findViewById(R.id.wifi_apply_button);
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFirst();
            }
        });
        applyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                applyAddDevice();
            }
        });

    }

    public void openFirst() {
        Intent intent = new Intent(this, FirstFragment.class);
        startActivity(intent);
    }



    private void applyAddDevice(){
        String ssid, password;
        ssidInput = (EditText) findViewById(R.id.wifi_ssid);
        passwordInput = (EditText) findViewById(R.id.wifi_password);
        ssid = ssidInput.getText().toString();
        password = passwordInput.getText().toString();
        Log.d("apply input (SSID)",ssid);
        Log.d("apply input (Password)",password );


    }

}