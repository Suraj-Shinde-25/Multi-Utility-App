package com.example.multiutilityapp.ui.todolist;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.multiutilityapp.R;

public class todolistFragment extends Fragment {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        Intent intent = new Intent(getActivity(), todolistActivity.class);
        startActivity(intent);
        return inflater.inflate(R.layout.fragment_todolist, container, false);
    }
}