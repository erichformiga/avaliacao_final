import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.FontUIResource;

public class PistasView extends JFrame {
    private Font fontForm = new FontUIResource("consolas", Font.PLAIN, 12);
    
    public PistasView() {
        
    /*  ID_PISTA
	    NUMERO_PISTA */

        JLabel labelId = new JLabel("ID..:");
        labelId.setFont(fontForm);
        JLabel labelNome = new JLabel("Nome da Pista:");
        labelNome.setFont(fontForm);
        

        //Posicionando os labels na tela
        JPanel formPista = new JPanel();
        formPista.setLayout(new GridLayout(0, 1, 10, 10));
        formPista.add(labelId);
        formPista.add(labelNome);


        //Adicionando os botões
        JButton bntNovo = new JButton("Novo");
        bntNovo.setFont(fontForm);
        
        JButton bntListar = new JButton("Listar");
        bntListar.setFont(fontForm);
        JButton bntCancelar = new JButton("Cancelar");
        bntCancelar.setFont(fontForm);
        JButton bntFecha = new JButton("Fechar");
        bntCancelar.setFont(fontForm);
        

        // Inicializando o Form Pista
        add(formPista, BorderLayout.NORTH);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Flysys :: Cadastro de Pista");
        this.setSize(500,200);
        this.setLocation(600, 300);
        //this.setBounds(MAXIMIZED_BOTH, ABORT, WIDTH, HEIGHT);
        this.setVisible(true);     
    }

    public static void main(String[] args){
        PistasView formPistas = new PistasView();
    }
}