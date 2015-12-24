package board;

public class BoardUtils {
	
	public boolean isInBound(byte pos){
		return pos>=00 && pos<0100;
	}

}
