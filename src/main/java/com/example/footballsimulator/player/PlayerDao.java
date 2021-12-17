package com.example.footballsimulator.player;

public interface PlayerDao {

	int getSkill();

	void setSkill(int skill);

	int getEnergy();

	void setEnergy(int energy);

	int getScoredGoals();

	void setScoredGoals(int scoredGoals);

	boolean isFinishCareer();

	void setFinishCareer(boolean finishCareer);

	int getPlayedMatches();

	void setPlayedMatches(int playedMatches);
}
