package fr.lucas.classes;

import java.util.Scanner;
import java.util.ArrayList;

public class Operation extends Voiture {
	public boolean ajouterNouvelleVoiture = true;
	
	// methode pour ajouter une voiture
	public ArrayList<Voiture> AjouterVoiture(ArrayList<Voiture> newVoiture) {
		

		boolean erreurSaisie = false;

		while (ajouterNouvelleVoiture) {

			System.out.println(" ");
			System.out.print("Ajout d'une nouvelle voiture ");
			System.out.println(" ");
			// pour entrer et enregistrer la marque de la voiture
			System.out.print("Entrer la marque de la voiture : ");
			Scanner clavierMarque = new Scanner(System.in);
			String marque = clavierMarque.nextLine();

			// pour entrer et enregistrer la couleur de la voiture
			System.out.print("Entrer la couleur de la voiture : ");
			Scanner clavierCouleur = new Scanner(System.in);
			String couleur = clavierCouleur.nextLine();

			// pour entrer et enregistrer l'année de la voiture
			System.out.print("Entrer l'année de la voiture : ");
			Scanner clavierAnnee = new Scanner(System.in);
			int annee = clavierAnnee.nextInt();

			// pour entrer et enregistrer le nb de portes de la voiture
			System.out.print("Entrer le nombre de porte de la voiture : ");
			Scanner clavierPorte = new Scanner(System.in);
			int nb = clavierPorte.nextInt();

			newVoiture.add(new Voiture(marque, couleur, annee, nb));

			// demande à l'utilisateur si il veut ajouter une nouvelle voiture
			System.out.println(" ");
			System.out.println("***************** ");
			System.out.println("Voulez vous ajouter une autre voiture?");
			System.out.println("1) Oui");
			System.out.println("2) Non");
			System.out.println("tapez le numéro de votre choix: ");

			System.out.println("***************** ");
			System.out.println(" ");
			Scanner clavierContinue = new Scanner(System.in);
			int reponse = clavierContinue.nextInt();

			if (reponse == 2) {
				this.ajouterNouvelleVoiture = false;

			}
		}

		return newVoiture;

	}
}
