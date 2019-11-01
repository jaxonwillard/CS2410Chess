import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public  class Piece{
//    Node piece;
    ImageView node;
    public Piece() {
//        node.setOnMouseClicked(e -> {
//            System.out.println("piece clicked");
//        });
    }
//    public Piece(Color color){
//        this.piece = new Rectangle();
//    }
    public ImageView getImageView(){
        return this.node;
    }



}
