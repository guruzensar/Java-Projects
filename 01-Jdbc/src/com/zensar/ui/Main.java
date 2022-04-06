package com.zensar.ui;

public class Main {

	public static void main(String[] args) {

		MenuHandler menuHandler;
		menuHandler = new MenuHandler();
		while (true) {
			menuHandler.displayMenu();
			menuHandler.dispatchMenu();
		}
	}

}
