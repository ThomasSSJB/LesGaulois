package personnages;

public class Gaulois extends Personnage {
	
	private int puissanceActuellePotion = 1;
	
	public Gaulois(String nom, int force) {
		super(nom, force);
	}
	
	@Override
	protected String donnerAuteur() {
		return "gaulois";
	}
	
	@Override
	public void frapper(Personnage adversaire) {
		float forceCoup = super.force*puissanceActuellePotion;
		System.out.println("Le Gaulois " + super.nom + " donne un grand coup de force " + forceCoup + " au " + adversaire.donnerAuteur() + " " + adversaire.getNom() + ".");
		adversaire.recevoirCoup((int)forceCoup);
		if (forceCoup > 1) {
			puissanceActuellePotion -= 0.5;			
		}
	}
	
	public void setPuissanceActuellePotion(int puissance) {
		puissanceActuellePotion = puissance;
	}
	
}
