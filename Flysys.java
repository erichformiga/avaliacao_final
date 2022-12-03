
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Flysys extends JFrame {

    private JMenuBar menuPrincipal = new JMenuBar();

    // Menu Cadastro
    private JMenu menuCadastro = new JMenu("Cadastro");
    
    // Itens SubMenu Cadastro
    private JMenuItem aeronaveMenu = new JMenuItem("Aeronave");
    private JMenuItem companhiaMenu = new JMenuItem("Companhia");
    private JMenuItem hangaresMenu = new JMenuItem("Hangares");
    private JMenuItem pistaMenu = new JMenuItem("Pista");
    private JMenuItem sairMenu = new JMenuItem("Sair...");

    // Menu Operações
    private JMenu menuOperacoes = new JMenu("Operações");
 
    // Itens SubMenu Operações
    private JMenuItem gerarvoosMenu = new JMenuItem("Gerar Voos");
    private JMenuItem operacoesMenu = new JMenuItem("Relatório");  

    public Flysys() {
        // Itens Menu Cadastro
        menuCadastro.add(companhiaMenu);
        menuCadastro.add(aeronaveMenu);
        menuCadastro.addSeparator();
        menuCadastro.add(hangaresMenu);
        menuCadastro.add(pistaMenu);
        menuCadastro.addSeparator();
        menuCadastro.add(sairMenu);

        // Sair do sistema
        sairMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        // Itens Menu Operações
        menuOperacoes.add(gerarvoosMenu);
        menuOperacoes.addSeparator();
        menuOperacoes.add(operacoesMenu);
    
        // Itens Menu Principal
        menuPrincipal.add(menuCadastro);
        menuPrincipal.add(menuOperacoes);

        //Configuração FormPrincipal
        this.setJMenuBar(menuPrincipal);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Flysys :: Sistema de Gestão de Aeronves");
        //this.setIconImage("c:/erich/aviao_icon.png");
        this.setSize(500,300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        //this.setLocation(600, 300);
        //this.setBounds(500, 500, 500, 500);
        this.setVisible(true);
    }

    public static void main(String[] args){
        Flysys formFlysys = new Flysys();
    }
}