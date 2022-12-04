import java.util.Objects;

public class Companhia {
    private int id;
    private String nome;
    private String cnpj;


    public Companhia() {
    }

    public Companhia(
        
        String nome, String cnpj
        
    ) {
        this.nome = nome;
        this.cnpj = cnpj;
        
    // Iniciando a integração com o banco de dados 

        //this.id = 1;
    }

    public Companhia(
        
        int id,
        String nome,
        String cnpj
        
    ) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
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
    public String getCnpj() {
        return this.cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public Companhia id(int id) {
        setId(id);
        return this;
    }
    public Companhia nome(String nome) {
        setNome(nome);
        return this;
    }
    public Companhia cnpj(String cnpj) {
        setCnpj(cnpj);
        return this;
    }
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Companhia)) {
            return false;
        }
        Companhia companhia = (Companhia) o;
        return id == companhia.id && Objects.equals(nome, companhia.nome) && Objects.equals(cnpj, companhia.cnpj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, cnpj);
    }

    @Override
    public String toString() {
        return "{" +
            " Id ='" + getId() + "'" +
            ", Nome ='" + getNome() + "'" +
            ", Cnpj ='" + getCnpj() + "'" +
            "}";
    }

}
