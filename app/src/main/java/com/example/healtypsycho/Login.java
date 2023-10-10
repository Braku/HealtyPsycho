package com.example.healtypsycho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    Button login;
    EditText userName, email, passW;
    String uName, mail, pWord;

    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        userName = (EditText) findViewById(R.id.eTxtUserName);
        email = (EditText) findViewById(R.id.eTxtMail);
        passW = (EditText) findViewById(R.id.eTxtPassW);
        login = (Button) findViewById(R.id.btnLogin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uName = userName.getText().toString();
                mail = email.getText().toString();
                pWord = passW.getText().toString();

                if(uName.equals("") || mail.equals("") || pWord.equals("")){
                    Toast.makeText(Login.this, "Ingresa correctamente los datos", Toast.LENGTH_SHORT).show();
                }else{
                    i = new Intent(Login.this, Feed.class);
                    i.putExtra("userName", uName);
                    i.putExtra("email", mail);
                    i.putExtra("passWord", pWord);
                    startActivity(i);
                }

            }
        });

    }
}