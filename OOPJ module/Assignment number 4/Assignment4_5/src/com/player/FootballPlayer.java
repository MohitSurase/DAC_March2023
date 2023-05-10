package com.player;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter @Setter
public class FootballPlayer extends Player{

	private int goals;
	private int assists;
	
	
	
	
	@Override
	public void play() {
		int goal=this.assists*5;
		this.score=goal+this.goals;
		
	}
	
}
