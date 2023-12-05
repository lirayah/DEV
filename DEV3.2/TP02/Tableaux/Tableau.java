/**
 * Tableau
 */
public class Tableau {

    public static void creation(String[] ligneCommande,int[] tab,int pos) {
        if (pos!=ligneCommande.length) {
            tab[pos]=Integer.parseInt(ligneCommande[pos]);
            creation(ligneCommande, tab, pos+1);
        }
    }

    public static void affiche(int[] tab,int taille) {
        if (taille!=0) {
            affiche(tab, taille-1);
            System.out.print(tab[taille-1]+ " ");
        }
    }

    public static void inverse(int[] tab,int taille) {
        if (taille!=0) {
            System.out.print(tab[taille-1]+ " ");
            inverse(tab, taille-1);
        }
    }

    public static int pair(int[] tab,int pos) {
        int nb=0;
        if (pos!=0) {
            nb=pair(tab, pos-1);
            if (tab[pos-1]%2==0) {
            nb++;
            }
        }
        return nb;
    }

    public static int max(int[] tab,int pos) {
        int max=tab[pos-1];
        if (pos>1) {
            max=max(tab, pos-1);
            if (max<tab[pos-1]) {
                max=tab[pos-1];
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int[] tab=new int[args.length];
        creation(args, tab,0);
        affiche(tab, tab.length);
        System.out.println("\n"+pair(tab, tab.length));
        System.out.println(max(tab, tab.length));
        inverse(tab, tab.length);
    }
}
