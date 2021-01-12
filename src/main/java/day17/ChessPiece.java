package day17;

public enum ChessPiece {
    KING_WHITE(100, "♔"), KING_BLACK(100, "♚"), QUEEN_WHITE(9, "♕"), QUEEN_BLACK(9, "♛"),
    ROOK_WHITE(5, "♖"), ROOK_BLACK(5, "♜"), BISHOP_WHITE(3.5, "♗"), BISHOP_BLACK(3.5, "♝"),
    PAWN_WHITE(1, "♙"), PAWN_BLACK(1, "♟"), KNIGHT_WHITE(3, "♘"), KNIGHT_BLACK(3, "♞"),
    EMPTY(-1, "_");

    private double value;
    private String pic;

    ChessPiece(double value, String pic) {
        this.value = value;
        this.pic = pic;
    }

    public double getValue() {
        return value;
    }


    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    @Override
    public String toString() {
        return "ChessPiece{" +
                "value=" + value +
                ", pic='" + pic + '\'' +
                '}';
    }
}
