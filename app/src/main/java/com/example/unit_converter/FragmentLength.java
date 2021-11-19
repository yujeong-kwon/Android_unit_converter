package com.example.unit_converter;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class FragmentLength extends Fragment {
    private Activity view;

    private Spinner mCateNum1;
    private Spinner mCateNum2;

    private static final String[] unit = {"mm","cm"};
    // Spinner를 초기화 하기 위해서는 getActivity()가 아닌 view를 사용하여야 했다.
    // 왜냐하면 스피너는 액티비티가 아닌 fragment위의 spinner이기 때문이다.

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_length, container, false);



        //ArrayAdapter<String> unitAdapter = new ArrayAdapter<String>(getActivity(),
        //        R.layout.support_simple_spinner_dropdown_item,unit);
        //unitAdapter.set();


        return view;


    }
    public void onStart(){
        super.onStart();
        addItemsOnSpinner();
    }
    public void addItemsOnSpinner(){
        //mCateNum1 = (Spinner)view.findViewById(R.id.CateNum1);
        //mCateNum2 = (Spinner)view.findViewById(R.id.CateNum2);
        //mCateNum1.setOnItemClickListener(new CustomOnLtemSelectedListener());

        //ArrayAdapter<String> unitAdapter = ArrayAdapter.createFromResource(getActivity());

    }
}