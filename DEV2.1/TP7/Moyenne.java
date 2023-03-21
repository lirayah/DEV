package TP7;

public abstract class Moyenne {
    private Moyenne a;
    private int j;

    public Moyenne(){
        Moyenne a;
        int j;
    }
    public abstract byte add(byte b);

    public abstract short add(short s);
    
    public abstract int add(int i);
    
    public abstract long add(long l);

    public abstract float add(float f);

    public abstract double add(double d);

    public abstract float getAverage();
}
