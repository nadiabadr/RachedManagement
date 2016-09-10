package Entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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

	@Override
	public String toString() {
		return "Produit [reference=" + reference + ", nom=" + nom
				+ ", prixUnitaire=" + prixUnitaire + ", categorie=" + categorie
				+ ", marchandise=" + marchandise + "]";
	}

	public Produit(String reference, String nom, float prixUnitaire,
			Categorie categorie, Marchandise marchandise) {
		super();
		this.reference = reference;
		this.nom = nom;
		this.prixUnitaire = prixUnitaire;
		this.categorie = categorie;
		this.marchandise = marchandise;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
