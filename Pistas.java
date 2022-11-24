import java.awt.*;
import javax.swing.*;

public class Pistas extends JFrame {

    public Pistas() {
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Flysys :: Cadastro de Pistas");
        this.setSize(500,300);
        this.setLocation(600, 300);
        //this.setBounds(MAXIMIZED_BOTH, ABORT, WIDTH, HEIGHT);
        this.setVisible(true);    
    }

    public static void main(String[] args){
        Pistas janela = new Pistas();
    }
}