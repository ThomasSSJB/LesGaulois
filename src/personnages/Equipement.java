package personnages;

public enum Equipement {
	CASQUE("casque", 2), PLASTRON("plastron", 3), BOUCLIER("bouclier", 3);
	
	private String nom;
	private int protection;
	
	private Equipement(String nom, int protection) {
		this.nom = nom;
		this.protection = protection;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getProtection() {
		return protection;
	}
	
	@Override
	public String toString() {
		return nom;
	}
}