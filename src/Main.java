public class Main {

    public static void main(String[] args) {
        Cliente leonardo = new Cliente();
        venilton.setNome("Leonardo");

        Conta cc = new ContaCorrente(leonardo);
        Conta poupanca = new ContaPoupanca(leonardo);

        cc.depositar(2000);
        cc.transferir(500, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}