package Services.Interfaces;

import java.util.List;

import javax.ejb.Remote;

import Entities.Commande;

@Remote
public interface CommandeServicesRemote {

	Boolean addCommande(Commande commande);

	Boolean deleteCommandeById(Integer id);

	Boolean updateCommande(Commande commande);

	Commande findCommandeById(Integer id);

	Boolean deleteCommande(Commande commande);

	public Boolean assignClientToNewCommande(Commande newCommande,
			Integer clientId);

	public Boolean assignClientToCommande(Commande commande, Integer clientId);

	Boolean assignCommandeToClient(Commande newCommande, Integer clientId);

	List<Commande> findAllCommandesByClientId(Integer clientId);

}
