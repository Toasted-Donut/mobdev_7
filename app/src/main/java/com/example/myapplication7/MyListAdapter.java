package com.example.myapplication7;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyListAdapter extends ArrayAdapter<Object> {

    private ArrayList<Object> objects;
    private Context context;

    public MyListAdapter(Context context, ArrayList<Object> objects) {
        super(context, R.layout.block_list, objects);
        this.context = context;
        this.objects = objects;
    }

    @Override
    public int getCount() {
        return objects.size();
    }

    @Override
    public Object getItem(int position) {
        return objects.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.block_list, null);
        }

        TextView textView1 = view.findViewById(R.id.numberview_id);
        TextView textView2 = view.findViewById(R.id.textview_id);

        Object object = objects.get(position);

        textView1.setText(String.valueOf(object.getNumber()));
        textView2.setText(object.getString());

        return view;
    }
}

