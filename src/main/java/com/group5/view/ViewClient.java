package com.group5.view;

import com.group5.card.*;
import com.group5.component.*;
import com.group5.controller.Controller;

public abstract class ViewClient extends View {
	private CardAccount cardAccount;
	private Card cardBookingList;
	public CardBookingManage cardBookingManage;

	public ViewClient(Controller controller) {
		super(controller);
	}

	public CardAccount getCardAccount() { return this.cardAccount; }
	public Card getCardBookingList() { return this.cardBookingList; }
	public Card getCardBookingManage() { return this.cardBookingManage; }

	public void setCardAccount(CardAccount c) { this.cardAccount = c; }
	public void setCardBookingManage(CardBookingManage c) { this.cardBookingManage = c; }
	public void setCardBookingList(CardBookingList c) { this.cardBookingList = c; }
}
