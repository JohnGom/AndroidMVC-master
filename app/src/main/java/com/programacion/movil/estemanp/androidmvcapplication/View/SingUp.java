package com.programacion.movil.estemanp.androidmvcapplication.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.programacion.movil.estemanp.androidmvcapplication.Controller.AppController;
import com.programacion.movil.estemanp.androidmvcapplication.R;

public class SingUp extends AppCompatActivity {

    EditText nombre;
    EditText apellido;
    EditText userName;
    EditText password;
    EditText edad;
    EditText confirmP;

    String contr1, contr2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);

        nombre = (android.widget.EditText) this.findViewById(R.id.nombre);
        apellido = (android.widget.EditText) this.findViewById(R.id.apellido);
        userName = (android.widget.EditText) this.findViewById(R.id.usuario);
        password = (android.widget.EditText) this.findViewById(R.id.password);
        edad = (android.widget.EditText) this.findViewById(R.id.edad);
        confirmP = (android.widget.EditText) this.findViewById(R.id.confirPass);


    }
    public void registrar (View v){
        if(AppController.getInstance().IsValidPass(password.getText().toString(),confirmP.getText().toString())){
           AppController.getInstance().llenar(nombre.getText().toString(), apellido.getText().toString(),
                   userName.getText().toString(), password.getText().toString(), Integer.parseInt(edad.getText().toString()));

            Toast.makeText(this, "Registrado", Toast.LENGTH_SHORT).show();
            nombre.setText("");
            apellido.setText("");
            userName.setText("");
            password.setText("");
            edad.setText("");
            confirmP.setText("");

        }else{
            Toast.makeText(this, "Las contraseñas no son iguales", Toast.LENGTH_SHORT).show();

            password.setText("");
            confirmP.setText("");
        }
    }

    }


