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

//
//        GridPane gp = new GridPane();
//        gp.setGridLinesVisible(true);
//        Scene scene = new Scene(gp);
//
//
//
//


//
//        gp.add(imageView, 0, 0);
//        gp.setPadding(new Insets(10, 10, 20, 10));
//        gp.setVgap(0);
//        gp.setHgap(0);
//        for (int i=0; i < 8; i++){
//            for (int j=0; j < 8; j++) {
//                if (!(i == 0)) {
//                    Rectangle rectangle = new Rectangle(70, 65, Color.WHITE);
//                    rectangle.setStroke(Color.TRANSPARENT);
//                    gp.add(rectangle, i, j);
//                }
//            }
//        }
//




        stage.setScene(board.scene);
        stage.show();


    }
}
