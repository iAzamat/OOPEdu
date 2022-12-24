package Seminars.Java01.S1;

public abstract class Human {
    private String firstname;
    private String lastname;
    private Integer age;
    private String country;
    private String gender;
    private Integer parent;
    private Integer idPerson;
    private String appeal;

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    public void setIdPerson(Integer idPerson) {
        this.idPerson = idPerson;
    }

    public void setAppeal(String appeal) {
        this.appeal = appeal;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public Integer getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public String getGender() {
        return gender;
    }

    public Integer getParent() {
        return parent;
    }

    public Integer getIdPerson() {
        return idPerson;
    }

    public String getAppeal() {
        return appeal;
    }

    private static final String EMPTY_STRING = "";

    public void greetings(String msg) {
        System.out.println(msg);
    }

    public void printInfo() {
        System.out.println(printString());
    }

    protected String apper() {
        return "Он";
    }

    private String printString() {
        return apper() + " GeoTree{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", gender='" + gender + '\'' +
                ", parent=" + parent +
                ", idPerson=" + idPerson +
                '}';
    }
}
