import java.awt.*;
import java.awt.event.*;
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
        formCompahia.setLayout(new GridLayout(3, 1, 10, 10));
        JPanel panel1 = new JPanel(new GridLayout(4, 2, 10, 10));
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        
        formCompahia.add(panel1);
        formCompahia.add(panel2);
        formCompahia.add(panel3);

        panel1.add(labelId);
        panel1.add(labelNome);
        panel1.add(labelCnpj);
        panel1.add(labelData);

        //Adicionando os botões
        JButton bntNovo = new JButton("Novo");
        bntNovo.setFont(fontForm);
        
        JButton bntListar = new JButton("Listar");
        bntListar.setFont(fontForm);
        JButton bntCancelar = new JButton("Cancelar");
        bntCancelar.setFont(fontForm);
        JButton bntFecha = new JButton("Fechar");
        bntCancelar.setFont(fontForm);

        String[] columnNames = {"First Name",
                        "Last Name",
                        "Sport",
                        "# of Years",
                        "Vegetarian"};

        Object[][] data = {
            {"Kathy", "Smith",
             "Snowboarding", new Integer(5), new Boolean(false)},
            {"John", "Doe",
             "Rowing", new Integer(3), new Boolean(true)},
            {"Sue", "Black",
             "Knitting", new Integer(2), new Boolean(false)},
            {"Jane", "White",
             "Speed reading", new Integer(20), new Boolean(true)},
            {"Joe", "Brown",
             "Pool", new Integer(10), new Boolean(false)}
        };
        JTable tableView = new JTable(data, columnNames);
        tableView.setAutoResizeMode( JTable.AUTO_RESIZE_OFF );
        tableView.setPreferredScrollableViewportSize(new Dimension(400,100));
        JScrollPane scrollPane = new JScrollPane(tableView);
        panel2.add(scrollPane);

        panel3.add(bntListar);
        panel3.add(bntCancelar);
        panel3.add(bntFecha);

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
        Companhia forCompanhia = new Companhia();
    }
}