package messages;

import login.AuthCredentials;
import Interface.ILogin;
import messages.Message;

public class SMSMessage extends Message {
	private String source;
	private String dest;

	public SMSMessage(ILogin loginMethod, String source, String dest, String message) {
		super(loginMethod, message);
		
		this.source = source;
		this.dest = dest;
	}

	@Override
	public void send(String username, String password) {
		// TODO Auto-generated method stub
		boolean isAuth = loginMethod.authenticated(new AuthCredentials(username, password));
		if(isAuth) {
			System.out.println("SMS sent from " + source +" to " + dest +": " + message);
		}else {
			System.out.println("SMS authentication failed for user: " + username);
		}
		
	}

}