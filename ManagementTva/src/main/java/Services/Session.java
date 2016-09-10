package Services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import Services.Interfaces.SessionLocal;
import Services.Interfaces.SessionRemote;

/**
 * Session Bean implementation class Session
 */
@Stateless
@LocalBean
public class Session implements SessionRemote, SessionLocal {

	public static String login;
	public static String pwd;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		Session.login = login;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		Session.pwd = pwd;
	}

	public Session() {

	}

	@Override
	public void exit() {
		login = null;
		pwd = null;

	}

	@Override
	public void stopSession() {
		login = null;
		pwd = null;

	}

}
