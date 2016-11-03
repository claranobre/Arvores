package br.imd;

import javax.xml.soap.Node;

public class Tree {
	
	private No root;
	private Tree leftTree;
	private Tree rightTree;
	
	public Tree(){
		// construtor vazio
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
	
	 public No getRoot() {
	        return root;
	 }

	public void setRoot(No root) {
	        this.root = root;
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
	
	// Busca
	
	public No search(int key){
		  No currentNode = this.root;
		  
		  while(currentNode != null){
		   if(key == currentNode.key)
		    return currentNode;
		   else if(key < currentNode.key)
		    currentNode = currentNode.leftTree;
		   else
		    currentNode = currentNode.rightTree;
		  }
		  return currentNode;
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
}
