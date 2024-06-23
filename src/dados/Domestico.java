
package dados;

public class Domestico extends Robo {
    private int nivel;

    public Domestico(int id, String modelo, double valorDiario, int nivel) {
        super(id, modelo, valorDiario);
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    @Override
    public double calculaLocacao(int dias) {
        double totalLocacao = 0;
        if (nivel == 1) {
            totalLocacao = dias * 10;
        } else if (nivel == 2) {
            totalLocacao = dias * 20;
        } else {
            totalLocacao = dias * 50;
        }
        return totalLocacao;
    }

    @Override
    public String toString() {
        return super.toString() + ", nivel=" + nivel;
    }
}
