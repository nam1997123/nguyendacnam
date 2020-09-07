/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author NAMND
 */
public class Product {
   private String name;
   private String tag;
   private Category category;
   private double price;
    

    public Product() {
    }

    public Product(String name, String tag, Category category, double price) {
        this.name = name;
        this.tag = tag;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
     public String toString() {
        return getPrice()+", " + getName();
    }
}
