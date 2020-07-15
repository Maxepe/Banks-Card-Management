package model;

public abstract class Tarjeta {
    protected int numero;
    protected double saldo;
    protected String titular;

    public Tarjeta(int numero, double saldo, String titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public abstract boolean extraer(double importe);
    public abstract boolean depositar(double importe);
    
    @Override
    public String toString() {
        return "Tarjeta: " + "numero= " + numero + ", saldo= " + saldo + ", titular= " + titular;
    }
}
