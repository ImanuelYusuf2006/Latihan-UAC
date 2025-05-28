package Interface;

import login.AuthCredentials;

public interface ILogin {
	public boolean authenticated(AuthCredentials credentials);
}

// - Sudah menerapkan Interface Segregation dimana saya tidak menambakan function function baru yang
// tidak terpakai dan hanya menggunakan interface ILogin sebagai jembatan pada saat Login