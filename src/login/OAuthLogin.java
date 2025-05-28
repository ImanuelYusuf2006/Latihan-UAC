package login;

import Interface.ILogin;

public class OAuthLogin implements ILogin {
	private AuthCredentials credentials;
	
	public OAuthLogin(String token) {
		credentials = new AuthCredentials("" ,token);
	}

	@Override
	public boolean authenticated(AuthCredentials credentials) {
		if(credentials.getPassword().equals(this.credentials.getPassword())) {
			return true;
		}
		return false;
	}
	
}
