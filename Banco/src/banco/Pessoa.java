/*Grupo:
Bernardo Alexander Prado Clepf
Gustavo Bueno de Oliveira
Jhonatan Oliveira Landin Costa
Matheus Martins Aguiar
Kayky de Castro Manso Ribeiro 
*/

package banco;

public class Pessoa {
    private String nome;
    private String dataDeNascimento;

    public Pessoa(String nome, String dataDeNascimento) {
    this.nome = nome;
    this.dataDeNascimento = dataDeNascimento;
    }
    public String getNome() {
        return nome;
    }
    
    public String getDataDeNascimento() {
        return dataDeNascimento;
    }
       
    private int ano = Integer.parseInt(dataDeNascimento);
    
    private int idade = 2023 - ano;

    public int getIdade() {
        return idade;
    }

        
}
