package fr.lucas.classes;

public class Voiture {
	// une voiture possède une marque, une couleur, une année de mise en service, nombre de portes
	
	String marqueVoiture;
	String couleurVoiture;
	int anneeVoiture;
	int nbPortes;
	
	Voiture(){
		
	}
	
	//constructeur principal
	Voiture(String marque, String couleur, int annee, int nb){
		this.marqueVoiture = marque;
		this.couleurVoiture = couleur;
		this.anneeVoiture = annee;
		this.nbPortes = nb;
	}

	// methode pour afficher la voiture 
	public void Afficher() {
		System.out.println("La voiture de la marque "+ this.marqueVoiture + " de couleur " + this.couleurVoiture + " qui possèdent " + this.nbPortes + 
				" portes et mise en circulation en " + this.anneeVoiture + " a bien été enregistrée !");
	}
	
	//methode pour afficher sous forme de tableau
	public void AfficherTableau() {
		
		
		System.out.println(" ------------------------------------------ ");
		System.out.println("| "+ this.marqueVoiture + "   | "+ this.couleurVoiture + "   | "+ this.nbPortes + "   | "+ this.anneeVoiture + "   | ");

	}
	//constructeur secondaire
	
	//getter 
	public String getMarqueVoiture() {
		return marqueVoiture;
	}
	
	public String getCouleurVoiture() {
		return couleurVoiture;
	}
	
	public int getAnneeVoiture() {
		return anneeVoiture;
	}
	
	public int getNbPortes() {
		return nbPortes;
	}

	// Setters
	public void setMarqueVoiture(String marqueVoiture) {
		this.marqueVoiture = marqueVoiture;
	}

	public void setCouleurVoiture(String couleurVoiture) {
		this.couleurVoiture = couleurVoiture;
	}

	public void setAnneeVoiture(int anneeVoiture) {
		this.anneeVoiture = anneeVoiture;
	}

	public void setNbPortes(int nbPortes) {
		this.nbPortes = nbPortes;
	}

	
}
