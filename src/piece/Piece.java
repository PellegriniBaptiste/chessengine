package piece;

public enum Piece {

	EMPTY((byte)00) {

		@Override
		public byte[] getDirections() {
			return new byte[]{};
		}

	},
	P ((byte)01){
		@Override
		public byte[] getDirections() {
			return new byte[]{010};
		}
	},
	R((byte)02) {
		@Override
		public byte[] getDirections() {
			return new byte[]{-010,-01,01,010};
		}
	},
	N((byte)03) {
		@Override
		public byte[] getDirections() {
			return new byte[]{-012,-021,-17,-06,06,17,021,012};
		}
	},
	B((byte)04) {
		@Override
		public byte[] getDirections() {
			return new byte[]{-011,-07,07,011};
		}
	},
	Q((byte)05) {
		@Override
		public byte[] getDirections() {
			return new byte[]{-011,-010,-07,-01,01,07,010,011};
		}
	},
	K((byte)06) {
		@Override
		public byte[] getDirections() {
			return new byte[]{-011,-010,-07,-01,01,07,010,011};
		}
	},

	
	p ((byte)07){
		@Override
		public byte[] getDirections() {
			return new byte[]{-010};
		}
	},
	r((byte)010) {
		@Override
		public byte[] getDirections() {
			return new byte[]{-010,-01,01,010};
		}
	},
	n((byte)011) {
		@Override
		public byte[] getDirections() {
			return new byte[]{-012,-021,-17,-06,06,17,021,012};
		}
	},
	b((byte)012) {
		@Override
		public byte[] getDirections() {
			return new byte[]{-011,-07,07,011};
		}
	},
	q((byte)013) {
		@Override
		public byte[] getDirections() {
			return new byte[]{-011,-010,-07,-01,01,07,010,011};
		}
	},


	k ((byte)014){
		@Override
		public byte[] getDirections() {
			return new byte[]{-011,-010,-07,-01,01,07,010,011};
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
}
