/**
 * Service qui surveille un flux de mesures pour produire une moyenne glissante.
 *
 * @version 1.0 02 February 2024
 * @author Luc Hernandez
 */
public interface Average {
 
  /**
   * Renvoie la moyenne sur les dix dernières mesures.
   * 
   * @return la moyenne
   */
  double getAverage();
 
  /**
   * Ajoute une nouvelle mesure.
   * 
   * @param newData la nouvelle mesure
   */
  void addData(double newData);
 
}
