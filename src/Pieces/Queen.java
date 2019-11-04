package Pieces;

import javafx.scene.image.Image;

import java.util.ArrayList;

public class Queen extends Piece {
    public Queen(Position p, boolean isWhite) {
        this.pos = p;
        this.isWhite = isWhite;
        this.imgUrl = this.isWhite ?
                "https://www.pinclipart.com/picdir/big/65-658889_king-rubber-stamp-white-queen-chess-piece-png.png" :
                "https://www.pinclipart.com/picdir/big/352-3529225_king-chess-piece-shape-comments-queen-chess-piece.png";
        this.setImage(new Image(imgUrl));
    }

    public ArrayList<Position> getLegalMoves() {
        return null;
    }
}
