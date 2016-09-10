package Entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Admin
 *
 */
@Entity
public class Admin implements Serializable {

	private Integer id;
	private String nom;
	private String prenom;
	private String pseudo;
	private String mdp;
	private String email;
	private static final long serialVersionUID = 1L;

	public Admin() {
		super();
	}

	public Admin(String nom, String prenom, String pseudo, String mdp,
			String email) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.pseudo = pseudo;
		this.mdp = mdp;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Admin [nom=" + nom + ", prenom=" + prenom + ", pseudo="
				+ pseudo + ", mdp=" + mdp + ", email=" + email + "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMdp() {
		return this.mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
