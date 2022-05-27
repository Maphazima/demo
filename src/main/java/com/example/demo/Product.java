package com.example.demo;

import lombok.Data;

import javax.persistence.*;
@Entity
@Data

public class Product {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name ="name")
    private String name;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id =id;
    }
    public String getName(){
    return name;
    }
    public void setName(String name){
        this.name= name;
    }

    @Override
    public String toString(){
        return "Product[id="+ id + ", name"+ name +")";
    }
}
