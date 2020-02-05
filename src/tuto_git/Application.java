package tuto_git;

import java.awt.Frame;

public class Application extends Frame {

	public static void main(String[] args) {
		new Application();
	}
	
	public Application() {
		super();
		
		Modèle modl = new Modèle();
		Contrôleur ctrl = new Contrôleur(modl); 
		Vue vue = new Vue();
		modl.addObserver(vue);
		vue.addActionListener(ctrl);
		this.setTitle("tutoriel git de Lisa et Sandra");
		this.add(vue);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		//Ferme la fenetre avec la croix
				this.addWindowListener(new java.awt.event.WindowAdapter() {
					public void windowClosing(java.awt.event.WindowEvent evt) {
						dispose();	
						System.exit(0);	
						}
					}
				);
	}

}
