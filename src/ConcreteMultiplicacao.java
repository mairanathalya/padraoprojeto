public class ConcreteMultiplicacao implements Strategy{

    @Override
    public Integer fazerConta(int a, int b) {
        return a * b;
    }
}
