package com.example.simpletodo;

import java.util.ArrayList;
import java.util.Date;

public class Item {
    private String description;
    private Date dueDate;

    public Item(String description, Date dueDate) {
        this.description = description;
        this.dueDate = dueDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public static ArrayList<Item> getItems() {
        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item("Do Homework", new Date(2019, 9, 30)));
        items.add(new Item("Make doctor's appointment", new Date(2019, 9, 30)));
        items.add(new Item("Call mom and dad", new Date(2019, 9, 30)));
        return items;
    }
}
