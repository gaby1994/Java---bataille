/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bataille;

/**
 *
 * @author licence
 */
public class Bataille {
    public static void main(String [] args){
	Joueur j1=new Joueur();
	Joueur j2=new Joueur();
	//paquet de cartes
	Carte [] paquet=new Carte[52];

	//initialisation du paquet de cartes
	int i=0;
        while(i<paquet.length){
	    for(int j=0;j<4;j++){
		for(int k=0;k<13;k++){
		    paquet[i]=new Carte(j,k);
		    //  System.out.print(paquet[i]+"\n");
		    i++;
		}
	    }
	}	    
	//	System.out.println("\nJeu melange\n");
	//melange du paquet de cartes
	Carte tmp=new Carte(-1,-1);
        for (Carte paquet1 : paquet) {
            // carte d'indice j va dans tmp
            tmp.setCouleurCarte(paquet1.getCouleurCarte());
            tmp.setValCarte(paquet1.getValCarte());
            int r = (int) (Math.random()*52);
            // carte paquet[r] remplace carte paquet[j]
            paquet1.setCouleurCarte(paquet[r].getCouleurCarte());
            paquet1.setValCarte(paquet[r].getValCarte());
            // carte tmp remplace carte paquet[r]
            paquet[r].setCouleurCarte(tmp.getCouleurCarte());
            paquet[r].setValCarte(tmp.getValCarte());
        }
        /*	for(int j=0; j<paquet.length;j++){
        System.out.println(paquet[j]);
        }*/
	
	//distribution du paquet entre les deux joueurs
	for(int j = 0; j < paquet.length; j++){
	    //si j est pair, on ajoute la carte paquet[j] à j1
	    //si j est impair, on ajoute la carte paquet[j] à j2
	    if(j%2==0){
		j1.ajouterCarte(paquet[j]);
	    }else{
		j2.ajouterCarte(paquet[j]);
	    }
	}
	/*	System.out.println("\nTableau de cartes de j1");
	j1.afficheTableau();
	System.out.println("\nTableau de cartes de j2");
	j2.afficheTableau();*/

	//jeu d'une partie
	while(j1.getNbCartes() > 0 || j2.getNbCartes() > 0){
	    Carte c1=j1.tireCarte();
	    Carte c2=j2.tireCarte();

	    if(c1.getValCarte() > c2.getValCarte()){
	        j1.setNbPoints();
	    }else{
		if(c1.getValCarte() < c2.getValCarte()){
		    j2.setNbPoints();
		}		
	    }

	    System.out.print("carte j1 : "+c1+"  ");
	    System.out.print("carte j2 : "+c2+"\n");
	    System.out.print("Score j1 = "+j1.getNbPoints()+"  ");
	    System.out.print("Score j2 = "+j2.getNbPoints()+"\n");
	}
	

	//determination du gagnant
	if(j1.getNbPoints()==j2.getNbPoints()){
	    System.out.println("Match Nul");
	}else{
	    if(j1.getNbPoints() > j2.getNbPoints()){
		System.out.println("Joueur 1 a gagne");
	    }else{
		System.out.println("Joueur 2 a gagne");
	    }
	}
    }
}
