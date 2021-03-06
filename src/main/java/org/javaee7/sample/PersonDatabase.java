package org.javaee7.sample;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Singleton;
import javax.ws.rs.NotFoundException;

/**
 * @author arungupta
 */
@Singleton
public class PersonDatabase {

    List<Person> persons;

    @PostConstruct
    public void init() {
        persons = Arrays.asList(
                new Person("Penny"), 
                new Person("Leonard"), 
                new Person("Sheldon"), 
                new Person("Amy"), 
                new Person("Howard"), 
                new Person("Bernadette"), 
                new Person("Raj"), 
                new Person("Priya"),
                new Person("Osama"),
                new Person("Askoura"),
                new Person("Jack"),
                new Person("Mike"),
                new Person("Jane"),
                new Person("Mary"),
                new Person("Katie"),
                new Person("Sprint-55"),
                new Person("Issue-100")
                );
        
    }

    public Person[] currentList() {
        return persons.toArray(new Person[0]);
    }

    public Person getPerson(int id) {
        if (id < persons.size()) {
            return persons.get(id);
        }

        throw new NotFoundException("Person with id \"" + id + "\" not found.");
    }
}
