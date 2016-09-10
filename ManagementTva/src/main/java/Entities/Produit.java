package Entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Produit
 *
 */
@Entity
public class Produit implements Serializable {

	private Integer id;
	private String reference;
	private String nom;
	private float prixUnitaire;
	private static final long serialVersionUID = 1L;

	private Categorie categorie;
	private Marchandise marchandise;

	public Produit() {
		super();
	}

	@Id
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer Id) {
		this.id = Id;
	}

	public String getReference() {
		return this.reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getPrixUnitaire() {
		return this.prixUnitaire;
	}

	public void setPrixUnitaire(float prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	@ManyToOne(cascade = CascadeType.MERGE)
	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	@ManyToOne(cascade = CascadeType.MERGE)
	public Marchandise getMarchandise() {
		return marchandise;
	}

	public void setMarchandise(Marchandise marchandise) {
		this.marchandise = marchandise;
	}

}
