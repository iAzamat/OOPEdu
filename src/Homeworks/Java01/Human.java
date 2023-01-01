package Homeworks.Java01;

import java.util.List;

public class Human {
    private String firstname;
    private String lastname;
    private String birthday;
    private String dateDeath;
    private String gender;
    private Integer idPerson;
    private Integer idFather;
    private Integer idMother;
    private Human father;
    private List<Human> children;
    List<Communication> communicationList;

    public Human(
            String firstname,
            String lastname,
            String birthday,
            String dateDeath,
            String gender,
            Integer idPerson,
            Integer idFather,
            Integer idMother) {

        this.firstname = firstname;
        this.lastname = lastname;
        this.birthday = birthday;
        this.dateDeath = dateDeath;
        this.gender = gender;
        this.idPerson = idPerson;
        this.idFather = idFather;
        this.idMother = idMother;

    }

    public Human(String firstname,
                 String lastname,
                 String birthday,
                 String gender,
                 Integer idPerson,
                 Integer idFather,
                 Integer idMother) {
        this(firstname, lastname, birthday, null, gender, idPerson, idFather, idMother);
    }


    @Override
    public String toString() {
        return "Human{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthday='" + birthday + '\'' +
                ", dateDeath='" + dateDeath + '\'' +
                ", gender='" + gender + '\'' +
                ", idPerson=" + idPerson +
                ", idFather=" + idFather +
                ", idMother=" + idMother +
                '}';
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getDateDeath() {
        return dateDeath;
    }

    public void setDateDeath(String dateDeath) {
        this.dateDeath = dateDeath;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Integer idPerson) {
        this.idPerson = idPerson;
    }

    public Integer getIdFather() {
        return idFather;
    }

    public void setIdFather(Integer idFather) {
        this.idFather = idFather;
    }

    public Integer getIdMother() {
        return idMother;
    }

    public void setIdMother(Integer idMother) {
        this.idMother = idMother;
    }
}
