public class ContaCorrente extends Conta{

    @Override
    public void imprimirExtrato() {
        System.out.println("Conta Corrente");
        super.imprimirInfoComuns();

    }
    

}
