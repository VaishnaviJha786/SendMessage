package com.example.sendmessage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void send(View v)
    {
        EditText ed=(EditText)findViewById(R.id.e1);
        String msg=ed.getText().toString();
        Intent i=new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        i.putExtra(getIntent().EXTRA_TEXT,msg);
        String ct="SEND MESSAGE.....";
        Intent chooseintent= Intent.createChooser(i,ct);
        startActivity(chooseintent);
    }
}