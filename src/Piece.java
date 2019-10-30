import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public  class Piece extends Node{
//    Node piece;
    ImageView imageView;
    public Piece(){
    }
//    public Piece(Color color){
//        this.piece = new Rectangle();
//    }
    public ImageView getImageView(){
        return this.imageView;
    }
}
