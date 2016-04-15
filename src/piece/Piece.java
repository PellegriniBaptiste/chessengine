package piece;

import java.util.HashSet;
import java.util.Set;

import move.Move;
import board.Board;

public enum Piece {

	EMPTY((byte)00) {

		@Override
		public byte[] getDirections() {
			return new byte[]{};
		}

		@Override
		public Set<Move> getAllowedMoves(Board board) {
			// TODO Auto-generated method stub
			 return new HashSet<Move>();
		}

	},
	P ((byte)01){
		@Override
		public byte[] getDirections() {
			return new byte[]{010};
		}

		@Override
		public Set<Move> getAllowedMoves(Board board) {
			Set<Move> allowedMoves=new HashSet<Move>();
			// TODO Auto-generated method stub
			return allowedMoves;
		}
	},
	R((byte)02) {
		@Override
		public byte[] getDirections() {
			return new byte[]{-010,-01,01,010};
		}

		@Override
		public Set<Move> getAllowedMoves(Board board) {
			Set<Move> allowedMoves=new HashSet<Move>();
			// TODO Auto-generated method stub
			return allowedMoves;
		}
	},
	N((byte)03) {
		@Override
		public byte[] getDirections() {
			return new byte[]{-012,-021,-17,-06,06,17,021,012};
		}

		@Override
		public Set<Move> getAllowedMoves(Board board) {
			Set<Move> allowedMoves=new HashSet<Move>();
			// TODO Auto-generated method stub
			return allowedMoves;
		}
	},
	B((byte)04) {
		@Override
		public byte[] getDirections() {
			return new byte[]{-011,-07,07,011};
		}

		@Override
		public Set<Move> getAllowedMoves(Board board) {
			Set<Move> allowedMoves=new HashSet<Move>();
			// TODO Auto-generated method stub
			return allowedMoves;
		}
	},
	Q((byte)05) {
		@Override
		public byte[] getDirections() {
			return new byte[]{-011,-010,-07,-01,01,07,010,011};
		}

		@Override
		public Set<Move> getAllowedMoves(Board board) {
			Set<Move> allowedMoves=new HashSet<Move>();
			// TODO Auto-generated method stub
			return allowedMoves;
		}
	},
	K((byte)06) {
		@Override
		public byte[] getDirections() {
			return new byte[]{-011,-010,-07,-01,01,07,010,011};
		}

		@Override
		public Set<Move> getAllowedMoves(Board board) {
			Set<Move> allowedMoves=new HashSet<Move>();
			// TODO Auto-generated method stub
			return allowedMoves;
		}
	},

	
	p ((byte)07){
		@Override
		public byte[] getDirections() {
			return new byte[]{-010};
		}

		@Override
		public Set<Move> getAllowedMoves(Board board) {
			Set<Move> allowedMoves=new HashSet<Move>();
			// TODO Auto-generated method stub
			return allowedMoves;
		}
	},
	r((byte)010) {
		@Override
		public byte[] getDirections() {
			return new byte[]{-010,-01,01,010};
		}

		@Override
		public Set<Move> getAllowedMoves(Board board) {
			Set<Move> allowedMoves=new HashSet<Move>();
			// TODO Auto-generated method stub
			return allowedMoves;
		}
	},
	n((byte)011) {
		@Override
		public byte[] getDirections() {
			return new byte[]{-012,-021,-17,-06,06,17,021,012};
		}

		@Override
		public Set<Move> getAllowedMoves(Board board) {
			Set<Move> allowedMoves=new HashSet<Move>();
			// TODO Auto-generated method stub
			return allowedMoves;
		}
	},
	b((byte)012) {
		@Override
		public byte[] getDirections() {
			return new byte[]{-011,-07,07,011};
		}

		@Override
		public Set<Move> getAllowedMoves(Board board) {
			Set<Move> allowedMoves=new HashSet<Move>();
			// TODO Auto-generated method stub
			return allowedMoves;
		}
	},
	q((byte)013) {
		@Override
		public byte[] getDirections() {
			return new byte[]{-011,-010,-07,-01,01,07,010,011};
		}

		@Override
		public Set<Move> getAllowedMoves(Board board) {
			Set<Move> allowedMoves=new HashSet<Move>();
			// TODO Auto-generated method stub
			return allowedMoves;
		}
	},


	k ((byte)014){
		@Override
		public byte[] getDirections() {
			return new byte[]{-011,-010,-07,-01,01,07,010,011};
		}

		@Override
		public Set<Move> getAllowedMoves(Board board) {
			Set<Move> allowedMoves=new HashSet<Move>();
			// TODO Auto-generated method stub
			return allowedMoves;
		}
	};


	private byte value;

	private Piece(byte value){
		this.value=value;
	}

	public static Piece valueOf(byte value) {
		// if (value != null) {
		for (Piece p : Piece.values()) {
			if (p.value==value) {
				return p;
			}
		}
		// }
		throw new IllegalArgumentException("No Piece with value " + value + " found");
	}
	
	public byte value(){
		return value;
	}
	
	public String toString(){
		if(this.equals(Piece.EMPTY)){
			return ".";
		}
		return this.name();
	}
	
	public abstract byte[] getDirections();
	public abstract Set<Move> getAllowedMoves(Board board);
}
