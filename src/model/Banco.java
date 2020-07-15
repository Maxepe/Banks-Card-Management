package model;

import java.util.ArrayList;

public class Banco {
    private ArrayList<Tarjeta> tarjetas;

    public Banco() {
        this.tarjetas = new ArrayList<>();
    }
    
    public void addTarjeta(Tarjeta t){
        tarjetas.add(t);
    }
    
    public double saldoTotalDebito(){
        double acum = 0;
        for (Tarjeta tarjeta : tarjetas) {
            if (tarjeta instanceof Debito) {
                acum += tarjeta.getSaldo();
            }
        }
        return acum;
    }
    
    public double promSaldoCredito(){
        int cont = 0;
        int acum = 0;
        for (Tarjeta tarjeta : tarjetas) {
            if (tarjeta instanceof Credito) {
                acum += tarjeta.getSaldo();
                cont++;
            }
        }
        return acum/cont;
    }
    
    public boolean depositar(int numero, int tipo, double importe){
        boolean resultado = false;
        for (Tarjeta tarjeta : tarjetas) {
            //Tipo = 0 es débito. Tipo == 1 es crédito
            if (tipo == 0) {
                if (tarjeta instanceof Debito && tarjeta.getNumero() == numero) {
                    resultado = tarjeta.depositar(importe);
                    break;
                }
            }else{
                if (tarjeta instanceof Credito && tarjeta.getNumero() == numero) {
                    resultado = tarjeta.depositar(importe);
                    break;
                }
            }
        }
        return resultado;
    }
    
    public boolean extraer(int numero, int tipo, double importe){
        boolean resultado = false;
        for (Tarjeta tarjeta : tarjetas) {
            //Tipo = 0 es débito. Tipo == 1 es crédito
            if (tipo == 0) {
                if (tarjeta instanceof Debito && tarjeta.getNumero() == numero) {
                    resultado = tarjeta.extraer(importe);
                    break;
                }
            }else{
                if (tarjeta instanceof Credito && tarjeta.getNumero() == numero) {
                    resultado = tarjeta.extraer(importe);
                    break;
                }
            }
        }
        return resultado;
    }
}
