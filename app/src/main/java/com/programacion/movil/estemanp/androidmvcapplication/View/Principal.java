package com.programacion.movil.estemanp.androidmvcapplication.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.programacion.movil.estemanp.androidmvcapplication.R;

public class Principal extends AppCompatActivity {

    Button signin;
    Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        signup = (Button) findViewById(R.id.btnsignup);
        signup.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent signup = new Intent(Principal.this, SingUp.class);
                startActivity(signup);
            }
        });

        signin = (Button) findViewById(R.id.btnsignin);
        signin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent signin = new Intent(Principal.this, LoginActivity.class);
                startActivity(signin);
            }
        });



    }
}
