package com.example.theroute;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    FirebaseAuth auth;
    SearchView searchView;
    ListView listView;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        auth=FirebaseAuth.getInstance();
        listView=findViewById(R.id.destinationOptionsList);
        searchView=findViewById(R.id.searchDestination);
        //for Retrieving data From Firebase
        /*ArrayList arrayList=new ArrayList<>();
        arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,arrayList);
        listView.setAdapter(arrayAdapter);
        DatabaseReference destinationOptions= FirebaseDatabase.getInstance().getReference().child("Destinations");
        destinationOptions.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                arrayList.clear();
                for(DataSnapshot snapshot:dataSnapshot.getChildren()){
                    arrayList.add(snapshot.getValue().toString());
                }
                arrayAdapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });*/
        Resources res=getResources();
        String[] Option=res.getStringArray(R.array.Destinationoptions);
        arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,android.R.id.text1,Option);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                /*Toast.makeText(MainActivity.this, "You Clicked on"+ adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();*/
                searchView.setQuery(adapterView.getItemAtPosition(i).toString(),true);
            }
        });
        //searchView set filter
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                MainActivity.this.arrayAdapter.getFilter().filter(query);
                Intent intent=new Intent(MainActivity.this, ChooseBusStand.class);
                intent.putExtra("option",query);
                /*Toast.makeText(MainActivity.this, "Searching...", Toast.LENGTH_SHORT).show();*/
                startActivity(intent);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                MainActivity.this.arrayAdapter.getFilter().filter(newText);
                return false;
            }
        });
        /*//for coder to add data on Firebase
        EditText option;
        Button addOnFirebase;
        addOnFirebase=findViewById(R.id.addOnFirebase);
        option=findViewById(R.id.addOnFirebaseName);
        addOnFirebase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=option.getText().toString();
                if(name.isEmpty()){
                    Toast.makeText(MainActivity.this, "add first", Toast.LENGTH_SHORT).show();
                }
                else{
                    FirebaseDatabase.getInstance().getReference().child("Destinations").child("Option").setValue(name);
                }
            }
        });*/

    }

    //Created and Manipulated Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.top_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()) {
            case R.id.logout:{
                auth.signOut();
                Intent intent =new Intent(MainActivity.this,LogInActivity.class);
                startActivity(intent);
                finish();
                break;
            }
            case R.id.profile:{
                Intent intent2=new Intent(MainActivity.this,Profilepage.class);
                startActivity(intent2);
                break;
            }
            case R.id.others:{
                Intent intent3=new Intent(MainActivity.this,OthersOnMenu.class);
                startActivity(intent3);
                break;
            }
        }
        return super.onOptionsItemSelected(item);
    }
}
