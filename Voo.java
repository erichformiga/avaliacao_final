import java.awt.*;
import javax.swing.*;

public class Voo extends JFrame {

    public Voo() {
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Flysys :: Gerar Voos");
        this.setSize(500,300);
        this.setLocation(600, 300);
        //this.setBounds(MAXIMIZED_BOTH, ABORT, WIDTH, HEIGHT);
        this.setVisible(true);    
    }

    public static void main(String[] args){
        Voo formVoo = new Voo();
    }
}