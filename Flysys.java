
import java.awt.*;
import javax.swing.*;
/*teste */
public class Flysys extends JFrame {

    private JMenuItem companhiaMenu = new JMenuItem("Companhia");
    private JMenuItem aeronaveMenu = new JMenuItem("Aeronave");
    private JMenuItem hangaresMenu = new JMenuItem("Hangares");
    private JMenuItem pistaMenu = new JMenuItem("Pista");
    private JMenuItem sairMenu = new JMenuItem("Sair...");

    private JMenuItem operacoesMenu = new JMenuItem("Operações");
    private JMenu menuCadastro = new JMenu("Cadastro");

    private JMenu menuRelatorio = new JMenu("Relatório");

    private JMenuBar menuBar = new JMenuBar();

    public Flysys() {

        operacoesMenu.add(companhiaMenu);
        operacoesMenu.add(aeronaveMenu);
        operacoesMenu.add(hangaresMenu);
        operacoesMenu.add(pistaMenu);
        operacoesMenu.addSeparator();
        operacoesMenu.add(sairMenu);

        menuPedido.add(pedidoMenu);
    

        menuBar.add(menuArquivo);
        menuBar.add(menuPedido);

        this.setJMenuBar(menuBar);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,300);
        this.setLocation(600, 300);
        this.setVisible(true);
    }

    public static void main(String[] args){
        Flysys janela = new Flysys();
    }
}