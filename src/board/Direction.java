package board;

public enum Direction {
	SOUTH((byte)-010) 
	,NORTH ((byte)010)
	,EAST ((byte)01)
	,WEST ((byte)-01)
	,SOUTH_EAST((byte)-07) 
	,SOUTH_WEST ((byte)-011)
	,NORTH_EAST ((byte)011)
	,NORTH_WEST ((byte)07)
	,SOUTH_SOUTH_EAST((byte)-017) 
	,SOUTH_SOUTH_WEST ((byte)-021)
	,NORTH_NORTH_EAST ((byte)021)
	,NORTH_NORTH_WEST ((byte)017)
	,EAST_SOUTH_EAST ((byte)-06)
	,WEST_SOUTH_WEST ((byte)-012)
	,EAST_NORTH_EAST ((byte)012)
	,WEST_NORTH_WEST ((byte)06)
	;

	private Direction(byte step){
		this.step=step;
	}
	
	public byte step;

	public byte getStep(byte pos){
		return (byte) ((BoardUtils.isInBound((byte) pos,this))?pos+step:-1);
	}
}
