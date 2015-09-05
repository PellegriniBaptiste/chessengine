package piece;



public class Pieces {

    private static final Piece PIECES[] = Piece.values();
    private static final int PIECES_LENGTH = PIECES.length;

    public static Piece getPiece(final byte squareContent) {
        return PIECES[squareContent % PIECES_LENGTH];
    }
}
