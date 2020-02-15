package com.example.admin.broadcastbesttest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class NewscontentFragment extends Fragment {
    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_newscontent, container, false);
        return view;
    }

    public void refresh(String title, String content) {
        TextView titletext = (TextView) view.findViewById(R.id.title1);
        TextView contenttext = (TextView) view.findViewById(R.id.content);
        View viviable=view.findViewById(R.id.visibility);
        viviable.setVisibility(View.VISIBLE);
        titletext.setText(title);
        contenttext.setText(content);

    }
}

