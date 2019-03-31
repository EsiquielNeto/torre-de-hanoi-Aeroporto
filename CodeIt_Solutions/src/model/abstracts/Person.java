package model.abstracts;

public abstract class Person {
    protected String description;

    public Person(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Description:" + description;
    }
}
