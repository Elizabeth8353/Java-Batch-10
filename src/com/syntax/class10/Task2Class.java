package com.syntax.class10;

public class Task2Class {
	public static void main(String[] args) {

		String[] countries = { "Afghanistan", "Tajikistan", "USA","Japan" };

		String capital ="";

		for (int i = 0; i < countries.length; i++) {

		switch(countries[i]) {

		case "Afghanistan":
		capital="Kabul";
		break;
		case "Tajikistan":
		capital="Dushiksitan";
		break;
		case "USA":
		capital="DC";
		break;
		case "Japan":
		capital="Tokyo";
		break;
		}

		System.out.println("The country of" + countries[i] + "is" + capital);
		}

		System.out.println("================ANother Way=================================");

		capital = "";

		for (String country : countries) {

		if (country.equals("Afghanistan")) {
		capital = "kabul";
		} else if (country.equals("Tajikistan")) {
		capital = "Dushanbe";
		} else if (country.equals("USA")) {
		capital = "Washington";
		} else if (country.equals("Japan")) {
		capital = "Tokyo";
		}

		System.out.println("The country of" + country +" is " + capital);
		}

	}
}



