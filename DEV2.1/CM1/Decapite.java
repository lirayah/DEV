/*Lionel MORIN Groupe 1 */

import java.awt.*;

public class Decapite {
    public static void main(String[] args) {
        GraphicsEnvironment graph=GraphicsEnvironment.getLocalGraphicsEnvironment();
        String str1;
        String str2;
        boolean Headless=GraphicsEnvironment.isHeadless();
        boolean HeadlessInstance=graph.isHeadlessInstance();

        if(!Headless){
            str1="non";
        }
        else{
            str1="oui";
        }

        if(!HeadlessInstance){
            str2="non";
        }
        else{
            str2="oui";
        }
        System.out.println("isHeadless dit :" + str1);
        System.out.println("isHeadlessInstance dit :" + str2);
    }
}
