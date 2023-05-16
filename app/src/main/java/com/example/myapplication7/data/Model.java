package com.example.myapplication7.data;

import android.content.Context;

import com.example.myapplication7.data.Object;
import com.example.myapplication7.ui.MyListAdapter;

import java.util.ArrayList;

public class Model {

    private ArrayList<Object> myData;
    private MyListAdapter adapter;

    public Model()
    {
        myData = new ArrayList<>();
        myData.add(new Object(0, "Hello World"));
    }

    public ArrayList<Object> getMyData() {
        return myData;
    }

    public void addMyData(String string)
    {
        myData.add(new Object(myData.size(), string));
    }

    public MyListAdapter getAdapter(Context context)
    {
        adapter = new MyListAdapter(context, myData);
        return adapter;
    }
}
