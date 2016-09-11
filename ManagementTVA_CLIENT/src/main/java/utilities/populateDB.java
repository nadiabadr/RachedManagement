package utilities;

import BusinessDelegator.AdminDelegate;
import Entities.Admin;

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

	}
}
