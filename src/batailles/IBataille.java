package batailles;

import personnages.Personnage;

public interface IBataille {
	
	void decrireContexte();
	void ajouterCombattant(Personnage  combattant);
	void preparerCombat();
	void decrireCombat();
	void donnerResultat();	

}
