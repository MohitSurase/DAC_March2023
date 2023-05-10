package com.main;

import com.manage.Manager;
import com.player.Player;

public class Program {

	public static void main(String[] args) {
		int choice;
		Manager mg=new Manager();
		while ((choice = Manager.menuList()) != 0) {
			switch (choice) {
			case 1:
				mg.acceptRecord();
				break;
			case 2:
				mg.printRecord();
				break;
			
			}
		}

	}

}
