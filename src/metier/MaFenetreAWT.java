package metier;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;

public class MaFenetreAWT extends Frame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6918395248877527332L;

	// Créer une zone de texte
	TextField t = new TextField(12);

	// Créer un bouton OK
	Button b = new Button("Hodor");

	public MaFenetreAWT() {

		// Définir une technique de placement
		this.setLayout(new FlowLayout());
		// Ajouter les composants à la fenetre
		this.add(t); // zone de texte
		this.add(b); // button
		this.setBounds(10, 10, 500, 500);
		this.setVisible(true);
	}

}
