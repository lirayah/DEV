import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

public class Vue extends JFrame{

    public Vue(){
        super();
        this.setSize(500,500);
        this.setLayout(new GridBagLayout());
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        GridBagConstraints gbc=new GridBagConstraints();

        JButton b1=new JButton("1");
        gbc.gridx=0;
        gbc.gridy=0;
        gbc.gridheight=1;
        gbc.gridwidth=2;
        gbc.fill=GridBagConstraints.BOTH;
        gbc.anchor=GridBagConstraints.CENTER;
        gbc.weightx=1.0f;
        gbc.weighty=1.0f;
        gbc.insets=new Insets(5,5,5,5);
        this.add(b1,gbc);

        JButton b2=new JButton("2");
        gbc.gridx=2;
        gbc.gridy=0;
        gbc.gridheight=2;
        gbc.gridwidth=1;
        gbc.fill=GridBagConstraints.BOTH;
        gbc.anchor=GridBagConstraints.CENTER;
        gbc.weightx=1.0f;
        gbc.weighty=1.0f;
        gbc.insets=new Insets(5,5,5,5);
        this.add(b2,gbc);

        JButton b3=new JButton("3");
        gbc.gridx=1;
        gbc.gridy=2;
        gbc.gridheight=1;
        gbc.gridwidth=2;
        gbc.fill=GridBagConstraints.BOTH;
        gbc.anchor=GridBagConstraints.CENTER;
        gbc.weightx=1.0f;
        gbc.weighty=1.0f;
        gbc.insets=new Insets(5,5,5,5);
        this.add(b3,gbc);

        JButton b4=new JButton("4");
        gbc.gridx=0;
        gbc.gridy=1;
        gbc.gridheight=2;
        gbc.gridwidth=1;
        gbc.fill=GridBagConstraints.BOTH;
        gbc.anchor=GridBagConstraints.CENTER;
        gbc.weightx=1.0f;
        gbc.weighty=1.0f;
        gbc.insets=new Insets(5,5,5,5);
        this.add(b4,gbc);

        JButton b5=new JButton("5");
        Dimension d=new Dimension(100,100);
        b5.setPreferredSize(d);
        gbc.gridx=1;
        gbc.gridy=1;
        gbc.gridheight=1;
        gbc.gridwidth=1;
        gbc.fill=GridBagConstraints.BOTH;
        gbc.anchor=GridBagConstraints.CENTER;
        gbc.weightx=0.0f;
        gbc.weighty=0.0f;
        gbc.insets=new Insets(5,5,5,5);
        this.add(b5,gbc);

        Fenetre f=new Fenetre(this);
        this.addWindowListener(f);
    }
}
