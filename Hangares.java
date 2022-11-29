import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.FontUIResource;

public class Hangares extends JFrame {
    private Font fontForm = new FontUIResource("consolas", Font.PLAIN, 12);

    public Hangares() {
        
    /*  ID_HANGAR
	    NOME_HANGAR
        ID_AERONAVE */

        JLabel labelId = new JLabel("ID..:");
        labelId.setFont(fontForm);
        JLabel labelNome = new JLabel("Nome:");
        labelNome.setFont(fontForm);
        
        //Posicionando os labels na tela
        JPanel formHangares = new JPanel();
        formHangares.setLayout(new GridLayout(0, 1, 10, 10));
        formHangares.add(labelId);
        formHangares.add(labelNome);



        //Adicionando os botões
        JButton bntNovo = new JButton("Novo");
        bntNovo.setFont(fontForm);
        
        JButton bntListar = new JButton("Listar");
        bntListar.setFont(fontForm);
        JButton bntCancelar = new JButton("Cancelar");
        bntCancelar.setFont(fontForm);
        JButton bntFecha = new JButton("Fechar");
        bntCancelar.setFont(fontForm);
        

        // Inicializando o Form Hangares
        add(formHangares, BorderLayout.NORTH);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Flysys :: Cadastro de Hangares");
        this.setSize(500,300);
        this.setLocation(600, 300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        //this.setBounds(MAXIMIZED_BOTH, ABORT, WIDTH, HEIGHT);
        this.setVisible(true);    
    }
    
    public static void main(String[] args){
        Hangares janela = new Hangares();
    }

}