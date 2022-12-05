import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.FontUIResource;

public class VooView extends JFrame {
    private Font fontForm = new FontUIResource("consolas", Font.PLAIN, 12);

    public VooView() {
        
    /*  ID_VOO
	    NUMERO
        DATA
	    ORIGEM
	    DESTINO
	    PILOTO
	    COPILOTO
	    OBSERVACAO
        ID_PISTA
	    ID_AERONAVE */

        JLabel labelId = new JLabel("ID..:");
        labelId.setFont(fontForm);
        JLabel labelNumero = new JLabel("Número:");
        labelNumero.setFont(fontForm);
        JLabel labelData = new JLabel("Data:");
        labelData.setFont(fontForm);
        JLabel labelOrigem = new JLabel("Origem:");
        labelOrigem.setFont(fontForm);
        JLabel labelDestino = new JLabel("Destino:");
        labelDestino.setFont(fontForm);
        JLabel labelPiloto = new JLabel("Piloto:");
        labelPiloto.setFont(fontForm);
        JLabel labelCopiloto = new JLabel("Copiloto:");
        labelCopiloto.setFont(fontForm);
        JLabel labelObservacao = new JLabel("Observações:");
        labelObservacao.setFont(fontForm);
        
        //Posicionando os labels na tela
        JPanel formAVoo = new JPanel();
        formAVoo.setLayout(new GridLayout(0, 1, 10, 10));
        formAVoo.add(labelId);
        formAVoo.add(labelNumero);
        formAVoo.add(labelData);
        formAVoo.add(labelOrigem);
        formAVoo.add(labelDestino);
        formAVoo.add(labelPiloto);
        formAVoo.add(labelCopiloto);
        formAVoo.add(labelObservacao);
        
        
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
        add(formAVoo, BorderLayout.NORTH);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Flysys :: Cadastro de Voos");
        this.setSize(500,400);
        this.setLocation(600, 300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        //this.setBounds(MAXIMIZED_BOTH, ABORT, WIDTH, HEIGHT);
        this.setVisible(true);    
    }

    public static void main(String[] args){
        VooView formVoo = new VooView();
    }
}