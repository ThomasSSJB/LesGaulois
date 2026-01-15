package sites;

import personnages.Gaulois;

public class Village {
	
	private Gaulois chef;
	private Gaulois[] listeVillageois;
	private int nbVillageois;
	
	public Village(Gaulois chef) {
		this.chef = chef;
		listeVillageois = new Gaulois[50];
		nbVillageois = 0;
	}
	
	public Gaulois getChef() {
		return chef;
	}
	
	public boolean ajouterVillageois(Gaulois villageois) {
		if (nbVillageois > 3) {
			chef.parler("Désolé " + villageois.getNom() + " mon village est déjà bien rempli.");
			return false;
		} else {
			chef.parler("Bienvenue " + villageois.getNom());
			listeVillageois[nbVillageois] = villageois;
			nbVillageois++;
			return true;
		}
	}
	
	public void afficherVillageois() {
		System.out.println("Le village de " + chef.getNom() + " est habité par :");
		for (int i=0; i<nbVillageois ; i++) {
			System.out.println("- " + listeVillageois[i].getNom());
		}
	}
	
	public void changerChef(Gaulois newChef) {
		chef.parler("Je laisse mon grand bouclier au grand " + newChef.getNom());
		newChef.parler("Merci !");
		chef = newChef;
	}

}
