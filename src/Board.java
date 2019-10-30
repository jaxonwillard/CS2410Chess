import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Board {
    public Stage stage;
    public int stageWidth;
    public Scene scene;
    public GridPane gp;
    public Piece[][] boardNodes;
    public Player p1;
    public Player p2;
//    public Image whitePawn = new Image("https://www.vectorjunky.com/wp-content/uploads/2017/02/Pr%20065%20-%20TRI%20-%2008_11_10%20-%20031.jpg");
//    public Image blackPawn = new Image("https://www.jing.fm/clipimg/full/220-2203935_chess-piece-transparent-chess-pawn-png.png")




    public Board(Stage stage, int stageWidth){
        this.stage = stage;
        this.stageWidth = stageWidth;
        this.gp = new GridPane();
        this.scene = new Scene(gp);
        this.boardNodes = new Piece[8][8];
        this.p1 = new Player(true);
        this.p2 = new Player(false);
        gp.setGridLinesVisible(true);
        gp.setPadding(new Insets(10, 10, 20, 10));
        gp.setVgap(0);
        gp.setHgap(0);

        for (int i=0; i < 8; i++){
            for (int j=0; j < 8; j++) {
                if (j == 1) boardNodes[i][j] = new Pawn(p1);
                if (j == 6) boardNodes[i][j] = new Pawn(p2);
                if (j == 7){
                    if (i == 2 || i == 5){
//                        boardNodes[i][j] = new Bishop(p2);
                    }
                }

//                System.out.print(boardNodes[i][j] + "   ");
            }
//            System.out.println("");
        }
        putTilesOnBoard();
        testPicture("https://www.pinclipart.com/picdir/big/23-237242_rook-clip-art-clipart-chess-rook-clip-art.png");
    }







    public void testPicture(String url){

        Image image = new Image(url);
        ImageView imageView = new ImageView(image);
        gp.add(imageView,4,5);
        imageView.setFitWidth(65);
        imageView.setFitHeight(60);

        imageView.setOnMouseClicked(e -> {
            System.out.println("hello");
            System.out.println(imageView);
        });
    }



    public void putTilesOnBoard() {
        boolean isWhite = true;
        Color white = Color.WHITE;
        Color black = Color.GREY;
//        gp.add(new Tile(Color.BLACK), 0, 0);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                    if (isWhite) gp.add(new Tile(white).tile, i, j);
                    else gp.add(new Tile(black).tile, i, j);
                    isWhite = !isWhite;
                    if (boardNodes[i][j] != null){
                        gp.add(boardNodes[i][j].getImageView(), i, j);
//                        System.out.println(boardNodes[i][j].getImageView());
                    }

            }
            isWhite = !isWhite;
        }
    }
}
