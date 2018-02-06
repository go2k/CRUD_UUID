package UUID_CRUD;

import java.util.UUID;

public class Person extends Datensatz{

    private String vorname;
    private String nachname;

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public Person() {
        super();
    }


    public Person(String vorname, String nachname) {
        super();
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public Person(String vorname, String nachname, UUID id) {
        super(id);
        this.vorname = vorname;
        this.nachname = nachname;
    }
    @Override

    public String toString() {
        return "Person{" +
                "vorname='" + getVorname() + '\'' +
                ", nachname='" + getNachname() + '\'' +
                ", id='" + getUuid() + '\'' +
                '}';
    }
}
