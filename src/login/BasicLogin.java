package login;

import Interface.ILogin;

public class BasicLogin implements ILogin {
	private AuthCredentials credentials;
	
	@Override
	public boolean authenticated(AuthCredentials credentials) {
		if(credentials.getUsername() == this.credentials.getUsername() &&
			credentials.getPassword() == this.credentials.getPassword()) {
			return true;
		}
		return false;
	}
	
	public BasicLogin(String username, String password) {
		credentials = new AuthCredentials(username, password);
	}
}
