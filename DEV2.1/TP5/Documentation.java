package TP5;


public class Documentation {
    public static void main(String[] args) {
        /*for (String str : args) {
            String str2 = new String();
            str2=str.toUpperCase();
            System.out.println(str2);
        }*/
        int a=Integer.parseInt(args[0],8);
        String b=Integer.toHexString(a);
        System.out.println(b);
    }
}

//la classe string se trouve dans le package java.lang elle hérite de Object