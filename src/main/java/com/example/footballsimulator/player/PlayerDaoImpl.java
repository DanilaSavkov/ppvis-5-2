package com.example.footballsimulator.player;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class PlayerDaoImpl implements PlayerDao {

	private Player player;

	@Override
	public int getSkill() {
		return player.getSkill();
	}

	@Override
	public void setSkill(int skill) {
		player.setSkill(skill);
	}

	@Override
	public int getEnergy() {
		return player.getEnergy();
	}

	@Override
	public void setEnergy(int energy) {
		player.setEnergy(energy);
	}

	@Override
	public int getScoredGoals() {
		return player.getScoredGoals();
	}

	@Override
	public void setScoredGoals(int scoredGoals) {
		player.setScoredGoals(scoredGoals);
	}

	@Override
	public boolean isFinishCareer() {
		return player.isFinishCareer();
	}

	@Override
	public void setFinishCareer(boolean finishCareer) {
		player.setFinishCareer(finishCareer);
	}

	@Override
	public int getPlayedMatches() {
		return player.getPlayedMatches();
	}

	@Override
	public void setPlayedMatches(int playedMatches) {
		player.setPlayedMatches(playedMatches);
	}
}
