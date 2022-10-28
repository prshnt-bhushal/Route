package com.example.theroute;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.theroute.Adapter.BusAdapter;
import com.example.theroute.Model.BusModel;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ChooseBus extends AppCompatActivity {
    private RecyclerView recyclerView;
    private DatabaseReference mbase;
    BusAdapter adapter;
    Button button;
    MapsActivity mapsActivity;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_bus);
        Intent intent=getIntent();
        String busOptions=intent.getStringExtra("$Name").toLowerCase();
        String main=intent.getStringExtra("$main");
        button=findViewById(R.id.btnMapInternal);
        textView=findViewById(R.id.textView2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ChooseBus.this, "Feature Currently Unavailable ", Toast.LENGTH_SHORT).show();
                Toast.makeText(ChooseBus.this, "You can Use Map by Going one step Back\nSorry for inconvenience", Toast.LENGTH_LONG).show();
                /*textView.setText("You can Use Map by Going one step Back\nSorry for inconvenience");*/

                /*Intent intent1 =new Intent(ChooseYourBus.this,MapsActivity.class);
                *//*intent1.putExtra("aInternal",main);
                intent1.putExtra("busStand",busOptions);*//*
                new MapsActivity().internalMap(main,busOptions);
                startActivity(intent1);*/

            }
        });
        try {
            switch (main) {
                case "chandragiri": {
                    switch (busOptions) {
                        case "thankot":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("chandragiri").child("thankot");
                            break;
                        case "kalimati":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("chandragiri").child("kalimati");
                            break;
                        case "kalanki":
                            // Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("chandragiri").child("kalanki");
                            break;
                        case "purano buspark":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("chandragiri").child("purano buspark");
                            break;
                        case "ratnapark":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("chandragiri").child("ratnapark");
                            break;
                        case "koteswor":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("chandragiri").child("koteswor");
                            break;
                        case "lagankhel":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("chandragiri").child("lagankhel");
                            break;
                        case "naya buspark":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("chandragiri").child("naya buspark");
                            break;
                        default:
                            Toast.makeText(this, "Sorry We can't help you on this Destination.", Toast.LENGTH_SHORT).show();
                    }
                    break;
                }
                case "sundarijal": {
                    switch (busOptions) {
                        case "purano buspark":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("sundarijal").child("purano buspark");
                            break;
                        case "ratnapark":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("sundarijal").child("ratnapark");
                            break;
                        case "koteswor":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("sundarijal").child("koteswor");
                            break;
                        case "chakrapat":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("sundarijal").child("chakrapat");
                            break;
                        case "naya buspark":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("sundarijal").child("naya buspark");
                            break;
                        case "gausala":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("sundarijal").child("gausala");
                            break;
                        default:
                            Toast.makeText(this, "Sorry We can't help you on this Destination.", Toast.LENGTH_SHORT).show();
                    }
                    break;
                }
                case "sanga": {
                    switch (busOptions) {
                        case "kamalvinayek":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("sanga").child("kamalvinayek");
                            break;
                        case "baneshwor":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("sanga").child("baneshwor");
                            break;
                        case "maitighar":
                            // Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("sanga").child("maitighar");
                            break;
                        case "purano buspark":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("sanga").child("purano buspark");
                            break;
                        case "ratnapark":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("sanga").child("ratnapark");
                            break;
                        case "koteswor":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("sanga").child("koteswor");
                            break;
                        case "lagankhel":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("sanga").child("lagankhel");
                            break;
                        case "naya buspark":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("sanga").child("naya buspark");
                            break;
                        default:
                            Toast.makeText(this, "Sorry We can't help you on this Destination.", Toast.LENGTH_SHORT).show();
                    }
                    break;
                }
                case "ratnapark": {
                    switch (busOptions) {
                        case "thankot":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("ratnapark").child("thankot");
                            break;
                        case "kalimati":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("ratnapark").child("kalimati");
                            break;
                        case "kalanki":
                            // Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("ratnapark").child("kalanki");
                            break;
                        case "baneshwor":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("ratnapark").child("baneshwor");
                            break;
                        case "balkhu":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("ratnapark").child("balkhu");
                            break;
                        case "koteswor":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("ratnapark").child("koteswor");
                            break;
                        case "lagankhel":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("ratnapark").child("lagankhel");
                            break;
                        case "naya buspark":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("ratnapark").child("naya buspark");
                            break;
                        default:
                            Toast.makeText(this, "Sorry We can't help you on this Destination.", Toast.LENGTH_SHORT).show();
                    }
                    break;
                }
                case "champadevi": {
                    switch (busOptions) {
                        case "purano buspark":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("champadevi").child("purano buspark");
                            break;
                        case "ratnapark":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("champadevi").child("ratnapark");
                            break;
                        case "lagankhel":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("champadevi").child("lagankhel");
                            break;
                        case "ekantakuna":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("champadevi").child("ekantakuna");
                            break;
                        default:
                            Toast.makeText(this, "Sorry We can't help you on this Destination.", Toast.LENGTH_SHORT).show();
                    }
                    break;
                }
                case "kalanki": {
                    switch (busOptions) {
                        case "thankot":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("kalanki").child("thankot");
                            break;
                        case "kalimati":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("kalanki").child("kalimati");
                            break;
                        case "purano buspark":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("kalanki").child("purano buspark");
                            break;
                        case "naya buspark":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("kalanki").child("naya buspark");
                            break;
                        case "ratnapark":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("kalanki").child("ratnapark");
                            break;
                        case "baneshwor":
                            // Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("kalanki").child("baneshwor");
                            break;
                        case "tikathali":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("kalanki").child("tikathali");
                            break;
                        case "lagankhel":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("kalanki").child("lagankhel");
                            break;
                        case "pepsicola":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("kalanki").child("pepsicola");
                            break;
                        default:
                            Toast.makeText(this, "Sorry We can't help you on this Destination.", Toast.LENGTH_SHORT).show();
                    }
                    break;
                }
                case "pilot baba": {
                    switch (busOptions) {
                        case "kamalvinayek":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("pilot baba").child("kamalvinayek");
                            break;
                        case "purano buspark":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("pilot baba").child("purano buspark");
                            break;
                        case "ratnapark":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("pilot baba").child("ratnapark");
                            break;
                        case "koteswor":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("pilot baba").child("koteswor");
                            break;
                        case "baneshwor":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("pilot baba").child("baneshwor");
                            break;
                        case "suryabinayek":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("pilot baba").child("suryabinayek");
                            break;
                        default:
                            Toast.makeText(this, "Sorry We can't help you on this Destination.", Toast.LENGTH_SHORT).show();
                    }
                    break;
                }
                case "doleswor mahadev": {
                    switch (busOptions) {
                        case "kamalvinayek":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("doleswor mahadev").child("kamalvinayek");
                            break;
                        case "purano buspark":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("doleswor mahadev").child("purano buspark");
                            break;
                        case "ratnapark":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("doleswor mahadev").child("ratnapark");
                            break;
                        case "koteswor":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("doleswor mahadev").child("koteswor");
                            break;
                        case "baneshwor":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("doleswor mahadev").child("baneshwor");
                            break;
                        case "suryabinayek":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("doleswor mahadev").child("suryabinayek");
                            break;
                        default:
                            Toast.makeText(this, "Sorry We can't help you on this Destination.", Toast.LENGTH_SHORT).show();
                    }
                    break;
                }
                case "nagarkot": {
                    switch (busOptions) {
                        case "kamalvinayek":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("nagarkot").child("kamalvinayek");
                            break;
                        default:
                            Toast.makeText(this, "Sorry We can't help you on this Destination.", Toast.LENGTH_SHORT).show();
                    }
                    break;
                }
                case "dhulikhel": {
                    switch (busOptions) {
                        case "kamalvinayek":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("dhulikhel").child("kamalvinayek");
                            break;
                        case "purano buspark":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("dhulikhel").child("purano buspark");
                            break;
                        case "naya buspark":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("dhulikhel").child("naya buspark");
                            break;
                        case "ratnapark":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("dhulikhel").child("ratnapark");
                            break;
                        case "koteswor":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("dhulikhel").child("koteswor");
                            break;
                        case "lagankhel":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("dhulikhel").child("lagankhel");
                            break;
                        case "baneshwor":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("dhulikhel").child("baneshwor");
                            break;
                        case "maitighar":// Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("dhulikhel").child("maitighar");
                            break;
                        case "kalanki":
                            // Create a instance of the database and get
                            // its reference
                            mbase = FirebaseDatabase.getInstance().getReference("bus").child("dhulikhel").child("kalanki");
                            break;
                        default:
                            Toast.makeText(this, "Sorry We can't help you on this Destination.", Toast.LENGTH_SHORT).show();
                    }
                    break;
                }
                default: {
                    Toast.makeText(this, "Sorry we can't Help you on this currently", Toast.LENGTH_SHORT).show();
                }
            }
        }catch (RuntimeException e){
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }
        recyclerView = findViewById(R.id.listViewoptionForBus);
        // To display the Recycler view linearly
        recyclerView.setLayoutManager(
                new LinearLayoutManager(this));
        // It is a class provide by the FirebaseUI to make a
        // query in the database to fetch appropriate data
        FirebaseRecyclerOptions<BusModel> firebaseRecyclerOptions
                = new FirebaseRecyclerOptions.Builder<BusModel>()
                .setQuery(mbase, BusModel.class)
                .build();
        // Connecting object of required Adapter class to
        // the Adapter class itself
        adapter = new BusAdapter(firebaseRecyclerOptions);
        // Connecting Adapter class with the Recycler view*/
        recyclerView.setAdapter(adapter);
    }
    // Function to tell the app to start getting
    // data from database on starting of the activity

    @Override
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }

    // Function to tell the app to stop getting
    // data from database on stoping of the activity
    @Override
    protected void onStop() {
        super.onStop();
        adapter.stopListening();
    }
}