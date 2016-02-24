package presentation;

import java.io.Serializable;

import javax.swing.JFrame;

import metier.FenetrePanel;

public class Fenetre extends JFrame implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6918395248877527332L;

	/*
	 * public Fenetre(String nom) { super(nom); setSize(800, 600); }
	 * 
	 * public static void main(String[] args) {
	 * 
	 * MaFenetreAWT f = new MaFenetreAWT(); f.setVisible(true);
	 * 
	 * }
	 */
	public Fenetre(String nom) {
		super(nom);
		setSize(800, 600);
	}

	public static void main(String[] args) {
		FenetrePanel f = new FenetrePanel();
		f.setVisible(true);
	}

}
