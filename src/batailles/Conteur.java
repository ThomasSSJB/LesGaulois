package batailles;

public class Conteur {
	
	private String nom;
	private IBataille bataille;
	
	public Conteur(String nom) {
		this.nom = nom;
	}
	
	public void raconterHistoire(IBataille bataille, String presentation) {
		System.out.println(presentation + "\n");
		
		System.out.println(bataille.decrireContexte());
		System.out.println(bataille.choisirCombattants());
		System.out.println(bataille.preparerCombat());
		System.out.println(bataille.decrireCombat());
		System.out.println(bataille.donnerResultat());		
	}
	
}
