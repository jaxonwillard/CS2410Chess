import javafx.scene.image.Image;
import javafx.scene.paint.Color;

public class Player {
    public boolean isWhite;
//    public Color color;
    public Image pawn;





    public Player(boolean isWhite){
        this.isWhite = isWhite;
        if (isWhite){
            pawn = new Image("https://www.vectorjunky.com/wp-content/uploads/2017/02/Pr%20065%20-%20TRI%20-%2008_11_10%20-%20031.jpg");
        }
        else{
            pawn = new Image("https://www.jing.fm/clipimg/full/220-2203935_chess-piece-transparent-chess-pawn-png.png");
        }

    }
}
