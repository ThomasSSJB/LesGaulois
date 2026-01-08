package personnages;

public class Romain {
	
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String message) {
		System.out.println("Le Romain " + nom + " : \"" + message + '"' + ".");
	}
	
	public void recevoirCoup(int coup) {
		if ( (force-coup) <= 0) {
			force = 0;
			this.parler("J'abandonne...");
		} else {
			force -= coup;
			this.parler("Aïe ! ");
		}
	}

}
