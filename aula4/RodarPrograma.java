package aula4;

public class RodarPrograma {
    public static void main(String args[]) {
        // Medico m1 = new Pessoa("Ana", 25);
        Pessoa m2 = new Medico("Marina", 25, "12345-DF", "Ortopedista");
        Pessoa m4 = new Medico("Felipe", 32, "243002-DF", "Urologista");
        m2.cumprimentar();
        ((Pessoa)m2).cumprimentar(); // conversão explícita (apenas para entender, aqui está redundante)
        //m2.atender();
        ((Medico)m2).atender();

        // Medico m3 = m2;
        Medico m3 = (Medico)m2;
        m3.atender();

        Pessoa p1 = new Pessoa("Caio", 25);
        p1.cumprimentar();
        // ((Medico)p1).cumprimentar(); 
        // Vai compilar, mas dá ERRO em tempo de execução (ClassCastException),
        // porque Caio foi criado como Pessoa e não pode ser convertido para Medico.

        ((Medico)m4).atenderPessoa(p1.nome);

    }

}
