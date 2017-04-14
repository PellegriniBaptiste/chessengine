package board;

import org.junit.Assert;
import org.junit.Test;

// 
/*
70 71 72 73 74 75 76 77
60 61 62 63 64 65 66 67
50 51 52 53 54 55 56 57
40 41 42 43 44 45 46 47
30 31 32 33 34 35 36 37
20 21 22 23 24 25 26 27
10 11 12 13 14 15 16 17
00 01 02 03 04 05 06 07



56 57 58 59 60 61 62 63
48 49 50 51 52 53 54 55
40 41 42 43 44 45 46 47
32 33 34 35 36 37 38 39
24 25 26 27 28 29 30 31
16 17 18 19 20 21 22 23
08 09 10 11 12 13 14 15
00 01 02 03 04 05 06 07  
 */

public class KingCheckedTest {

	//TODO write as many different test as possible
	//TODO finish in-depth testing

	@Test
	public void isKingCheckedTest(){
		//____________________________________________________________
		// no checks
		//____________________________________________________________
		String s="r n b q k b n r \n"
				+ "p p p p p p p p \n"
				+ ". . . . . . . . \n"
				+ ". . . . . . . . \n"
				+ ". . . . P . . . \n"
				+ ". . . . . . . . \n"
				+ "P P P P . P P P \n"
				+ "R N B Q K B N R \n";
		Board board=new Board(s);
		Assert.assertFalse("NOK1", board.isKingChecked(false));

		s="r n b q k b n r \n"
				+ "p p p p p p p p \n"
				+ ". . . . . . . . \n"
				+ ". . . . . . . . \n"
				+ ". . . K P . . . \n"
				+ ". . . . . . . . \n"
				+ "P P P P . P P P \n"
				+ "R N B Q . B N R \n";
		board=new Board(s);
		Assert.assertFalse("NOK2", board.isKingChecked(true));

		s="r n b q k b n r \n"
				+ "p p p p p p p p \n"
				+ ". . . . . . . . \n"
				+ ". . p . . . . . \n"
				+ ". p K p P . . . \n"
				+ ". p p p . . . . \n"
				+ "P P P P . P P P \n"
				+ "R N B Q . B N R \n";
		board=new Board(s);
		Assert.assertFalse("NOK3", board.isKingChecked(true));

		s="r n b q . b n r \n"
				+ "p p p p p p p p \n"
				+ "P P P . . . . . \n"
				+ "P k P . . . . . \n"
				+ ". P . . . . . . \n"
				+ ". . . . . . . . \n"
				+ "P P P P P P P P \n"
				+ "R N B Q K B N R \n";
		board=new Board(s);
		Assert.assertFalse("NOK4", board.isKingChecked(false));

		s="r n b q k b n r \n"
				+ "p p p p p p p p \n"
				+ ". . n . . . . . \n"
				+ ". n n n . . . . \n"
				+ "n n K n n . . . \n"
				+ ". n n n . . . . \n"
				+ "P P n P . P P P \n"
				+ "R N B Q . B N R \n";
		board=new Board(s);
		Assert.assertFalse("NOK5", board.isKingChecked(true));

		s="r n b q . b n r \n"
				+ "p p p p p p p p \n"
				+ ". . N . . . . . \n"
				+ ". N N N . . . . \n"
				+ "N N k N N . . . \n"
				+ ". N N N . . . . \n"
				+ "P P N P . P P P \n"
				+ "R N B Q K B N R \n";
		board=new Board(s);
		Assert.assertFalse("NOK6", board.isKingChecked(false));

		//____________________________________________________________
		// Actual checks
		//____________________________________________________________

		s="r n b q k b n r \n"
				+ "p p p p p p p p \n"
				+ ". . . . . . . . \n"
				+ ". . . . . . . . \n"
				+ ". . . . . . . . \n"
				+ ". . . n . . . . \n"
				+ "P P P P P P P P \n"
				+ "R N B Q K B N R \n";
		board=new Board(s);
		Assert.assertTrue("NOK7", board.isKingChecked(true));

		s="r n b q k b n r \n"
				+ "p p p p p p p p \n"
				+ ". . . N . . . . \n"
				+ ". . . . . . . . \n"
				+ ". . . . . . . . \n"
				+ ". . . . . . . . \n"
				+ "P P P P P P P P \n"
				+ "R N B Q K B N R \n";
		board=new Board(s);
		Assert.assertTrue("NOK8", board.isKingChecked(false));

		s="r n b q k b n r \n"
				+ "p p p p p p p p \n"
				+ ". . . . . . . . \n"
				+ ". . . . . . . . \n"
				+ ". . . . P . . . \n"
				+ ". . . . q . . . \n"
				+ "P P P P . P P P \n"
				+ "R N B Q K B N R \n";
		board=new Board(s);
		Assert.assertTrue("NOK9", board.isKingChecked(true));

		s="r n b q k b n r \n"
				+ "p p p p p p p p \n"
				+ ". . . . . . . . \n"
				+ ". . . . . . . . \n"
				+ ". . . . P . . . \n"
				+ ". . . . r . . . \n"
				+ "P P P P . P P P \n"
				+ "R N B Q K B N R \n";
		board=new Board(s);
		Assert.assertTrue("NOK10", board.isKingChecked(true));

		s="r n b q k b n r \n"
				+ "p p p p p p p p \n"
				+ ". . . . . . . . \n"
				+ ". . . . . . . . \n"
				+ ". . . . P . . . \n"
				+ ". . . . . . . . \n"
				+ "P P P P . P P P \n"
				+ "R N B Q K q N R \n";
		board=new Board(s);
		Assert.assertTrue("NOK11", board.isKingChecked(true));

		s="r n b q k b n r \n"
				+ "p p p p p p p p \n"
				+ ". . . . . . . . \n"
				+ ". . . . . . . . \n"
				+ ". . . . P . . . \n"
				+ ". . . . . . . . \n"
				+ "P P P P . P P P \n"
				+ "R N B Q K . q R \n";
		board=new Board(s);
		Assert.assertTrue("NOK12", board.isKingChecked(true));

		s="r n b q k b n r \n"
				+ "p p p p p p p p \n"
				+ ". . . . . . . . \n"
				+ ". . . . . . . . \n"
				+ ". . . . P . . . \n"
				+ ". . . . . . . . \n"
				+ "P P P P . P P P \n"
				+ "R N B Q K . . q \n";
		board=new Board(s);
		Assert.assertTrue("NOK13", board.isKingChecked(true));

		s="r n b q k b n r \n"
				+ "p p p p p p p p \n"
				+ ". . . . . . . . \n"
				+ ". . . . . . . . \n"
				+ ". . . . P . . . \n"
				+ ". . . . . . . . \n"
				+ "P P P P . P P P \n"
				+ "R N B Q K r N R \n";
		board=new Board(s);
		Assert.assertTrue("NOK14", board.isKingChecked(true));

		s="r n b q k b n r \n"
				+ "p p p p p p p p \n"
				+ ". . . . . . . . \n"
				+ ". . . . . . . . \n"
				+ ". . . . P . . . \n"
				+ ". . . . . . . . \n"
				+ "P P P P . P P P \n"
				+ "R N B Q K . r R \n";
		board=new Board(s);
		Assert.assertTrue("NOK15", board.isKingChecked(true));

		s="r n b q k b n r \n"
				+ "p p p p p p p p \n"
				+ ". . . . . . . . \n"
				+ ". . . . . . . . \n"
				+ ". . . . P . . . \n"
				+ ". . . . . . . . \n"
				+ "P P P P . P P P \n"
				+ "R N B Q K . . r \n";
		board=new Board(s);
		Assert.assertTrue("NOK16", board.isKingChecked(true));
		s="r n b q k b n r \n"
				+ "p p p p p p p p \n"
				+ ". . . . . . . . \n"
				+ ". . . . . . . . \n"
				+ ". . . . P . . . \n"
				+ ". . . . . . . . \n"
				+ "P P P P . b P P \n"
				+ "R N B Q K B N R \n";
		board=new Board(s);
		Assert.assertTrue("NOK17", board.isKingChecked(true));

		s="r n b q k b n r \n"
				+ "p p p p p p p p \n"
				+ ". . . . . . . . \n"
				+ ". . . . . . . . \n"
				+ ". . . . P . . . \n"
				+ ". . . . . . b . \n"
				+ "P P P P . . P P \n"
				+ "R N B Q K . . R \n";
		board=new Board(s);
		Assert.assertTrue("NOK18", board.isKingChecked(true));

		s="r n b q k b n r \n"
				+ "p p p p p p p p \n"
				+ ". . . . . . . . \n"
				+ ". . . . . . . . \n"
				+ ". . . . P . . b \n"
				+ ". . . . . . . . \n"
				+ "P P P P . . P P \n"
				+ "R N B Q K . . r \n";
		board=new Board(s);
		Assert.assertTrue("NOK19", board.isKingChecked(true));
		s="r n b q k b n r \n"
				+ "p p p p p p p p \n"
				+ ". . . . . . . . \n"
				+ ". . . p . . . . \n"
				+ ". . K . P . . . \n"
				+ ". . . . . . . . \n"
				+ "P P P P . . P P \n"
				+ "R N B Q . . . r \n";
		board=new Board(s);
		Assert.assertTrue("NOK20", board.isKingChecked(true));
		s="r n b q k b n r \n"
				+ "p p p p p p p p \n"
				+ ". . . . . . . . \n"
				+ ". p . . . . . . \n"
				+ ". . K . P . . b \n"
				+ ". . . . . . . . \n"
				+ "P P P P . . P P \n"
				+ "R N B Q . . . r \n";
		board=new Board(s);
		Assert.assertTrue("NOK21", board.isKingChecked(true));
		s="r n b q k b n r \n"
				+ "p p p p p p p p \n"
				+ ". . . . . . . . \n"
				+ ". K . . . . . r \n"
				+ ". . . . P . . b \n"
				+ ". . . . . . . . \n"
				+ "P P P P . . P P \n"
				+ "R N B Q . . . r \n";
		board=new Board(s);
		Assert.assertTrue("NOK22", board.isKingChecked(true));
		//____________________________________________________________
		// no checks
		//____________________________________________________________
		s="r n b q k b n r \n"
				+ "p p p p p p p p \n"
				+ ". . . . . . . . \n"
				+ ". . . . . . n . \n"
				+ ". . . . P . . . \n"
				+ ". . . . . . . . \n"
				+ "P P P P . P P P \n"
				+ "R N B Q K B N R \n";
		board=new Board(s);
		Assert.assertFalse("NOK23", board.isKingChecked(false));
		
		s="r n b q k b n r \n"
				+ "p p p p p p p p \n"
				+ ". . . . . . . . \n"
				+ ". . n . . . . . \n"
				+ ". . . . P . . . \n"
				+ ". . . . . . . . \n"
				+ "P P P P . P P P \n"
				+ "R N B Q K B N R \n";
		board=new Board(s);
		Assert.assertFalse("NOK24", board.isKingChecked(false));
		s="r n b q k b n r \n"
				+ "p p p p p p p p \n"
				+ ". . . . . . . . \n"
				+ ". . . . . . . . \n"
				+ ". . . . P . . . \n"
				+ ". . . . . . b . \n"
				+ "P P P P . P P P \n"
				+ "R N B Q K B N R \n";
		board=new Board(s);
		Assert.assertFalse("NOK25", board.isKingChecked(false));
		s="r n b q k b n r \n"
				+ "p p p p p p p p \n"
				+ ". . . . . . . . \n"
				+ "b . n . . . . . \n"
				+ ". . . . P . . . \n"
				+ ". . . . . . . . \n"
				+ "P P P P . P P P \n"
				+ "R N B Q K B N R \n";
		board=new Board(s);
		Assert.assertFalse("NOK26", board.isKingChecked(false));
		s="r n b q k b n r \n"
				+ "p p p p p p p p \n"
				+ ". . . . . . . . \n"
				+ ". . n . . . . . \n"
				+ ". . . . P . . . \n"
				+ ". . . . . . . b \n"
				+ "P P P P . . P P \n"
				+ "R N B Q K B N R \n";
		board=new Board(s);
		Assert.assertFalse("NOK27", board.isKingChecked(false));
		s="r n b q k b n r \n"
				+ "p p p p p p p p \n"
				+ ". . . . . . . . \n"
				+ ". . n . . . . . \n"
				+ "b . . . P . . . \n"
				+ ". . . . . . . . \n"
				+ "P P P . . P P P \n"
				+ "R N B Q K B N R \n";
		board=new Board(s);
		Assert.assertFalse("NOK28", board.isKingChecked(false));
		s="r n b q k b n r \n"
				+ "p p p p p p p p \n"
				+ ". . . . . . . . \n"
				+ ". . n . . . . . \n"
				+ ". . . . P . . . \n"
				+ ". . . . . . . q \n"
				+ "P P P P . . P P \n"
				+ "R N B Q K B N R \n";
		board=new Board(s);
		Assert.assertFalse("NOK29", board.isKingChecked(false));
		s="r n b q k b n r \n"
				+ "p p p p p p p p \n"
				+ ". . . . . . . . \n"
				+ ". . n . . . . . \n"
				+ "q . . . P . . . \n"
				+ ". . . . . . . . \n"
				+ "P P P . . P P P \n"
				+ "R N B Q K B N R \n";
		board=new Board(s);
		Assert.assertFalse("NOK30", board.isKingChecked(false));

	}

}
