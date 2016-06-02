package com.udacity.firebase.shoppinglistplusplus.model;

/**
 * Created by surya on 02-06-2016.
 */
public class ShoppingList {
    String listName;
    String owner;

    public ShoppingList() {
    }

    public ShoppingList(String listName, String owner) {
        this.listName = listName;
        this.owner = owner;
    }

    public String getListName() {
        return listName;
    }

    public String getOwner() {
        return owner;
    }
}
