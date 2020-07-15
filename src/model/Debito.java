package model;

public class Debito extends Tarjeta {

    public Debito(int numero, double saldo, String titular) {
        super(numero, saldo, titular);
    }

    @Override
    public boolean extraer(double importe) {
        if (importe <= getSaldo()) {
            double nuevoSaldo = getSaldo() - importe;
            setSaldo(nuevoSaldo);
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public boolean depositar(double importe){
        double nuevoSaldo = getSaldo() + importe;
        setSaldo(nuevoSaldo);
        return true;
    }
}
