
public class Five extends bateau {

	public Five(String n){
		super(n, 5);
	}
	
	public static void main (String[] args){
		Five B1 = new Five("GrosBateau");
		B1.SetPosition(5);
		B1.SetPosition(6);
		B1.SetPosition(7);
		if(B1.testPosition(5) == true)System.out.println("test concluant");
	}
}
