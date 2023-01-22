import Exeptions.NoSuchModelNameException;

import java.util.Arrays;

public class PrintVisitor implements Visitor {
// нарушил инкапсуляцию (исправить)
    @Override
    public void visit(Auto auto) {
        for (int i = 0; i < auto.getSizeModelArray(); i++) {
            System.out.print(auto.getModelByIndex(i) + " " + auto.getModelByIndex(i) + " ");
        }
    }

    @Override
    public void visit(Motorcycle motorcycle) {
        for (int i=0; i< motorcycle.getSizeModelArray();i++) {
            System.out.println(motorcycle.getModelByIndex(i).getModelName() + " " + motorcycle.getModelByIndex(i).getPrice());
        }
    }
}
