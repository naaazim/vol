import java.util.ArrayList;
import java.util.List;

public class Vol{
	private String numeroVol;
	private List<Billet> listeBillets;
	public Vol(String numeroVol, List<Billet>listeBillets){
		this.numeroVol = numeroVol;
		this.listeBillets = listeBillets;
	}
	public Vol(){
		this("", new ArrayList<Billet>());
	}
	public void afficherBillets(){
		for(Billet b : listeBillets){
			b.afficher();
		}
	}
	public void ajouterBillet(Billet b){
		listeBillets.add(b);
	}
} 
