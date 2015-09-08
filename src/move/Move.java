package move;

import piece.Piece;

public class Move {
	private Piece piece;
	private byte start;
	private byte end;
	
	public Move(Piece piece,byte start,byte end) {
		this.piece=piece;
		this.start=start;
		this.end=end;
	}
	
	public Piece getPiece() {
		return piece;
	}
	public byte getStart() {
		return start;
	}
	public byte getEnd() {
		return end;
	}
	
	

}
