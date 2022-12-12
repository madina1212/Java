package services;

public interface PersonService {
    String create(Person people);


    List<Person>getPerson();
    Person getPersonFirsName(String name,List<Person>people);
}
