/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PooTamaguchi;

/**
 *
 * @author Rafael Walker
 */
public class Cachorro {

    String raca;
    String nome;
    String porte;
    int peso;
    int idade;
    int energia;
    int nascimento;
    
    void criarCachorro(String raca, String nome, String porte, int peso, int nascimento, int energia){
        this.raca = raca;
        this.nome = nome;
        this.porte = porte;
        this.peso = peso;
        this.energia = energia;
        this.nascimento = nascimento;
    }
    
    public void calculaIdade(){
        idade = 2016 - nascimento;
    }
    
    public void envelhecer(){
       idade++;
        
    }
    
    public void alimentar(){
        peso++;
        energia++;
        
    }
    
    public void passear(){
        peso--;
        energia --;
    }
    public void dormir(){
        peso--;
        energia++;
    }
    
    @Override
        public String toString() {  
        return "Nome: " + nome + "\n Idade: " + idade + "\n Energia: " + energia; 
    }  
    
}
