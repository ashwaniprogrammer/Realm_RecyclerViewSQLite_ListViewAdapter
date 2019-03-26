package com.example.realm_recyclerviewsqlite_listviewadapter;

public class RealmLists {
    String name,email,blog;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getBlog() {
        return blog;
    }

    public RealmLists(String name, String email, String blog) {
        this.name = name;
        this.email = email;
        this.blog = blog;
    }
}
