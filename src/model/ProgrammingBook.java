package model;

import java.io.Serializable;

public class ProgrammingBook extends Book implements Serializable {
    private String language;
    private String framework;

    public ProgrammingBook() {
    }

    public ProgrammingBook(String bookCode, String name, int price, String author, String language, String framework) {
        super(bookCode, name, price, author);
        this.language = language;
        this.framework = framework;
    }

    public ProgrammingBook(String language, String framework) {
        this.language = language;
        this.framework = framework;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    @Override
    public String toString() {
        return super.toString()+"ProgrammingBook{" +
                "language='" + language + '\'' +
                ", framework='" + framework + '\'' +
                '}';
    }
}
