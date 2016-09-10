package Services.Interfaces;

import javax.ejb.Remote;

@Remote
public interface SessionRemote {
	String getLogin();

	void setLogin(String login);

	String getPwd();

	void setPwd(String pwd);

	void exit();

	void stopSession();

}
