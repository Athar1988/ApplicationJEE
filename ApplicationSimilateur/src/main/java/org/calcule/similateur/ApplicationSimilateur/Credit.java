package org.calcule.similateur.ApplicationSimilateur;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="CREDIT")
public class Credit implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@Column(name="montant")
	private double montant;
	@Column(name="mois")
	private int mois;
	@Column(name="taux")
	private double taux;
	@Column(name="mensuelle")
	private double mensuelle;
	public double getMensuelle() {
		return mensuelle;
	}
	@Override
	public String toString() {
		return "Credit [montant=" + montant + ", mois=" + mois + ", taux=" + taux + ", mensuelle=" + mensuelle + "]";
	}
	public void setMensuelle(double mensuelle) {
		this.mensuelle = mensuelle;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public int getMois() {
		return mois;
	}
	public void setMois(int mois) {
		this.mois = mois;
	}
	public double getTaux() {
		return taux;
	}
	public void setTaux(double taux) {
		this.taux = taux;
	}
	public Credit(double montant, int mois, double taux, double mense) {
		super();
		this.montant = montant;
		this.mois = mois;
		this.taux = taux;
		this.mensuelle = mense;
	}
	public Credit() {
		super();
		// TODO Auto-generated constructor stub
	}

}
