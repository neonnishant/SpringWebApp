package com.example.demo.businesslogic;

import com.example.demo.businesslogic.dtos.AuthDto;
import com.example.demo.database.DBConnection;
import com.example.demo.database.DataBaseTransactionObject;
import com.example.demo.persistentobject.AuthenticationObject;

public class Authenticator {
	public AuthDto verifyLogin(String userid, String password) {
		DataBaseTransactionObject dtobject = new DBConnection().getDataBaseTransactionObject();
		AuthenticationObject authObject = new AuthenticationObject("123", "neon", "123456", "ddrdr", "drdrdr");
		dtobject.getSession().save(authObject);
		dtobject.getTransaction().commit();
		return new AuthDto("Success", "Authentication Succed");
	}

	public void registerNewUser(String username, String userId, String password, String emailId) {

	}
}
