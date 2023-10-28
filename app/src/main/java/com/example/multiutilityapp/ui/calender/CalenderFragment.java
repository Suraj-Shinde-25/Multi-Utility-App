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
    ImageView imageView1, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10, imageView11, imageView12;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_calender, container, false);

        imageView1 = view.findViewById(R.id.imageViewJan);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the activity when the ImageView is clicked.
                String textToPass = "January";
                int imageResource = R.drawable.jan1;

                Bundle bundle = new Bundle();
                bundle.putString("key_text", textToPass);
                bundle.putInt("key_image", imageResource);

                Intent intent = new Intent(getActivity(), CalenderActivity.class);
                intent.putExtra("name",textToPass);
                intent.putExtra("image",imageResource);
                startActivity(intent);
            }
        });

        imageView2 = view.findViewById(R.id.imageViewFeb);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the activity when the ImageView is clicked.
                String textToPass = "February";
                int imageResource = R.drawable.feb2;

                Bundle bundle = new Bundle();
                bundle.putString("key_text", textToPass);
                bundle.putInt("key_image", imageResource);

                Intent intent = new Intent(getActivity(), CalenderActivity.class);
                intent.putExtra("name",textToPass);
                intent.putExtra("image",imageResource);
                startActivity(intent);
            }
        });
        imageView3 = view.findViewById(R.id.imageViewMar);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the activity when the ImageView is clicked.
                String textToPass = "March";
                int imageResource = R.drawable.mar2;

                Bundle bundle = new Bundle();
                bundle.putString("key_text", textToPass);
                bundle.putInt("key_image", imageResource);

                Intent intent = new Intent(getActivity(), CalenderActivity.class);
                intent.putExtra("name",textToPass);
                intent.putExtra("image",imageResource);
                startActivity(intent);
            }
        });
        imageView4 = view.findViewById(R.id.imageViewApr);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the activity when the ImageView is clicked.
                String textToPass = "April";
                int imageResource = R.drawable.apr2;

                Bundle bundle = new Bundle();
                bundle.putString("key_text", textToPass);
                bundle.putInt("key_image", imageResource);

                Intent intent = new Intent(getActivity(), CalenderActivity.class);
                intent.putExtra("name",textToPass);
                intent.putExtra("image",imageResource);
                startActivity(intent);
            }
        });
        imageView5 = view.findViewById(R.id.imageViewMay);
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the activity when the ImageView is clicked.
                String textToPass = "May";
                int imageResource = R.drawable.may2;

                Bundle bundle = new Bundle();
                bundle.putString("key_text", textToPass);
                bundle.putInt("key_image", imageResource);

                Intent intent = new Intent(getActivity(), CalenderActivity.class);
                intent.putExtra("name",textToPass);
                intent.putExtra("image",imageResource);
                startActivity(intent);
            }
        });
        imageView6 = view.findViewById(R.id.imageViewJun);
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the activity when the ImageView is clicked.
                String textToPass = "June";
                int imageResource = R.drawable.jun2;

                Bundle bundle = new Bundle();
                bundle.putString("key_text", textToPass);
                bundle.putInt("key_image", imageResource);

                Intent intent = new Intent(getActivity(), CalenderActivity.class);
                intent.putExtra("name",textToPass);
                intent.putExtra("image",imageResource);
                startActivity(intent);
            }
        });
        imageView7 = view.findViewById(R.id.imageViewJul);
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the activity when the ImageView is clicked.
                String textToPass = "July";
                int imageResource = R.drawable.jul2;

                Bundle bundle = new Bundle();
                bundle.putString("key_text", textToPass);
                bundle.putInt("key_image", imageResource);

                Intent intent = new Intent(getActivity(), CalenderActivity.class);
                intent.putExtra("name",textToPass);
                intent.putExtra("image",imageResource);
                startActivity(intent);
            }
        });
        imageView8 = view.findViewById(R.id.imageViewAug);
        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the activity when the ImageView is clicked.
                String textToPass = "August";
                int imageResource = R.drawable.aug2;

                Bundle bundle = new Bundle();
                bundle.putString("key_text", textToPass);
                bundle.putInt("key_image", imageResource);

                Intent intent = new Intent(getActivity(), CalenderActivity.class);
                intent.putExtra("name",textToPass);
                intent.putExtra("image",imageResource);
                startActivity(intent);
            }
        });
        imageView9 = view.findViewById(R.id.imageViewSep);
        imageView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the activity when the ImageView is clicked.
                String textToPass = "September";
                int imageResource = R.drawable.sept2;

                Bundle bundle = new Bundle();
                bundle.putString("key_text", textToPass);
                bundle.putInt("key_image", imageResource);

                Intent intent = new Intent(getActivity(), CalenderActivity.class);
                intent.putExtra("name",textToPass);
                intent.putExtra("image",imageResource);
                startActivity(intent);
            }
        });
        imageView10 = view.findViewById(R.id.imageViewOct);
        imageView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the activity when the ImageView is clicked.
                String textToPass = "October";
                int imageResource = R.drawable.oct2;

                Bundle bundle = new Bundle();
                bundle.putString("key_text", textToPass);
                bundle.putInt("key_image", imageResource);

                Intent intent = new Intent(getActivity(), CalenderActivity.class);
                intent.putExtra("name",textToPass);
                intent.putExtra("image",imageResource);
                startActivity(intent);
            }
        });
        imageView11 = view.findViewById(R.id.imageViewNov);
        imageView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the activity when the ImageView is clicked.
                String textToPass = "November";
                int imageResource = R.drawable.nov2;

                Bundle bundle = new Bundle();
                bundle.putString("key_text", textToPass);
                bundle.putInt("key_image", imageResource);

                Intent intent = new Intent(getActivity(), CalenderActivity.class);
                intent.putExtra("name",textToPass);
                intent.putExtra("image",imageResource);
                startActivity(intent);
            }
        });
        imageView12 = view.findViewById(R.id.imageViewDec);
        imageView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the activity when the ImageView is clicked.
                String textToPass = "December";
                int imageResource = R.drawable.dec2;

                Bundle bundle = new Bundle();
                bundle.putString("key_text", textToPass);
                bundle.putInt("key_image", imageResource);

                Intent intent = new Intent(getActivity(), CalenderActivity.class);
                intent.putExtra("name",textToPass);
                intent.putExtra("image",imageResource);
                startActivity(intent);
            }
        });

        return view;
    }

}