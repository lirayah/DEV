package luminance;

import java.util.LinkedList;
import java.util.List;
/**
 * Luminance
 */
public class Luminance {
    public static void main(String[] args) {
        List<Parallelogramme> liste=new LinkedList<Parallelogramme>();
        
        for (int i = 0; i < 10; i++) {
            liste.add(new Parallelogramme(Math.random(), Math.random(), Math.random()));
        }
        Vue v= new Vue(liste);
    }
}