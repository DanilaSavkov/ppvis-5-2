package com.example.footballsimulator.player;

import com.example.footballsimulator.player.result.CareerResult;
import com.example.footballsimulator.player.result.GameResult;
import com.example.footballsimulator.player.result.TrainingResult;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/player")
@AllArgsConstructor
public class PlayerController {

	private final PlayerService playerService;

	@PutMapping("/club-training")
	public TrainingResult clubTraining() {
		return training(5, 3);
	}

	@PutMapping("/self-training/general")
	public TrainingResult selfGeneralTraining() {
		return selfTraining(1);
	}

	@PutMapping("/self-training/field")
	public TrainingResult selfFieldTraining() {
		return selfTraining(3);
	}

	@PutMapping("/self-training/jogging")
	public TrainingResult selfJoggingTraining() {
		return selfTraining(2);
	}

	@PutMapping("/match")
	public GameResult match() {
		int teamScoredGoals = (int) (Math.random() * 5);
		int teamMissedGoals = (int) (Math.random() * 5);
		int playerScoredGoals = (int) (Math.random() * teamScoredGoals);
		playerService.setPlayedMatches(playerService.getPlayedMatches() + 1);
		playerService.setScoredGoals(playerService.getScoredGoals() + playerScoredGoals);
		return new GameResult(teamScoredGoals, teamMissedGoals, playerScoredGoals);
	}

	@PutMapping("/relaxation")
	public int relaxation() {
		playerService.setEnergy(playerService.getEnergy() + 2);
		return playerService.getEnergy();
	}

	@PutMapping("/finish-career")
	public CareerResult finishCareer() {
		playerService.setFinishCareer(true);
		return new CareerResult(playerService.getScoredGoals(), playerService.getPlayedMatches());
	}

	@GetMapping("/skill")
	public int getSkill() {
		return playerService.getSkill();
	}

	@GetMapping("/energy")
	public int getEnergy() {
		return playerService.getEnergy();
	}

	private TrainingResult selfTraining(int complexity) {
		return training(complexity, complexity);
	}

	private TrainingResult training(int skillPoints, int energyPoints) {
		playerService.setSkill(playerService.getSkill() + skillPoints);
		playerService.setEnergy(playerService.getEnergy() - energyPoints);
		return new TrainingResult(skillPoints, energyPoints);
	}
}
