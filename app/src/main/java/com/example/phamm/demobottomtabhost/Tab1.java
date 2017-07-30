package com.example.phamm.demobottomtabhost;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by phamm on 7/30/2017.
 */

public class Tab1 extends ListFragment {
    String[] arr = new String[10];

    ArrayAdapter adapter;
    Button btnthem;
    ArrayList<String> arr1;
    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab1,container,false);
        btnthem = (Button) view.findViewById(R.id.buttonNhap);
        arr[0] = "C++";
        arr[1] = "PHP";
        arr[2] = "C#";
        arr[3] = "IOS";
        arr[4] = "ANDROID STUDIO";

        arr1 = new ArrayList<>();
        arr1.add("Android");
        arr1.add("Java");
        arr1.add("Nodejs");
        arr1.add("JS");
        arr1.add("UNITY");
        adapter = new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1,arr1);
        setListAdapter(adapter);
        btnthem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(arr[0]==null){

                    Toast.makeText(getActivity(),"Không Còn Data Để Thêm Item", Toast.LENGTH_SHORT).show();
                }else {
                    arr1.add(arr[0]);
                    delete(arr,0);
                    adapter.notifyDataSetChanged();
                }
            }
        });

        return view;
    }
    public void delete(String []a,int n){
        for(int i = n+1;i<arr.length;i++){
             a[i-1]=a[i];
        }
        n--;
    }

}