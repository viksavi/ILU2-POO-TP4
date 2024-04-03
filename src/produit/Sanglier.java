package produit;

import personnages.Gaulois;

public class Sanglier extends Produit{

	private int poids;
	private Gaulois chasseur;
	
	public Sanglier(String unite, int poids, Gaulois chasseur) {
		super("sanglier", unite);
		this.poids = poids;
		this.chasseur = chasseur;
	}
	
	public String getDescription() {
		StringBuilder result = new StringBuilder();
		result.append("sanglier de ");
		result.append(String.valueOf(poids));
		result.append(" ");
		result.append(unite);
		result.append(" chassé par ");
		result.append(chasseur.getNom());
		result.append(".");
		return result.toString();
	}
}
