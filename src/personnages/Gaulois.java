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
		System.out.println("Le Gaulois " + super.nom + " donne un grand coup  de force " + super.force + " au " + adversaire.donnerAuteur() + " " + adversaire.getNom() + ".");
		adversaire.recevoirCoup((super.force*puissanceActuellePotion)/3);
	}
	
	public void setPuissanceActuellePotion(int puissance) {
		puissanceActuellePotion = puissance;
	}
	
}
