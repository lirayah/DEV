package TP5;

import java.awt.print.Paper;

public class Metrique extends Paper{

    //Constructeur
    public Metrique{
        
    }
    
    //Méthodes get
    @Override
    public double getHeight() {
        // TODO Auto-generated method stub
        return super.getHeight();
    }

    @Override
    public double getWidth() {
        // TODO Auto-generated method stub
        return super.getWidth();
    }

    @Override
    public double getImageableX() {
        // TODO Auto-generated method stub
        return super.getImageableX();
    }

    @Override
    public double getImageableY() {
        // TODO Auto-generated method stub
        return super.getImageableHeight();
    }

    @Override
    public double getImageableHeight() {
        // TODO Auto-generated method stub
        return super.getImageableHeight();
    }
    
    @Override
    public double getImageableWidth() {
        // TODO Auto-generated method stub
        return super.getImageableWidth();
    }


    //Méthodes Set
    @Override
    public void setSize(double width, double height) {
        // TODO Auto-generated method stub
        super.setSize(width, height);
    }

    @Override
    public void setImageableArea(double x, double y, double width, double height) {
        // TODO Auto-generated method stub
        super.setImageableArea(x, y, width, height);
    }
}
