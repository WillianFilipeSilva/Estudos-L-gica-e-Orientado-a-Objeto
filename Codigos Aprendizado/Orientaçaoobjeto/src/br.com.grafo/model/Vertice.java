package br.com.grafo.model;
public class Vertice {
    public String nome;
    private int grau;
    
    public Vertice (String nomeCidade ) throws Exception {
        if (nomeCidade == null || nomeCidade.trim(). isEmpty()){
            throw new Exception("O nome do vertice deve ser informado.");
        }
        nome = nomeCidade.trim();
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String novoNome){
        nome = novoNome;
    }
}