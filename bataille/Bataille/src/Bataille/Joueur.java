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
public class Joueur {
    private final Carte[]tabCarte;
    private int nbPoints;
    private static final int nbMax=52;
    private int nbCartes;

    public Joueur(){
	nbCartes=0;
	nbPoints=0;
	tabCarte=new Carte[nbMax];
    }

    public void ajouterCarte(Carte c){
	if(nbCartes<nbMax){
	    tabCarte[nbCartes]=c;
	    nbCartes++;
	}
    }

    public Carte tireCarte(){	
	Carte crt=new Carte(tabCarte[nbCartes-1].getCouleurCarte(),tabCarte[nbCartes-1].getValCarte());
	tabCarte[nbCartes-1]=null;
	nbCartes--;
	return crt;
    }

    public int getNbPoints(){
	return nbPoints;
    }

    public int getNbCartes(){
	return nbCartes;
    }

    public void setNbPoints(){
	nbPoints++;
    }

    public void setNbCartes(){
	nbCartes--;
    }

    public void afficheTableau(){
	for(int i=0;i<nbCartes;i++){
	    System.out.print(tabCarte[i]+"\n");
	}
    }
}
