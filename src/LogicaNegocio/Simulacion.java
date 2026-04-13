import java.util.ArrayList;
import java.util.List;
#TODO: Darle una vuelta a esta interfaz
#TODO: Decidir si es interfaz
public interface Simulacion {
    private ArrayList<Criatura> criaturas;
    public boolean puedeMover(Criatura b, int x, int y);
    public boolean mover(Criatura b, int x, int y);
    public boolean puedeDuplicar(Criatura b, int x, int y);
    public void duplicar(Criatura b, int x, int y);
}
