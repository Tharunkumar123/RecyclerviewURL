package com.example.recyclerviewurl;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<DataItems> dataItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView=findViewById(R.id.recycler_view);
        dataItems =new ArrayList<>();
        CustomAdaptor objCustomAdaptor=new CustomAdaptor(getList());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(objCustomAdaptor);
    }

    private ArrayList<DataItems> getList() {
        ArrayList<DataItems> dataItems = new ArrayList<>();
//        john wick
        dataItems.add(new DataItems("https://www.fillmurray.com/640/360","John Wick","2014","Action Thriller","7.4/10"));
        dataItems.add(new DataItems("https://loremflickr.com/640/360","John Wick2","2016","Action Thriller","7.5/10"));
        dataItems.add(new DataItems("https://placekitten.com/640/360","John Wick3","2019","Action Thriller","7.9/10"));
        dataItems.add(new DataItems("https://www.fillmurray.com/640/360","John Wick4","2021","Action Thriller","8.4/10"));
//lord of the rings
        dataItems.add(new DataItems("https://loremflickr.com/640/360","Lord of the rings1","2001","Fantasy","8.8/10"));
        dataItems.add(new DataItems("https://placekitten.com/640/360","Lord of the rings2","2002","Fantasy","8.7/10"));
        dataItems.add(new DataItems("https://www.fillmurray.com/640/360","Lord of the rings3","2003","Fantasy","8.9/10"));
//        hobbit
        dataItems.add(new DataItems("https://loremflickr.com/640/360","Hobbit1","2012","Fantasy","7.8/10"));
        dataItems.add(new DataItems("https://placekitten.com/640/360","Hobbit2","2013","Fantasy","7.8/10"));
        dataItems.add(new DataItems("https://www.fillmurray.com/640/360","Hobbit3","2014","Fantasy","7.4/10"));


        dataItems.add(new DataItems("https://www.fillmurray.com/640/360","John Wick","2014","Action Thriller","7.4/10"));
        dataItems.add(new DataItems("https://loremflickr.com/640/360","John Wick2","2016","Action Thriller","7.5/10"));
        dataItems.add(new DataItems("https://placekitten.com/640/360","John Wick3","2019","Action Thriller","7.9/10"));
        dataItems.add(new DataItems("https://www.fillmurray.com/640/360","John Wick4","2021","Action Thriller","8.4/10"));
//lord of the rings
        dataItems.add(new DataItems("https://loremflickr.com/640/360","Lord of the rings1","2001","Fantasy","8.8/10"));
        dataItems.add(new DataItems("https://placekitten.com/640/360","Lord of the rings2","2002","Fantasy","8.7/10"));
        dataItems.add(new DataItems("https://www.fillmurray.com/640/360","Lord of the rings3","2003","Fantasy","8.9/10"));
//        hobbit
        dataItems.add(new DataItems("https://loremflickr.com/640/360","Hobbit1","2012","Fantasy","7.8/10"));
        dataItems.add(new DataItems("https://placekitten.com/640/360","Hobbit2","2013","Fantasy","7.8/10"));
        dataItems.add(new DataItems("https://www.fillmurray.com/640/360","Hobbit3","2014","Fantasy","7.4/10"));


        dataItems.add(new DataItems("https://www.fillmurray.com/640/360","John Wick","2014","Action Thriller","7.4/10"));
        dataItems.add(new DataItems("https://loremflickr.com/640/360","John Wick2","2016","Action Thriller","7.5/10"));
        dataItems.add(new DataItems("https://placekitten.com/640/360","John Wick3","2019","Action Thriller","7.9/10"));
        dataItems.add(new DataItems("https://www.fillmurray.com/640/360","John Wick4","2021","Action Thriller","8.4/10"));
//lord of the rings
        dataItems.add(new DataItems("https://loremflickr.com/640/360","Lord of the rings1","2001","Fantasy","8.8/10"));
        dataItems.add(new DataItems("https://placekitten.com/640/360","Lord of the rings2","2002","Fantasy","8.7/10"));
        dataItems.add(new DataItems("https://www.fillmurray.com/640/360","Lord of the rings3","2003","Fantasy","8.9/10"));
//        hobbit
        dataItems.add(new DataItems("https://loremflickr.com/640/360","Hobbit1","2012","Fantasy","7.8/10"));
        dataItems.add(new DataItems("https://placekitten.com/640/360","Hobbit2","2013","Fantasy","7.8/10"));
        dataItems.add(new DataItems("https://www.fillmurray.com/640/360","Hobbit3","2014","Fantasy","7.4/10"));


        dataItems.add(new DataItems("https://www.fillmurray.com/640/360","John Wick","2014","Action Thriller","7.4/10"));
        dataItems.add(new DataItems("https://loremflickr.com/640/360","John Wick2","2016","Action Thriller","7.5/10"));
        dataItems.add(new DataItems("https://placekitten.com/640/360","John Wick3","2019","Action Thriller","7.9/10"));
        dataItems.add(new DataItems("https://www.fillmurray.com/640/360","John Wick4","2021","Action Thriller","8.4/10"));
//lord of the rings
        dataItems.add(new DataItems("https://loremflickr.com/640/360","Lord of the rings1","2001","Fantasy","8.8/10"));
        dataItems.add(new DataItems("https://placekitten.com/640/360","Lord of the rings2","2002","Fantasy","8.7/10"));
        dataItems.add(new DataItems("https://www.fillmurray.com/640/360","Lord of the rings3","2003","Fantasy","8.9/10"));
//        hobbit
        dataItems.add(new DataItems("https://loremflickr.com/640/360","Hobbit1","2012","Fantasy","7.8/10"));
        dataItems.add(new DataItems("https://placekitten.com/640/360","Hobbit2","2013","Fantasy","7.8/10"));
        dataItems.add(new DataItems("https://www.fillmurray.com/640/360","Hobbit3","2014","Fantasy","7.4/10"));


        dataItems.add(new DataItems("https://www.fillmurray.com/640/360","John Wick","2014","Action Thriller","7.4/10"));
        dataItems.add(new DataItems("https://loremflickr.com/640/360","John Wick2","2016","Action Thriller","7.5/10"));
        dataItems.add(new DataItems("https://placekitten.com/640/360","John Wick3","2019","Action Thriller","7.9/10"));
        dataItems.add(new DataItems("https://www.fillmurray.com/640/360","John Wick4","2021","Action Thriller","8.4/10"));
//lord of the rings
        dataItems.add(new DataItems("https://loremflickr.com/640/360","Lord of the rings1","2001","Fantasy","8.8/10"));
        dataItems.add(new DataItems("https://placekitten.com/640/360","Lord of the rings2","2002","Fantasy","8.7/10"));
        dataItems.add(new DataItems("https://www.fillmurray.com/640/360","Lord of the rings3","2003","Fantasy","8.9/10"));
//        hobbit
        dataItems.add(new DataItems("https://loremflickr.com/640/360","Hobbit1","2012","Fantasy","7.8/10"));
        dataItems.add(new DataItems("https://placekitten.com/640/360","Hobbit2","2013","Fantasy","7.8/10"));
        dataItems.add(new DataItems("https://www.fillmurray.com/640/360","Hobbit3","2014","Fantasy","7.4/10"));


        dataItems.add(new DataItems("https://www.fillmurray.com/640/360","John Wick","2014","Action Thriller","7.4/10"));
        dataItems.add(new DataItems("https://loremflickr.com/640/360","John Wick2","2016","Action Thriller","7.5/10"));
        dataItems.add(new DataItems("https://placekitten.com/640/360","John Wick3","2019","Action Thriller","7.9/10"));
        dataItems.add(new DataItems("https://www.fillmurray.com/640/360","John Wick4","2021","Action Thriller","8.4/10"));
//lord of the rings
        dataItems.add(new DataItems("https://loremflickr.com/640/360","Lord of the rings1","2001","Fantasy","8.8/10"));
        dataItems.add(new DataItems("https://placekitten.com/640/360","Lord of the rings2","2002","Fantasy","8.7/10"));
        dataItems.add(new DataItems("https://www.fillmurray.com/640/360","Lord of the rings3","2003","Fantasy","8.9/10"));
//        hobbit
        dataItems.add(new DataItems("https://loremflickr.com/640/360","Hobbit1","2012","Fantasy","7.8/10"));
        dataItems.add(new DataItems("https://placekitten.com/640/360","Hobbit2","2013","Fantasy","7.8/10"));
        dataItems.add(new DataItems("https://www.fillmurray.com/640/360","Hobbit3","2014","Fantasy","7.4/10"));


        dataItems.add(new DataItems("https://www.fillmurray.com/640/360","John Wick","2014","Action Thriller","7.4/10"));
        dataItems.add(new DataItems("https://loremflickr.com/640/360","John Wick2","2016","Action Thriller","7.5/10"));
        dataItems.add(new DataItems("https://placekitten.com/640/360","John Wick3","2019","Action Thriller","7.9/10"));
        dataItems.add(new DataItems("https://www.fillmurray.com/640/360","John Wick4","2021","Action Thriller","8.4/10"));
//lord of the rings
        dataItems.add(new DataItems("https://loremflickr.com/640/360","Lord of the rings1","2001","Fantasy","8.8/10"));
        dataItems.add(new DataItems("https://placekitten.com/640/360","Lord of the rings2","2002","Fantasy","8.7/10"));
        dataItems.add(new DataItems("https://www.fillmurray.com/640/360","Lord of the rings3","2003","Fantasy","8.9/10"));
//        hobbit
        dataItems.add(new DataItems("https://loremflickr.com/640/360","Hobbit1","2012","Fantasy","7.8/10"));
        dataItems.add(new DataItems("https://placekitten.com/640/360","Hobbit2","2013","Fantasy","7.8/10"));
        dataItems.add(new DataItems("https://www.fillmurray.com/640/360","Hobbit3","2014","Fantasy","7.4/10"));



        return dataItems;
    }
}


