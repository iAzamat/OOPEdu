package Seminars.Java01.S1;

public class Male extends Human {

    public Male(String firstname, String lastname, Integer idPerson) {
        this.setFirstname(firstname);
        this.setLastname(lastname);
        this.setIdPerson(idPerson);
    }

    @Override
    protected String apper() {
        return "Он";
    }
}
