package produit;

public abstract class Produit {
	
	private String nom;
	protected String unite;
	
	Produit(String nom, String unite) {
		this.nom = nom;
		this.unite = unite;
	}
	
	public String getNom() 
	{
		return nom;
	}
	
	public abstract String getDescription();
}
