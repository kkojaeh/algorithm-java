package kkojaeh.c9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 트리 순회
 * 전위, 중위 후위 순회 결과 반환
 */
public class S25 {

  public String[] solution(int[] array) {
    Node root = toTree(array);
    List<String> preorder = new ArrayList<>();
    root.preorder(node -> {
      preorder.add(node.value + "");
    });
    List<String> inorder = new ArrayList<>();
    root.inorder(node -> {
      inorder.add(node.value + "");
    });
    List<String> postorder = new ArrayList<>();
    root.postorder(node -> {
      postorder.add(node.value + "");
    });
    return new String[]{
        preorder.stream().collect(Collectors.joining(" ")),
        inorder.stream().collect(Collectors.joining(" ")),
        postorder.stream().collect(Collectors.joining(" "))
    };
  }

  private Node toTree(int[] array) {
    Node[] nodes = new Node[array.length];
    nodes[0] = new Node(array[0]);
    for (int i = 1; i < array.length; i++) {
      int value = array[i];
      Node node = new Node(value);
      nodes[i] = node;
      int parentIndex = (i - 1) / 2;
      boolean left = (i - 1) % 2 == 0;
      if (left) {
        nodes[parentIndex].left = node;
      } else {
        nodes[parentIndex].right = node;
      }
    }
    return nodes[0];
  }

  interface Visitor {
    void visit(Node node);
  }

  class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
      this.value = value;
    }

    void preorder(Visitor visitor) {
      visitor.visit(this);
      if (left != null) {
        left.preorder(visitor);
      }
      if (right != null) {
        right.preorder(visitor);
      }
    }

    void inorder(Visitor visitor) {
      if (left != null) {
        left.inorder(visitor);
      }
      visitor.visit(this);
      if (right != null) {
        right.inorder(visitor);
      }
    }

    void postorder(Visitor visitor) {
      if (left != null) {
        left.postorder(visitor);
      }
      if (right != null) {
        right.postorder(visitor);
      }
      visitor.visit(this);
    }

    @Override
    public String toString() {
      return "Node{" +
          "value=" + value +
          ", left=" + left +
          ", right=" + right +
          '}';
    }
  }
}
