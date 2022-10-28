package com.example.theroute;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.theroute.Model.UserModel;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterActivity extends AppCompatActivity {
    EditText username,email,password;
    TextView message,messagess;
    Button registerbutton;
    String gender;
    ProgressDialog dialog;
    private FirebaseAuth auth;
    private FirebaseDatabase dat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        username=findViewById(R.id.username);
        email=findViewById(R.id.emailRegister);
        password=findViewById(R.id.passwordRegister);
        message=findViewById(R.id.checkMessageAlreadyAccount);
        messagess=findViewById(R.id.checkMessageRegister);
        registerbutton =findViewById(R.id.btnRegister);
        auth=FirebaseAuth.getInstance();
        dat=FirebaseDatabase.getInstance();
        dialog =new ProgressDialog(this);
        dialog.setTitle("Authentication");
        dialog.setMessage("Creating User...");
        dialog.setCancelable(false);
        RadioGroup genderRadioGroup = (RadioGroup) findViewById(R.id.genderRadioGroup);
        genderRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.maleRadioButton: {
                        gender="male";
                        break;
                    }
                    case R.id.femaleRadioButton: {
                        gender="female";
                        break;
                    }
                }
            }
        });
        registerbutton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String emailCheck=email.getText().toString();
                String userCheck=username.getText().toString();
                String passwordCheck=password.getText().toString();
                if(emailCheck.isEmpty()||userCheck.isEmpty()||passwordCheck.isEmpty()||gender.isEmpty())
                {
                    message.setText("Fields cannot be Empty");
                    message.setTextColor(Color.RED);
                }
                else{
                    dialog.show();
                    createUser(emailCheck,passwordCheck);
                    if(gender.contains("male")){
                        messagess.setText("Welcome To Our family Mr." + username + "\nProceed to log In?");
                    }
                    else {
                        messagess.setText("Welcome To Our family Miss/Mrs." + username + "\nProceed to log In?");
                    }
                    messagess.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            auth.signOut();
                            Intent intent=new Intent(RegisterActivity.this,LogInActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                }

            }
        });
        message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RegisterActivity.this,LogInActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
    private void createUser(String $email,String $password){
        auth.createUserWithEmailAndPassword($email, $password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    dialog.dismiss();
                    String id=task.getResult().getUser().getUid(); //from firebase we had taken users id.
                    UserModel user=new UserModel(username.getText().toString(),password.getText().toString(),email.getText().toString(),gender);
                    dat.getReference().child("Users").child(id).setValue(user);//created a child Users in database.

                } else {
                    dialog.dismiss();
                    Toast.makeText(RegisterActivity.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}