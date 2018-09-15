package com.app.paul.guidetour.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.paul.guidetour.logic.PlacesES;
import com.app.paul.guidetour.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Adapter to display each card item of the places
 */
public class AdapterRecyclerView extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements Filterable{

    private List<PlacesES> listOfPlaces;
    private List<PlacesES> listOfPlacesFiltered;
    private final OnItemClickListener listener;

    public AdapterRecyclerView(List<PlacesES> list, OnItemClickListener listener) {
        listOfPlaces = list;
        listOfPlacesFiltered = list;
        this.listener = listener;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler, parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder) holder).name.setText(listOfPlaces.get(position).getName());
        ((ViewHolder) holder).city.setText(listOfPlaces.get(position).getCity());
        ((ViewHolder) holder).address.setText(listOfPlaces.get(position).getAddress());
        ((ViewHolder) holder).phone.setText(listOfPlaces.get(position).getPhone());
        ((ViewHolder) holder).imgPlace.setImageResource(listOfPlaces.get(position).getImg().get(0));


    }

    @Override
    public int getItemCount() {
        return listOfPlaces.size();
    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                    String query = constraint.toString();
                    List<PlacesES> listFilter = new ArrayList<>();
                    if(!query.isEmpty()){
                        for (PlacesES listOfPlace : listOfPlaces) {
                            if(listOfPlace.getName().toLowerCase().contains(query.toLowerCase())){
                                listFilter.add(listOfPlace);
                            }
                        }
                        listOfPlaces = listFilter;
                    }
                    else {
                        listOfPlaces = listOfPlacesFiltered;
                    }

                FilterResults filterResults = new FilterResults();
                filterResults.values = listOfPlaces;
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {
                listOfPlaces = (List<PlacesES>)results.values;
                notifyDataSetChanged();
            }
        };
    }

    public  class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView name;
        TextView city;
        TextView address;
        TextView phone;
        ImageView imgPlace;

        ViewHolder(@NonNull final View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.item_name);
            city = itemView.findViewById(R.id.item_city);
            address = itemView.findViewById(R.id.item_address);
            phone = itemView.findViewById(R.id.item_phone);
            imgPlace = itemView.findViewById(R.id.item_img);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            listener.onItemClick(getAdapterPosition());
        }
    }

    //On click interface
    public interface OnItemClickListener {
        void onItemClick(Integer position);
    }
}
