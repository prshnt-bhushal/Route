package com.example.theroute;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserInfo;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Objects;

public class Profilepage extends AppCompatActivity {
    EditText $username,$email,$password;
    Button btnReset/*,btnLogOut*/;
    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profilepage);
        $username=findViewById(R.id.displayUsername);
        auth = FirebaseAuth.getInstance();
        /*Intent intent=getIntent();
        $username.setText(intent.getStringExtra("$$$$username"));*/
        $email=findViewById(R.id.displayEmail);
        $password=findViewById(R.id.displayPassword);
        btnReset=findViewById(R.id.resetBtn);
        /*btnLogOut=findViewById(R.id.logOutbtn);*/
        FirebaseUser user=FirebaseAuth.getInstance().getCurrentUser();
        $email.setText(user.getEmail());
       /* assert user != null;
        String id=user.getUid().toString();
        if(user!=null){
            for(UserInfo Profile:user.getProviderData()){
                $email.setText(Profile.getEmail());
                $username.setText(Profile.getUid());
                $password.setText(Profile.getProviderId);
            }
        }*/
        /*DatabaseReference databaseReference=FirebaseDatabase.getInstance().getReference("Users/"+id+"/username");
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Profilepage page =dataSnapshot.getValue(Profilepage.class);
                System.out.println(page);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                System.out.println("The read failed: " + error.getCode());

            }
        });*/
       /* DatabaseReference databaseReference= FirebaseDatabase.getInstance().getReference().child("Users").child(id).child("username").get().getResult().toString();
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for(DataSnapshot snapshot:dataSnapshot.getChildren()){
                    $password.setText(Objects.requireNonNull(snapshot.getValue()).toString());
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });*/
        btnReset.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                EditText resetmail = new EditText(v.getContext());
                AlertDialog.Builder passwordResetDialog = new AlertDialog.Builder(v.getContext());
                passwordResetDialog.setTitle("Reset your password?");
                passwordResetDialog.setMessage("Enter Your email to get a password reset link.\n(Check if its your Email?)");
                passwordResetDialog.setView(resetmail);
                resetmail.setText($email.getText().toString());
                passwordResetDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //extract email and resend reset link.
                        String mail = resetmail.getText().toString();
                        auth.sendPasswordResetEmail(mail).addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void aVoid) {
                                Toast.makeText(Profilepage.this, "Reset link is sent to your Mail.", Toast.LENGTH_SHORT).show();
                            }
                        }).addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(Profilepage.this, "Error! Reset Email is not sent" + e.getMessage(), Toast.LENGTH_SHORT).show();
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
        /*btnLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                auth.signOut();
                Intent intent =new Intent(Profilepage.this,LogInActivity.class);
                startActivity(intent);
                finish();
            }
        });*/
    }
}