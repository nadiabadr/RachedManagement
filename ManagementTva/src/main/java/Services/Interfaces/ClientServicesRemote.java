package Services.Interfaces;

import java.util.List;

import javax.ejb.Remote;

import Entities.Client;

@Remote
public interface ClientServicesRemote {

	Boolean addClient(Client client);

	Boolean deleteClientById(Integer id);

	Boolean updateClient(Client client);

	Client findClientById(Integer id);

	Boolean deleteClient(Client client);

	List<Client> findAllClients();

}
