package com.example.footballsimulator.fan;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FanServiceImpl implements FanService {

	private FanDao fanDao;

	@Override
	public int getRating() {
		return fanDao.getRating();
	}

	@Override
	public void setRating(int rating) {
		fanDao.setRating(rating);
	}

	@Override
	public int getBudget() {
		return fanDao.getBudget();
	}

	@Override
	public void setBudget(int budget) {
		fanDao.setBudget(budget);
	}
}
