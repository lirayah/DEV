package luminance;

import java.util.List;
import java.util.LinkedList;

import javax.swing.JFrame;

public class Vue extends JFrame{
    private List<Parallelogramme> liste;

    public Vue(List<Parallelogramme> para){
        super();
        this.setSize(500,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.liste=para;
        VisuPara visu=new VisuPara(this.liste);
        this.add(visu);
        Souris s=new Souris(this,liste);
        this.addMouseListener(s);

        this.setVisible(true);
    }
}
