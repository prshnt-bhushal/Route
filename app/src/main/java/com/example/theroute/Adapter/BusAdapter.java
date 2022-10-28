package com.example.theroute.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/*import com.bumptech.glide.Glide;*/
import com.example.theroute.Model.BusModel;
import com.example.theroute.R;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

// FirebaseRecyclerAdapter is a class provided by
// FirebaseUI. it provides functions to bind, adapt and show
// database contents in a Recycler View
public class BusAdapter extends FirebaseRecyclerAdapter<BusModel,BusAdapter.busViewHolder>{
    public BusAdapter(@NonNull FirebaseRecyclerOptions<BusModel> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull busViewHolder holder, int position, @NonNull BusModel model) {
        holder.bus_name.setText(model.name.toUpperCase());
        holder.bus_desc.setText(model.description);
        holder.bus_num.setText(model.busno);
    }

    @NonNull
    @Override
    public busViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView=LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_option_bus,parent,false);
        return new BusAdapter.busViewHolder(mView);
    }

    class busViewHolder extends RecyclerView.ViewHolder{
        TextView bus_name,bus_desc,bus_num;
        public busViewHolder(@NonNull View itemView) {
            super(itemView);
            bus_name=itemView.findViewById(R.id.busName);
            bus_desc=itemView.findViewById(R.id.busDescription);
            bus_num=itemView.findViewById(R.id.busNumber);
        }
    }
}
