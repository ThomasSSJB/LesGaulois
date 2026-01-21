package test_fonctionnel;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Romain minus = new Romain("Minus", 6);
		
		// asterix.parler("Bonjour à tous");	
		// minus.parler("UN GAU... UN GAUGAU...");
		// minus.recevoirCoup(5);
		// minus.recevoirCoup(3);
		
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		
		System.out.println();
		
		Druide panoramix = new Druide("Panoramix", 5);
		panoramix.fabriquerPotions(3);
		panoramix.afficherInformationsDruide();
	}

}
