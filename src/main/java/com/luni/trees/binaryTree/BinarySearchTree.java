package com.luni.trees.binaryTree;

import java.util.ArrayList;

public class BinarySearchTree<T extends Comparable<T>> {

    private Node<T> root;

    public BinarySearchTree() {
    }

    public void add(T data) {       
        root = addNode(root, data);
    }

    private Node<T> addNode(Node<T> node, T data) {
        if (node == null) {
            node = new Node<>(data);
            return node;
        } else if (data.compareTo(node.getData()) >= 0) {
            node.setRight(addNode(node.getRight(), data));
        } else if (data.compareTo(node.getData()) == -1) {
            node.setLeft(addNode(node.getLeft(), data));
        }
        return node;
    }

    public void printPreOrder() {        
        System.out.print("=>" + getPreOrder() + "\n");
    }

    public void printPostOrder() {
        ArrayList<T> list = new ArrayList<>(20);
        postOrderTraversal(root, list);
        System.out.print("=>" + getPostOrder() + "\n");
    }

    public void printInOrder() {
        ArrayList<T> list = new ArrayList<>(20);
        inOrderTraversal(root, list);
        System.out.print("=>" + getInOrder() + "\n");
    }

		public ArrayList<T> getPreOrder(){
			ArrayList<T> list = new ArrayList<>(20);
      preOrderTraversal(root, list);      
			return list;
		}

		public ArrayList<T> getPostOrder() {
        ArrayList<T> list = new ArrayList<>(20);
        postOrderTraversal(root, list);
        return list;
    }

    public ArrayList<T> getInOrder() {
        ArrayList<T> list = new ArrayList<>(20);
        inOrderTraversal(root, list);
        return list;
    }

    private void preOrderTraversal(Node<T> node, ArrayList<T> list) {
        if (node == null) {
            return;
        }
        list.add(node.getData());
        preOrderTraversal(node.getLeft(), list);
        preOrderTraversal(node.getRight(), list);
    }

    private void postOrderTraversal(Node<T> node, ArrayList<T> list) {
        if (node == null) {
            return;
        }
        postOrderTraversal(node.getLeft(), list);
        postOrderTraversal(node.getRight(), list);
        list.add(node.getData());
    }

    private void inOrderTraversal(Node<T> node, ArrayList<T> list) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.getLeft(), list);
        list.add(node.getData());
        inOrderTraversal(node.getRight(), list);
    }
}



