package com.brotherjing.aademo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import com.brotherjing.aademo.beans.Word;

import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.rest.RestService;

@EActivity(R.layout.activity_main)
public class MainActivity extends ActionBarActivity {

    @RestService
    RESTClient client;

    Word word;

    @ViewById(R.id.et)
    EditText et;

    @ViewById(R.id.tv)
    TextView tv;

    @Click(R.id.btn)
    void btnClick(){
        searchWord(et.getText().toString());
    }

    @Background(id="task1")
    void searchWord(String w){
        word = client.getWord(w).getWord();
        refreshView();
    }

    @UiThread
    void refreshView(){
        tv.setText(word.getPronunciation()+"\n"+word.getDefinition());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
