/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author brnrdrosa
 */
public class Jogador {

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the saldo
     */
    public int getSaldo() {
        return saldo;
    }

    /**
     * @return the divida
     */
    public int getDivida() {
        return divida;
    }

    /**
     * @return the posicao
     */
    public int getPosicao() {
        return posicao;
    }

    /**
     * @param posicao the posicao to set
     */
    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }
    private int saldo;
    private int divida;
    private int posicao;
    private static int idGeral;
    private int id;
    
    Jogador(){
        this.saldo = 3000;
        this.idGeral++;
        this.id = idGeral;
        
    }
    
    void emprestimo(int multiplicador){
        int valorEmprestado = multiplicador * 1000;
        this.saldo += valorEmprestado;
        int valorDevido = valorEmprestado + valorEmprestado/10;
        this.divida += valorDevido;
    }
    
    void receber(int valor){
        this.saldo += valor;
    }
    
    void pagar(int valor){
        this.saldo -= valor;
    }
    
}
