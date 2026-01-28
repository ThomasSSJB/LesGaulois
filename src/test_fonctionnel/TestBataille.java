package test_fonctionnel;

import batailles.Conteur;
import batailles.Embuscade;
import personnages.Gaulois;
import personnages.Grades;
import personnages.Soldat;
import sites.Camp;
import sites.Village;

public class TestBataille {

	public static void main(String[] args) {
		
		Gaulois abraracourcix = new Gaulois("Abraracourix", 5);
		Village village = new Village(abraracourcix);
		
		Gaulois agecanonix = new Gaulois("Agecanonix", 1);
		Gaulois assurancetourix = new Gaulois("Assurancetourix", 2);
		Gaulois asterix = new Gaulois("Astérix", 5);
		Gaulois obelix = new Gaulois("Obélix", 15);
		Gaulois cetautomatix = new Gaulois("Cétautomatix", 8);
		Gaulois ordralfabetix = new Gaulois("Ordralfabétix", 8);
		
		village.ajouterVillageois(agecanonix);
		village.ajouterVillageois(assurancetourix);
		village.ajouterVillageois(asterix);
		village.ajouterVillageois(obelix);
		village.ajouterVillageois(cetautomatix);
		village.ajouterVillageois(ordralfabetix);
		
		Soldat chorus = new Soldat("Chorus", 4, Grades.CENTURION);
		Camp camp = new Camp(chorus);
		Soldat minus = new Soldat("Minus", 2, Grades.SOLDAT);
		Soldat brutus = new Soldat("Brutus", 5, Grades.CENTURION);
		Soldat milexcus = new Soldat("Milexcus", 2, Grades.SOLDAT);
		Soldat tullius = new Soldat("Tullius Octopus", 2, Grades.TESSERARIUS);
		Soldat ballondebaudrus = new Soldat("Ballondebaudrus", 3, Grades.OPTIO);
		Soldat quintilius = new Soldat("Quintilius", 2, Grades.SOLDAT);
		camp.ajouterSoldat(brutus);
		camp.ajouterSoldat(milexcus);
		camp.ajouterSoldat(tullius);
		camp.ajouterSoldat(ballondebaudrus);
		camp.ajouterSoldat(minus);
		camp.ajouterSoldat(quintilius);
		
		System.out.println();
		
		Conteur goscinny = new Conteur("Goscinny");
		Embuscade embuscade = new Embuscade("Dans une sombre forêt dans un coin reculé de la Gaule, quatre comparses se promènent.");
		goscinny.raconterHistoire(embuscade, "Je suis Goscinny. Je vais vous conter une histoire qui se déroule en 50 avant Jésus-Christ, du temps où la Gaule est occupée par les Romains.");
	}

}
