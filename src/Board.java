import Pieces.Piece;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Board {
    public Stage stage;
    public int stageWidth;
    public Scene scene;
    public GridPane gp;
    public StackPane[][] boardNodes;
    public Piece onDeck;



    public Board (Stage stage, int stageWidth){
        this.stage = stage;
        this.stageWidth = stageWidth;
        this.gp = new GridPane();
        this.scene = new Scene(gp);
        this.boardNodes = new StackPane[8][8];
        gp.setGridLinesVisible(true);
        gp.setPadding(new Insets(10, 10, 20, 10));
        gp.setVgap(0);
        gp.setHgap(0);}


        public void print(){
            System.out.println("hello");
        }



//        /**
//         * populate multidimensional array boardNodes with pieces (doesn't put anything on the gui)
//         */
//        for (int i=0; i < 8; i++){
//            for (int j=0; j < 8; j++) {
//                if (j == 1) boardNodes[i][j] = new Pawn(p1, this);
//                else if (j == 6) boardNodes[i][j] = new Pawn(p2, this);
//                else if (j == 7){
//                    if (i == 2 || i == 5) boardNodes[i][j] = new Bishop(p2);
//                    if (i == 1 || i == 6) boardNodes[i][j] = new Knight(p2);
//                    if (i == 0 || i == 7) boardNodes[i][j] = new Rook(p2);
//                    if (i == 4) boardNodes[i][j] = new King(p2);
//                    if (i == 3) boardNodes[i][j] = new Queen(p2);
//                }
//                else if (j == 0){
//                    if (i == 2 || i == 5) boardNodes[i][j] = new Bishop(p1);
//                    if (i == 1 || i == 6) boardNodes[i][j] = new Knight(p1);
//                    if (i == 0 || i == 7) boardNodes[i][j] = new Rook(p1);
//                    if (i == 3) boardNodes[i][j] = new King(p1);
//                    if (i == 4) boardNodes[i][j] = new Queen(p1);
//                }
//            }
//        }
//        putTilesOnBoard();
//
//
//
//    }
//
//
//    /**
//    unfinished, called when a tile is clicked, check if there is a piece on deck and move piece to that tile
//     */
//    public void handleOnDeck(int i, int j){
//        boardNodes[i][j] = this.onDeck;
//        for (Node n : gp.getChildren()){
//            System.out.println(n);
//        }
//        gp.add(this.onDeck.getImageView(), i, j);
//    }
//
//
//    /**
//    used to test putting pictures on the board
//     */
//    public void testPicture(String url, int i, int j){
//        Image image = new Image(url);
//        ImageView imageView = new ImageView(image);
//        gp.add(imageView,i,j);
//        imageView.setFitWidth(65);
//        imageView.setFitHeight(60);
//        imageView.setOnMouseClicked(e -> {
//            System.out.println("hello");
//            System.out.println(imageView);
//        });
//    }
//
//
//    /**
//    populates board with appropriate tiles and pieces
//     */
//    public void putTilesOnBoard() {
//        boolean isWhite = true;
//        Color white = Color.WHITE;
//        Color grey = Color.GREY;
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//                    if (isWhite) gp.add(new Tile(white, i, j, this).tile, i, j);
//                    else gp.add(new Tile(grey, i, j, this).tile, i, j);
//                    isWhite = !isWhite;
//                    if (boardNodes[i][j] != null){
//                        gp.add(boardNodes[i][j].getImageView(), i, j);
//                    }
//            }
//            isWhite = !isWhite;
//        }

}
