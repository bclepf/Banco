package banco;

public class CartaoDeCredito {
    private String numero;
    private Double limite;

    public CartaoDeCredito(String numero) {
    this.numero = numero;
    this.limite = limite;
    }
    public String getNumero() {
        return numero;
    }
    
    public Double getLimite() {
        return limite;
    }
       
}
