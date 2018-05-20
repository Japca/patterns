package cz.japca.patterns.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by Jakub Krhovják on 5/20/18.
 */

@Slf4j
public class Car {

	public void move(int x, int y) {
		log.info("Moving to x: {} y: {}", x, y);
	}
}
