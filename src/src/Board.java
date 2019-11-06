package src;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Board {
    public Stage stage;
    public int stageWidth;
    public Scene scene;
    public GridPane gp;
    public Tile[][] boardNodes;




    public Board (Stage stage, int stageWidth) {
        this.stage = stage;
        this.stageWidth = stageWidth;
        this.gp = new GridPane();
        this.scene = new Scene(gp);
        this.boardNodes = new Tile[8][8];
        gp.setGridLinesVisible(true);
        gp.setPadding(new Insets(10, 10, 20, 10));
        gp.setVgap(0);
        gp.setHgap(0);
        putTilesOnBoard();
    }





    /**
     unfinished, called when a tile is clicked, check if there is a piece on deck and move piece to that tile
     */
//    public void handleOnDeck(int i, int j){
//        boardNodes[i][j] = this.onDeck;
//        for (Node n : gp.getChildren()){
//            System.out.println(n);
//        }
//        gp.add(this.onDeck.getImageView(), i, j);
//    }



    /**
    populates board with appropriate tiles and pieces
     */
    public void putTilesOnBoard() {
        boolean isWhite = true;
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                Circle circle = new Circle(20);
                circle.setFill(Color.BLACK);


                gp.add(new Tile(isWhite, new Position(x, y), this), x, y);
                // gridpane only shows tiles when circles are added... not sure why
                gp.add(circle, x, y);

                isWhite = !isWhite;
                if (boardNodes[x][y] != null){
                }
            }
            isWhite = !isWhite;
        }

    }

    /**
     used to test putting pictures on the board
     */
    public void testPicture(String url, int i, int j){
        Image image = new Image(url);
        ImageView imageView = new ImageView(image);
        gp.add(imageView,i,j);
        imageView.setFitWidth(65);
        imageView.setFitHeight(60);
        imageView.setOnMouseClicked(e -> {
            System.out.println("hello");
            System.out.println(imageView);
        });
    }
}





// populate multidimensional array boardNodes with pieces (doesn't put anything on the gui)
//        for (int i=0; i < 8; i++){
//            for (int j=0; j < 8; j++) {
//                if (j == 1) boardNodes[i][j] = new Pieces.Pawn(p1, this);
//                else if (j == 6) boardNodes[i][j] = new Pieces.Pawn(p2, this);
//                else if (j == 7){
//                    if (i == 2 || i == 5) boardNodes[i][j] = new Pieces.Bishop(p2);
//                    if (i == 1 || i == 6) boardNodes[i][j] = new Pieces.Knight(p2);
//                    if (i == 0 || i == 7) boardNodes[i][j] = new Pieces.Rook(p2);
//                    if (i == 4) boardNodes[i][j] = new Pieces.King(p2);
//                    if (i == 3) boardNodes[i][j] = new Pieces.Queen(p2);
//                }
//                else if (j == 0){
//                    if (i == 2 || i == 5) boardNodes[i][j] = new Pieces.Bishop(p1);
//                    if (i == 1 || i == 6) boardNodes[i][j] = new Pieces.Knight(p1);
//                    if (i == 0 || i == 7) boardNodes[i][j] = new Pieces.Rook(p1);
//                    if (i == 3) boardNodes[i][j] = new Pieces.King(p1);
//                    if (i == 4) boardNodes[i][j] = new Pieces.Queen(p1);
//                }
//            }
//        }
