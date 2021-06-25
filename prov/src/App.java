import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String nome1;
        int cpf;
        String nasc;
        int numConta;
        String tipoConta;
        int depos;
        int sac;
        String modCaneta;
        String tamCaneta;
        String corCaneta;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Nome:");
        nome1 = leitor.next();

        System.out.println("Digite CPF:");
        cpf = leitor.nextInt();

        System.out.println("Nascimento:");
        nasc = leitor.next();

        System.out.println("Digite um número para conta:");
        numConta = leitor.nextInt();

        System.out.println("Tipo de conta CC - Conta corrent ou CP - conra poupança:");
        tipoConta = leitor.next();

        System.out.println("Valor a depositar:");
        depos = leitor.nextInt();

        System.out.println("Valor a sacar:");
        sac = leitor.nextInt();

        System.out.println("Digite o modelo de caneta que queria ganha de brinde:");
        modCaneta = leitor.next();

        System.out.println("tamanho da ponta da caneta:");
        tamCaneta = leitor.next();

        System.out.println("A cor da caneta:");
        corCaneta = leitor.next();

        Identidade id1 = new Identidade(nome1, cpf, nasc);
        ContaBanco p1 = new ContaBanco();
        Caneta c1 = new Caneta(modCaneta, tamCaneta, corCaneta);
        p1.setNumConta(numConta);
        p1.setDono(nome1);
        p1.abrirConta(tipoConta);
        p1.estadoAtual();
        p1.depositar(depos);
        p1.sacar(sac);
        p1.fecharConta();
        p1.estadoAtual();
        c1.status();
        id1.info();
    }
}
