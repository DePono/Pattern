/*
package Template;

public class Square extends Application {

    Pane ballPane = new Pane();
    ScrollBar sbSpeed = new ScrollBar();

    @Override
    public void start(Stage primaryStage) {


        ballPane.setStyle("-fx-border-color: yellow");

        Button btAdd = new Button("+ Круг");
        Button btAddS = new Button("+ Квадрат");
        Button btAddSt = new Button("+ Звезда");
        Button btSubtract = new Button("- Удалить");

        HBox hBox = new HBox(10);
        hBox.getChildren().addAll(btAdd, btAddS, btAddSt, btSubtract);
        hBox.setAlignment(Pos.CENTER);



        btAdd.setOnAction(e -> FigureAction.addCircle(ballPane, sbSpeed));
        btAddS.setOnAction(e -> FigureAction.addSquare(ballPane, sbSpeed));
        btAddSt.setOnAction(e -> FigureAction.addStar(ballPane, sbSpeed));
        btSubtract.setOnAction(e -> FigureAction.remove());


        BorderPane pane = new BorderPane();
        pane.setCenter(ballPane);
        pane.setTop(sbSpeed);
        pane.setBottom(hBox);


        Scene scene = new Scene(pane, 500, 400);
        primaryStage.setTitle("Симулятор DVD");
        primaryStage.setScene(scene);
        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}
*/
