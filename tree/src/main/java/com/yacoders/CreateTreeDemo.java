package com.yacoders;

import java.util.ArrayList;
import java.util.List;

class Node<T> {
    T data;
    Node<T> parent;
    List<Node<T>> children = new ArrayList<>();

    Node(T data) {
        this.data = data;
    }
}

class Tree<T> {
    Node<T> root;

    Tree(final Node<T> root) {
        this.root = root;
    }

    void addChild(Node<T> parent, Node<T> child) {
        child.parent = parent;
        parent.children.add(child);
    }
    int getHeight() {
        return getHeight(root);
    }
    int getHeight(Node<T> node) {
        if (node == null) {
            return 0;
        }
        int height = 0;
        for (Node<T> child : node.children) {
            height = Math.max(height, getHeight(child));
        }
        return height + 1;
    }



    void traverse(Node<T> node) {
        System.out.println(node.data);
        for (Node<T> child : node.children) {
            traverse(child);
        }
    }

}

public class CreateTreeDemo {
    public static void main(String[] args) {
        Node<String> root = new Node<>("root");
        Tree<String> tree = new Tree<>(root);
        Node<String> n1 = new Node<>("n1");
        Node<String> n2 = new Node<>("n2");
        Node<String> n3 = new Node<>("n3");
        Node<String> n4 = new Node<>("n4");
        tree.addChild(root, n1);
        tree.addChild(n1, n2);
        tree.addChild(n2, n3);
        System.out.println(tree.getHeight());
        tree.addChild(n3, n4);
        System.out.println(tree.getHeight());
        tree.traverse(root);
    }
}
