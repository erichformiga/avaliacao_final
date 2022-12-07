import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.util.List;

public class CompanhiaLista extends JFrame {
    public CompanhiaLista() {
        JPanel formCompahia = new JPanel();
        JPanel panel2 = new JPanel();

        CompanhiaConexao companhiaConexao = new CompanhiaConexao();
        List<Companhia> companhias = companhiaConexao.getListar();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("NOME");
        model.addColumn("CNPJ");
        for (Companhia companhia : companhias) {
            model.addRow(new Object[]{companhia.getId(), companhia.getNome(), companhia.getCnpj()});
        }
        JTable tableView = new JTable(model);
        tableView.setAutoResizeMode( JTable.AUTO_RESIZE_OFF );
        tableView.setPreferredScrollableViewportSize(new Dimension(400,100));

        JScrollPane scrollPane = new JScrollPane(tableView);
        panel2.add(scrollPane);
        tableView.setVisible(true); 

        add(formCompahia, BorderLayout.NORTH);
        formCompahia.add(panel2);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Flysys :: Listar de Companhias");
        this.setSize(500,400);
        this.setLocation(600, 300);
        this.setLocationRelativeTo(null);
        this.setResizable(true);
        //this.setBounds(MAXIMIZED_BOTH, ABORT, WIDTH, HEIGHT);
        this.setVisible(true); 
    }
}
