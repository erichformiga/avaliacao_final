import java.util.Objects;

public class Pistas {
    private int id;
    private String nome;



    public Pistas() {
    }

    public Pistas(
        
        String nome, String cnpj
        
    ) {
        this.nome = nome;

        
    // Iniciando a integração com o banco de dados 

        this.id = 1;
    }

    public Pistas(
        
        int id, String nome, String cnpj
        
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

    public Pistas id(int id) {
        setId(id);
        return this;
    }
    public Pistas nome(String nome) {
        setNome(nome);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Pistas)) {
            return false;
        }
        Pistas pistas = (Pistas) o;
        return id == pistas.id && Objects.equals(nome, pistas.nome);
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
