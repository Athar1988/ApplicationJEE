package org.calcule.similateur.ApplicationSimilateur;

import org.hibernate.Session;
import org.calcule.similateur.util.HibernateUtil;

public class ICreditImp implements CreeditInt{


	public Credit calculeCredit(double Montant, int Mois, double taux) {

		double mens=(Montant*((taux/100)/12))/(1-Math.pow((1+((taux/100)/12)), -240));
		Credit C= new Credit(Montant,Mois,taux,mens);
		C.setMensuelle(mens);
		return C;
	}

	@Override
	public void addCredit(Credit C) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        try {
        session.save(C);
        }catch(Exception e){
        	session.getTransaction().rollback();
        	e.printStackTrace();
        }
        session.getTransaction().commit();
	}
	
	
	public void toString(Credit C) {
		System.out.println(C.getMontant()+" "+C.getMois()+" "+C.getTaux()+" "+C.getMensuelle());
	}
	

}
