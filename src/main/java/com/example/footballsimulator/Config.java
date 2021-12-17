package com.example.footballsimulator;

import com.example.footballsimulator.fan.Fan;
import com.example.footballsimulator.player.Player;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	public Player getPlayer() {
		return new Player(1, 0, 10, 0, 0, false);
	}

	@Bean
	public Fan getFan() {
		return new Fan(1, 0, 5);
	}
}
