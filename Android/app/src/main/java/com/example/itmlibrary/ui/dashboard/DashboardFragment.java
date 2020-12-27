package com.example.itmlibrary.ui.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.itmlibrary.BookOpener;
import com.example.itmlibrary.R;

public class DashboardFragment extends Fragment {



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        final TextView textView = root.findViewById(R.id.text_dashboard);
        ImageView image = (ImageView) root.findViewById(R.id.placeimage1);
        ImageView image2 = (ImageView) root.findViewById(R.id.placeimage2);
        ImageView image3 = (ImageView) root.findViewById(R.id.placeimage3);
        ImageView image4 = (ImageView) root.findViewById(R.id.placeimage4);
        ImageView image5 = (ImageView) root.findViewById(R.id.placeimage5);
        ImageView image6 = (ImageView) root.findViewById(R.id.placeimage6);

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), BookOpener.class);
                intent.putExtra("Bookname", "DBMS");
                startActivity(intent);
            }
        });

        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), BookOpener.class);
                intent.putExtra("Bookname", "Chad_Fowler_-_The_Passionate_Programmer,_2nd_edition");
                startActivity(intent);
            }
        });

        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), BookOpener.class);
                intent.putExtra("Bookname", "Introduction_to_algorithms");
                startActivity(intent);
            }
        });

        image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), BookOpener.class);
                intent.putExtra("Bookname", "Avengers_Endgame");
                startActivity(intent);
            }
        });

        image6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), BookOpener.class);
                intent.putExtra("Bookname", "DBMS");
                startActivity(intent);
            }
        });

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), BookOpener.class);
                intent.putExtra("Bookname", "Atomic_Habits");
                startActivity(intent);
            }
        });
        return root;
    }
}