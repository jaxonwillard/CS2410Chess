package src;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Chess extends Application{
    int width = 650;

    public static void main(String[] args) {
        Application.launch(args);
    }
    public void start(Stage stage) {
        stage.setWidth(width);
        stage.setHeight(width);
        Scene scene = new Scene(new Tile(false, new Position(0, 0), new Board(stage, width)));
        stage.setScene(scene);
        stage.show();



        final long startTime = System.currentTimeMillis();
        Board board = new Board(stage, width);
        final long endTime = System.currentTimeMillis();
        System.out.println("board initialization time: " + (endTime - startTime));





        stage.setScene(board.scene);
        stage.show();


    }
}
