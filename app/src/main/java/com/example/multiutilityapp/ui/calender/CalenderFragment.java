package com.example.multiutilityapp.ui.calender;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.multiutilityapp.R;

public class CalenderFragment extends Fragment {
//    ImageView image;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_calender, container, false);
        ImageView imageView = view.findViewById(R.id.imageViewJan);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the activity when the ImageView is clicked.
                String textToPass = "Hello, Activity!";
                int imageResource = R.drawable.jan1;
//                String id = jan;

                Bundle bundle = new Bundle();
                bundle.putString("key_text", textToPass);
                bundle.putInt("key_image", imageResource);

                Intent intent = new Intent(getActivity(), CalenderActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }

}