import java.sql.*;

/**
 * Vote
 */
public class Vote {
    public static void main(String[] args) {
        String pays=args[0];
        int compte=0;
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            try {
                Connection cnx=DriverManager.getConnection("jdbc:mariadb://dwarves.iut-fbleau.fr/morinl","morinl","chehsatoru");
                try{
                    PreparedStatement pst=cnx.prepareStatement("SELECT Votant,Points from Votes WHERE Competiteur=?");
                    pst.setString(1, pays);
                    try {
                        ResultSet rs=pst.executeQuery();
                        while (rs.next()) {
                            System.out.print(rs.getString(1));
                            System.out.println("   "+ rs.getInt(2));
                            compte+=rs.getInt(2);
                        }
                    } catch (SQLException e) {
                        System.err.println("Resultset" + e.getMessage());
                    }
                    
                }catch(SQLException e){
                        System.err.println("Prepare Statement");
                }
                System.out.println("Total     "+ compte);
                cnx.close();
            } catch (SQLException e) {
                System.err.println("ptdr t ki?");
            }
        } catch(ClassNotFoundException e){
            System.err.println("Ptdr t ou?");
        }
    }
}