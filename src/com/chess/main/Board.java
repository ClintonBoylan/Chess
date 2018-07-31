package com.chess.main;

//Left to right
enum Type {
	PAWN,
	ROOK, KNIGHT, BISHOP, QUEEN, KING
}

public class Board {
	
	private class Tile {
		
		private boolean hasPiece;
		private GamePiece gp;
		private int id[];
		
		Tile(int id[]) {
			this.id = new int[2];
			this.id[0] = id[0];
			this.id[1] = id[1];
			
			this.hasPiece = false;
			this.gp = null;
		}
		
		Tile(int id[], GamePiece gp) {
			this.id = new int[2];
			this.id[0] = id[0];
			this.id[1] = id[1];
			
			this.hasPiece = true;
			this.gp = gp;
		}
		
		void clearTile() {
			this.gp = null;
			hasPiece = false;
		}
		
		void setPiece(GamePiece gp) {
			if(!hasPiece) {
				this.gp = gp;
				this.hasPiece = true;
			}
			else
				System.err.println("Failed to set piece to tile. ID: " + (char)(id[0] + 64) + id[1]);
		}
		
		
	}
	
	private Tile[][] tiles;
	
	public Board(GameSet set1, GameSet set2) {
		
	}
	
	
	/*private void displayMoves(GamePiece piece) {
		switch(GamePiece.getType()) {
		case 0: break;
		case 1: break;
		case 2: break;
		case 3: break;
		case 4: break;
		case 5: break;
			default: break; 
		}
	}
	
	private void movePiece(GamePiece piece) {
		
		
	}
	
	private void setCoordinates(GamePiece piece, int x, int y) {
		
	}
	*/
}
