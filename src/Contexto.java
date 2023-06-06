public class Contexto {
    private Strategy conta;

    public void setConta(Strategy conta) {
        this.conta = conta;
    }


    public Integer fazerStrategy(int a, int b) {
        return conta.fazerConta(a,b);
    }
}
