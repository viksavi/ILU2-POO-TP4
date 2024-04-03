package produit;

public class Poisson extends Produit{
	private String date;
	
	public Poisson(String unite, String date) {
		super("poisson", unite);
		this.date = date;
	}
	
	public String getDescription() {
		StringBuilder result = new StringBuilder();
		result.append("poisson pêchés ");
		result.append(date);
		result.append(".");
		return result.toString();
	}
}
