package tests;

import java.util.List;

import BusinessDelegator.ClientDelegator;
import Entities.Client;

public class ClientTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Client> cs = ClientDelegator.doFindAllClients();
		System.out.println(ClientDelegator.doFindAllClients());
		for (Client c : cs) {
			System.out.print(c.getName());
		}

	}
}
