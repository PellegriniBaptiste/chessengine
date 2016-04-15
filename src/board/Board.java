package board;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
		applyMove(move);
	}

	public Board(String input){
		init();
		/** create a board from a string input that represents a position
		 * This constructor is used for test purposes
		 */
		/*
		 * Format :
		 * "r n b q k b n r \n"
		 * "p p p p p p p p \n"
		 * ". . . . . . . . \n"
		 * ". . . . . . . . \n"
		 * ". . . . P . . . \n"
		 * ". . . . . . . . \n"
		 * "P P P P . P P P \n"
		 * "R N B Q K B N R \n"
		 */
		String lines[]=input.split("\n");
		if(lines.length!=BOARD_SIZE){
			throw new IllegalArgumentException();
		}
		int i=0;
		int j=0;
		for(String line:lines){		
			String squares[]=line.split(" ");
			if(squares.length!=BOARD_SIZE){
				System.out.println(squares.length);
				// the last squares' value should be empty (each line's end is "[ ]\n")
				throw new IllegalArgumentException();
			}
			for(String square:squares){
				//TODO implement
				byte sq=Piece.EMPTY.value();
				switch(square){
				case ".":
					sq=Piece.EMPTY.value();
					break;
				case "P":
					sq=Piece.P.value();
					break;
				case "R":
					sq=Piece.R.value();
					break;
				case "N":
					sq=Piece.N.value();
					break;
				case "B":
					sq=Piece.B.value();
					break;
				case "Q":
					sq=Piece.Q.value();
					break;
				case "K":
					sq=Piece.K.value();
					break;
				case "p":
					sq=Piece.p.value();
					break;
				case "r":
					sq=Piece.r.value();
					break;
				case "n":
					sq=Piece.n.value();
					break;
				case "b":
					sq=Piece.b.value();
					break;
				case "q":
					sq=Piece.q.value();
					break;
				case "k":
					sq=Piece.k.value();
					break;	
				default :

				}
				setSquare((byte)(j+(BOARD_SIZE-1-i)*BOARD_SIZE), sq);
				j=((j+1)+BOARD_SIZE)%BOARD_SIZE;
			}
			++i;
		}


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

	public Set<Move> getAllowedMoves(){
		//TODO implement
		Set<Move> allowedMoves=new HashSet<Move>();

		for(byte i =00;i<0100;++i){
			allowedMoves.addAll(getPieceAllowedMoves(i));
		}

		return allowedMoves;
	}

	private Set<Move> getPieceAllowedMoves(byte squareOffset){
		Set<Move> allowedMoves=new HashSet<Move>();
		Piece piece=getPiece(squareOffset);
		//TODO implement
		return piece.getAllowedMoves(this);
	}

	public Piece getPiece(byte squareOffset){
		return Pieces.getPiece(datas[squareOffset]);
	}


	private void setSquare(byte squareOffset,byte pieceValue){
		// use it only for test purpose and for board deserialization
		datas[squareOffset]=pieceValue;
	}

	public boolean isKingChecked(boolean isWhite ){

		//TODO implement
		byte kingPos=findKing(isWhite);




		return false;
	}

	public byte findKing(boolean isWhite){
		Piece king=(isWhite)?Piece.K:Piece.k;

		for(byte i =00;i<0100;++i){
			if(king.equals(getPiece(i))){
				return i;
			}
		}

		throw new InvalidBoardException("No king found");
	}


}
