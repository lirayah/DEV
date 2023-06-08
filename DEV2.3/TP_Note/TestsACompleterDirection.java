import static org.junit.Assert.assertTrue; // import static : une facilité offerte depuis java5 (pas besoin de mettre le préfixe)
import static org.junit.Assert.assertFalse; //
import static org.junit.Assert.assertEquals; // 
import org.junit.Test;

import java.lang.StringBuilder;



/**
 * Une classe pour faire des tests sur la classe MaMemoire avec JUnit
 */
public class TestsACompleterDirection {


    /**
     * Test nord x vaut 0
     */
    @Test
    public void Nordx(){
        // au nord c'était les corons.
        Direction d = Direction.NORD;
        assertEquals(0,d.getDecalageX());
    }

    /**
     * Test nord y vaut -1
     */
    @Test
    public void Nordy(){
        Direction d = Direction.NORD;
        assertEquals(-1,d.getDecalageY()); // Test qui va rater car la valeur y de la constante NORD = 1
    }

    /**
     * Test que reset retourne une NullPointerException
     */
    @Test(expected = NullPointerException.class)
    public void ResetNPE(){
        Direction d=Direction.NORD;
        d.reset();
    }


    /**
     * Test que l'on peut faire 64 fois un huitième de tour dans le sens trigonométrique et être au même endroit quand on part du Sud Est
     */
    @Test
    public void whenIGetOlder(){
        Direction d=Direction.SE;
        for (int i = 0; i < 64; i++) {
            d.huitDeTour(); // Probleme entre le sens trigo et anti trigo car la liste des directions données dans le fichier est dans le sens anti trigo alors que son nom indique qu'elles sont sensées être dans le sens trigo n'indique donc aucune erreur
        }
        assertEquals(d, Direction.SE);
    }


    /**
     * Test que l'on peut faire 65 fois un huitième detour dans le sens antitrigonométrique et être au même endroit que si on faisait un anti huitième de tour quand on part du Sud Est
     */
    public void losingMyHair(){
        Direction d1=Direction.SE;
        Direction d2=Direction.SE;
        d2.huitDeTour();
        for (int i = 0; i < 65; i++) {
            d1.huitDeTourAnti(); // Probleme entre le sens trigo et anti trigo car la liste des directions données dans le fichier est dans le sens anti trigo alors que son nom indique qu'elles sont sensées être dans le sens trigo ce test n'indique donc aucune erreur
        }
        assertEquals(d1, d2);
    }
}
