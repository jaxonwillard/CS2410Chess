package Pieces;

import javafx.scene.image.Image;

import java.util.ArrayList;

public class Rook extends Piece {
    Rook(Position p, boolean isWhite) {
        this.pos = p;
        this.isWhite = isWhite;
        this.imgUrl = this.isWhite ?
                "https://www.pinclipart.com/picdir/big/23-237242_rook-clip-art-clipart-chess-rook-clip-art.png" :
                "https://www.pinclipart.com/picdir/big/67-676127_tiles-clipart-transparent-rook-chess-piece-clipart-png.png";
        this.setImage(new Image(imgUrl));
    }

    public ArrayList<Position> getLegalMoves() {
        return null;
    }
}
