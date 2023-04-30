package com.group5.system;

import com.group5.account.Account;
import com.group5.account.AccountCredentials;
import com.group5.account.AccountPermission;
import com.group5.util.ParseInput;
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class AccountNew {
	private List<AccountCredentials> credentialsList;
	private List<Account> accountList;
	private List<String> userList;

	public AccountNew() {
		this.credentialsList = DataHandlerRead.loadCredentialsJson();
		this.accountList = DataHandlerRead.loadAccountsJson();
		this.userList = getUserList();
	}

	public Account createUser(Scanner scan) {
		String username = getUniqueUser(scan);
		Account newAccount = null;

		if (!username.isEmpty()) {
			System.out.println("Enter new password: ");
			String password = ParseInput.string(scan);
			System.out.println("Enter first name: ");
			String firstName = ParseInput.string(scan);
			System.out.println("Enter last name: ");
			String lastName = ParseInput.string(scan);
			System.out.println("Enter email: ");
			String email = ParseInput.string(scan);
			System.out.println("Enter phone: ");
			String phone = ParseInput.string(scan);

			this.credentialsList.add(new AccountCredentials(username, password));
			DataHandlerWrite.saveCredentials(credentialsList);

			newAccount = new Account(username, firstName, lastName, phone, email, AccountPermission.USER);
			this.accountList.add(newAccount);
			DataHandlerWrite.saveAccounts(accountList);

			System.out.println("Account created.");
		}
		return newAccount;
	}
	
	private String getUniqueUser(Scanner scan) {
		boolean isUnique = false;
		String username = "";
		for(int attempts = 2; attempts >= 0 && !isUnique; attempts--) {
			System.out.println("Enter new username: ");
			username = ParseInput.string(scan);
			isUnique = checkUserName(username);
			if (username.isEmpty()) isUnique = printInvalid(attempts);
			else if (!isUnique) printIncorrect(attempts);
		}
		return isUnique ? username : "";
	}

	private List<String> getUserList() {
		List<AccountCredentials> credentialsList = DataHandlerRead.loadCredentialsJson();
		List<String> users = new ArrayList<>();
		for (AccountCredentials c : credentialsList) users.add(c.getUsername());
		return users;
	}

	private boolean checkUserName(String newUsername) {
		return !this.userList.contains(newUsername);
	}

	private boolean printInvalid(int attempts) {
		System.out.println("Invalid, attempts remaining " + attempts + "\n");
		return false;
	}

	private void printIncorrect(int attempts) {
		System.out.println("User already exists, attempts remaining " + attempts + "\n");
	}
}