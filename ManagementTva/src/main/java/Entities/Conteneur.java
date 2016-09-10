package Entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Conteneur
 *
 */
@Entity
public class Conteneur implements Serializable {

	private Integer id;
	private String name;
	private String chauffeur;
	private String marque;
	private String matricule;
	private String proprietaire;
	private static final long serialVersionUID = 1L;

	public Conteneur() {
		super();
	}

	public Conteneur(String name, String chauffeur, String marque,
			String matricule, String proprietaire) {
		super();
		this.name = name;
		this.chauffeur = chauffeur;
		this.marque = marque;
		this.matricule = matricule;
		this.proprietaire = proprietaire;
	}

	@Override
	public String toString() {
		return "Conteneur [name=" + name + ", chauffeur=" + chauffeur
				+ ", marque=" + marque + ", matricule=" + matricule
				+ ", proprietaire=" + proprietaire + "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer Id) {
		this.id = Id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getChauffeur() {
		return this.chauffeur;
	}

	public void setChauffeur(String chauffeur) {
		this.chauffeur = chauffeur;
	}

	public String getMarque() {
		return this.marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getMatricule() {
		return this.matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getProprietaire() {
		return this.proprietaire;
	}

	public void setProprietaire(String proprietaire) {
		this.proprietaire = proprietaire;
	}

}
