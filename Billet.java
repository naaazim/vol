public class Billet implements Reduction{
	private String type;
	private double prixBase;
	public Billet(String type, double prixBase) throws PrixInvalideException{
		if(prixBase < 0) throw new PrixInvalideException("Le prix doit être positif");
		this.type = type;
		this.prixBase = prixBase;
	}
	public double getPrix(){ return prixBase; }
	public void appliquerReduction(double prix) throws ReductionInvalideException{
		if(prix > prixBase || prix < 0) throw new ReductionInvalideException("La réduction doit être comprise entre 0 et le prix actuel");
		prixBase -= prix;
	}
	public void afficher(){
		System.out.println("Billet [type = " + type + " prix = " + prixBase + "]");  	
	}
}
