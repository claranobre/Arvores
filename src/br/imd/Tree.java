package br.imd;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Tree extends JPanel{
	
	private No root;
	private Tree leftTree;
	private Tree rightTree;
	
	public Tree(){
		root = null;
	}	
    public Tree(No root){
        this.root = root;
    }
	
    public void setRoot(No root){
        this.root = root;
    }
    public No getRoot(){
        return root;
    }
	public Tree getRightTree(){
		return rightTree;
	}
	
	public void setRightTree(Tree rightTree){
		this.rightTree = rightTree;
	}
	
	public Tree getLeftTree(){
		return leftTree;
	}
	
	public void setLeftTree(Tree leftTree){
		this.leftTree = leftTree;
	}
	
    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
    }  
	
	public void insereAluno(int matricula, String nome) {
        Aluno aluno = new Aluno(matricula, nome);
        No no = new No(aluno);
        inserir(no);
    }

	private void inserir(No no) {
		if(this.root == null){
		   this.root = no;
		}
		else {
			if (no.getAluno().getMatricula() > this.root.getAluno().getMatricula()){
				if (this.rightTree == null){
					this.rightTree = new Tree();
				}
				this.rightTree.inserir(no);
			}
			else if (no.getAluno().getMatricula() < this.root.getAluno().getMatricula()){
				if (this.leftTree == null){
					this.leftTree = new Tree();
				}
				this.leftTree.inserir(no);
			}
		}
		
	}
/**	
	// Busca
	
	public No search(int key){
		  No no = this.root;
		  
		  while(no != null){
		   if(key == no.key)
		    return no;
		   else if(key < no.key)
		    no = no.leftTree;
		   else
		    no = no.rightTree;
		  }
		  return no;
		 }


	// Em ordem
	
	public void inOrder(No no){
		if(no != null){
			inOrder(no.leftTree);
			System.out.println(no.root + " ");
			inOrder(no.rightTree);
		}
	}
	
	//Pré ordem
	
	public void preOrder(No no){
		if(no != null){
			System.out.print(no.root + " ");
			preOrder(no.leftTree);
			preOrder(no.rightTree);
		}
	}
	
	//Pós ordem
	
	public void posOrder(No no){
		if(no != null){
			posOrder(no.leftTree);
			posOrder(no.rightTree);
		System.out.println(no.root + "");
		}
	}
**/	
}
