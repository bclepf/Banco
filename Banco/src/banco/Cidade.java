package banco;

public class Cidade { 
    private String nome;
    private String estado;

    public Cidade(String nome, String estado) {
        this.nome = nome;
        this.estado = estado;
        System.out.println("Endereco");
    }

    public String getNome() {
        return nome;
    }

    public String getEstado() {
        return estado;
    
   }
}
   