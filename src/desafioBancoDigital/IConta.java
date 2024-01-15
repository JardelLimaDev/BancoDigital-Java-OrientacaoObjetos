package desafioBancoDigital;

public interface IConta {
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, Conta contaDestino );
    void transferirViaPix(String chavePixDestino, double valor, Conta contaDestino);

    void imprimirExtrato();

}
