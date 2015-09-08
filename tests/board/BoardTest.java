package board;


import org.junit.Assert;
import org.junit.Test;

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

}
