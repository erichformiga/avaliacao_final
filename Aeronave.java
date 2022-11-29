import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.FontUIResource;

public class Aeronave extends JFrame {
    private Font fontForm = new FontUIResource("consolas", Font.PLAIN, 12);

    public Aeronave() {

    /*  ID_AERONAVE
	    MARCA
        MODELO
	    COR
	    TIPO
	    PREFIXO
        CAPACIDADE
	    VELOCIDADE
        ID_COMPANHIA
	    ID_HANGAR  */

        JLabel labelId = new JLabel("ID..:");
        labelId.setFont(fontForm);
        JLabel labelMarca = new JLabel("Marca:");
        labelMarca.setFont(fontForm);
        JLabel labelModelo = new JLabel("Modelo:");
        labelModelo.setFont(fontForm);
        JLabel labelCor = new JLabel("Cor:");
        labelCor.setFont(fontForm);
        JLabel labelTipo = new JLabel("Tipo:");
        labelTipo.setFont(fontForm);
        JLabel labelPrefixo = new JLabel("Prefixo:");
        labelPrefixo.setFont(fontForm);
        JLabel labelCapacidade = new JLabel("Capacidade:");
        labelCapacidade.setFont(fontForm);
        JLabel labelVelocidade = new JLabel("Velocidade:");
        labelVelocidade.setFont(fontForm);
        
        //Posicionando os labels na tela
        JPanel formAeronave = new JPanel();
        formAeronave.setLayout(new GridLayout(0, 1, 10, 10));
        formAeronave.add(labelId);
        formAeronave.add(labelMarca);
        formAeronave.add(labelModelo);
        formAeronave.add(labelCor);
        formAeronave.add(labelTipo);
        formAeronave.add(labelPrefixo);
        formAeronave.add(labelCapacidade);
        formAeronave.add(labelVelocidade);
        
        
        //Adicionando os botões
        JButton bntNovo = new JButton("Novo");
        bntNovo.setFont(fontForm);
        JButton bntListar = new JButton("Listar");
        bntListar.setFont(fontForm);
        JButton bntCancelar = new JButton("Cancelar");
        bntCancelar.setFont(fontForm);
        JButton bntFecha = new JButton("Fechar");
        bntCancelar.setFont(fontForm);
        

        // Inicializando o Form Aeronave
        add(formAeronave, BorderLayout.NORTH);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Flysys :: Cadastro de Aeronaves");
        this.setSize(500,400);
        this.setLocation(600, 300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        //this.setBounds(MAXIMIZED_BOTH, ABORT, WIDTH, HEIGHT);
        this.setVisible(true);    
    }

    //Conexão com o Banco de dados


    public static void main(String[] args){
        Aeronave forAeronave = new Aeronave();
    }
}