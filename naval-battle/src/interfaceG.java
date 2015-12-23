import javax.swing.*;
import java.awt.* ;
import java.awt.event.*;

public class interfaceG extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton Grille1[];
	private JButton Grille2[];
	private JPanel Plateaux;
	private JPanel PlateauxJ1;
	private JPanel PlateauxJ2;
	private JPanel InterfaceJoueur;
	private JPanel InterfaceJ1;
	private JPanel InterfaceJ2;
	private JLabel NomJ1;
	private JLabel NomJ2;
	private JLabel BateauxRestantJ1;
	private JLabel BateauxRestantJ2;
	
	
	
	
	//constructeur interface graphique
	public interfaceG()
	{
		super("Battleship");
		
		setSize(1200, 400);
		this.setLocationRelativeTo(null);
		Plateaux = new JPanel();
		PlateauxJ1 = new JPanel();
		PlateauxJ2 = new JPanel();
		InterfaceJoueur = new JPanel();
		InterfaceJ1 = new JPanel();
		InterfaceJ2 = new JPanel();
		Grille1 = new JButton[100];
		Grille2 = new JButton[100];
		NomJ1 = new JLabel("J1");
		NomJ2 = new JLabel("J2");
		BateauxRestantJ1 =new JLabel("Bateaux Restant: ");
		BateauxRestantJ2 =new JLabel("Bateaux Restant: ");
		//création de la zone de jeux avec les plateaux des joueurs
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(Plateaux, BorderLayout.CENTER);
		
		Plateaux.setLayout(new GridLayout( 1, 2, 40, 0));
		Plateaux.add(PlateauxJ1);
		Plateaux.add(PlateauxJ2);
		PlateauxJ1.setLayout(new GridLayout(10, 10));
		PlateauxJ2.setLayout(new GridLayout(10, 10));
		
		
		//Bar horizontale des joueurs
		getContentPane().add(InterfaceJoueur, BorderLayout.NORTH);
		InterfaceJoueur.setLayout(new GridLayout(1, 2, 100, 50));
		InterfaceJoueur.add(InterfaceJ1);
		InterfaceJoueur.add(InterfaceJ2);
		InterfaceJ1.setLayout(new GridLayout(3, 1, 0, 5));
		InterfaceJ2.setLayout(new GridLayout(3, 1, 0, 5));
		InterfaceJ1.add(NomJ1);
		InterfaceJ1.add(BateauxRestantJ1);
		InterfaceJ2.add(NomJ2);
		InterfaceJ2.add(BateauxRestantJ2);

		
		
		
		
		
		
		for(int i = 0; i <= 99; i++)
		{
			Grille1[i] = new JButton(""+(i+1));
			Grille1[i].setActionCommand("Action"+i);
			Grille1[i].addActionListener(this);
			//Grille1[i].setPreferredSize(new Dimension(1,1));
			PlateauxJ1.add(Grille1[i]);
			//Grille1[i].setPreferredSize(Taille);
			Grille1[i].setBounds(1, 1, 10, 10);
		}
		for(int i = 0; i <= 99; i++)
		{
			Grille2[i] = new JButton(""+(i+1));
			Grille2[i].setActionCommand("Action"+i);
			Grille2[i].addActionListener(this);
			PlateauxJ2.add(Grille2[i]);
			//Grille2[i].setPreferredSize(Taille);
		}

		setVisible(true);
		
		
		
		
		
		

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args){
		
		JFrame MonInterface =new interfaceG();
		
	}
	
	
	
}

