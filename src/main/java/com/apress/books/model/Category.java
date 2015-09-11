package com.apress.books.model;

/**
 * Created by Rekish on 9/11/2015.
 */
public class Category {
    private Long id;
    private String categoryDescription;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public String toString() {
        return "Category - Id: " + id + ", Category Description: "
                    + categoryDescription;
    }
}
