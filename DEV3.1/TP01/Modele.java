import java.sql.*;


public class Modele {
    Competiteur[] tab;

    public Modele() {
        this.tab = new Competiteur[26];
        for (int i = 0; i < tab.length; i++) {
            this.tab[i] = new Competiteur();
        }
    }


    public void nbVotes(){
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            try {
                Connection cnx=DriverManager.getConnection("jdbc:mariadb://dwarves.iut-fbleau.fr/morinl","morinl","chehsatoru");
                try {
                    PreparedStatement pst=cnx.prepareStatement("SELECT * FROM Votes ORDER BY Competiteur");
                    try {
                        int pays=0;
                        ResultSet rs=pst.executeQuery();

                        while (rs.next()) {
                            String paysActu=tab[pays].getPays();
                            String paysSuiv=rs.getString(1);
                            if (paysActu != paysSuiv){
                                pays++;
                                tab[pays]=new Competiteur();
                                tab[pays].setPays(rs.getString(1));
                            }
                            tab[pays].addScore(rs.getInt(3));
                        }

                    } catch (SQLException e) {
                        System.err.println("Resultset" + e.getMessage());
                    }
                } catch (SQLException e) {
                    System.err.println("Prepare Statement");
                }
                cnx.close();
            } catch (SQLException e) {
                System.err.println("Ptdr t ki?");
            }
        } catch (ClassNotFoundException e) {
            System.err.println("Ptdr t ou?");
        }
    }

    /*
    public void nombrePays(){
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            try {
                Connection cnx=DriverManager.getConnection("jdbc:mariadb://dwarves.iut-fbleau.fr/morinl","morinl","chehsatoru");
                try{
                    PreparedStatement pst=cnx.prepareStatement("SELECT * FROM Competiteur");
                    try {
                        ResultSet rs=pst.executeQuery();
                        while (rs.next()) {
                            tab[nb]= rs.getString(1);
                            this.nb++;
                        }
                    } catch (SQLException e) {
                        System.err.println("Resultset" + e.getMessage());
                    }
                    
                }catch(SQLException e){
                        System.err.println("Prepare Statement");
                }
                cnx.close();
            } catch (SQLException e) {
                System.err.println("ptdr t ki?");
            }

        } catch(ClassNotFoundException e){
            System.err.println("Ptdr t ou?");
        }
    }
    */

    public Competiteur[] getTab() {
        return this.tab;
    }
}
