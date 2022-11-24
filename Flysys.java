
import java.awt.*;
import javax.swing.*;
/*teste  novo*/
public class Flysys extends JFrame {

    // Itens SubMenu Cadastro
    private JMenuItem aeronaveMenu = new JMenuItem("Aeronave");
    private JMenuItem companhiaMenu = new JMenuItem("Companhia");
    private JMenuItem hangaresMenu = new JMenuItem("Hangares");
    private JMenuItem pistaMenu = new JMenuItem("Pista");
    private JMenuItem sairMenu = new JMenuItem("Sair...");
    
    // Itens SubMenu Operações
    private JMenuItem gerarvoosMenu = new JMenuItem("Gerar Voos");
    private JMenuItem operacoesMenu = new JMenuItem("Relatório");
    
    // Menu Cadastro
    private JMenu menuCadastro = new JMenu("Cadastro");

    // Menu Operações
    private JMenu menuOperacoes = new JMenu("Operações");

    private JMenuBar menuPrincipal = new JMenuBar();

    public Flysys() {
        // Itens Menu Cadastro
        menuCadastro.add(companhiaMenu);
        menuCadastro.add(aeronaveMenu);
        menuCadastro.addSeparator();
        menuCadastro.add(hangaresMenu);
        menuCadastro.add(pistaMenu);
        menuCadastro.addSeparator();
        menuCadastro.add(sairMenu);
        // Itens Menu Operações
        menuOperacoes.add(gerarvoosMenu);
        menuCadastro.addSeparator();
        menuOperacoes.add(operacoesMenu);
    
        // Itens Menu Principal
        menuPrincipal.add(menuCadastro);
        menuPrincipal.add(menuOperacoes);

        this.setJMenuBar(menuPrincipal);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Flysys :: Sistema de Gestão de Aeronves");
        //this.setIconImage("c:/erich/aviao_icon.png");
        this.setSize(500,300);
        this.setLocation(600, 300);
        //this.setBounds(500, 500, 500, 500);
        this.setVisible(true);
    }

    public static void main(String[] args){
        Flysys janela = new Flysys();
    }
}