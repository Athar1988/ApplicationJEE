package org.calcule.similateur.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.calcule.similateur.ApplicationSimilateur.Credit;
import org.calcule.similateur.ApplicationSimilateur.CreeditInt;
import org.calcule.similateur.ApplicationSimilateur.ICreditImp;

public class ServletApp extends HttpServlet{
	private CreeditInt  CI;
	public void init() throws ServletException {
		CI= new ICreditImp();
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		double montant=Double.parseDouble(req.getParameter("montant"));
		int mois=Integer.parseInt(req.getParameter("mois"));
		double taux=Double.parseDouble(req.getParameter("taux"));
		Credit C= new Credit();
		C=CI.calculeCredit(montant, mois, taux);
		CI.addCredit(C);
		req.setAttribute("credit", C);
		req.getRequestDispatcher("VueCredit.jsp").forward(req, resp);	


		
	}

}
