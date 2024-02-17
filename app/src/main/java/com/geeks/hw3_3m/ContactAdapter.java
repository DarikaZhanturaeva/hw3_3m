package com.geeks.hw3_3m;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactViewHolder> {
    private ArrayList<String> contactList;

    public ContactAdapter(ArrayList<String> contactList) {
        this.contactList = contactList;
    }


    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContactViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder viewHolder, int position) {

        viewHolder.OnBind(contactList.get(position));
        if (position % 2 == 0) {
            viewHolder.itemView.setBackgroundResource(R.color.pink);
        } else {
        }

    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }
}
