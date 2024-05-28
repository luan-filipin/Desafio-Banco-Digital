public class ContaPoupanca extends Conta{

    @Override
    public void imprimirExtrato() {
        System.out.println("Conta Poupança");
        super.imprimirInfoComuns();
    }


}
