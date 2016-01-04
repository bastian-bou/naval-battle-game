
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
		value=2;
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
	
	public void SetPosition(int pos){
		/*
		 * Affect une valeur liée à la postion d'un bouton au bateau par un tableau
		 */
		if(i < value)
		{
			tab[i] = pos;
			i++;
		}
	}
	
	public boolean testPosition(int pos){
		/*
		 * Test si la position correspond au bateau
		 * si OUI, retourne True
		 * sinon retourne False
		 */
		for(int j=0; j < value; j++)
			if (pos == tab[j])return true;
		return false;
	}
	
	
	
}
