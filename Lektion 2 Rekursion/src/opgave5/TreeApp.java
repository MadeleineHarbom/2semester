package opgave5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.shape.Line;

public class TreeApp extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }
    @Override
    public void start(Stage stage) {
        Pane root = this.initContent();
        Scene scene = new Scene(root);

        stage.setTitle("Shapes");
        stage.setScene(scene);
        stage.show();
    }

    private Pane initContent() {
        Pane pane = new Pane();
        pane.setPrefSize(500, 500);
        this.drawTree(pane);
        return pane;
    }

    private static void drawTree(Pane pane, double x0, double y0, double len, double angle) {
        if (len > 4) {
            double x1 = x0 + len * Math.cos(Math.toRadians(angle));
            double y1 = y0 - len * Math.sin(Math.toRadians(angle));
            Line line = new Line(x0, y0, x1, y1);
            pane.getChildren().add(line);
            drawTree(pane, x1, y1, len*0.73, angle-30);
            drawTree(pane, x1, y1,len*0.73, angle+50);
        }
        else {
            Circle c = new Circle(x0, y0, 2);
            c.setFill(Color.GREEN);
            pane.getChildren().add(c);
        }
    }
     public static void drawTree(Pane pane) {
        double x = pane.getPrefWidth()/2;
        double y = pane.getPrefHeight()-10;
        double angle = 90;
        double lenght = 100;
        Line line = new Line(x, y, x, y-lenght);
        pane.getChildren().add(line);
        drawTree(pane, x, y-lenght, lenght*0.73, angle-30);
        drawTree(pane, x, y-lenght, lenght*0.73, angle+50);
     }

}


