package com.player;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter @Setter
abstract public class Player {
	private String name;
	private int age;
	private String team;
	protected int score;

	@Override
	public String toString() {
		return String.format("%-10s%-5d%-10s%-10d",this.name, this.age, this.team, this.score);
	}
	abstract public void play();
}
