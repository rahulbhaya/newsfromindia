package com.rahulbhaya.newsfromindia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List <learnLanguages> availLang = new ArrayList<learnLanguages>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_headlines);
        availLang.add(new learnLanguages("HTML", R.mipmap.ic_launcher,40));
        availLang.add(new learnLanguages("Javascript", R.mipmap.ic_launcher,40));
        availLang.add(new learnLanguages("PHP", R.mipmap.ic_launcher,40));
        availLang.add(new learnLanguages("Java", R.mipmap.ic_launcher,40));

        ArrayAdapter<learnLanguages> adapter = new customAdapter();
        ListView myFirstListView = (ListView) findViewById(R.id.myFirstListView);
        myFirstListView.setAdapter(adapter);

    }

    private class customAdapter extends ArrayAdapter<learnLanguages>{
        public customAdapter(){
            super(MainActivity.this, R.layout.my_layout, availLang);
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent){
            if(convertView == null)
                convertView = LayoutInflater.from(MainActivity.this).inflate(R.layout.my_layout, parent);
            learnLanguages myCurrentLang = availLang.get(position);

            ImageView myImg = (ImageView)convertView.findViewById(R.id.leftIco);
            TextView myHeading = (TextView) convertView.findViewById(R.id.heading);
            TextView myDesc = (TextView) convertView.findViewById(R.id.desc);

            myImg.setImageResource(myCurrentLang.getImageID());
            myHeading.setText(myCurrentLang.getNameOfLang());
            myDesc.setText(String.valueOf(myCurrentLang.getTutorialNumber()));

            return convertView;
        }
    }


}


