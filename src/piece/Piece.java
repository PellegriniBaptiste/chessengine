package piece;

public enum Piece {

	EMPTY((byte)00) {

	},
	P ((byte)01){

	},
	R((byte)02) {

	},
	N((byte)03) {

	},
	B((byte)04) {

	},
	Q((byte)05) {

	},
	K((byte)06) {

	},

	
	p ((byte)07){

	},
	r((byte)010) {

	},
	n((byte)011) {

	},
	b((byte)012) {

	},
	q((byte)013) {

	},


	k ((byte)014){

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
}
