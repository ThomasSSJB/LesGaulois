package sites;

import personnages.Grades;
import personnages.Soldat;

public class Camp {
	
	private Soldat commandant;
	private Soldat[] listeSoldats;
	private int nbSoldats;
	
	public Camp(Soldat commandant) {
		this.commandant = commandant;
		listeSoldats = new Soldat[80];
		nbSoldats = 0;
	}
	
	public Soldat getCommandant() {
		return commandant;
	}
	
	public boolean ajouterSoldat(Soldat soldat) {
		if (nbSoldats > 2) {
			commandant.parler("Désolé " + soldat.getNom() + " notre camp est complet !");
			return false;
		} else {
			soldat.parler("Je mets mon épée au service de Rome dans le camp dirifé par " + commandant.getNom());
			listeSoldats[nbSoldats] = soldat;
			nbSoldats++;
			return true;
		}
	}
	
	public void afficherCamp() {
		System.out.println("Le camp dirigé par " + commandant.getNom() + " contient les soldats :");
		for (int i=0 ; i<nbSoldats ; i++) {
			System.out.println("- " + listeSoldats[i].getNom());			
		}
	}
	
	public void changerCommandant(Soldat newCommandant) {
		if (newCommandant.getGrade() == Grades.CENTURION) {
			newCommandant.parler("Moi " + newCommandant.getNom() + " je prends la direction du camp romain.");
			commandant = newCommandant;
		} else {
			newCommandant.parler("Je ne suis pas suffisamment gradé pour prendre la direction du camp.");			
		}
	}

}
