package com.example.footballsimulator.player;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PlayerServiceImpl implements PlayerService {

	private final PlayerDao playerDao;

	@Override
	public int getSkill() {
		return playerDao.getSkill();
	}

	@Override
	public void setSkill(int skill) {
		playerDao.setSkill(skill);
	}

	@Override
	public int getEnergy() {
		return playerDao.getEnergy();
	}

	@Override
	public void setEnergy(int energy) {
		playerDao.setEnergy(energy);
	}

	@Override
	public int getScoredGoals() {
		return playerDao.getScoredGoals();
	}

	@Override
	public void setScoredGoals(int scoredGoals) {
		playerDao.setScoredGoals(scoredGoals);
	}

	@Override
	public boolean isFinishCareer() {
		return playerDao.isFinishCareer();
	}

	@Override
	public void setFinishCareer(boolean finishCareer) {
		playerDao.setFinishCareer(finishCareer);
	}

	@Override
	public int getPlayedMatches() {
		return playerDao.getPlayedMatches();
	}

	@Override
	public void setPlayedMatches(int playedMatches) {
		playerDao.setPlayedMatches(playedMatches);
	}
}
