import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Chess extends Application {
    int width = 650;
    public void start(Stage stage){
        stage.setWidth(width);
        stage.setHeight(width);


        final long startTime = System.currentTimeMillis();
        Board board = new Board(stage, width);
        final long endTime = System.currentTimeMillis();
        System.out.println("board initialization time: " + (endTime - startTime));





        stage.setScene(board.scene);
        stage.show();


    }
}
