package personnages;

import java.security.SecureRandom;
import java.util.Random;

public class Druide extends Gaulois {
	
	private int nbDoses = 0;
	private int puissance;
	private Random random;
	
	public Druide(String nom, int force) {
		super(nom, force);
		
		try {
		random = SecureRandom.getInstanceStrong();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void fabriquerPotions(int nbDosesAFabriquer) {
		nbDoses += nbDosesAFabriquer;
		puissance = 2 + random.nextInt(5);
	}
	
	public void afficherInformationsDruide() {
		this.parler("J'ai concocté " + nbDoses + " doses de potion magique. Elle a une force de " + puissance + ".");
	}
	
	public void boosterGaulois(Gaulois gaulois) {
		if ("Obélix".equals(gaulois.getNom())) {
			this.parler("Non, Obélix Non !... Et tu le sais très bien !");
		} else if (nbDoses > 0) {
			this.parler("Tiens " + gaulois.getNom() + " un peu de potion magique.");
			gaulois.setPuissanceActuellePotion(puissance);
			nbDoses--;
		} else {
			this.parler("Désolé " + gaulois.getNom() + " il n'y a plus une seule goutte de potion.");
		}
	}
}
