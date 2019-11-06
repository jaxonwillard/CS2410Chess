package src.Pieces;

import javafx.scene.image.Image;

import java.util.ArrayList;
import src.Position;

public class King extends Piece {
    public King(Position p, boolean isWhite) {
        this.pos = p;
        this.isWhite = isWhite;
        this.imgUrl = this.isWhite ?
                "https://www.pinclipart.com/picdir/big/69-695089_all-photo-png-clipart-king-chess-piece-clip.png" :
                "https://www.pinclipart.com/picdir/big/82-825511_big-image-png-king-chess-piece-silhouette-clipart.png";
        this.setImage(new Image(imgUrl));
    }

    public ArrayList<Position> getLegalMoves() {
        return null;
    }
}
