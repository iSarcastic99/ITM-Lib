package com.example.itmlibrary.ui.home;

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

public class HomeFragment extends Fragment implements View.OnClickListener{
    

    public View onCreateView( LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);
        ImageView image = (ImageView) root.findViewById(R.id.placeimage1);
        image.setOnClickListener(this);
        return root;

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getActivity(), BookOpener.class);
        startActivity(intent);
    }
}