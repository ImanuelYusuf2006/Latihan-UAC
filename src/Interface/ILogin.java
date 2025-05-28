package Interface;

import login.AuthCredentials;

public interface ILogin {
	public boolean authenticated(AuthCredentials credentials);
}
