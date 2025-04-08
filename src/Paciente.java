import java.util.Scanner;

public class Paciente {
    private String nomeCompleto;
    private String endereco;
    private int RG;
    private int idade;
    String CondicaoEspecial; //esse paciente automaticamente ganha o selo verde inicialmente (prioridade 2 de 5)
    private String sintomas;
    private int NivelDor;


    private boolean AceitaAtendimento;

    public Paciente(Scanner sc) { // construtor

        this.Cadastro(sc);
        this.informacoes(sc);
    }

    public void Cadastro(Scanner sc) {
        System.out.print("Digite seu nome completo: ");
        this.nomeCompleto = sc.nextLine();

        System.out.print("Digite seu endereço: ");
        this.endereco = sc.nextLine();

        System.out.print("Digite seu RG (apenas números): ");
        this.RG = sc.nextInt();
        sc.nextLine(); // consome o \n

        System.out.print("Digite sua idade: ");
        this.idade = sc.nextInt();
        sc.nextLine(); // consome o \n

        System.out.print("Digite seu principal sintoma: ");
        this.sintomas = sc.nextLine();

        System.out.print("Digite seu nível de dor (1 a 10): ");
        this.NivelDor = sc.nextInt();
        sc.nextLine(); // consome o \n

        System.out.print("Digite sua condição especial (Idoso, Gestante, Deficiente ou 'nao'): ");
        this.CondicaoEspecial = sc.nextLine();

        System.out.println("Cadastro concluído com sucesso!\n");

    }
    public void informacoes(Scanner sc){
        System.out.println("Deseja saber como funciona o sistema de filas de prioridade? (sim/nao)");
        String resposta = sc.nextLine();
        this.AceitaAtendimento = resposta.equalsIgnoreCase("sim");
        if(AceitaAtendimento){
            System.out.println("No sistema de triagem \"AtendeBem\", os pacientes são organizados em filas de acordo com sua prioridade de atendimento (escala de 1 a 5), levando em consideração características clínicas" +
                    " e sociais que impactam a urgência do cuidado médico. Os nomes das classificações são: 1 - não urgente; 2 - Pouco urgente; 3 - Urgente; 4 - Muito urgente; 5 - Emergência" +
                    " A prioridade é definida por meio de critérios simples, porém eficazes.\n" +
                    "Ao se cadastrar no sistema, o paciente informa dados como nome, idade, sintomas, nível de dor (em uma escala de 1 a 10) e se possui alguma condição especial, como ser idoso, gestante ou pessoa com deficiência.");
        }




    }






    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEndereço() {
        return endereco;
    }

    public void setEndereço(String endereço) {
        this.endereco = endereço;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCondicaoEspecial() {
        return CondicaoEspecial;
    }

    public void setCondicaoEspecial(String condicaoEspecial) {
        CondicaoEspecial = condicaoEspecial;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public int getNivelDor() {
        return NivelDor;
    }

    public void setNivelDor(int nivelDor) {
        this.NivelDor = NivelDor;
    }

    public boolean isAceitaAtendimento() {
        return AceitaAtendimento;
    }

    public void setAceitaAtendimento(boolean aceitaAtendimento) {
        AceitaAtendimento = aceitaAtendimento;
    }
}
