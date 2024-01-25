package com.example.ciclo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private EditText usernameEditText,passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        usernameEditText= (EditText)findViewById(R.id.usuariotxt);
        passwordEditText= (EditText)findViewById(R.id.clavetxt);
        Button loginButton =findViewById(R.id.button);



    }

    public void sendMessage (View view){

        Log.i("tagNuevo","hola mundo");

        String username= usernameEditText.getText().toString();
        String password= passwordEditText.getText().toString();
        if (!username.isEmpty()&& !password.isEmpty()) {


            Intent intent = new Intent(MainActivity.this ,SecondActivity.class);
            intent.putExtra("USERNAME" ,username);
            startActivity(intent);
        }
        else {

        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume en Main Activity", Toast.LENGTH_SHORT).show();


        }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onResume en Main Activity", Toast.LENGTH_SHORT).show();
    }
}