package com.finalproject.bmap;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;


public class AirportFragment extends Fragment {


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    private String mParam1;
    private String mParam2;
    RecyclerView AirportView;
    myadapter adapter3;


    public AirportFragment() {

    }


    public static AirportFragment newInstance(String param1, String param2) {
        AirportFragment fragment = new AirportFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View  view =inflater.inflate(R.layout.fragment_airport, container, false);
        AirportView=(RecyclerView)view.findViewById(R.id.AirportView);
        AirportView.setLayoutManager(new LinearLayoutManager(getContext()));

        FirebaseRecyclerOptions<model_stops> options =
                new FirebaseRecyclerOptions.Builder<model_stops>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Airport"), model_stops.class)
                        .build();

        adapter3 = new myadapter(options);
        AirportView.setAdapter(adapter3);

        return view;
    }
    @Override
    public void onStart() {
        super.onStart();
        adapter3.startListening();
    }

    @Override
    public void onStop() {
        super.onStop();
        adapter3.stopListening();
    }

}