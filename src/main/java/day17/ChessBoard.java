package day17;

public class ChessBoard {
    private ChessPiece[][] chessBoard;

    public ChessBoard(ChessPiece[][] chessBoard) {
        this.chessBoard = chessBoard;
    }

    public void print(){
        for (int i = 0; i < chessBoard.length; i++) {
            for (int c = 0; c < chessBoard.length; c++) {
                System.out.print(chessBoard[i][c].getPic());
            }
            System.out.println();

        }

    }
}
