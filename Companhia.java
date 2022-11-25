import java.awt.*;
import javax.swing.*;

public class Companhia extends JFrame {

    public Companhia() {
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Flysys :: Cadastro de Companhias");
        this.setSize(500,300);
        this.setLocation(600, 300);
        //this.setBounds(MAXIMIZED_BOTH, ABORT, WIDTH, HEIGHT);
        this.setVisible(true);    
    }

    public static void main(String[] args){
        Companhia forCompanhia = new Companhia();
    }
}