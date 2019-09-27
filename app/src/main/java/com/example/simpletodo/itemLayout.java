package com.example.simpletodo;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class itemLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_layout);
        populateItemsList();
    }

    private void populateItemsList() {
        // Construct the data source
        ArrayList<Item> arrayOfItems = Item.getItems();
        // Create the adapter to convert the array to views
        ItemListAdapter adapter = new ItemListAdapter(this, arrayOfItems);
        // Attach the adapter to a ListView
        ListView listView = (ListView) findViewById(R.id.itemList);
        listView.setAdapter(adapter);

    }
}
