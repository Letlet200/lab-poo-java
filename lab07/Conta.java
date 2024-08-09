package lab07;

public class Conta {
    String usuario;
    String senha;
    double saldo;
    String agencia;
    
    String realizarExtrato;(){
        return "Seu saldo é" + saldo;
    }

    void depositar(double valor){
        saldo += valor;
    })
}
