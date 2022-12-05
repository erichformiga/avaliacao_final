import java.util.Objects;

public class Pista {
    private int id;
    private String numero;



    public Pista() {
    }

    public Pista(
        
        String numero
        
    ) {
        this.numero = numero;

        
    // Iniciando a integração com o banco de dados 

        this.id = 1;
    }

    public Pista(
        
        int id, String numero
        
    ) {
        this.id = id;
        this.numero = numero;

    }
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNumero() {
        return this.numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Pista id(int id) {
        setId(id);
        return this;
    }
    public Pista numero(String numero) {
        setNumero(numero);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Pista)) {
            return false;
        }
        Pista pistas = (Pista) o;
        return id == pistas.id && Objects.equals(numero, pistas.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numero);
    }

    @Override
    public String toString() {
        return "{" +
            " ID ='" + getId() + "'" +
            ", NUMERO ='" + getNumero() + "'" +
            "}";
    }

}
