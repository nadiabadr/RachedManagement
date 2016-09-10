package Entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Client
 *
 */
@Entity
public class Client implements Serializable {

	private Integer id;
	private String name;
	private String responsable;
	private Integer numTel;
	private static final long serialVersionUID = 1L;

	private List<Commande> commandes;

	public Client() {
		super();
	}

	@Id
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

	public String getResponsable() {
		return this.responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	public Integer getNumTel() {
		return this.numTel;
	}

	public void setNumTel(Integer numTel) {
		this.numTel = numTel;
	}

	@OneToMany(mappedBy = "client")
	public List<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}

	public void linkCommandesToThisClient(List<Commande> commandes) {
		this.commandes = commandes;
		for (Commande p : commandes) {
			p.setClient(this);
		}
	}
}
