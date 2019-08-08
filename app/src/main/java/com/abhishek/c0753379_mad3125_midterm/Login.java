package com.abhishek.c0753379_mad3125_midterm;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    Button btnLogin;
    EditText txtUserName,txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
       btnLogin=findViewById(R.id.btnlogin);
       txtUserName=findViewById(R.id.txtusername);
       txtPassword=findViewById(R.id.txtpassword);
       btnLogin.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if(txtUserName.getText().toString().equals("abhishek") && txtPassword.getText().toString().equals("madepogu")){
                   Intent intent=new Intent(Login.this,Home.class);
                   startActivity(intent);
               }
               else{
                   AlertDialog.Builder builder=new AlertDialog.Builder(Login.this);
                   builder.setTitle("Incorrect Password");
                   builder.setPositiveButton("ok",null);

                   AlertDialog alert=builder.create();
                   alert.show();

               }
           }
       });
    }
}
