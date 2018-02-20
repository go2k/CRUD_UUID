package UUID_CRUD;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public interface CRUDDB {

    public void createPerson(Person person);
    public Person readPerson(UUID uuid);
    public List<Person> readAllPersonsWithLastName(String nachname);
    public List<Person> readAllPersons();
    public void updatePerson(Person person);
    public void deletePerson(UUID uuid);
    public void deletePerson(Person person);

}
