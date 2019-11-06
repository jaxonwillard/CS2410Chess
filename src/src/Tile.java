package src;

import Pieces.Piece;
import javafx.scene.layout.StackPane;

public class Tile extends StackPane {
    boolean isWhite;
    public Board board;
    public Piece piece;
    public Position position;


    public Tile(boolean isWhite, Position position, Board board){
        this.board = board;
        this.position = position;
        this.isWhite = isWhite;
        if (this.isWhite){
        this.setStyle("-fx-background-color: #ffffff");}
        else { this.setStyle("-fx-background-color: #808080");}
        this.setWidth(300);
        this.setHeight(300);

    }








}
