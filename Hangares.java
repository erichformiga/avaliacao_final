import java.util.Objects;

public class Hangares {
    private int id;
    private String nome;
    private int idaeronave;    
    private AeronaveView aeronave;


    public Hangares() {
    }

    public Hangares(
        
        String nome, String cnpj
        
    ) {
        this.nome = nome;

    // Iniciando a integração com o banco de dados 

        this.id = 1;
    }

    public Hangares(
        
        int id, String nome
        
    ) {
        this.id = id;
        this.nome = nome;
    }
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Hangares id(int id) {
        setId(id);
        return this;
    }
    public Hangares nome(String nome) {
        setNome(nome);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Hangares)) {
            return false;
        }
        Hangares hangares = (Hangares) o;
        return id == hangares.id && Objects.equals(nome, hangares.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    @Override
    public String toString() {
        return "{" +
            " Id ='" + getId() + "'" +
            ", Nome ='" + getNome() + "'" +
            "}";
    }

}
