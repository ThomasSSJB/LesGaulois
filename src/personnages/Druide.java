package personnages;

import java.util.Random;

public class Druide extends Gaulois {
	
	private int nbDoses = 0;
	private int puissance;
	
	public Druide(String nom, int force) {
		super(nom, force);
		
		Random random = new Random();
		puissance = random.nextInt(5)+2;
	}
	
	public void fabriquerPotions(int nbDosesAFabriquer) {
		nbDoses += nbDosesAFabriquer;
	}
	
	public void afficherInformationsDruide() {
		this.parler("J'ai concocté " + nbDoses + " doses de potion magique. Elle a une force de " + puissance + ".");
	}
}
