package com.example.footballsimulator.fan;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class FanDaoImpl implements FanDao {

	private final Fan fan;

	@Override
	public int getRating() {
		return fan.getRating();
	}

	@Override
	public void setRating(int rating) {
		fan.setRating(rating);
	}

	@Override
	public int getBudget() {
		return fan.getBudget();
	}

	@Override
	public void setBudget(int budget) {
		fan.setBudget(budget);
	}
}
