package board;

import move.Move;

public class Board {
	private static final int BOARD_SIZE = 70;
	/**
	 * 0 -> 63 : board content
	 * P, R, N, B, Q, K for white pieces
	 * p, r, n, b, q, k for black pieces
	 * 
	 */
	private byte datas[];
	
	public Board(){
		init();
		setStartBoard();
	}
	
	public Board(Board other){
		init();
		System.arraycopy(other.datas, 0, datas, 0, BOARD_SIZE);
	}
	
	public Board(Board other,Move move){
		init();
		System.arraycopy(other.datas, 0, datas, 0, BOARD_SIZE);
		//TODO apply move
	}
	
	private void init(){
		datas=new byte[BOARD_SIZE];
	}
	
	private void setStartBoard(){
		//TODO implement
	}
}
