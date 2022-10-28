package com.example.theroute;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.theroute.Adapter.BusStandAdapter;

public class ChooseBusStand extends AppCompatActivity {
    ListView showOptions;
    Button button;
    String a;
   /* MapsActivity mapsActivity;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*mapsActivity=new MapsActivity(1);*/
        /*Intent map=new Intent(this,MapsActivity.class);
        map.putExtra("whichMap","1");*/
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_bus_stand);
        showOptions=findViewById(R.id.listViewoptionForBusStand);
        Intent intent=getIntent();
        button=findViewById(R.id.buttonToGoMap);
        a=intent.getStringExtra("option").toLowerCase();
        //To get data from string.xml we should import android.content.res.Resources; and then following 2 lines of codes should help.
        Resources res=getResources();
        try {
            switch (a) {
                case "chandragiri":
                    String[] Option0 = res.getStringArray(R.array.busOptionsForChandragiri);
                    //First we created manual adapter and we invoked it with the help of 2 lines of codes.
                    BusStandAdapter Op = new BusStandAdapter(this, R.layout.layout_option_bus_stand, Option0);
                    showOptions.setAdapter(Op);
                    showOptions.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            Intent intent1=new Intent(ChooseBusStand.this, ChooseBus.class);
                            intent1.putExtra("$Name",Op.getItem(position));
                            intent1.putExtra("$main",a);
                            startActivity(intent1);
                        }
                    });
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(ChooseBusStand.this, "Opening Map... please Wait", Toast.LENGTH_SHORT).show();
                            Intent intent1 = new Intent(ChooseBusStand.this, MapsActivity.class);
                            intent1.putExtra("optionMap", "0");
                            startActivity(intent1);

                        }
                    });
                    break;
                case "sundarijal":
                    String[] Option1 = res.getStringArray(R.array.busOptionsForSundarijal);
                    //First we created manual adapter and we invoked it with the help of 2 lines of codes.
                    BusStandAdapter Op1 = new BusStandAdapter(this, R.layout.layout_option_bus_stand, Option1);
                    showOptions.setAdapter(Op1);
                    showOptions.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            Intent intent1=new Intent(ChooseBusStand.this, ChooseBus.class);
                            intent1.putExtra("$Name",Op1.getItem(position));
                            intent1.putExtra("$main",a);
                            startActivity(intent1);
                        }
                    });
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(ChooseBusStand.this, "Opening Map... please Wait", Toast.LENGTH_SHORT).show();
                            Intent intent1 = new Intent(ChooseBusStand.this, MapsActivity.class);
                            intent1.putExtra("optionMap", "1");
                            startActivity(intent1);

                        }
                    });
                    break;
                case "sanga":
                    String[] Option2 = res.getStringArray(R.array.busOptionsForSanga);
                    //First we created manual adapter and we invoked it with the help of 2 lines of codes.
                    BusStandAdapter Op2 = new BusStandAdapter(this, R.layout.layout_option_bus_stand, Option2);
                    showOptions.setAdapter(Op2);
                    showOptions.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            Intent intent1=new Intent(ChooseBusStand.this, ChooseBus.class);
                            intent1.putExtra("$Name",Op2.getItem(position));
                            intent1.putExtra("$main",a);
                            startActivity(intent1);
                        }
                    });
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(ChooseBusStand.this, "Opening Map... please Wait", Toast.LENGTH_SHORT).show();
                            Intent intent1 = new Intent(ChooseBusStand.this, MapsActivity.class);
                            intent1.putExtra("optionMap", "2");
                            startActivity(intent1);

                        }
                    });
                    break;
                case "ratnapark":
                    String[] Option3 = res.getStringArray(R.array.busOptionsForRatnaPark);
                    //First we created manual adapter and we invoked it with the help of 2 lines of codes.
                    BusStandAdapter Op3 = new BusStandAdapter(this, R.layout.layout_option_bus_stand, Option3);
                    showOptions.setAdapter(Op3);
                    showOptions.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            Intent intent1=new Intent(ChooseBusStand.this, ChooseBus.class);
                            intent1.putExtra("$Name",Op3.getItem(position));
                            intent1.putExtra("$main",a);
                            startActivity(intent1);
                        }
                    });
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(ChooseBusStand.this, "Opening Map... please Wait", Toast.LENGTH_SHORT).show();
                            Intent intent1 = new Intent(ChooseBusStand.this, MapsActivity.class);
                            intent1.putExtra("optionMap", "3");
                            startActivity(intent1);

                        }
                    });
                    break;
                case "champadevi":
                    String[] Option4 = res.getStringArray(R.array.busOptionsForChampadevi);
                    //First we created manual adapter and we invoked it with the help of 2 lines of codes.
                    BusStandAdapter Op4 = new BusStandAdapter(this, R.layout.layout_option_bus_stand, Option4);
                    showOptions.setAdapter(Op4);
                    showOptions.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            Intent intent1=new Intent(ChooseBusStand.this, ChooseBus.class);
                            intent1.putExtra("$Name",Op4.getItem(position));
                            intent1.putExtra("$main",a);
                            startActivity(intent1);
                        }
                    });
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(ChooseBusStand.this, "Opening Map... please Wait", Toast.LENGTH_SHORT).show();
                            Intent intent1 = new Intent(ChooseBusStand.this, MapsActivity.class);
                            intent1.putExtra("optionMap", "4");
                            startActivity(intent1);

                        }
                    });
                    break;
                case "kalanki":
                    String[] Option5 = res.getStringArray(R.array.busOptionsForKalanki);
                    //First we created manual adapter and we invoked it with the help of 2 lines of codes.
                    BusStandAdapter Op5 = new BusStandAdapter(this, R.layout.layout_option_bus_stand, Option5);
                    showOptions.setAdapter(Op5);
                    showOptions.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            Intent intent1=new Intent(ChooseBusStand.this, ChooseBus.class);
                            intent1.putExtra("$Name",Op5.getItem(position));
                            intent1.putExtra("$main",a);
                            startActivity(intent1);
                        }
                    });
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(ChooseBusStand.this, "Opening Map... please Wait", Toast.LENGTH_SHORT).show();
                            Intent intent1 = new Intent(ChooseBusStand.this, MapsActivity.class);
                            intent1.putExtra("optionMap", "5");
                            startActivity(intent1);

                        }
                    });
                    break;
                case "pilot baba":
                    String[] Option6 = res.getStringArray(R.array.busOptionsForPilotBaba);
                    //First we created manual adapter and we invoked it with the help of 2 lines of codes.
                    BusStandAdapter Op6 = new BusStandAdapter(this, R.layout.layout_option_bus_stand, Option6);
                    showOptions.setAdapter(Op6);
                    showOptions.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            Intent intent1=new Intent(ChooseBusStand.this, ChooseBus.class);
                            intent1.putExtra("$Name",Op6.getItem(position));
                            intent1.putExtra("$main",a);
                            startActivity(intent1);
                        }
                    });
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(ChooseBusStand.this, "Opening Map... please Wait", Toast.LENGTH_SHORT).show();
                            Intent intent1 = new Intent(ChooseBusStand.this, MapsActivity.class);
                            intent1.putExtra("optionMap", "6");
                            startActivity(intent1);

                        }
                    });
                    break;
                case "doleswor mahadev":
                    String[] Option7 = res.getStringArray(R.array.busOptionsForDoleshworMahadev);
                    //First we created manual adapter and we invoked it with the help of 2 lines of codes.
                    BusStandAdapter Op7 = new BusStandAdapter(this, R.layout.layout_option_bus_stand, Option7);
                    showOptions.setAdapter(Op7);
                    showOptions.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            Intent intent1=new Intent(ChooseBusStand.this, ChooseBus.class);
                            intent1.putExtra("$Name",Op7.getItem(position));
                            intent1.putExtra("$main",a);
                            startActivity(intent1);
                        }
                    });
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(ChooseBusStand.this, "Opening Map... please Wait", Toast.LENGTH_SHORT).show();
                            Intent intent1 = new Intent(ChooseBusStand.this, MapsActivity.class);
                            intent1.putExtra("optionMap", "7");
                            startActivity(intent1);

                        }
                    });
                    break;
                case "nagarkot":
                    String[] Option8 = res.getStringArray(R.array.busOptionsForNagarkot);
                    //First we created manual adapter and we invoked it with the help of 2 lines of codes.
                    BusStandAdapter Op8 = new BusStandAdapter(this, R.layout.layout_option_bus_stand, Option8);
                    showOptions.setAdapter(Op8);
                    showOptions.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                            Intent intent1=new Intent(ChooseBusStand.this, ChooseBus.class);
                            intent1.putExtra("$Name",Op8.getItem(position));
                            intent1.putExtra("$main",a);
                            startActivity(intent1);
                        }
                    });
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(ChooseBusStand.this, "Opening Map... please Wait", Toast.LENGTH_SHORT).show();
                            Intent intent1 = new Intent(ChooseBusStand.this, MapsActivity.class);
                            intent1.putExtra("optionMap", "8");
                            startActivity(intent1);

                        }
                    });
                    break;
                case "dhulikhel":
                    String[] Option9 = res.getStringArray(R.array.busOptionsForDhulikhel);
                    //First we created manual adapter and we invoked it with the help of 2 lines of codes.
                    BusStandAdapter Op9 = new BusStandAdapter(this, R.layout.layout_option_bus_stand, Option9);
                    showOptions.setAdapter(Op9);
                    showOptions.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            Intent intent1=new Intent(ChooseBusStand.this, ChooseBus.class);
                            intent1.putExtra("$Name",Op9.getItem(position));
                            intent1.putExtra("$main",a);
                            startActivity(intent1);
                        }
                    });
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(ChooseBusStand.this, "Opening Map... please Wait", Toast.LENGTH_SHORT).show();
                            Intent intent1 = new Intent(ChooseBusStand.this, MapsActivity.class);
                            intent1.putExtra("optionMap", "9");
                            startActivity(intent1);

                        }
                    });
                    break;
                default:
                    Toast.makeText(this, "Sorry We can't help you on this Destination.", Toast.LENGTH_SHORT).show();
            }
        } catch(RuntimeException e){
//           Toast.makeText(this, "Error"+ e, Toast.LENGTH_SHORT).show();
            Intent intent1=new Intent(ChooseBusStand.this, ChooseBusStand.class);
            startActivity(intent1);
            finish();
        }
    }
}