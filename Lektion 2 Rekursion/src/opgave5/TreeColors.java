package opgave5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.shape.Line;

public class TreeColors extends Application {
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

    private static void drawTree(Pane pane, double x0, double y0, double len, double angle, int red) {
        if (len > 4) {
            double x1 = x0 + len * Math.cos(Math.toRadians(angle));
            double y1 = y0 - len * Math.sin(Math.toRadians(angle));
            Line line = new Line(x0, y0, x1, y1);
            Color c = Color.rgb(red, 69, 19);
            line.setStrokeWidth(2.0);
            line.setStroke(c);
            pane.getChildren().add(line);
            drawTree(pane, x1, y1, len*0.73, angle-30, red+10);
            drawTree(pane, x1, y1,len*0.73, angle+50, red+10);
        }
        else {
            Circle c = new Circle(x0, y0, 3);
            c.setFill(Color.GREEN);
            pane.getChildren().add(c);
        }
    }
    public static void drawTree(Pane pane) {
        double x = pane.getPrefWidth()/2;
        double y = pane.getPrefHeight()-10;
        double angle = 90;
        double lenght = 100;
        int r = 100;
        Line line = new Line(x, y, x, y-lenght);
        Color c = Color.rgb(r, 69, 19);
        line.setStrokeWidth(2.0);
        line.setStroke(c);
        pane.getChildren().add(line);
        drawTree(pane, x, y-lenght, lenght*0.73, angle-30,r+10);
        drawTree(pane, x, y-lenght, lenght*0.73, angle+50, r);
    }

}


