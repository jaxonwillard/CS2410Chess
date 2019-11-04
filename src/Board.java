import Pieces.Pawn;
import Pieces.Piece;
import Pieces.*;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Board {
    public Stage stage;
    public int stageWidth;
    public Scene scene;
    public GridPane gp;
    public Piece[][] boardNodes;
    public Player p1;
    public Player p2;
    public Piece onDeck;
//    public Text selected;



    public Board (Stage stage, int stageWidth){
        this.stage = stage;
        this.stageWidth = stageWidth;
        this.gp = new GridPane();
        this.scene = new Scene(gp);
        this.boardNodes = new Piece[8][8];
        this.p1 = new Player(true);
        this.p2 = new Player(false);
        this.onDeck = null;
//        this.selected = null;
        gp.setGridLinesVisible(true);
        gp.setPadding(new Insets(10, 10, 20, 10));
        gp.setVgap(0);
        gp.setHgap(0);


        // populate multidimensional array boardNodes with pieces (doesn't put anything on the gui)
        for (int i=0; i < 8; i++){
            for (int j=0; j < 8; j++) {
                if (j == 1) boardNodes[i][j] = new Pawn(p1, this);
                else if (j == 6) boardNodes[i][j] = new Pawn(p2, this);
                else if (j == 7){
                    if (i == 2 || i == 5) boardNodes[i][j] = new Bishop(p2);
                    if (i == 1 || i == 6) boardNodes[i][j] = new Knight(p2);
                    if (i == 0 || i == 7) boardNodes[i][j] = new Rook(p2);
                    if (i == 4) boardNodes[i][j] = new King(p2);
                    if (i == 3) boardNodes[i][j] = new Queen(p2);
                }
                else if (j == 0){
                    if (i == 2 || i == 5) boardNodes[i][j] = new Bishop(p1);
                    if (i == 1 || i == 6) boardNodes[i][j] = new Knight(p1);
                    if (i == 0 || i == 7) boardNodes[i][j] = new Rook(p1);
                    if (i == 3) boardNodes[i][j] = new King(p1);
                    if (i == 4) boardNodes[i][j] = new Queen(p1);
                }
            }
        }
        putTilesOnBoard();


//        testPicture("https://www.pinclipart.com/picdir/big/183-1838874_white-chess-pawn-comments-vector-graphics-clipart.png", 0, 5);
//        testPicture("https://www.pinclipart.com/picdir/big/60-602746_chess-piece-bishop-king-chessboard-alfil-ajedrez-para.png", 1, 5);
//        testPicture("https://www.pinclipart.com/picdir/big/23-237242_rook-clip-art-clipart-chess-rook-clip-art.png", 2, 5);
//        testPicture("https://www.pinclipart.com/picdir/big/69-695089_all-photo-png-clipart-king-chess-piece-clip.png", 3, 5);
//        testPicture("https://www.pinclipart.com/picdir/big/191-1916865_horse-chess-piece-knight-comments-knight-chess-piece.png", 4, 5);
//        testPicture("https://www.pinclipart.com/picdir/big/65-658889_king-rubber-stamp-white-queen-chess-piece-png.png", 5, 5);
//        testPicture("https://www.pinclipart.com/picdir/big/183-1838895_geometric-chess-pawn-comments-clipart.png", 0,4);
//        testPicture("https://www.pinclipart.com/picdir/big/100-1006999_clipart-silhouette-chess-piece-remix-bishop-alfil-chess.png", 1, 4);
//        testPicture("https://www.pinclipart.com/picdir/big/67-676127_tiles-clipart-transparent-rook-chess-piece-clipart-png.png", 2, 4);
//        testPicture("https://www.pinclipart.com/picdir/big/82-825511_big-image-png-king-chess-piece-silhouette-clipart.png", 3, 4);
//        testPicture("https://www.pinclipart.com/picdir/big/60-602828_chess-piece-knight-bishop-king-knight-chess-clip.png", 4, 4);
//        testPicture("https://www.pinclipart.com/picdir/big/352-3529225_king-chess-piece-shape-comments-queen-chess-piece.png", 5, 4);
    }


    /*
    unfinished, called when a tile is clicked, check if there is a piece on deck and move piece to that tile
     */
    public void handleOnDeck(int i, int j){
        boardNodes[i][j] = this.onDeck;
        for (Node n : gp.getChildren()){
            System.out.println(n);
        }
        gp.add(this.onDeck.getImageView(), i, j);
    }


    /*
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


    /*
    populates board with appropriate tiles and pieces
     */
    public void putTilesOnBoard() {
        boolean isWhite = true;
        Color white = Color.WHITE;
        Color grey = Color.GREY;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                    if (isWhite) gp.add(new Tile(white, i, j, this).tile, i, j);
                    else gp.add(new Tile(grey, i, j, this).tile, i, j);
                    isWhite = !isWhite;
                    if (boardNodes[i][j] != null){
                        gp.add(boardNodes[i][j].getImageView(), i, j);
                    }
            }
            isWhite = !isWhite;
        }
    }
}
