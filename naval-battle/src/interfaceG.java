import javax.swing.*;
import java.awt.* ;
import java.awt.event.*;

public class interfaceG extends JFrame implements ActionListener {


	//Déclaration des attributs pour l'interface joueur
	private JPanel InterfaceJoueur;
	private JPanel InterfaceJ1;
	private JPanel InterfaceJ2;
	private JLabel NomJ1;
	private JLabel NomJ2;
	private JLabel ValeurNomJ1;
	private JLabel ValeurNomJ2;
	private JLabel BateauxRestantJ1;
	private JLabel BateauxRestantJ2;
	private JLabel ValeurBateauxRestantJ1;
	private JLabel ValeurBateauxRestantJ2;
	
	//Déclaration des attributs pour le plateaux de jeu
	private JPanel Plateaux;
	private JPanel PlateauxJ1;
	private JPanel PlateauxJ2;
	private JButton Grille1[];
	private JButton Grille2[];
	
	//Déclaration des attributs pour les boutons systèmes du jeu
	private JPanel Systeme;
	private JButton BoutonStart;
	private JButton BoutonStopRestart;
	private JLabel ResultatScore;
	private JLabel ValeurResultatScore;
	private JLabel Vide1;
	private JLabel Vide2;
	private JLabel Vide3;
	private JLabel Vide4;
	
	
	
	private static final long serialVersionUID = 1L;

	
	//constructeur interface graphique
	public interfaceG()
	{
		//Appel du contructeur JFrame
		super("Battleship");
		
		
		//Contruction des éléments pour l'interface joueur
		InterfaceJoueur = new JPanel();
		InterfaceJ1 = new JPanel();
		InterfaceJ2 = new JPanel();
		NomJ1 = new JLabel("Nom du Joueur 1: ");
		NomJ2 = new JLabel("Nom du Joueur 2: ");
		ValeurNomJ1 = new JLabel("Joueur1");
		ValeurNomJ2 = new JLabel("Joueur2");
		BateauxRestantJ1 = new JLabel("Nombre de bateaux restants: ");
		BateauxRestantJ2 = new JLabel("Nombre de bateaux restants: ");
		ValeurBateauxRestantJ1 = new JLabel("1");
		ValeurBateauxRestantJ2 = new JLabel("2");
		
		//Construction des éléments pour le plateaux de jeu
		Plateaux = new JPanel();
		PlateauxJ1 = new JPanel();
		PlateauxJ2 = new JPanel();
		Grille1 = new JButton[100];
		Grille2 = new JButton[100];
		
		//Construction des éléments pour les boutons système du jeu
		BoutonStart = new JButton();
		BoutonStart.setText("Start");
		BoutonStopRestart = new JButton();
		BoutonStopRestart.setText("Stop & Restart");
		Systeme = new JPanel();
		ResultatScore = new JLabel("Résultat de la partie: ");
		ValeurResultatScore = new JLabel("Victoire Joueur 1");
		Vide1 = new JLabel("");
		Vide2 = new JLabel("");
		Vide3 = new JLabel("");
		Vide4 = new JLabel("");
		
		
		// Construction de la frame
		
		setSize(1170, 500);
		
		setLocationRelativeTo(null);
		
		
		//Organisation de la frame avec un BorderLayout
		getContentPane().setLayout(new BorderLayout());
		
		//Construction de l'interface status des joueurs (north du borderlayout)
		getContentPane().add(InterfaceJoueur, BorderLayout.NORTH);
		InterfaceJoueur.setLayout(new GridLayout( 1, 2, 35, 0));
		InterfaceJoueur.add(InterfaceJ1);
		InterfaceJoueur.add(InterfaceJ2);
		InterfaceJ1.setLayout(new GridLayout(2, 2, 0, 10));
		InterfaceJ2.setLayout(new GridLayout(2, 2, 0, 10));
		InterfaceJ1.add(NomJ1);
		InterfaceJ1.add(ValeurNomJ1);
		InterfaceJ1.add(BateauxRestantJ1);
		InterfaceJ1.add(ValeurBateauxRestantJ1);
		InterfaceJ2.add(NomJ2);
		InterfaceJ2.add(ValeurNomJ2);
		InterfaceJ2.add(BateauxRestantJ2);
		InterfaceJ2.add(ValeurBateauxRestantJ2);
		
		//Construction du plateaux avec la grille des joueurs
		getContentPane().add(Plateaux, BorderLayout.CENTER);
		Plateaux.setLayout(new GridLayout(1, 2, 30, 30));
		Plateaux.add(PlateauxJ1);
		Plateaux.add(PlateauxJ2);
		PlateauxJ1.setLayout(new GridLayout(10, 10, 0, 0));
		PlateauxJ2.setLayout(new GridLayout(10, 10, 0, 0));
		
		for(int i = 0; i <= 99; i++)
		{
			Grille1[i] = new JButton(""+(i+1));
			Grille1[i].setActionCommand("Action"+i);
			Grille1[i].addActionListener(this);
			PlateauxJ1.add(Grille1[i]);

		}
		
		for(int i = 0; i <= 99; i++)
		{
			Grille2[i] = new JButton(""+(i+1));
			Grille2[i].setActionCommand("Action"+i);
			Grille2[i].addActionListener(this);
			PlateauxJ2.add(Grille2[i]);

		}
		
		setVisible(true);
		
		
		//construction des boutons système du jeu
		getContentPane().add(Systeme, BorderLayout.SOUTH);
		Systeme.setLayout(new GridLayout(2, 4, 0, 0));
		Systeme.add(Vide1);
		Systeme.add(ResultatScore);
		Systeme.add(ValeurResultatScore);
		Systeme.add(Vide2);
		Systeme.add(Vide3);
		Systeme.add(BoutonStart);
		Systeme.add(BoutonStopRestart);
		Systeme.add(Vide4);
		
		
		
		
		
		
		

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args){
		
		new interfaceG();
		
	}
	
	
	
}

