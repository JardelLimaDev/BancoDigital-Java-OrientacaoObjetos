package desafioBancoDigital;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cliente jardel = new Cliente();
        jardel.setNome("jardel");

        Cliente jamille = new Cliente();
        jamille.setNome("jamille");

        Conta ccJardel = new ContaCorrente(jardel);
        ccJardel.depositar(150);

        Conta ccJamille = new ContaCorrente(jamille);
        ccJamille.setChavePix("ja9624ll");

        ccJardel.transferirViaPix("ja9624ll", 50, ccJamille);

        ccJardel.imprimirExtrato();
        ccJamille.imprimirExtrato();

    }
}