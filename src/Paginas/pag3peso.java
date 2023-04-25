package Paginas;
//María Picazo Sánchez

import javax.swing.*;

public class pag3peso extends JFrame{
    private JTextArea textAreaMuestra;
    private JPanel panel3;

    public pag3peso(String s){
        setContentPane(panel3);
        setTitle("Contenedores con peso mayor");
        setSize(1200,600);
        setVisible(true);

        textAreaMuestra.setText(s);

    }


}
