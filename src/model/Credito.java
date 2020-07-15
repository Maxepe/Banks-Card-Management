package model;

public class Credito extends Tarjeta {

    private double limite;

    public Credito(int numero, double saldo, String titular, double limite) {
        super(numero, saldo, titular);
        this.limite = limite;
    }

    public boolean extraer(double importe) {
        if (importe + getSaldo() <= limite) {
            double nuevoSaldo = getSaldo() + importe;
            setSaldo(nuevoSaldo);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean depositar(double importe) {
        double saldoNuevo = getSaldo() + importe;
        setSaldo(saldoNuevo);
        return true;
    }
}
