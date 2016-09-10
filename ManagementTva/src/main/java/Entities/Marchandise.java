package Entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Marchandise
 *
 */
@Entity
public class Marchandise implements Serializable {

	private Integer id;
	private String reference;
	private String nature;
	private Integer quantite;
	private float total;
	private float tva;
	private static final long serialVersionUID = 1L;

	private Commande commande;
	private List<Produit> produits;

	public Marchandise() {
		super();
	}

	@Override
	public String toString() {
		return "Marchandise [reference=" + reference + ", nature=" + nature
				+ ", quantite=" + quantite + ", total=" + total + ", tva="
				+ tva + ", commande=" + commande + ", produits=" + produits
				+ "]";
	}

	public Marchandise(String reference, String nature, Integer quantite,
			float total, float tva, Commande commande, List<Produit> produits) {
		super();
		this.reference = reference;
		this.nature = nature;
		this.quantite = quantite;
		this.total = total;
		this.tva = tva;
		this.commande = commande;
		this.produits = produits;
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

	public String getNature() {
		return this.nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}

	public float getTva() {
		return this.tva;
	}

	public void setTva(float tva) {
		this.tva = tva;
	}

	public Integer getQuantite() {
		return quantite;
	}

	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	@ManyToOne(cascade = CascadeType.MERGE)
	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	@OneToMany(mappedBy = "marchandise")
	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}

}
