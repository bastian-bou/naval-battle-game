
public abstract class bateau {

	protected String nom;		//type du bateau
	protected int value;		//taille du bateau
	protected int nbTouche;	//nombre de touche sur le bateau
	protected int tab[];
	protected static int i;
	
	//constructeur 
	public bateau(String n, int val){
		nom = n;
		value = val;
		nbTouche = 0;
		i = 0;
		tab = new int[val];
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
		/*
		 * retourne vrai (true) il est coulé
		 * ou faux (false) si il est simplement touché
		 */
		nbTouche ++;
		if (nbTouche == value) return true;
		else return false;
	}
	
	public void SetPosition(int pos){
		/*
		 * Affect une valeur liée à la postion d'un bouton au bateau par un tableau
		 */
		if(i < value)
		{
			tab[i] = pos;
			i++;
		}
		if(i == value) i = 0;
	}
	
	//retourne le tableau des differentes positions des cases du bateau
	public int[] getPositions(){
		return tab;
	}
	
	public boolean testPosition(int pos){
		/*
		 * Test si la position correspond au bateau et si il a deja ete touche au meme endroit
		 * si OUI, retourne True
		 * sinon retourne False
		 */
		int cmpt = 0;
		for(int j=0; j < value; j++){
			if (pos == tab[j])cmpt++;
		}
		if(cmpt == 1)return true;
		return false;
	}
		
}
