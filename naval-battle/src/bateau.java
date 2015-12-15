
public abstract class bateau {

	protected String nom;		//type du bateau
	protected int value;		//taille du bateau
	protected int nbTouche;	//nombre de touche sur le bateau
	
	//constructeur 
	public bateau(String n, int val){
		nom = n;
		value = val;
		nbTouche = 0;
	}
	
	//retourne le nom du bateau (type)
	public String getNom(){
		return nom;
	}
	
	//retourne la taille du bateau
	public int getValue(){
		return value;
	}
	
	//ajoute une touche au bateau et test si il est "touché" ou "coulé"
	public boolean addTouch(){
		nbTouche ++;
		/*
		 * retourne vrai (true) il est coulé
		 * ou faux (false) si il est simplement touché
		 */
		if (nbTouche == value) return true;
		else return false;
	}
	
}
