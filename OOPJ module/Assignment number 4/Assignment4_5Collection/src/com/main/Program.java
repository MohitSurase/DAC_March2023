
package com.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.player.Player;
import com.player.Test;

public class Program {
	static Scanner sc=new Scanner(System.in);
	public static int menuList() {
		System.out.println("0.Exit.");
		System.out.println("1.Accept Player");
		System.out.println("2.Print Player");
		System.out.println("3.Find Player");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	
	private static void acceptRecord(Player player) {
		System.out.println("Enter name : ");
		player.setName(sc.next());
		System.out.println("Enter age : ");
		player.setAge(sc.nextInt());
		System.out.println("Enter team : ");
		player.setTeam(sc.next());
		System.out.println("Enter score : ");
		player.setScore(sc.nextInt());
		
	}
	
	
	public static void main(String[] args) {
		int choice;
		Test test=new Test();
		test.setList(new ArrayList<>());
		while ((choice = Program.menuList()) != 0) {
			switch (choice) {
			case 1:
				Player player=new Player();
				Program.acceptRecord(player);
				test.acceptPlayer(player);
				break;
			case 2:
				test.printPlayer();
				break;	
			case 3: 
				System.out.println("Enter player name : ");
				String p=sc.next();
				Player player2= test.findPlayer(p);
				System.out.println(player2);
			}
		}
	}
}
