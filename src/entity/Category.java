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
public class Category {
   private String name;
   private String categoryTag;

    public Category() {
    }

    public Category(String name, String categoryTag) {
        this.name = name;
        this.categoryTag = categoryTag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategoryTag() {
        return categoryTag;
    }

    public void setCategoryTag(String categoryTag) {
        this.categoryTag = categoryTag;
    }

    
    
}
