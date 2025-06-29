package com.pack.balance.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pack.balance.entity.Balance;

@RestController
@RequestMapping("/balances")
public class BalanceController {

	private List<Balance> balances = new ArrayList<>();

	public BalanceController() {
		// Initialize with dummy data
		balances.add(new Balance("A1001", 1500.50, "USD"));
		balances.add(new Balance("A1002", 25000.00, "USD"));
		balances.add(new Balance("A1003", 500.75, "USD"));
	}

	@GetMapping
	public List<Balance> getAllBalances() {
		return balances;
	}

	@GetMapping("/{accountId}")
	public Balance getBalanceByAccountId(@PathVariable String accountId) {
		return balances.stream().filter(balance -> balance.getAccountId().equals(accountId)).findFirst().orElse(null);
	}
	
	@GetMapping("/welcome")
	public String welcomehello() {
		return "hello welcme";
		
		
	}
}
