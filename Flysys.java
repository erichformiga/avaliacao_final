
import java.awt.*;
import javax.swing.*;
/*teste  novo*/
public class Flysys extends JFrame {

    private JMenuItem aeronaveMenu = new JMenuItem("Aeronave");
    private JMenuItem companhiaMenu = new JMenuItem("Companhia");
    private JMenuItem hangaresMenu = new JMenuItem("Hangares");
    private JMenuItem pistaMenu = new JMenuItem("Pista");
    private JMenuItem sairMenu = new JMenuItem("Sair...");

    private JMenuItem operacoesMenu = new JMenuItem("Relatório");
    
    private JMenu menuCadastro = new JMenu("Cadastro");

    private JMenu menuRelatorio = new JMenu("Operações");

    private JMenuBar menuBar = new JMenuBar();

    public Flysys() {

        menuCadastro.add(companhiaMenu);
        menuCadastro.add(aeronaveMenu);
        menuCadastro.addSeparator();
        menuCadastro.add(hangaresMenu);
        menuCadastro.add(pistaMenu);
        menuCadastro.addSeparator();
        menuCadastro.add(sairMenu);

        menuRelatorio.add(operacoesMenu);
    

        menuBar.add(menuCadastro);
        menuBar.add(menuRelatorio);

        this.setJMenuBar(menuBar);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Flysys :: Sistema de Gestão de Aeronves");
        this.setSize(500,300);
        this.setLocation(600, 300);
        //this.setBounds(MAXIMIZED_BOTH, ABORT, WIDTH, HEIGHT);
        this.setVisible(true);
    }

    public static void main(String[] args){
        Flysys janela = new Flysys();
    }
}