import java.util.Arrays;
import java.util.Collections;

public class FilaDeAtendimento {
    private Integer[] prioridades;
    private String[] nomes;
    private int tamanho;
    private final int CAPACIDADE = 5;

    public FilaDeAtendimento() {

        this.prioridades = new Integer[CAPACIDADE];
        this.nomes = new String[CAPACIDADE];

        this.tamanho = 0;

    }


    public void adicionar(String nome, Integer prioridade) {
        if (tamanho < CAPACIDADE) {
            prioridades[tamanho] = prioridade;
            nomes[tamanho] = nome;
            tamanho++;
        } else {
            System.out.println("Fila cheia! Só é possível inserir " + CAPACIDADE + " pacientes.");
        }
    }

    public void ordenar() {
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = i + 1; j < tamanho; j++) {
                if (prioridades[i] < prioridades[j]) {
                  
                    int tempP = prioridades[i];
                    prioridades[i] = prioridades[j];
                    prioridades[j] = tempP;

                    
                    String tempN = nomes[i];
                    nomes[i] = nomes[j];
                    nomes[j] = tempN;
                }
            }
        }
    }

    public void exibir() {
        System.out.println("Fila ordenada por prioridade:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Paciente " + nomes[i] + ": Prioridade " + prioridades[i]);
        }
    }





}
