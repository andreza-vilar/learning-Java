public class Quartos {
    private String names;
    private String emails;
    private int numeroQuartos;
    private String telefone;

   

    public Quartos(String names, String emails, String telefone) {
        this.names = names;
        this.emails = emails;
        this.telefone = telefone;
    }


    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getEmails() {
        return emails;
    }

    public void setEmails(String emails) {
        this.emails = emails;
    }

    public int getNumeroQuartos() {
        return numeroQuartos;
    }

    public void setNumeroQuartos(int numeroQuartos) {
        this.numeroQuartos = numeroQuartos;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return names + ", " + emails + ", " + telefone;
    }

}
