package Seminars.Java01.S1;

public class Female extends Human {

    public Female(String firstname, String lastname, Integer idPerson) {
        this.setFirstname(firstname);
        this.setLastname(lastname);
        this.setIdPerson(idPerson);
    }

    @Override
    protected String apper() {
        return "Она";
    }
}
