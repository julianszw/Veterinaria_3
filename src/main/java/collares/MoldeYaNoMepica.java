package collares;

public class MoldeYaNoMepica extends CollarMolde{

    @Override
    public Collar generarCollar() {
        return new CollarYaNoMepica();
    }
}
