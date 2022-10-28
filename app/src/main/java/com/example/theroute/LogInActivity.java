package com.example.theroute;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LogInActivity extends AppCompatActivity {
    EditText emaill, passwordd;
    Button loginn;
    TextView messagee2, messagee3, message4;
    FirebaseAuth auth;
    ProgressDialog dialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        emaill = findViewById(R.id.emailLog);
        passwordd = findViewById(R.id.passwordLog);
        messagee2 = findViewById(R.id.txtCheckBoxes);
        messagee3 = findViewById(R.id.txtRegister);
        message4 = findViewById(R.id.txtForgetPassword);
        loginn = findViewById(R.id.btnSignIn);
        auth = FirebaseAuth.getInstance();
        dialog = new ProgressDialog(this);
        dialog.setTitle("Authentication");
        dialog.setMessage("Logging In...");
        dialog.setCancelable(false);
        loginn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String emailCheck = emaill.getText().toString();
                String passwordCheck = passwordd.getText().toString();
                if (emailCheck.isEmpty() || passwordCheck.isEmpty()) {
                    messagee2.setText("Fields cannot be Empty");
                    messagee2.setTextColor(Color.RED);
                }
                else {
                    dialog.show();
                    signIn(emaill.getText().toString(), passwordd.getText().toString());
                }
            }
        });
        message4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText resetmail = new EditText(v.getContext());
                AlertDialog.Builder passwordResetDialog = new AlertDialog.Builder(v.getContext());
                passwordResetDialog.setTitle("Reset your password?");
                passwordResetDialog.setMessage("Enter Your email to get a password reset link.");
                passwordResetDialog.setView(resetmail);
                passwordResetDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //extract email and resend reset link.
                        String mail = resetmail.getText().toString();
                        auth.sendPasswordResetEmail(mail).addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void aVoid) {
                                Toast.makeText(LogInActivity.this, "Reset link is sent to your Mail.", Toast.LENGTH_SHORT).show();
                            }
                        }).addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(LogInActivity.this, "Error! Reset Email is not sent" + e.getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        });

                    }
                });
                passwordResetDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                passwordResetDialog.create().show();
            }
        });

        messagee3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LogInActivity.this, RegisterActivity.class);
                startActivity(intent);
                finish();
            }
        });
        if (auth.getCurrentUser() != null) {
            Intent intent1 = new Intent(LogInActivity.this, MainActivity.class);
            startActivity(intent1);
            finish();
        }
    }

    private void signIn(String $email, String $password) {
        auth.signInWithEmailAndPassword($email, $password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    dialog.dismiss();
                    Intent intent = new Intent(LogInActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    dialog.dismiss();
                    Toast.makeText(LogInActivity.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}