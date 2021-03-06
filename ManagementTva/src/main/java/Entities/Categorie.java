package Entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Categorie
 *
 */
@Entity
public class Categorie implements Serializable {

	private Integer id;
	private String name;
	private static final long serialVersionUID = 1L;

	private List<Produit> produits;

	public Categorie() {
		super();
	}

	public Categorie(String name, List<Produit> produits) {
		super();
		this.name = name;
		this.produits = produits;
	}

	@Override
	public String toString() {
		return "Categorie [name=" + name + ", produits=" + produits + "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(mappedBy = "categorie")
	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}

	public void linkProduitsToThisCategorie(List<Produit> produits) {
		this.produits = produits;
		for (Produit p : produits) {
			p.setCategorie(this);
		}
	}
}
