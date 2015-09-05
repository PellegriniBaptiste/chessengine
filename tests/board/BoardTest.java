package board;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoardTest {

	@Test
	public void initialTest() {
		Board board=new Board();
		System.out.println(board.toString());
	}

}
