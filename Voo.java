import java.util.Objects;

public class Voo {
    private int id;
    private String numero;
    private String data;
	private String origem;
    private String destino;
    private String piloto;
    private String copiloto;
    private String observacao;
    private int idPista;
    private PistaView pista;
    private int idAeronave;
    private AeronaveView aeronave;

    public Voo() {
    }

    public Voo(
        
        String numero,
        String data,
        String origem,
        String destino,
        String piloto,
        String copiloto,
        String observacao
        
    ) {
        this.numero = numero;
        this.data = data;
        this.origem = origem;
        this.destino = destino;
        this.piloto = piloto;
        this.copiloto = copiloto;
        this.observacao = observacao;
       
    // Iniciando a integração com o banco de dados 

        this.id = 1;
    }

    public Voo(
        
        int id,
        String numero,
        String data,
        String origem,
        String destino,
        String piloto,
        String copiloto,
        String observacao
        
    ) {
        this.id = id;
        this.numero = numero;
        this.data = data;
        this.origem = origem;
        this.destino = destino;
        this.piloto = piloto;
        this.copiloto = copiloto;
        this.observacao = observacao;

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
   
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public String getCopiloto() {
        return copiloto;
    }

    public void setCopiloto(String copiloto) {
        this.copiloto = copiloto;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public int getIdPista() {
        return idPista;
    }

    public void setIdPista(int idPista) {
        this.idPista = idPista;
    }

    public PistaView getPista() {
        return pista;
    }

    public void setPista(PistaView pista) {
        this.pista = pista;
    }

    public int getIdAeronave() {
        return idAeronave;
    }

    public void setIdAeronave(int idAeronave) {
        this.idAeronave = idAeronave;
    }

    public AeronaveView getAeronave() {
        return aeronave;
    }

    public void setAeronave(AeronaveView aeronave) {
        this.aeronave = aeronave;
    }

    public Voo id(int id) {
        setId(id);
        return this;
    }
    public Voo numero(String numero) {
        setNumero(numero);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Voo)) {
            return false;
        }
        Voo Voos = (Voo) o;
        return id == Voos.id && Objects.equals(numero, Voos.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
        numero,
        data,
        origem,
        destino,
        piloto,
        copiloto,
        observacao
        );
    }

    @Override
    public String toString() {
        return "{" +
        " Id ='" + getId() + "'" +
        ", Numero ='" + getNumero() + "'" +
        ", Data = '" + getData() + "'" +
        ", Origem = '" + getOrigem() + "'" +
        ", Destino = '" + getDestino() + "'" +
        ", Piloto = '" + getPiloto() + "'" +
        ", Copiloto = '" + getCopiloto() + "'" +
        ", Observação = '" + getObservacao() + "'" +
        "}";
    }

}
