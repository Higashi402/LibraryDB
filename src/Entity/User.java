package Entity;

public class User {
    private int id;
    private String c_name;
    private String surname;
    private String patronymic;
    private String character;

    public User(int id, String surname, String c_name, String patronymic, String character) {
        this.id = id;
        this.surname = surname;
        this.c_name = c_name;
        this.patronymic = patronymic;
        this.character = character;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.c_name;
    }

    public void setName(String c_name) {
        this.c_name = c_name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getCharacter() {
        return this.character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }


}
