import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.FontUIResource;

public class CompanhiaView extends JFrame {
    private Font fontForm = new FontUIResource("consolas", Font.PLAIN, 12);

    public CompanhiaView() {
        this(0);
    }

    public CompanhiaView(int id) {

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
        
        //Posicionando os componetes na tela
        JPanel formCompahia = new JPanel();
        formCompahia.setLayout(new GridLayout(3, 1, 10, 10));
        JPanel panel1 = new JPanel(new GridLayout(4, 4, 20, 10));
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();

        JTextField textId = new JTextField(25);
        JTextField textNome = new JTextField(25);
        JTextField textCnpj = new JTextField(25);
        JTextField textData = new JTextField(25);

        // Se o id != 0 significa que é Alteração
        if (id !=0) {
            Companhia companhia = new Companhia(1, "Gol", "1144741");

            textNome.setText(companhia.getNome());
            textCnpj.setText(companhia.getCnpj());
        }
        formCompahia.add(panel1);
        formCompahia.add(panel2);
        formCompahia.add(panel3);

        panel1.add(labelId);
        panel1.add(textId);
        panel1.add(labelNome);
        panel1.add(textNome);
        panel1.add(labelCnpj);
        panel1.add(textCnpj);
        panel1.add(labelData);
        panel1.add(textData);

        //Adicionando os botões
        JButton bntNovo = new JButton("  Novo  ");
        bntNovo.setFont(fontForm);
        JButton bntListar = new JButton("Listar");
        bntListar.setFont(fontForm);
        JButton bntCancelar = new JButton("Cancelar");
        bntCancelar.setFont(fontForm);
        JButton bntGravar = new JButton("Gravar");
        bntGravar.setFont(fontForm);
        JButton bntFechar = new JButton("Fechar");
        bntFechar.setFont(fontForm);

        panel3.add(bntNovo);
        panel3.add(bntListar);
        panel3.add(bntCancelar);
        panel3.add(bntGravar);
        panel3.add(bntFechar);

        String[] columnNames = {"ID",
                        "NOME",
                        "CNPJ"};

        Object[][] data = {
            {"1", "GOL",
             "11111111111", new Integer(5), new Boolean(false)},
            {"2", "AZUL",
             "22222222222", new Integer(3), new Boolean(true)},
            {"3", "EMIRATES",
             "33333333333", new Integer(2), new Boolean(false)},
            {"4", "LATAM",
             "44444444444", new Integer(20), new Boolean(true)},
            {"5", "AIR FRANCE",
             "55555555555", new Integer(11), new Boolean(false)}
        };
        JTable tableView = new JTable(data, columnNames);
        tableView.setAutoResizeMode( JTable.AUTO_RESIZE_OFF );
        tableView.setPreferredScrollableViewportSize(new Dimension(400,100));
        JScrollPane scrollPane = new JScrollPane(tableView);
        panel2.add(scrollPane);
        //tableView.setVisible(false);


        // Inicializando o Form Compahia
        add(formCompahia, BorderLayout.NORTH);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Flysys :: Cadastro de Companhias");
        this.setSize(500,400);
        this.setLocation(600, 300);
        this.setLocationRelativeTo(null);
        this.setResizable(true);
        //this.setBounds(MAXIMIZED_BOTH, ABORT, WIDTH, HEIGHT);
        this.setVisible(true);    
    }

    //Conexão com o Banco de dados


    public static void main(String[] args){
        // CompanhiaView forCompanhia = new CompanhiaView();
        CompanhiaView forCompanhiaUpdate = new CompanhiaView(1);
    }
}