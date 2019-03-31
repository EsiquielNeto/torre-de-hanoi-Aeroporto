package model.abstracts;

import model.interfaces.Accommodatable;

import java.util.ArrayList;
import java.util.List;

public abstract class Place implements Accommodatable {
    protected List<Person> personList = new ArrayList<>();

    public void addPerson(Person person) {
        this.personList.add(person);
        System.out.println("Movendo " + person.description + " para " + this.getClass().getSimpleName() + " \n");
    }

    public void removePerson(Person person) {
        this.personList.remove(person);
    }


    public Person removePerson(int index) {
        return this.personList.remove(index);
    }
}
