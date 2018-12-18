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
public class Carte {
    public static String[] couleur={"trefle","carreau","coeur","pique"};
    public static String[] valeur={"deux","trois","quatre","cinq","six","sept","huit","neuf","dix","valet","dame","roi","as"};
    private int valCarte;
    private int couleurCarte;

    public Carte(int c,int v){
	couleurCarte=c;
	valCarte=v;
    }

    public int getValCarte(){
	return valCarte;
    }

    public int getCouleurCarte(){
	return couleurCarte;
    }

    public void setValCarte(int v){
	valCarte=v;
    }

    public void setCouleurCarte(int c){
	couleurCarte=c;
    }

    public boolean equals(Object o){
	if(o instanceof Carte){
	    Carte crt=(Carte)o;
	    return (couleurCarte==crt.couleurCarte)&&(valCarte==crt.valCarte);
	}else{
	    return false;
	}
    }
    
    public String toString(){
	return valeur[valCarte]+" de "+couleur[couleurCarte];
    }
}
