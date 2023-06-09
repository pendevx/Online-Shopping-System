package com.group5.view;

import com.group5.card.CardAccount;
import com.group5.card.CardBookingList;
import com.group5.card.CardBookingManageUser;
import com.group5.component.*;
import com.group5.controller.Controller;
import com.group5.hotel.Booking;
import java.util.List;

public class ViewClientUser extends ViewClient {

	public CardBookingManageUser cardBookingManage;

	public ViewClientUser(Controller controller, Container[] accountInfo, Container[] hotelInfo, List<Booking> bookings) {
		super(controller);
		init(accountInfo, hotelInfo, bookings);
	}

	private void init(Container[] accountInfo, Container[] hotelInfo, List<Booking> bookings) {
		super.resetBasePanel();
		if (accountInfo.length > 0) setCardAccount(new CardAccount(accountInfo));
		getCardAccount().editAccountButton.addActionListener(getController());
		getCardAccount().logoutButton.addActionListener(getController());

		this.cardBookingManage = new CardBookingManageUser(hotelInfo);
		this.cardBookingManage.cancelButton.addActionListener(getController());
		this.cardBookingManage.bookButton.addActionListener(getController());
		setCardBookingManage(cardBookingManage);
		setCardBookingList(new CardBookingList(bookings));
		super.addToBaseWithGap(getCardAccount(), cardBookingManage, getCardBookingList());
	}
}
