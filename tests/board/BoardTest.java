package board;


import move.Move;

import org.junit.Assert;
import org.junit.Test;

import piece.Piece;

public class BoardTest {

	@Test
	public void initialTest() {
		Board board=new Board();
		String s=board.toString();
		Assert.assertEquals(s, "r n b q k b n r \n"
				+ "p p p p p p p p \n"
				+ ". . . . . . . . \n"
				+ ". . . . . . . . \n"
				+ ". . . . . . . . \n"
				+ ". . . . . . . . \n"
				+ "P P P P P P P P \n"
				+ "R N B Q K B N R \n");
		System.out.println(s);
	}
	
	@Test
	public void simpleMoveTest() {
		Board board=new Board();
		Move move=new Move(Piece.P,(byte)014,(byte)034);
		board.applyMove(move);
		String s=board.toString();
		
		System.out.println(s);
		Assert.assertEquals(s, "r n b q k b n r \n"
				+ "p p p p p p p p \n"
				+ ". . . . . . . . \n"
				+ ". . . . . . . . \n"
				+ ". . . . P . . . \n"
				+ ". . . . . . . . \n"
				+ "P P P P . P P P \n"
				+ "R N B Q K B N R \n");
	}

}
