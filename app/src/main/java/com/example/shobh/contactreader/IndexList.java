package com.example.shobh.contactreader;


import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.Loader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class IndexList extends Fragment {

    Button bt1,bt2,bt3,bt4,bt5;
    private FragmentInteractionListener listener;

    @Override
    public void onAttach(Context context)
    {
        super.onAttach(context);
        if(context instanceof FragmentInteractionListener){
            listener=(FragmentInteractionListener) context;
        }
        else
        {
            throw new RuntimeException("must implement interface");
        }
    }

    public IndexList() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_index_list, container, false);

        bt1=v.findViewById(R.id.b1);
        bt2=v.findViewById(R.id.b2);
        bt3=v.findViewById(R.id.b3);
        bt4=v.findViewById(R.id.b4);
        bt5=v.findViewById(R.id.b5);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            listener.itemClicked(1);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            listener.itemClicked(2);
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.itemClicked(3);
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            listener.itemClicked(4);
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.itemClicked(5);
            }
        });
        return v;
    }

    public interface FragmentInteractionListener {
        void itemClicked(int p0);
    }
}
