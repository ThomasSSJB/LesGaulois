package personnages;

public abstract class Personnage {
	
	private String nom;
	private int force;
	
	protected Personnage(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println("Le " + donnerAuteur() + " " + nom + " : \"" + texte + '"' + ".");
	}
	
	protected abstract String donnerAuteur();
	
	public void frapper(Personnage adversaire) {
		System.out.println("Le " + donnerAuteur() + " " + nom + " donne un grand coup au " + adversaire.donnerAuteur() + " " + adversaire.getNom() + ".");
		adversaire.recevoirCoup(force/3);
	}
	
	public void recevoirCoup(int forceCoup) {
		if ( (force-forceCoup) <= 0) {
			force = 0;
			this.parler("J'abandonne...");
		} else {
			force -= forceCoup;
			this.parler("Aïe !");
		}
	}	
}
