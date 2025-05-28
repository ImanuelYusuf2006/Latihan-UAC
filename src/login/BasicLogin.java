package login;

import Interface.ILogin;

public class BasicLogin implements ILogin {
	private AuthCredentials credentials;
	
	// - Menerapkan single responsibility dimana class basicLogin ini hanya menghandle basic login saja
	// - Menerapkan open close principle dimana ketika ingin menambahkan fitur-fitur login baru
	// cukup hanya membuat class baru dengan menggunakan implement ILogin tanpa harus mengubah 
	// kode yang lama	
	
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
