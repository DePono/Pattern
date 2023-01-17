/*
package Observer;

public class MouthSubscriber implements Observer{
    private Mouth mouth;

    @Override
    public void handleEvent(Object component) {
        if (component instanceof Mouth) {
            mouth = (Mouth)component;
            if (!mouth.getIsSmile()) {
                setSmile();
                mouth.setIsSmile(true);
                mouth.getComponent().setFill(Color.RED);
            }

            else {
                setSad();
                mouth.setIsSmile(false);
                mouth.getComponent().setFill(null);
            }
        } else {
            System.out.println(component + "    Mounth");
        }

    }

    public void setSmile() {
        mouth.getComponent().setCenterX(mouth.getFaceCenterX());
        mouth.getComponent().setCenterY(mouth.getFaceCenterY() + 60);
        mouth.getComponent().setRadiusX(70);
        mouth.getComponent().setRadiusY(50);
        mouth.getComponent().setStartAngle(180);
        mouth.getComponent().setLength(180);
    }

    public void setSad() {
        mouth.getComponent().setCenterX(mouth.getFaceCenterX());
        mouth.getComponent().setCenterY(mouth.getFaceCenterY() + 110);
        mouth.getComponent().setRadiusX(80);
        mouth.getComponent().setRadiusY(60);
        mouth.getComponent().setStartAngle(0);
        mouth.getComponent().setLength(180);

    }
}
}
*/
