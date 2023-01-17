/*
package Template;

import java.security.Provider;

public class FigureAction {


    public static void addCircle( Pane ballPane, ScrollBar sbSpeed) {


//        Runnable addCircle = new Runnable() {
//            public void run() {
//                Figure ball = new Ball(ballPane);
//                ball.setFigure();
//                ball.moveFigure();
//                ball.play();
//
//                sbSpeed.setMax(20);
//                sbSpeed.setValue(10);
//                ball.rateProperty().bind(sbSpeed.valueProperty());
//
//            }
//        };
//        Thread thread = new Thread(addCircle);
//        thread.start();


        Provider.Service service = new Service() {
            @Override
            protected Task createTask() {
                return new Task() {
                    @Override
                    protected Object call() throws Exception {
                        Platform.runLater(() -> {
                            Figure ball = new Ball(ballPane);
                            ball.setFigure();
                            ball.moveFigure();
                            ball.play();

                            sbSpeed.setMax(20);
                            sbSpeed.setValue(10);
                            ball.rateProperty().bind(sbSpeed.valueProperty());
                        });
                        return null;
                    }
                };
            }
        };
        service.start();

//        Platform.runLater(()->{
//            Figure ball = new Ball(ballPane);
//            ball.setFigure();
//            ball.moveFigure();
//            ball.play();
//
//            sbSpeed.setMax(20);
//            sbSpeed.setValue(10);
//            ball.rateProperty().bind(sbSpeed.valueProperty());
//        });



    }

    public static void remove() {
        Figure.removeFigure();
    }


    public static void addSquare( Pane ballPane, ScrollBar sbSpeed) {

        Service service = new Service() {
            @Override
            protected Task createTask() {
                return new Task() {
                    @Override
                    protected Object call() throws Exception {
                        Platform.runLater(() -> {
                            Figure ball = new Square(ballPane);
                            ball.setFigure();
                            ball.moveFigure();
                            ball.play();

                            sbSpeed.setMax(20);
                            sbSpeed.setValue(10);
                            ball.rateProperty().bind(sbSpeed.valueProperty());
                        });
                        return null;
                    }
                };
            }
        };
        service.start();
    }


    public static void addStar( Pane ballPane, ScrollBar sbSpeed) {

        Service service = new Service() {
            @Override
            protected Task createTask() {
                return new Task() {
                    @Override
                    protected Object call() throws Exception {
                        Platform.runLater(() -> {
                            Figure ball = new Star(ballPane);
                            ball.setFigure();
                            ball.moveFigure();
                            ball.play();

                            sbSpeed.setMax(20);
                            sbSpeed.setValue(10);
                            ball.rateProperty().bind(sbSpeed.valueProperty());
                        });
                        return null;
                    }
                };
            }
        };
        service.start();
    }
}
}
*/
