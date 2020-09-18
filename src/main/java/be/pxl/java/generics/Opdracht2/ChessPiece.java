package be.pxl.java.generics.Opdracht2;

public class ChessPiece implements Moveable<ChessBoardLocation> {
    private ChessBoardLocation chessBoardLocation;
    @Override
    public void move(ChessBoardLocation location) {
        chessBoardLocation = location;
    }

    @Override
    public ChessBoardLocation getCurrentLocation() {
        return chessBoardLocation;
    }
}
