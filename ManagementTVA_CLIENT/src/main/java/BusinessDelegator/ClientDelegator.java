package BusinessDelegator;

import java.util.List;

import Entities.Client;
import ServiceLocator.ServiceLocator;
import Services.Interfaces.ClientServicesRemote;

public class ClientDelegator {

	public static final String jndiName = "/ManagementTva/ClientServices!Services.Interfaces.ClientServicesRemote";

	public static ClientServicesRemote getProxy() {
		return (ClientServicesRemote) ServiceLocator.getInstance().getProxy(
				jndiName);
	}

	public static Boolean doAddClient(Client client) {
		return getProxy().addClient(client);
	}

	public static Boolean doDeleteClientById(Integer id) {
		return getProxy().deleteClientById(id);
	}

	public static Boolean doUpdateClient(Client client) {
		return getProxy().updateClient(client);
	}

	public static Client doFindClientById(Integer id) {
		return getProxy().findClientById(id);

	}

	public static Boolean doDeleteClient(Client client) {
		return getProxy().deleteClient(client);
	}

	public static List<Client> doFindAllClients() {
		return getProxy().findAllClients();

	}
}
