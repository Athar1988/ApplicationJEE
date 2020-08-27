package org.calcule.similateur.ApplicationSimilateur;

import javax.persistence.Column;

public class TestCredit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double montant=20000.0;
		 int mois=240;
		 double taux=4.5;
		 double mensuelle;
		 CreeditInt  CI= new ICreditImp();
		 Credit C= new Credit();
		 C=CI.calculeCredit(montant, mois, taux);
		 CI.addCredit(C);
		 C.toString();
		
	}

}
