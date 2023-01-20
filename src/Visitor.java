import Exeptions.NoSuchModelNameException;

public interface Visitor {
    void visit(Auto auto);
    void visit(Motorcycle motorcycle) throws NoSuchModelNameException;
}
