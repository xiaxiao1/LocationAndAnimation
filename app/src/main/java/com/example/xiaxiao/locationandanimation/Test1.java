package com.example.xiaxiao.locationandanimation;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test1 extends AppCompatActivity {
    private Button button = null;
    private ListView listView = null;
    SimpleAdapter simpleAdapter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test1);
        listView = (ListView)findViewById(R.id.list);
        button = (Button)findViewById(R.id.button);
        createListAdapter();
    }
    private void createListAdapter() {
        List<HashMap<String,String>> list =
                new ArrayList<HashMap<String,String>>();

        for (int i=0;i<50;i++) {
            HashMap<String,String> m = new HashMap<String,String>();
            m.put("name", "boolbe "+i);
            m.put("sex", "male "+i);
            list.add(m);
        }
         simpleAdapter = new SimpleAdapter(
                this,list,R.layout.item,new String[]{"name","sex"},
                new int[]{R.id.name,R.id.sex});
        listView.setAdapter(simpleAdapter);
    }

    private class ButtonListener implements View.OnClickListener {
        public void onClick(View v) {
            createListAdapter();
        }
    }
}