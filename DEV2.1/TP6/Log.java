package TP6;

import java.awt.*;
import javax.swing.*;

public class Log extends JComponent{
    private Image logo;
    public Log(){
        super();
        this.logo = Toolkit.getDefaultToolkit().getImage("TP6/logo.png");
    }

    protected void paintComponent(Graphics pinceau) {
        Graphics img = pinceau.create();
        img.drawImage(this.logo, 10, 20, this);

        Graphics login = pinceau.create();
        login.setColor(Color.white);
        login.setFont(new Font("default",Font.BOLD,24));
        login.drawString("Login",this.getWidth()/5,200);

        Graphics pwd = pinceau.create();
        pwd.setColor(Color.white);
        pwd.setFont(new Font("default",Font.BOLD,24));
        pwd.drawString("Password",this.getWidth()/10,300);

        JTextArea champ = new JTextArea("");
        champ.setForeground(new Color(0,0,0));
        champ.setBackground(new Color(255,255,255));
        champ.setBounds(190,180,200,30);
        this.add(champ);

        JTextArea champ2 = new JTextArea("");
        champ2.setForeground(new Color(0,0,0));
        champ2.setBackground(new Color(255,255,255));
        champ2.setBounds(190,280,200,30);
        this.add(champ2);
    }
}
