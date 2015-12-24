package board;

public enum Directions {
	SOUTH {
		@Override
		byte getStep(byte pos) {
			// TODO Auto-generated method stub
			return (BoardUtils.isInBound(pos+a))?pos+a:-1;
		}
	}
	,NORTH {
		@Override
		byte getStep(byte pos) {
			// TODO Auto-generated method stub
			return (BoardUtils.isInBound(pos+a))?pos+a:-1;
		}
	}
	,EAST {
		@Override
		byte getStep(byte pos) {
			// TODO Auto-generated method stub
			return (BoardUtils.isInBound(pos+a))?pos+a:-1;
		}
	}
	,WEST {
		@Override
		byte getStep(byte pos) {
			// TODO Auto-generated method stub
			return (BoardUtils.isInBound(pos+a))?pos+a:-1;
		}
	}
	,SOUTH_EAST {
		@Override
		byte getStep(byte pos) {
			// TODO Auto-generated method stub
			return (BoardUtils.isInBound(pos+a))?pos+a:-1;
		}
	},
	SOUTH_WEST {
		@Override
		byte getStep(byte pos) {
			// TODO Auto-generated method stub
			return (BoardUtils.isInBound(pos+a))?pos+a:-1;
		}
	},
	NORTH_EAST {
		@Override
		byte getStep(byte pos) {
			// TODO Auto-generated method stub
			return (BoardUtils.isInBound(pos+a))?pos+a:-1;
		}
	},
	NORTH_WEST {
		@Override
		byte getStep(byte pos) {
			// TODO Auto-generated method stub
			return (BoardUtils.isInBound(pos+a))?pos+a:-1;
		}
	},
	SOUTH_SOUTH_EAST {
		@Override
		byte getStep(byte pos) {
			// TODO Auto-generated method stub
			return (BoardUtils.isInBound(pos+a))?pos+a:-1;
		}
	},
	SOUTH_SOUTH_WEST {
		@Override
		byte getStep(byte pos) {
			// TODO Auto-generated method stub
			return (BoardUtils.isInBound(pos+a))?pos+a:-1;
		}
	},
	NORTH_NORTH_EAST {
		@Override
		byte getStep(byte pos) {
			// TODO Auto-generated method stub
			return (BoardUtils.isInBound(pos+a))?pos+a:-1;
		}
	},
	NORTH_NORTH_WEST {
		@Override
		byte getStep(byte pos) {
			// TODO Auto-generated method stub
			return (BoardUtils.isInBound(pos+a))?pos+a:-1;
		}
	},
	EAST_SOUTH_EAST {
		@Override
		byte getStep(byte pos) {
			// TODO Auto-generated method stub
			return (BoardUtils.isInBound(pos+a))?pos+a:-1;
		}
	},
	WEST_SOUTH_WEST {
		@Override
		byte getStep(byte pos) {
			// TODO Auto-generated method stub
			return (BoardUtils.isInBound(pos+a))?pos+a:-1;
		}
	},
	EAST_NORTH_EAST {
		@Override
		byte getStep(byte pos) {
			// TODO Auto-generated method stub
			return (BoardUtils.isInBound(pos+a))?pos+a:-1;
		}
	},
	WEST_NORTH_WEST {
		@Override
		byte getStep(byte pos) {
			// TODO Auto-generated method stub
			return (BoardUtils.isInBound(pos+a))?pos+a:-1;
		}
	}
	;

	abstract byte getStep(byte pos);
}
