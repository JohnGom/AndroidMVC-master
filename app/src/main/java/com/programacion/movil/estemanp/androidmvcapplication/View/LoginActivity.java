package com.programacion.movil.estemanp.androidmvcapplication.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.programacion.movil.estemanp.androidmvcapplication.Controller.*;

import com.programacion.movil.estemanp.androidmvcapplication.R;

public class LoginActivity extends AppCompatActivity {

    EditText userName;
    EditText password;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



        userName=(android.widget.EditText) this.findViewById(R.id.editUsername);
        password=(android.widget.EditText) this.findViewById(R.id.editPassword);
    }


    public void login(View view) {
        if( AppController.getInstance().isValidUser(userName.getText().toString(),password.getText().toString())) {
            Intent intent = new Intent(this, LandingActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(this, "El usuario y contraseña no coinciden", Toast.LENGTH_SHORT).show();
            userName.setText("");
            password.setText("");
        }
    }
}
