package etourisme.services;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import etourism.domain.*;

@WebService(targetNamespace = "http://services.etourisme/", portName = "UserManagerPort", serviceName = "UserManagerService")
public class UserManager {
	
	public static ArrayList<User> users = new ArrayList<User>();
	
	@WebMethod(operationName = "enregistrement", action = "urn:Enregistrement")
	public boolean enregistrement(@WebParam(name = "arg0") User user) {
		if(!users.contains(user.getUsername())) {
			users.add(user);
			return true;
		}
		return false;
	}
	
	@WebMethod(operationName = "authentification", action = "urn:Authentification")
	public String authentification(@WebParam(name = "arg0") String username, @WebParam(name = "arg1") String password) {
		for(User user : users) {
			if(user.getUsername().equals(username)) {
				if(user.getPassword().equals(password)) {
					return "Welcome "+username;
				}
				return "Wrong paswword";
			}
		}
		return "Erreur d'authentification";
	}
	
	@WebMethod(operationName = "facturation", action = "urn:Facturation")
	public Facture facturation(@WebParam(name = "arg0") User user) {
		Facture facture = new Facture();
		facture.setUser(user);
		return facture;
	}
	
}
