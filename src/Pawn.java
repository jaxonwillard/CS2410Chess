import javafx.scene.image.ImageView;

public class Pawn extends Piece {
    ImageView imageView;

    public Pawn(Player player, Board board){
        this.imageView = new ImageView(player.pawn);
        imageView.setFitHeight(55);
        imageView.setFitWidth(60);


        imageView.setOnMouseClicked(e->{
            System.out.println("pawn");
            board.onDeck = this;
            System.out.println(board.onDeck);
        });

    }
    public ImageView getImageView(){
        return this.imageView;
    }
}
