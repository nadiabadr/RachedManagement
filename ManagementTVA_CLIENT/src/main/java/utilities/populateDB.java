package utilities;

import BusinessDelegator.AdminDelegate;
import BusinessDelegator.ClientDelegator;
import BusinessDelegator.CommandeDelegator;
import Entities.Admin;
import Entities.Client;
import Entities.Commande;

public class populateDB {
	public static void main(String[] args) {

		// //////Populate Users
		Admin admin = new Admin();
		admin.setNom("Medimagh");
		admin.setPrenom("Rached");
		admin.setPseudo("rached");
		admin.setMdp("medimegh");
		admin.setEmail("rached.medimegh@gmail.com");
		System.out.println(AdminDelegate.getProxy().addAdmin(admin));

		// ////// Populate Clients
		Client client0 = new Client();
		client0.setName("Consoft");
		client0.setResponsable("Roberto Cavalli");
		client0.setNumTel("71520352");
		System.out.println(ClientDelegator.getProxy().addClient(client0));

		Client client1 = new Client();
		client1.setName("MBm");
		client1.setResponsable("Chokri BADR");
		client1.setNumTel("53074716");
		System.out.println(ClientDelegator.getProxy().addClient(client1));

		Client client2 = new Client();
		client2.setName("ACEG");
		client2.setResponsable("Heny GAFSI");
		client2.setNumTel("71787852");
		System.out.println(ClientDelegator.getProxy().addClient(client2));

		// // PopulateCommandes

		Commande com0 = new Commande();
		com0.setEtat(true);
		com0.setRef("124587");
		com0.setMontant(4512);
		com0.setTva(18);
		System.out.println(CommandeDelegator.getProxy().addCommande(com0));

		Commande com1 = new Commande();
		com1.setEtat(true);
		com1.setRef("124587");
		com1.setMontant(4512);
		com1.setTva(18);
		System.out.println(CommandeDelegator.getProxy().addCommande(com1));

		Commande com2 = new Commande();
		com2.setEtat(true);
		com2.setRef("124587");
		com2.setMontant(4512);
		com2.setTva(18);
		System.out.println(CommandeDelegator.getProxy().addCommande(com2));

		// ASsigncommande to client
		System.out.println(CommandeDelegator.getProxy().assignCommandeToClient(
				com0, 1));
		System.out.println(CommandeDelegator.getProxy().assignCommandeToClient(
				com1, 1));
		System.out.println(CommandeDelegator.getProxy().assignCommandeToClient(
				com2, 1));
		System.out.println(CommandeDelegator.getProxy().assignCommandeToClient(
				com0, 2));
		System.out.println(CommandeDelegator.getProxy().assignCommandeToClient(
				com1, 2));
		System.out.println(CommandeDelegator.getProxy().assignCommandeToClient(
				com2, 3));
		System.out.println(CommandeDelegator.getProxy().assignCommandeToClient(
				com1, 3));

	}
}
