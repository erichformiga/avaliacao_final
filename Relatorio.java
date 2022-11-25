import java.awt.*;
import javax.swing.*;

public class Relatorio extends JFrame {

    public Relatorio() {
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Flysys :: Relatorio");
        this.setSize(500,300);
        this.setLocation(600, 300);
        //this.setBounds(MAXIMIZED_BOTH, ABORT, WIDTH, HEIGHT);
        this.setVisible(true);    
    }

    public static void main(String[] args){
        Relatorio formRelatorio = new Relatorio();
    }
}