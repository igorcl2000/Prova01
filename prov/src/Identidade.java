public class Identidade {
    public String nome;
    private int cpf;
    private String nacimento;

    public Identidade(String nome, int cpf, String nacimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.nacimento = nacimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNacimento() {
        return nacimento;
    }

    public void setNacimento(String nacimento) {
        this.nacimento = nacimento;
    }

    public void info() {
        System.out.println("-------------------------");
        System.out.println("SOBRE: " + this.getNome());
        System.out.println("Nacimento: " + this.getNacimento());
        System.out.println("CPF: " + this.getCpf());
    }

}
