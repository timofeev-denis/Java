/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javafxapp;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

/**
 *
 * @author Exorcist
 */
public class JavaFXApp extends Application {
    private ImageView bgImage;
    private ImageView bgImage_bw;
    private ImageView quit;
    private Rectangle imgClip;
    private Rectangle imgClip_bw;
    private FadeTransition fadeTransition;
    private double sX = 0;
    private DoubleProperty coordXReal = new SimpleDoubleProperty(0);
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        Pane root = new Pane();
        bgImage = new ImageView(new Image(JavaFXApp.class.getResourceAsStream("images/1024_nature_10.jpg")));
        imgClip = new Rectangle(300, 200);
        imgClip.setArcHeight(40);
        imgClip.setArcWidth(30);
        bgImage.setClip(imgClip);
        bgImage_bw = new ImageView(new Image(JavaFXApp.class.getResourceAsStream("images/1024_nature_10_bw.jpg")));
        imgClip_bw = new Rectangle(300, 200);
        imgClip_bw.setArcHeight(40);
        imgClip_bw.setArcWidth(30);
        bgImage_bw.setClip(imgClip_bw);
        bgImage_bw.setOpacity(0.0);
        fadeTransition = new FadeTransition(Duration.seconds(1), bgImage_bw);
        fadeTransition.setFromValue(0.0);
        fadeTransition.setToValue(1.0);
        setDrug();
        setQuit();
        root.getChildren().addAll(bgImage, bgImage_bw, quit);
        
        Scene scene = new Scene(root, 300, 250);
        scene.setFill(null);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void setDrug() {
        bgImage.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
                //sX = t.getSceneX();
                sX = t.getSceneX() - coordXReal.getValue();
                System.err.println("[MousePressed] getSceneX: " + t.getSceneX() + "; sX: " + sX + "; coordXReal: " + coordXReal.getValue());
            }
        });
        bgImage.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
                coordXReal.setValue(t.getSceneX() - sX);
                System.err.println("[MouseDragged] getSceneX: " + t.getSceneX() + "; sX: " + sX + "; coordXReal: " + coordXReal.getValue());
            }
        });
        bgImage.xProperty().bind(coordXReal);
        
        bgImage_bw.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
                //sX = t.getSceneX();
                sX = t.getSceneX() - coordXReal.getValue();
                System.err.println("[MousePressed] getSceneX: " + t.getSceneX() + "; sX: " + sX + "; coordXReal: " + coordXReal.getValue());
            }
        });
        bgImage_bw.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
                coordXReal.setValue(t.getSceneX() - sX);
                System.err.println("[MouseDragged] getSceneX: " + t.getSceneX() + "; sX: " + sX + "; coordXReal: " + coordXReal.getValue());
            }
        });
        bgImage_bw.xProperty().bind(coordXReal);
        
        bgImage_bw.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
                //bgImage_bw.setOpacity(1.0);
                fadeTransition.setRate(1.0);
                fadeTransition.play();
            }
        });
        bgImage_bw.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
                //bgImage_bw.setOpacity(0.0);
                fadeTransition.setRate(-1.0);
                fadeTransition.play();
            }
        });
    }

    private void setQuit() {
        quit = new ImageView(new Image(JavaFXApp.class.getResourceAsStream("images/close_pop.png")));
        quit.setFitHeight(25);
        quit.setFitWidth(25);
        quit.setX(270);
        quit.setY(10);
        quit.setOnMouseClicked(new EventHandler<MouseEvent>() {
            
            @Override
            public void handle(MouseEvent t) {
                System.exit(0);
            }
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
