public class Main {

    public static void main(String[] args) {
        Cliente lucas = new Cliente();
        lucas.setNome("Lucas");

        Conta cc = new ContaCorrente(lucas);
        Conta poupanca = new ContaPoupanca(lucas);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();


        Cliente leticia = new Cliente();
        leticia.setNome("Leticia");

        Conta cc2 = new ContaCorrente(leticia);
        Conta poupanca2 = new ContaPoupanca(leticia);

        cc2.depositar(400);
        cc2.transferir(350, poupanca2);

        cc2.imprimirExtrato();
        poupanca2.imprimirExtrato();

    }
}