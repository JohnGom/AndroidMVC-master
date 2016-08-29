package com.programacion.movil.estemanp.androidmvcapplication.Controller;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.programacion.movil.estemanp.androidmvcapplication.Domain.User;
import com.programacion.movil.estemanp.androidmvcapplication.View.LandingActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lds on 22/08/2016.
 */
public class AppController {
    private static AppController _instance;
    private List<User> users;

    public static AppController getInstance() {
        if (_instance == null) {
            _instance = new AppController();
        }
        return _instance;
    }

    public void llenar (String nombre, String apelllido,  String usuario,  String password, int edad) {
        users = new ArrayList<User>();
        fillDateBases(nombre, apelllido, usuario, password, edad);
    }

    private void fillDateBases(String nombre, String apelllido,  String usuario,  String password, int edad) {
        //Add users
        fillUsers(nombre, apelllido, usuario, password, edad);
    }

    private void fillUsers(String nombre, String apelllido,  String usuario,  String password, int edad) {
        User person1 = new User(nombre, apelllido, usuario, password, edad);
        users.add(person1);

    }

    public boolean isValidUser(String username, String password) {
        Boolean resp = false;
        for (User person : users) {
            if (username.equals(person.getUserName())) {
                if (password.equals(person.getPassword())) {
                    resp = true;
                }
            }
        }
        return resp;
    }

    public boolean IsValidPass(String password, String confpassword) {
        Boolean resp = false;
        if (password.equals(confpassword)) {
                    resp = true;
        }
        return resp;
    }

}




