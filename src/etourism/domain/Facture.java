package etourism.domain;

import java.util.HashMap;

public class Facture {
	
	private long montantTotal;
	private HashMap<String, Long> prixUnit = new HashMap<String, Long>();
	private User user;
	
	public long getMontantTotal() {
		return montantTotal;
	}
	public void setMontantTotal(long montantTotal) {
		this.montantTotal = montantTotal;
	}
	public HashMap<String, Long> getPrixUnit() {
		return prixUnit;
	}
	public void setPrixUnit(HashMap<String, Long> prixUnit) {
		this.prixUnit = prixUnit;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
