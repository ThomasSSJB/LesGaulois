package test_fonctionnel;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	
	public static void main(String[] args) {
		Gaulois agecanonix = new Gaulois("Agecanonix", 1);
		Gaulois assurancetourix = new Gaulois("Assurancetourix", 2);
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 5);
		Gaulois asterix = new Gaulois("Astérix", 5);
		Gaulois obelix = new Gaulois("Obélix", 15);
		Romain minus = new Romain("Minus", 6);
		Druide panoramix = new Druide("Panoramix", 5);
		
		panoramix.fabriquerPotions(3);
		panoramix.boosterGaulois(asterix);
		panoramix.boosterGaulois(obelix);
		panoramix.boosterGaulois(assurancetourix);
		panoramix.boosterGaulois(abraracourcix);
		panoramix.boosterGaulois(agecanonix);
		asterix.parler("Bonjour à tous");
		
		System.out.println();
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.combattre(minus);
		
	}

}
