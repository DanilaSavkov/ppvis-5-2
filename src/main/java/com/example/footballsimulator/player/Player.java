package com.example.footballsimulator.player;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Player {

	private int id;

	private int skill;

	private int energy;

	private int scoredGoals;

	private int playedMatches;

	private boolean finishCareer;
}
