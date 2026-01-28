package batailles;

import personnages.Personnage;

public class Embuscade implements IBataille {
	
	private String contexte;
	
	public Embuscade(String contexte) {
		this.contexte = contexte;
	}
	
	@Override
	public String decrireContexte() {
		return contexte;
	}

	@Override
	public String choisirCombattants() {
		// TODO Auto-generated method stub
		return "choisirCombattants";
	}

	@Override
	public String preparerCombat() {
		// TODO Auto-generated method stub
		return "preparerCombat";
	}

	@Override
	public String decrireCombat() {
		// TODO Auto-generated method stub
		return "decrireCombat";
	}

	@Override
	public String donnerResultat() {
		// TODO Auto-generated method stub
		return "donnerResultat";
	}

}
