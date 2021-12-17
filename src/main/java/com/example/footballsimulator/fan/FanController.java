package com.example.footballsimulator.fan;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fan")
@AllArgsConstructor
public class FanController {

	private FanService fanService;

	@PutMapping("/visit-home-match")
	public FanDto visitHomeMatch() {
		buyTicket();
		fanService.setRating(fanService.getRating() + 2);
		return new FanDto(fanService.getRating(), fanService.getBudget());
	}

	@PutMapping("/visit-guest-match")
	public FanDto visitGuestMatch() {
		buyTicket();
		fanService.setRating(fanService.getRating() + 3);
		return new FanDto(fanService.getRating(), fanService.getBudget());
	}

	@PutMapping("/visit-fan-meeting")
	public FanDto visitFanMeeting() {
		fanService.setRating(fanService.getRating() + 1);
		return new FanDto(fanService.getRating(), fanService.getBudget());
	}

	@GetMapping("/rating")
	public int getRating() {
		return fanService.getRating();
	}

	@GetMapping("/budget")
	public int getBudget() {
		return fanService.getBudget();
	}

	private void buyTicket() {
		int currentBudget = fanService.getBudget();
		fanService.setBudget(currentBudget - 1);
	}
}
