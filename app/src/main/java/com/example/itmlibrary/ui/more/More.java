package com.example.itmlibrary.ui.more;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.itmlibrary.R;
import com.example.itmlibrary.ui.login.LoginActivity;

/**
 * A fragment representing a list of Items.
 */
public class More extends Fragment {

    String S;
    int i;
    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    // TODO: Customize parameters
    private int mColumnCount = 1;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public More() {
    }

    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static More newInstance(int columnCount) {
        More fragment = new More();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        SharedPreferences preferences = getSharedPreferences(S, i);
//        name = preferences.getString("Username", "No name");

        if (getArguments() != null) {
            mColumnCount = getArguments().getInt(ARG_COLUMN_COUNT);
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_more, container, false);
        final TextView textView = root.findViewById(R.id.logout);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor1 = getActivity().getSharedPreferences(S, i).edit();
                editor1.putString("Status", "No");
                editor1.apply();
                Intent intent = new Intent(getActivity(), LoginActivity.class);
                startActivity(intent);
                getActivity().finishAffinity();
            }
        });
        return root;
    }
}