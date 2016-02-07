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
	
	private byte step;

	

	public byte getStep(byte pos){
		boolean isStepPossible=true;
		isStepPossible=isStepPossible&&(pos+step>=00)&&(pos+step<0100);
		isStepPossible=isStepPossible
				&&(!(pos%010==0&&(step%010==-1||step%010==-2||step%010==7||step%010==6)));//"A" file and go west
		isStepPossible=isStepPossible
				&&(!(pos%010==1&&(step%010==-2||step%010==6)));//"B" file and go west west
		isStepPossible=isStepPossible
				&&(!(pos%010==7&&(step%010==1||step%010==2||step%010==-6||step%010==-7)));//"H" file and go east
		isStepPossible=isStepPossible
				&&(!(pos%010==6&&(step%010==2||step%010==-6)));//"G" file and go east east

						
		return (byte) ((isStepPossible)?pos+step:-1);
	}
}
