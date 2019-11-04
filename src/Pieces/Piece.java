import javafx.scene.image.ImageView;

public abstract class Piece extends ImageView {
    public String imgUrl;
    public Position pos;
    public boolean isWhite;
    public boolean isCaptureed;

    public Position[] getLegalMoves();

}
