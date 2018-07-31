package com.chess.main;

public class GamePiece {
	
	private boolean alive;
	private PieceType type;
	
	
	
	public GamePiece(PieceType type, boolean alive) {
		this.setType(type);
		this.setAlive(alive);
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public PieceType getType() {
		return type;
	}

	public void setType(PieceType type) {
		this.type = type;
	}
	
}


