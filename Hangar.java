import java.util.Objects;

public class Hangar {
    private int id;
    private String nome;
    private int idaeronave;    
    private AeronaveView aeronave;


    public Hangar() {
    }

    public Hangar(
        
        String nome, String cnpj
        
    ) {
        this.nome = nome;

    // Iniciando a integração com o banco de dados 

        this.id = 1;
    }

    public Hangar(
        
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

    public Hangar id(int id) {
        setId(id);
        return this;
    }
    public Hangar nome(String nome) {
        setNome(nome);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Hangar)) {
            return false;
        }
        Hangar hangar = (Hangar) o;
        return id == hangar.id && Objects.equals(nome, hangar.nome);
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
