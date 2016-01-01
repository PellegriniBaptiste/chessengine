package board;

public class BoardUtils {
	
	public static boolean isInBound(byte pos){
		return pos>=00 && pos<0100;
	}

	public static boolean isInBound(byte pos,Direction dir){
		//TODO test
//		if((pos)%010==00){
//			
//		}
//		if((pos)%010==07){
//			
//		}
//		if((pos)%010==01){
//			
//		}
//		if((pos)%010==06){
//			
//		}
//		
//		if((pos)/010==00){
//			
//		}
//		if((pos)/010==07){
//			
//		}
//		if((pos)/010==01){
//			
//		}
//		if((pos)/010==06){
//			
//		}
		if(pos%010+dir.step%010>07 ||pos%010+dir.step%010<00 ||pos/010+dir.step/010>07 ||pos/010+dir.step/010<00  ){
			return false;
		}
		return (pos+dir.step>=00 && pos+dir.step<0100);
	}
}
