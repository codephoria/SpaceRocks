package io.github.codephoria.spacerocks;

public class SpaceRocks extends BaseGame {

	
	@Override
	public void create () {
		super.create();
		setActiveScreen(new LevelScreen());
	}

}
