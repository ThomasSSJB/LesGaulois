package personnages;

public abstract class Personnage {
	
	protected String nom;
	protected int force;
	
	protected Personnage(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getForce() {
		return force;
	}
	
	public void parler(String texte) {
		System.out.println("Le " + donnerAuteur() + " " + nom + " : \"" + texte + '"' + ".");
	}
	
	protected abstract String donnerAuteur();
	
	public void frapper(Personnage adversaire) {
		System.out.println("Le " + donnerAuteur() + " " + nom + " donne un grand coup au " + adversaire.donnerAuteur() + " " + adversaire.getNom() + ".");
		adversaire.recevoirCoup(force);
	}
	
	public void recevoirCoup(int forceCoup) {
		if ( (force-forceCoup) <= 0 ) {
			force = 0;
			this.parler("J'abandonne...");
		} else {
			force -= forceCoup;
			this.parler("Aïe !");
		}
	}
	
	public void combattre(Personnage adversaire) {
	    while (this.force > 0 && adversaire.getForce() > 0) {
	        this.frapper(adversaire);
	        if (adversaire.getForce() > 0) {
	            adversaire.frapper(this);
	        }
	    }
	}
}
