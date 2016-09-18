package BusinessDelegator;

import java.util.List;

import Entities.Commande;
import ServiceLocator.ServiceLocator;
import Services.Interfaces.CommandeServicesRemote;

public class CommandeDelegator {

	public static final String jndiName = "/ManagementTva/CommandeServices!Services.Interfaces.CommandeServicesRemote";

	public static CommandeServicesRemote getProxy() {
		return (CommandeServicesRemote) ServiceLocator.getInstance().getProxy(
				jndiName);
	}

	public static Boolean addCommande(Commande commande) {
		return getProxy().addCommande(commande);
	}

	public static Boolean deleteCommandeById(Integer id) {
		return getProxy().deleteCommandeById(id);
	}

	public static Boolean updateCommande(Commande commande) {
		return getProxy().updateCommande(commande);
	}

	public static Commande findCommandeById(Integer id) {
		return getProxy().findCommandeById(id);
	}

	public static Boolean deleteCommande(Commande commande) {
		return getProxy().deleteCommande(commande);
	}

	public static Boolean assignClientToNewCommande(Commande newCommande,
			Integer clientId) {
		return getProxy().assignClientToNewCommande(newCommande, clientId);
	}

	public static Boolean assignClientToCommande(Commande commande,
			Integer clientId) {
		return getProxy().assignClientToCommande(commande, clientId);
	}

	public static Boolean assignCommandeToClient(Commande newCommande,
			Integer clientId) {
		return getProxy().assignCommandeToClient(newCommande, clientId);
	}

	public static List<Commande> findAllCommandesByClientId(Integer clientId) {
		return getProxy().findAllCommandesByClientId(clientId);
	}

}
