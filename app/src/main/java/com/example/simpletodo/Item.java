package com.example.simpletodo;
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
}
