package model;

import java.io.Serializable;

public class FictionBook extends Book implements Serializable {
    private String category;

    public FictionBook(String bookCode, String name, int price, String author, String category) {
        super(bookCode, name, price, author);
        this.category = category;
    }

    public FictionBook() {
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return super.toString()+"FictionBook{" +
                "category='" + category + '\'' +
                '}';
    }
}