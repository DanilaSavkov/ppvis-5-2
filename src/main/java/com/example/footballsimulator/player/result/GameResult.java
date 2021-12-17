package com.example.footballsimulator.player.result;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class GameResult {

	private int teamScoredGoals;

	private int teamMissedGoals;

	private int playerScoredGoals;
}
