package UUID_CRUD;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();

        person.setNachname("Duck");
        person.setVorname("Donald");
        System.out.println(person.toString());

        Person person1 = new Person("Daniel", "Düsentrieb");
        System.out.println(person1.toString());

        Person person2 = new Person("Daniel", "Düsentrieb", UUID.randomUUID());
        System.out.println(person2.toString());


    }


}
