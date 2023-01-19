public class Utente {
    private String nome;
    private String cognome;
    private String email;
    private String password;
    private int eta;
    private boolean isAdmin;

    public Utente(String nome, String cognome, String email, String password, int eta, boolean isAdmin) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.password = password;
        this.eta = eta;
        this.isAdmin = isAdmin;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
