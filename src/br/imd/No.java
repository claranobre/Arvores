package br.imd;

import java.awt.BasicStroke;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class No extends JPanel {
	
	private Aluno aluno;
	public int key;
    private int altura;
    private No raiz;
    private No noDireita;
    private No noEsquerda;
    
    /*
     * Variáveis do Gráfico
    */
    private int tam = 50;
    private int posX;
    private int posY;

    public No(Aluno aluno) {
        this.aluno = aluno;
        altura = 0;
        raiz = null;
        noDireita = null;
        noEsquerda = null;
    }

    public Aluno getAluno() {
        return aluno;
    }
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    public void setAltura(int altura){
        this.altura = altura;
    }
    public int getAltura(){
        return altura;
    }
    public void setRaiz(No raiz){
        this.raiz = raiz;
    }
    public No getRaiz(){
        return raiz;
    }
    public void setNoDireita(No noDireita){
        this.noDireita = noDireita;
    }
    public No getNoEsquerda(){
        return noEsquerda;
    }
    public void setnoEsquerda(No noEsquerda){
        this.noEsquerda = noEsquerda;
    }
    public No getnoDireita(){
        return noDireita;
    }
    public void setPosX(int posX){
        this.posX = posX;
    }
    public int getPosX(){
        return posX;
    }
    public void setPosY(int posY){
        this.posY = posY;
    }
    public int getPosY(){
        return posY;
    }
    
    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        Font a = new Font("Arial",Font.BOLD,16);
        if (noDireita != null){
            g2d.drawLine(posX + (tam / 2), posY + (tam / 2), noDireita.posX + (tam / 2), noDireita.posY + (tam / 2));
        }
        if (noEsquerda != null){
            g2d.drawLine(posX + (tam / 2), posY + (tam / 2), noEsquerda.posX + (tam / 2), noEsquerda.posY + (tam / 2));
        }
        g2d.setStroke(new BasicStroke(3));
        g2d.drawOval(posX, posY, tam, tam);
        //tenta centralizar o texto no centro do circulo.
        g2d.setFont(a);
        g2d.drawString(String.valueOf(aluno),
                posX + ((tam / 2) - 4 * (String.valueOf(aluno).length())), 
                posY + ((tam / 2) + 4));
    }
}