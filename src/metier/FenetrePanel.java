package metier;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FenetrePanel extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6918395248877527332L;

	// Components
	private JLabel jl1 = new JLabel("Hodor");
	private JTextField jtfl = new JTextField(12);
	private JButton jb1 = new JButton("Hodor");
	private JButton jb2 = new JButton("Hodor");
	private JButton jb3 = new JButton("Hodor");
	private List liste1 = new List();
	private List liste2 = new List();
	private JLabel jl2 = new JLabel("Hodor");

	// Constructor
	public FenetrePanel() throws HeadlessException {
		this.setLayout(new BorderLayout());

		// ajout de la 1ere ligne
		JPanel jpl1 = new JPanel();
		jpl1.setLayout(new FlowLayout());
		jpl1.add(jl1);
		jpl1.add(jtfl);
		jpl1.add(jb1);
		jpl1.add(jb2);
		jpl1.add(jb3);

		// ajout 1ere JPanel à la fenetre
		this.add(jpl1, BorderLayout.NORTH);

		// 2eme ligne
		JPanel jpl2 = new JPanel();
		jpl2.setLayout(new GridLayout());
		jpl2.add(liste1);
		jpl2.add(liste2);

		// ajout 2eme JPanel à la fenetre
		this.add(jpl2, BorderLayout.CENTER);

		// 3eme ligne
		this.add(jl2, BorderLayout.SOUTH);

		// add events to buttons
		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String s = jtfl.getText();
				liste1.add(s);
				jtfl.setText("");
			}
		});

		jb2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					int indice = liste1.getSelectedIndex();
					String s = liste1.getSelectedItem();
					liste2.add(s);
					liste1.remove(indice);
				} catch (Exception e) {
					jl2.setText("Hodor Error: Select a Hodor");
				}
			}
		});

		jb3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				liste1.removeAll();
			}
		});

		// make visible
		this.setBounds(10, 10, 500, 500);
		this.setVisible(true);
	}
}
