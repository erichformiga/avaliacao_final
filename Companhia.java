import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.FontUIResource;

public class Companhia extends JFrame {
    private Font fontForm = new FontUIResource("consolas", Font.PLAIN, 12);

    public Companhia() {

    /*  ID_COMPANHIA
	    NOME_COMPANHIA
        CNPJ
        DATA */

        JLabel labelId = new JLabel("ID..:");
        labelId.setFont(fontForm);
        JLabel labelNome = new JLabel("Nome:");
        labelNome.setFont(fontForm);
        JLabel labelCnpj = new JLabel("CNPJ:");
        labelCnpj.setFont(fontForm);
        JLabel labelData = new JLabel("Data:");
        labelData.setFont(fontForm);
        
        //Posicionando os labels na tela
        JPanel formCompahia = new JPanel();
        formCompahia.setLayout(new GridLayout(0, 1, 10, 10));
        formCompahia.add(labelId);
        formCompahia.add(labelNome);
        formCompahia.add(labelCnpj);
        formCompahia.add(labelData);

        //Adicionando os botões
        JButton bntNovo = new JButton("Novo");
        bntNovo.setFont(fontForm);
        
        JButton bntListar = new JButton("Listar");
        bntListar.setFont(fontForm);
        JButton bntCancelar = new JButton("Cancelar");
        bntCancelar.setFont(fontForm);
        JButton bntFecha = new JButton("Fechar");
        bntCancelar.setFont(fontForm);
        

        // Inicializando o Form Compahia
        add(formCompahia, BorderLayout.NORTH);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Flysys :: Cadastro de Companhias");
        this.setSize(500,300);
        this.setLocation(600, 300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        //this.setBounds(MAXIMIZED_BOTH, ABORT, WIDTH, HEIGHT);
        this.setVisible(true);    
    }

    //Conexão com o Banco de dados


    public static void main(String[] args){
        Companhia forCompanhia = new Companhia();
    }
}