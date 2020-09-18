package com.techdenovo.apps.cafe.entity;

import javax.persistence.*;

@Entity
@Table(name="TB_MENU_ITEM")
public class MenuItem {

    @Id
    @Column(name="id")
    @GeneratedValue
    private long Id;

    @Column(name="name")
    private String name;

    @Column(name="price")
    private String price;

    public MenuItem(long id, String name, String price) {
        Id = id;
        this.name = name;
        this.price = price;
    }

    public MenuItem() {
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
