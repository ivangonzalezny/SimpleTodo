package com.example.simpletodo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ItemListAdapter extends ArrayAdapter {

    private Context context;
    private List<Item> itemList;

    public ItemListAdapter(Context context, List<Item> itemList) {
        super(context, 0, itemList);
    }

    @Override
    public int getCount() {
        return itemList.size();
    }

    @Override
    public Object getItem(int position) {
        return itemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View v = View.inflate(context, R.layout.activity_main, null);
        TextView item_description = (TextView)v.findViewById(R.id.item_description);
        TextView item_due_date = (TextView)v.findViewById(R.id.item_due_date);

        // set text
        item_description.setText(itemList.get(position).getDescription());
        item_due_date.setText(itemList.get(position).getDueDate().toString());

        return v;
    }

//    public void add(Item item) {
//        itemList.add(item);
//    }
}
