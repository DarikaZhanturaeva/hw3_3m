package com.geeks.hw3_3m;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;

public class MainFragment extends Fragment {
    private RecyclerView rvContacts;
    private ArrayList<String> contactList = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        loadData();
        ContactAdapter contactAdapter = new ContactAdapter(contactList);
        rvContacts.setAdapter(contactAdapter);

    }

    private void loadData() {
        contactList.add("Valida");
        contactList.add("Milana");
        contactList.add("Isa");
        contactList.add("bro");
        contactList.add("Ula");
        contactList.add("Kolya");
        contactList.add("Darika");
        contactList.add("Musa");
        contactList.add("Georgina");
        contactList.add("Azaliya");
    }

    private void initView() {
        rvContacts = requireActivity().findViewById(R.id.rv_contacts);
    }
}