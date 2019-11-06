package src;

import javafx.scene.image.Image;

public class Player {
    public boolean isWhite;
//    public Color color;
    public Image pawn;
    public Image bishop;
    public Image rook;
    public Image knight;
    public Image queen;
    public Image king;



    public Player(boolean isWhite){
        this.isWhite = isWhite;
        if (isWhite){
//            this.pawn   = new Image("https://www.pinclipart.com/picdir/big/183-1838874_white-chess-pawn-comments-vector-graphics-clipart.png");
            this.pawn   = new Image("https://www.pinclipart.com/picdir/big/203-2039435_bishop-rubber-stamp-chess-pawn-png-clipart.png");
            this.bishop = new Image("https://www.pinclipart.com/picdir/big/60-602746_chess-piece-bishop-king-chessboard-alfil-ajedrez-para.png");
            this.rook   = new Image("https://www.pinclipart.com/picdir/big/23-237242_rook-clip-art-clipart-chess-rook-clip-art.png");
            this.king   = new Image("https://www.pinclipart.com/picdir/big/69-695089_all-photo-png-clipart-king-chess-piece-clip.png");
            this.knight = new Image("https://www.pinclipart.com/picdir/big/191-1916865_horse-chess-piece-knight-comments-knight-chess-piece.png");
            this.queen  = new Image("https://www.pinclipart.com/picdir/big/65-658889_king-rubber-stamp-white-queen-chess-piece-png.png");
        }
        else{
            this.pawn   = new Image("https://www.pinclipart.com/picdir/big/184-1845764_chess-piece-remix-pawn-pen-clipart.png");
            this.bishop = new Image("https://www.pinclipart.com/picdir/big/100-1006999_clipart-silhouette-chess-piece-remix-bishop-alfil-chess.png");
            this.rook   = new Image("https://www.pinclipart.com/picdir/big/67-676127_tiles-clipart-transparent-rook-chess-piece-clipart-png.png");
            this.king   = new Image("https://www.pinclipart.com/picdir/big/82-825511_big-image-png-king-chess-piece-silhouette-clipart.png");
            this.knight = new Image("https://www.pinclipart.com/picdir/big/60-602828_chess-piece-knight-bishop-king-knight-chess-clip.png");
            this.queen  = new Image("https://www.pinclipart.com/picdir/big/352-3529225_king-chess-piece-shape-comments-queen-chess-piece.png");
        }

    }
}
