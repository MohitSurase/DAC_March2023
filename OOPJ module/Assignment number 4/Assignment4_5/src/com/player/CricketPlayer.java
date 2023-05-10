package com.player;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter @Setter
public class CricketPlayer extends Player{

	private int run;
	private int wicket;
	
	
	
	
	@Override
	public void play() {
		int runs=this.wicket*10;
		this.score=this.run+runs;
		
	}
	
}
