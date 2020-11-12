package com.example.bicyclefinder;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BikeDetailsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BikeDetailsFragment extends Fragment {
    private long bikesid;

    static interface Listener{
        void itemClicked(long id);
    };
    private Listener listener;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public BikeDetailsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AllBikesListFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BikeDetailsFragment newInstance(String param1, String param2) {
        BikeDetailsFragment fragment = new BikeDetailsFragment();
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
        String[] brand = new String[Bikes.bikes.length];
        for (int i = 0; i <brand.length; i++)
            brand[i] = Bikes.bikes[i].getBrand();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                inflater.getContext(), android.R.layout.simple_list_item_1, brand;
        setListAdapter(adapter);
        return inflater.inflate(R.layout.activity_all_bikes_details, container, false);
        // Inflate the layout for this fragment

    } @Override
    public void onAttach(Context context){
        super.onAttach(context);
        this.listener = (Listener) context;

    } @Override
    public void onListItemClick(ListView listView, View itemView, int position, long id){
        if (listener != null){
            listener.itemClicked(id);
        }
    }

}