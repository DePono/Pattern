package Facade;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class ControlPanel extends JPanel {
    public JButton btnStart = new JButton("Start");;
    public JButton btnClose = new JButton("Close");
//    private JComboBox<> cbChooseShape;

    public ControlPanel(){
//        cbChooseShape= new JComboBox();

//        Vector<BouncingShape> items = new Vector<>();
//        items.add(new TrafficLight());
//        items.add(new Car());
//
//        cbChooseShape.setModel(new DefaultComboBoxModel<>(items));
//        cbChooseShape.setSelectedIndex(0);

        this.add(btnStart);
        this.add(btnClose);
//        this.add(cbChooseShape);

        btnClose.addActionListener(actionEvent -> {
           System.exit(0);
        });
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(600,35);
    }

//    public JComboBox getChooseShapeCb(){
//        return cbChooseShape;
//    }

//    public BouncingShape getSelectedShape(){
//        return (BouncingShape)cbChooseShape.getSelectedItem();
//    }
}
