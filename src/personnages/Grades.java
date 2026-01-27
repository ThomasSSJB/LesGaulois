package personnages;

public enum Grades {
	SOLDAT("Soldat"), TESSERARIUS("Tesserarius"), OPTIO("Optio"), CENTURION("Centurion");
	
	private String chaine;
	Grades(String chaine) {
		this.chaine = chaine;
	}
	
	@Override
	public String toString() {
		return chaine;
	}
}
