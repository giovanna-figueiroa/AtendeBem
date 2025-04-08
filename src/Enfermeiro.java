public class Enfermeiro {
    private int prioridade;

    public int calcularPrioridade(Paciente p) {
        prioridade = 1;
        if (p.getNivelDor() >= 5 && p.getNivelDor() <=7) {
            prioridade += 1;
        }
        else if(p.getNivelDor() >= 8 ){
            prioridade += 2;
        }
        if ((p.getCondicaoEspecial().equalsIgnoreCase("Idoso")))
            prioridade += 1;

        if (p.getCondicaoEspecial().equalsIgnoreCase("Gestante"))
            prioridade += 1;

        if (p.getCondicaoEspecial().equalsIgnoreCase("Deficiente"))
            prioridade += 1;

        return prioridade;



    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }
}
