import java.awt.*;
import javax.swing.*;

public class Aeronave extends JFrame {

    public Aeronave() {
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Flysys :: Cadastro de Aeronaves");
        this.setSize(500,300);
        this.setLocation(600, 300);
        //this.setBounds(MAXIMIZED_BOTH, ABORT, WIDTH, HEIGHT);
        this.setVisible(true);    
    }

    public static void main(String[] args){
        Aeronave janela = new Aeronave();
    }
}