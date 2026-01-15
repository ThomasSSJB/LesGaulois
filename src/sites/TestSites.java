package sites;

import personnages.Gaulois;
import personnages.Grades;
import personnages.Romain;
import personnages.Soldat;

public class TestSites {
	
	public static void main(String[] args) {
		Gaulois vercingetorix = new Gaulois("Vercingétorix", 5);
		Soldat minus = new Soldat("Minus", 2, Grades.CENTURION);
		
		Village village = new Village(vercingetorix);
		Camp camp = new Camp(minus);
		
		vercingetorix.parler("Je suis un grand guerrier et je vais créer mon village");
		minus.parler("Je suis en charge de créer un nouveau camp romain");
		
		System.out.println();
		
		Soldat brutus = new Soldat("Brutus", 5, Grades.CENTURION);
		Soldat milexcus = new Soldat("Milexcus", 2, Grades.SOLDAT);
		Soldat tulliusOctopus = new Soldat("Tullius Octopus", 2, Grades.TESSERARIUS);
		Soldat ballonDeBaudrus = new Soldat("Ballondebaudrus", 3, Grades.OPTIO);
		
		Gaulois agecanonix = new Gaulois("Agecanonix", 1);
		Gaulois assurancetourix = new Gaulois("Assurancetourix", 2);
		Gaulois asterix = new Gaulois("Astérix", 5);
		Gaulois obelix = new Gaulois("Obelix", 15);
		Gaulois prolix = new Gaulois("Prolix", 2);
		
		camp.ajouterSoldat(brutus);
		camp.ajouterSoldat(milexcus);
		camp.ajouterSoldat(tulliusOctopus);
		camp.ajouterSoldat(ballonDeBaudrus);
		
		System.out.println();
		
		village.ajouterVillageois(agecanonix);
		village.ajouterVillageois(assurancetourix);
		village.ajouterVillageois(asterix);
		village.ajouterVillageois(obelix);
		village.ajouterVillageois(prolix);
		
		System.out.println();
		
		village.afficherVillageois();
		System.out.println();
		camp.afficherCamp();
		
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 5);
		Soldat briseradius = new Soldat("Briseradius", 4, Grades.SOLDAT);
		Soldat chorus = new Soldat("Chorus", 4, Grades.CENTURION);
		
		System.out.println();
		
		village.changerChef(abraracourcix);
		System.out.println();
		camp.changerCommandant(briseradius);
		camp.changerCommandant(chorus);
		
	}

}
