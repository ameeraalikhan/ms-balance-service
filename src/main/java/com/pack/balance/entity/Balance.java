
package com.pack.balance.entity;

public class Balance {
	private String accountId;
	private double availableBalance;
	private String currency;

	// Constructors, getters, and setters
	public Balance() {
	}

	public Balance(String accountId, double availableBalance, String currency) {
		this.accountId = accountId;
		this.availableBalance = availableBalance;
		this.currency = currency;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public double getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(double availableBalance) {
		this.availableBalance = availableBalance;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

}
