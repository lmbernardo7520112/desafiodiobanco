package desafiodiobanco.demo;

public class Main {
    public static void  main(String[] args) {

        Cliente Leonardo = new Cliente();
        Leonardo.setNome("Leonardo");

        Conta cc = new ContaCorrente(Leonardo);
        cc.depositar(1000);
        Conta cp = new ContaPoupanca(Leonardo);
        cc.transferir(200, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}
