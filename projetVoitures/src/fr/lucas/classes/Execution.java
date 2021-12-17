package fr.lucas.classes;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Execution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation m1 = new Operation();
		ArrayList<Voiture> voitures = new ArrayList<Voiture>();		
		//ArrayList<Voiture> voitures = new ArrayList<Voiture>();
		boolean quitter = false;
		
		System.out.println("Bonjour, vous allez enregistrer plusieurs voitures !");
		
		// demande à l'utilisateur son choix
		System.out.println(" ");
		System.out.println("***************** ");
		System.out.println("Que voulez vous faire ?");
		System.out.println("1) Ajouter un vehicule");
		System.out.println("tapez le numéro de votre choix: ");
		
		System.out.println("***************** ");
		System.out.println(" ");
		Scanner clavier = new Scanner(System.in);
		int reponse = clavier.nextInt();
	
		if(reponse == 1) {
			voitures = m1.AjouterVoiture();
							
		}
		
		while (!quitter) {
			// demande à l'utilisateur son choix
				System.out.println(" ");
				System.out.println("***************** ");
				System.out.println("Que voulez vous faire ?");
				System.out.println("1) Ajouter un vehicule");
				System.out.println("2) Voir le tableau");
				System.out.println("0) Quitter");
				System.out.println("tapez le numéro de votre choix: ");
				System.out.println("***************** ");
				System.out.println(" ");
				Scanner clavierChoix = new Scanner(System.in);
				int choix = clavierChoix.nextInt();
			
				if(choix == 1) {
					voitures = m1.AjouterVoiture();
					quitter = false;
									
				}else if (choix == 2)
				{
					System.out.println(" ");
					System.out.println("***************** ");
					System.out.println(" ");
					
					System.out.println("| Marque   | Couleur   | Porte   | Annee   |");
					for (Voiture voiture: voitures) {
						//afficher la voiture qui vient d'être créée						
						voiture.AfficherTableau();
	
				}
					quitter = false;
			} else if(choix ==0)
				System.out.println(" ");
				System.out.println("***************** ");
				System.out.println("Au revoir ");
				System.out.println(" ");
				quitter = true;
		}
	}
}