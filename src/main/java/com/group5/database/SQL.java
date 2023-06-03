package com.group5.database;

public class SQL {
	//////////////////////////////////////////////////
	// CREATE TABLE
	//////////////////////////////////////////////////

	// need add input limits
	static String[] createAccountTable() {
		return new String[]
		{
			"CREATE TABLE account ( "
				+ "username VARCHAR(50),"
				+ "firstname VARCHAR(50),"
				+ "lastname VARCHAR(50),"
				+ "phone VARCHAR(50),"
				+ "email VARCHAR(50),"
				+ "permission VARCHAR(10)"
				+ ")",

			"INSERT INTO account VALUES "
			+ "('admin', 'admin', 'admin', '21153324', 'admin@hotel.com', 'ADMIN'),"
			+ "('user', 'user', 'user', '21152297', 'group5@comp603.com', 'USER')"
		};
	}

	static String[] createCredentialTable() {
		return new String[]
		{
			"CREATE TABLE credential ( "
				+ "username VARCHAR(50),"
				+ "password VARCHAR(50)"
				+ ")",

			"INSERT INTO credential VALUES "
			+ "('admin', 'admin'),"
			+ "('user', 'user')"
		};
	}

	static String[] createUsernameTable() {
		return new String[]
		{
			"CREATE TABLE username ( "
				+ "username VARCHAR(50)"
				+ ")",

			"INSERT INTO username VALUES "
			+ "('admin'),"
			+ "('user')"
		};
	}

	static String[] createHotelTable() {
		return new String[] 
		{
			"CREATE TABLE hotel ( "
				+ "hotelName VARCHAR(50),"
				+ "street VARCHAR(50),"
				+ "suburb VARCHAR(50),"
				+ "city VARCHAR(50),"
				+ "postcode VARCHAR(5),"
				+ "country VARCHAR(50),"
				+ "phone VARCHAR(50),"
				+ "email VARCHAR(50)"
				+ ")",

			"INSERT INTO hotel VALUES "
			+ "('Queens Hotel', '10 Main Street', 'CBD', 'Auckland', '1010', 'New Zealand', '+64090888', 'hotel@hotel.com')"
		};
	}

	static String[] createBookingTable() {
		return new String[]
		{
			"CREATE TABLE booking ( "
				+ "bookingID VARCHAR(50),"
				+ "bookingID VARCHAR(50)"
				+ ")",

			"INSERT INTO booking VALUES "
			+ "(''),"
			+ "('')"
		};
	}


	//////////////////////////////////////////////////
	// UPDATE TABLE
	//////////////////////////////////////////////////
	static void updateAccountTable() {
	}

	static void updateCredentialTable() {
	}

	static void updateUsernameTable() {
	}

	static void updateBookingTable() {
	}

	//////////////////////////////////////////////////
	// SELECT TABLE
	//////////////////////////////////////////////////
	static String selectAll(String name) {
		return "SELECT * FROM " + name;
	}

	//////////////////////////////////////////////////
	// DROP TABLE
	//////////////////////////////////////////////////
	static String dropTable(String name) {
		return "DROP TABLE " + name;
	}
}
