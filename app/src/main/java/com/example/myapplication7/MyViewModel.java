package com.example.myapplication7;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    private MutableLiveData<String> EditText = new MutableLiveData<>();

    public LiveData<String> getEditText() {
        return EditText;
    }

    public void updateEditText(String data) {
        EditText.setValue(data);
    }

    private MutableLiveData<String> TextView = new MutableLiveData<>();

    public LiveData<String> getTextView() {
        return TextView;
    }

    public void updateTextView(String data) {
        EditText.setValue(data);
    }

    private Model model;



    public MyViewModel(){
        model = new Model();
    };

    public MyListAdapter setAdapter(Context context)
    {
        return model.getAdapter(context);
    }

    public MyListAdapter updateAdapter(Context context)
    {
        model.addMyData(EditText.getValue());
        return setAdapter(context);
    }

    public void newTextView(android.widget.TextView view)
    {
        TextView.setValue(view.getText().toString());
    }

}
