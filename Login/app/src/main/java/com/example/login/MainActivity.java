package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public void login(android.view.View view){
        Log.i("Yo!!","oops!!");
        ImageView image = (ImageView) findViewById(R.id.closed);
        image.setImageResource(R.drawable.open);
     //  Button login = (Button) findViewById(R.id.login);
     //   login.setVisibility(View.GONE);
        //login.setOnClickListener();
        Toast.makeText(this,"Your Wardrobe is open and arranged!",Toast.LENGTH_LONG).show();
        setContentView(R.layout.searchpage);

    }
    public void logout(View view){
        Toast.makeText(this,"Your wardrobe is waiting for you!",Toast.LENGTH_LONG).show();
        setContentView(R.layout.activity_main);
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
