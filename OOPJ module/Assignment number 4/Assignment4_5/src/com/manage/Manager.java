package com.manage;

import java.util.Scanner;

import com.player.CricketPlayer;
import com.player.FootballPlayer;
import com.player.Player;

public class Manager {
	private Player[] arr=new Player[4];
	static Scanner sc = new Scanner(System.in);
	
	public Manager() {
		arr[0]=new CricketPlayer();
		arr[1]=new CricketPlayer();
		arr[2]=new FootballPlayer();
		arr[3]=new FootballPlayer();
	}
	
	public static int menuList() {
		System.out.println("0.Exit.");
		System.out.println("1.Accept Record.");
		System.out.println("2.Print Record.");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	
	

	public void acceptRecord() {
		for (int index = 0; index < arr.length; index++) {
			System.out.println("Name : ");
			arr[index].setName(sc.next());

			System.out.println("Age : ");
			arr[index].setAge(sc.nextInt());

			System.out.println("Team : ");
			arr[index].setTeam(sc.next());

			if(arr[index] instanceof CricketPlayer) {
				
				CricketPlayer cp = (CricketPlayer) new CricketPlayer();
				System.out.println("Wickets : ");
				cp.setWicket(sc.nextInt());
				System.out.println("Runs : ");
				cp.setRun(sc.nextInt());
				cp.play();
			}else {
				FootballPlayer fp = (FootballPlayer) new FootballPlayer();
				System.out.println("Goals : ");
				fp.setGoals(sc.nextInt());
				System.out.println("Assists : ");
				fp.setAssists(sc.nextInt());
				fp.play();
			}
	}
}

	public void printRecord() {
		for(Player player:arr)
			System.out.println(player);
		
	}

	
}
