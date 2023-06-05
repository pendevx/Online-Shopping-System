package com.group5.mvc;

import com.group5.component.*;
import com.group5.module.CardAccount;
import com.group5.module.CardBookingCreateUser;
import com.group5.module.CardBookingListUser;
import com.group5.module.CardLogin;
import com.group5.module.CardRegister;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JFrame;

public class ViewGUI extends JFrame {
	public Card cardLogin;
	public Card cardRegister;
	public Card cardAccount;
	public Card cardBookingList;
	public Card cardBookingCreate;
	private Base base = new Base();
	private Controller controller;

	public ViewGUI() {
		this.setName("Hotel Booking System");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1600,900);
		this.setLocation(500,300);
		this.setResizable(false);
		this.setVisible(true);
	}

	public void addController(Controller controller) {
		this.controller = controller;
	}

	public void renderLogin() {
		if (this.base != null) this.base.removeAll();
		this.cardLogin = new CardLogin(); // fresh new form
		((CardLogin) cardLogin).loginButton.addActionListener(controller);
		((CardLogin) cardLogin).registerButton.addActionListener(controller);
		this.base.add(cardLogin);
		this.renderPanel();
	}

	public void renderRegistration() {
		if (this.base != null) this.base.removeAll();
		this.cardRegister = new CardRegister(); // so fresh new form
		((CardRegister) cardRegister).cancelButton.addActionListener(controller);
		((CardRegister) cardRegister).submitButton.addActionListener(controller);
		this.base.add(cardRegister);
		this.renderPanel();
	}

	public void renderUser() {
		System.out.println("Rendering User");
		if (this.base != null) this.base.removeAll();
		this.cardAccount = new CardAccount();
		this.cardBookingList = new CardBookingListUser();
		this.cardBookingCreate = new CardBookingCreateUser();
		((CardAccount) cardAccount).logoutButton.addActionListener(controller);
		this.base.addWithGap(cardAccount);
		this.base.addWithGap(cardBookingList);
		this.base.addWithGap(cardBookingCreate);
		this.renderPanel();
	}

	public void renderAdmin() {
		System.out.println("Rendering Admin");
	}

	private void renderPanel() {
		this.add(this.base);
		this.revalidate();
		this.repaint();
	}
}
