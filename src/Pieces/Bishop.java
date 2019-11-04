package Pieces;

import javafx.scene.image.Image;

import java.util.ArrayList;

public class Bishop extends Piece {
    Bishop(Position p, boolean isWhite) {
        this.pos = p;
        this.isWhite = isWhite;
        this.imgUrl = this.isWhite ?
                "https://www.pinclipart.com/picdir/big/60-602746_chess-piece-bishop-king-chessboard-alfil-ajedrez-para.png" :
                "https://www.pinclipart.com/picdir/big/100-1006999_clipart-silhouette-chess-piece-remix-bishop-alfil-chess.png";
        this.setImage(new Image(imgUrl));
    }

    public ArrayList<Position> getLegalMoves() {
        return null;
    }
}
