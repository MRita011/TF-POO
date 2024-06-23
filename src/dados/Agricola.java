package dados;

public class Agricola extends Robo {
    private String uso;
    private double area;

    public Agricola(int id, String modelo, double valorDiario, String uso, double area) {
        super(id, modelo, valorDiario);
        this.uso = uso;
        this.area = area;
    }

    @Override
    public double calculaLocacao(int dias) {
        return dias * (area * 10);
    }

    @Override
    public String toString() {
        return super.toString() + ", uso='" + uso + '\'' + ", area=" + area;
    }
}