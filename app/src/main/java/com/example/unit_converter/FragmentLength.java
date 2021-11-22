package com.example.unit_converter;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class FragmentLength extends Fragment {
    private Activity view;

    private Spinner mCateNum1;
    private Spinner mCateNum2;
    private EditText num1;
    private EditText num2;

    private static final String[] unit = {"mm","cm"};
    // Spinner를 초기화 하기 위해서는 getActivity()가 아닌 view를 사용하여야 했다.
    // 왜냐하면 스피너는 액티비티가 아닌 fragment위의 spinner이기 때문이다.

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_length, container, false);

        mCateNum1 = (Spinner)view.findViewById(R.id.CateNum1);
        mCateNum2 = (Spinner)view.findViewById(R.id.CateNum2);

        num1 = (EditText) view.findViewById(R.id.InputNum1);
        num2 = (EditText) view.findViewById(R.id.InputNum2);

        ArrayAdapter<String> unitAdapter1 = new ArrayAdapter<String>(getActivity(),
                R.layout.support_simple_spinner_dropdown_item,unit);
        mCateNum1.setAdapter(unitAdapter1);
        mCateNum1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){


            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(getActivity(),Integer.toString(position),Toast.LENGTH_SHORT).show();
                float Fnum1 = Float.parseFloat(String.valueOf(num1.getText()));
                float Fnum2 = Integer.parseInt(String.valueOf(num2.getText()));
                switch (position){
                    case 0:
                        num1.setText(String.valueOf(Fnum2*10));
                        break;
                    case 1:
                        num1.setText(String.valueOf(Fnum2/10));
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });

        ArrayAdapter<String> unitAdapter2 = new ArrayAdapter<String>(getActivity(),
                R.layout.support_simple_spinner_dropdown_item,unit);
        mCateNum2.setAdapter(unitAdapter2);
        mCateNum2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("mm");
        nameList.add("cm");

        RecyclerView recyclerView = view.findViewById(R.id.UnitList);
        //어댑터 추가
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(nameList);
        recyclerView.setAdapter(adapter);
        //레이아웃 매니저 추가
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);


        return view;


    }



}