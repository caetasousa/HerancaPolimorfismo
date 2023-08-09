package entidade;

public class Emprego {
    private String nome;
    private Integer horas;
    private Double valorPorHora;

    public Emprego(String nome, Integer horas, Double valorPorHora) {
        this.nome = nome;
        this.horas = horas;
        this.valorPorHora = valorPorHora;
    }

    public Double pagamento() {
        return valorPorHora * horas;
    }
}
