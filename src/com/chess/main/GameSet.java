package com.chess.main;

public class GameSet {
	
	GamePiece rookLeft, knightLeft, bishopLeft, queen, king, knightRight, bishopRight,  rookRight;
	GamePiece pawn1, pawn2, pawn3, pawn4, pawn5, pawn6, pawn7, pawn8;
	
	private GamePiece[] living;	
	private int numAlive;
	public static final int MAX_PIECES = 16;
//	public final String BLACK = "BLACK", WHITE = "WHITE";
	
	public GameSet() {
		initialSetup();
	}
	
	private void initialSetup() {

		this.rookLeft = new GamePiece(PieceType.ROOK, true);
		this.knightLeft = new GamePiece(PieceType.KNIGHT, true);
		this.bishopLeft = new GamePiece(PieceType.BISHOP, true);
		this.queen = new GamePiece(PieceType.QUEEN, true);
		this.king = new GamePiece(PieceType.KING, true);
		this.bishopRight = new GamePiece(PieceType.BISHOP, true);
		this.knightRight = new GamePiece(PieceType.KNIGHT, true);
		this.rookRight = new GamePiece(PieceType.ROOK, true);
		this.pawn1 = new GamePiece(PieceType.PAWN, true);
		this.pawn2 = new GamePiece(PieceType.PAWN, true);
		this.pawn3 = new GamePiece(PieceType.PAWN, true);
		this.pawn4 = new GamePiece(PieceType.PAWN, true);
		this.pawn5 = new GamePiece(PieceType.PAWN, true);
		this.pawn6 = new GamePiece(PieceType.PAWN, true);
		this.pawn7 = new GamePiece(PieceType.PAWN, true);
		this.pawn8 = new GamePiece(PieceType.PAWN, true);
		
		
		this.living[0] = rookLeft;
		this.living[1] = knightLeft;
		this.living[2] = bishopLeft;
		this.living[3] = queen;
		this.living[4] = king;
		this.living[5] = bishopRight;
		this.living[6] = knightRight;
		this.living[7] = rookRight;
		this.living[8] = pawn1;
		this.living[9] = pawn2;
		this.living[10] = pawn3;
		this.living[11] = pawn4;
		this.living[12] = pawn5;
		this.living[13] = pawn6;
		this.living[14] = pawn7;
		this.living[15] = pawn8;
		
		this.numAlive = MAX_PIECES;
	}
	
}
