import java.util.List;
import java.util.LinkedList;

public class Tendance implements Average{
	private double moyenne;
	private double[] valeurs;
	/**
	* Ici une pile se prete bien au stockage des donnees car lorsque l'on reçoie une valeur on la rajoute à la stack
	* donc on l'empile
	* On est obligé de créer une classe Donnees pour faire cette liste car le type primitif double n'est pas accepté
	* et le type Double n'a plus de constructeur non déprecié (cf : https://www.iut-fbleau.fr/docs/java/api/java.base/java/lang/Double.html)
	*/
	private List<Donnees> pileDonnees;
	
	public Tendance(double[] valeurs){
		this.valeurs = valeurs;
		this.pileDonnees = new LinkedList<>(); // Les LinkedList se prete bien aux piles car on peut ajouter des données à la liste à "l'infini" 
		for (int i = 0; i<10; i++){
			this.moyenne += this.valeurs[i];
			this.pileDonnees.add(new Donnees(valeurs[i]));
		}
		this.moyenne = this.moyenne / 10;
	}
	
	
	public double getAverage(){
		return this.moyenne;
	}
	
	
	/**
	* Puisque la moyenne se calcule sur les 10 derniers termes, on a juste à prendre l'ancienne moyenne et la multiplier 9 fois
	* et rajouter la nouvelle valeur et la diviser par 10
	*/
	public void addData(double newData){
		this.pileDonnees.add(new Donnees(newData));
		this.moyenne = ((this.moyenne * 9) + newData)/10;
	}
	
	public void getData(){
		for(Donnees data : pileDonnees){
			System.out.println(data.getData());
		}
	}
}
