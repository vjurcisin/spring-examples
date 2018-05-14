package sk.jurcisin.app.model;

public class User {

    private final long id;
    private final String firstname;
    private final String lastname;

    public User(long id, String firstname, String surname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = surname;
    }

    public long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
}
