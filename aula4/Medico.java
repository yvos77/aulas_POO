package aula4;

public class Medico extends Pessoa {
    String crm;
    String especialidade;

    Medico(String nome, int idade, String crm, String especialidade) {
        super(nome, idade);
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public void atender() {
        System.out.printf("\nO(A) médico(a) %s está atendendo paciente...\n", nome);
    }

    public void atenderPessoa(String nomeP) {
        System.out.printf("\nO(A) médico(a) %s está atendendo paciente %s\n", nome, nomeP);
    }

    @Override
    public void cumprimentar() {
        //super.cumprimentar();
        System.out.printf("\nOlá, sou o(a) Dr(a). %s, sou %s e meu CRM é %s\n", nome, especialidade, crm);
    }

}
