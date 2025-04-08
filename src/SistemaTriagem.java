import java.util.Scanner;
public class SistemaTriagem {
    public static void main(String[] args) {
        FilaDeAtendimento fila = new FilaDeAtendimento();
        Enfermeiro enfermeiro = new Enfermeiro();
        Scanner sc = new Scanner(System.in);
        String resposta;

        System.out.println("######### Bem vindo ao AtendeBem! ###########");
        System.out.println("Realize seu cadastro para ser atendido");


        do {
            System.out.println("Deseja cadastrar um novo paciente? (sim/nao)");
            resposta = sc.nextLine();

            if (resposta.equalsIgnoreCase("sim")) {
                Paciente novoPaciente = new Paciente(sc); // usa o scanner pra entrada de dados
                int prioridade = enfermeiro.calcularPrioridade(novoPaciente);

                fila.adicionar(novoPaciente.getNomeCompleto(), enfermeiro.getPrioridade());
                fila.ordenar();
                fila.exibir();

                // você pode guardar esse paciente num array ou processar direto
            }

        } while (resposta.equalsIgnoreCase("sim"));










    }
}