import Exeptions.NoSuchModelNameException;

import java.util.Arrays;

public class PrintVisitor implements Visitor {

    @Override
    public void visit(Auto auto) {
        for (int i = 0; i < auto.getSizeModelArray(); i++) {
            System.out.print(Arrays.toString(auto.getAllModelNames()));
        }
    }

    @Override
    public void visit(Motorcycle motorcycle) throws NoSuchModelNameException {
        for (String motorcycleName: motorcycle.getAllModelNames()) {
            System.out.println(motorcycleName + "  " + motorcycle.getPriceModelByName(motorcycleName));
        }
    }
}
