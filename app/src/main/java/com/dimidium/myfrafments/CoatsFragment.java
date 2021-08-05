package com.dimidium.myfrafments;

import android.content.res.TypedArray;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.lang.reflect.Type;

public class CoatsFragment extends Fragment {

    public static final String ARG_INDEX = "index";
    public int index;

    public static CoatsFragment newInstance(int index) {
        CoatsFragment f = new CoatsFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_INDEX,index);
        f.setArguments(args);
        return f;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            index = getArguments().getInt(ARG_INDEX);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_coats, container, false);
    }

    public void  onViewCreated(@NonNull View view, @Nullable Bundle saveInstanceState){
        super.onViewCreated(view, saveInstanceState);
        AppCompatImageView imageCoat = view.findViewById(R.id.coats);
        TypedArray images = getResources().obtainTypedArray(R.array.coats_img);
        imageCoat.setImageResource(images.getResourceId(index,-1));
    }

}