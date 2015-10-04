package board;

import java.util.List;

import piece.Piece;
import piece.Pieces;
import move.Move;

public class Board {
	private static final int BOARD_SIZE=8;
	private static final int GAME_INFO_SIZE = 6;
	private static final int ARRAY_SIZE = BOARD_SIZE*BOARD_SIZE+GAME_INFO_SIZE;
	/**
	 * 0 -> 63 : board content
	 * P -> 0x01, R -> 0x02, N -> 0x03, B -> 0x04, Q -> 0X05, K -> 0X06 for white pieces
	 * P -> 0x11, R -> 0x12, N -> 0x13, B -> 0x14, Q -> 0X15, K -> 0X16 for black pieces
	 * 
	 * 8 70 71 72 73 74 75 76 77
	 * 7 60 61 62 63 64 65 66 67
	 * 6 50 51 52 53 54 55 56 57
	 * 5 40 41 42 43 44 45 46 47
	 * 4 30 31 32 33 34 35 36 37
	 * 3 20 21 22 23 24 25 26 27
	 * 2 10 11 12 13 14 15 16 17
	 * 1  0  1  2  3  4  5  6  7
	 *    a  b  c  d  e  f  g  h
	 * 
	 */
	private byte datas[];

	public Board(){
		init();
		setStartBoard();
	}

	public Board(Board other){
		init();
		System.arraycopy(other.datas, 0, datas, 0, ARRAY_SIZE);
	}

	public Board(Board other,Move move){
		init();
		System.arraycopy(other.datas, 0, datas, 0, ARRAY_SIZE);
		//TODO apply move
	}

	private void init(){
		datas=new byte[ARRAY_SIZE];
	}

	private void setStartBoard(){
		datas[000]=Piece.R.value();
		datas[001]=Piece.N.value();
		datas[002]=Piece.B.value();
		datas[003]=Piece.Q.value();
		datas[004]=Piece.K.value();
		datas[005]=Piece.B.value();
		datas[006]=Piece.N.value();
		datas[007]=Piece.R.value();
		for(int i=010;i<020;++i){
			datas[i]=Piece.P.value();
		}

		for(int i=060;i<070;++i){
			datas[i]=Piece.p.value();
		}
		datas[070]=Piece.r.value();
		datas[071]=Piece.n.value();
		datas[072]=Piece.b.value();
		datas[073]=Piece.q.value();
		datas[074]=Piece.k.value();
		datas[075]=Piece.b.value();
		datas[076]=Piece.n.value();
		datas[077]=Piece.r.value();

	}

	public String toString(){
		StringBuilder sb=new StringBuilder();
		for(int j=BOARD_SIZE-1;j>-1;--j){
			for(int i=0;i<BOARD_SIZE;++i){
				sb.append(Pieces.getPiece(datas[i+j*BOARD_SIZE]).toString());
				sb.append(' ');
			}
			sb.append('\n');
		}
		//TODO print other info

		return sb.toString();
	}
	
	public void applyMove(Move move){
		//TODO implement
		Piece piece=move.getPiece();
		byte start=move.getStart();
		byte end=move.getEnd();
		
		datas[start]=Piece.EMPTY.value();
		datas[end]=piece.value();
		
		//TODO update other info
	}
	
	public List<Move> getAllowedMoves(){
		//TODO implement
		return null;
	}
}
