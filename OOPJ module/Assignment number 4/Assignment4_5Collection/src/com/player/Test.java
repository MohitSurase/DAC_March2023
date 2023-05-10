package com.player;

import java.util.List;

public class Test {
	private List<Player> list;
	public void setList(List<Player> list) {
		this.list = list;
	}
	public void acceptPlayer(Player player) {
		this.list.add(player);
	}
	public void printPlayer() {
		for(Player player : list)
			System.out.println(player);
	}
	public Player findPlayer(String p) {
		if(list!=null) {
			for(Player player : list) {
				if(player.getName().equalsIgnoreCase(p));
				return player;
			}
		}
		return null;
		
	}
	
}
