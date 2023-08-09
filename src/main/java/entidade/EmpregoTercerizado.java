package entidade;

public class EmpregoTercerizado extends Emprego {
    private Double taxa;

    public EmpregoTercerizado(String nome, Integer horas, Double valorPorHora, Double taxa) {
        super(nome, horas, valorPorHora);
        this.taxa = taxa;
    }

    @Override
    public final Double pagamento() {
        Double pagamento = super.pagamento();
        return pagamento * taxa;
    }
}
