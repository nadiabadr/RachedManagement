package BusinessDelegator;

import java.util.List;

import Entities.Admin;
import ServiceLocator.ServiceLocator;
import Services.Interfaces.AdminServicesRemote;

public class AdminDelegate {
	public static final String jndiName = "/ManagementTva/AdminServices!Services.Interfaces.AdminServicesRemote";

	public static AdminServicesRemote getProxy() {
		return (AdminServicesRemote) ServiceLocator.getInstance().getProxy(
				jndiName);
	}

	public static boolean doAddAdmin(Admin admin) {
		return getProxy().addAdmin(admin);

	}

	public static boolean doDeleteAdminById(int id) {
		return getProxy().deleteAdminById(id);
	}

	public static Admin updateAdmin(int id) {
		return getProxy().updateAdmin(id);
	}

	public static List<Admin> doFindAllAdmins() {
		return getProxy().findAllAdmins();
	}

	public static Admin findAdminById(int id) {
		return getProxy().findAdminById(id);
	}

	public static Admin doAuthenticate(String name, String password) {
		return getProxy().authenticate(name, password);
	}

	public static List<Admin> doFindAdminByName(String name) {
		return getProxy().findAdminByName(name);
	}
}
