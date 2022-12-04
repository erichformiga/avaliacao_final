import java.util.Objects;

public class Aeronave {
    private int id;
    private String marca;
    private String modelo;
    private String cor;
    private String tipo;
    private String prefixo;
    private String capacidade;
    private String velocidade;
    private int idcompahia;    
    private CompanhiaView compahia;
    private int idHangares;
    private HangaresView Hangares;

    public Aeronave() {
    }

    public Aeronave(
        
        String marca,
        String modelo,
        String cor,
        String tipo,
        String prefixo,
        String capacidade,
        String velocidade
        
        ) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.tipo = tipo;
        this.prefixo = prefixo;
        this.capacidade = capacidade;
        this.velocidade = velocidade;

        
    // Iniciando a integração com o banco de dados 

        this.id = 1;
    }

    public Aeronave(
        
        int id,
        String marca,
        String modelo,
        String cor,
        String tipo,
        String prefixo,
        String capacidade,
        String velocidade
        
        ) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.tipo = tipo;
        this.prefixo = prefixo;
        this.capacidade = capacidade;
        this.velocidade = velocidade;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPrefixo() {
        return this.prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public String getCapacidade() {
        return this.capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

    public String getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(String velocidade) {
        this.velocidade = velocidade;
    }

    public Aeronave id(int id) {
        setId(id);
        return this;
    }

    public Aeronave Marca(String marca) {
        setMarca(marca);
        return this;
    }

    public Aeronave Modelo(String modelo) {
        setModelo(modelo);
        return this;
    }

    public Aeronave Cor(String cor) {
        setCor(cor);
        return this;
    }

    public Aeronave Tipo(String tipo) {
        setTipo(tipo);
        return this;
    }

    public Aeronave Prefixo(String prefixo) {
        setPrefixo(prefixo);
        return this;
    }

    public Aeronave Capacidade(String capacidade) {
        setCapacidade(capacidade);
        return this;
    }

    public Aeronave Velocidade(String velocidade) {
        setVelocidade(velocidade);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Aeronave)) {
            return false;
        }
        Aeronave aeronave = (Aeronave) o;
        return id == aeronave.id && Objects.equals(marca, aeronave.marca);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            marca,
            modelo,
            cor,
            tipo,
            prefixo,
            capacidade,
            velocidade
        );
    }

    @Override
    public String toString() {
        return "{" +
            " Id ='" + getId() + "'" +
            ", Marca ='" + getMarca() + "'" +
            ", Modelo = '" + getModelo() + "'" +
            ", Cor = '" + getModelo() + "'" +
            ", Tipo = '" + getTipo() + "'" +
            ", Prefixo = '" + getPrefixo() + "'" +
            ", Capacidade = '" + getCapacidade() + "'" +
            ", Velocidade = '" + getVelocidade() + "'" +
            "}";
    }

}
