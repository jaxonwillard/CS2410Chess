import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class King extends Piece {
    //    String whiteImgUrl = "https://www.vectorjunky.com/wp-content/uploads/2017/02/Pr%20065%20-%20TRI%20-%2008_11_10%20-%20031.jpg";
//    String blackImgUrl = "https://www.jing.fm/clipimg/full/220-2203935_chess-piece-transparent-chess-pawn-png.png";
    ImageView imageView;

    public King(Player player){
        this.imageView = new ImageView(player.king);
//        this.imageView = new ImageView(new Image(blackImgUrl));
        imageView.setFitHeight(65);
        imageView.setFitWidth(60);

        imageView.setOnMouseClicked(e -> {
            System.out.println("king");
        });

    }
    public ImageView getImageView(){
        return this.imageView;
    }
}
