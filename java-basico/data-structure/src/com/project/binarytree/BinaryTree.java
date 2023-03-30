package com.project.binarytree;

public class BinaryTree<T extends Comparable<T>> {
    private BinaryKnot<T> root;

    public BinaryTree() {
    this.root = null;
    }

    public void insert(T content) {
        BinaryKnot<T> newKnot = new BinaryKnot<>(content);
        this.root = insert(root, newKnot);
    }

    private BinaryKnot<T> insert(BinaryKnot<T> current, BinaryKnot<T> newKnot) {
        if(current == null) {
            return newKnot;
        } else if(newKnot.getContent().compareTo(current.getContent()) < 0) {
            current.setLeftKnot(insert(current.getLeftKnot(), newKnot));
        } else {
            current.setRightKnot(insert(current.getLeftKnot(), newKnot));
        }
        return current;
    }

    public void showInOrder() {
        System.out.println("\nExibindo em ordem");
        showInOrder(this.root);
    }

    private void showInOrder(BinaryKnot<T> current) {
        if (current != null) {
            showInOrder(current.getLeftKnot());
            System.out.print(current.getContent() + ", ");
            showInOrder(current.getRightKnot());
        }
    }

    public void showPostOrder() {
        System.out.println("\nExibindo pós ordem");
        showPostOrder(this.root);
    }

    private void showPostOrder(BinaryKnot<T> current) {
        if (current != null) {
            showPostOrder(current.getLeftKnot());
            showPostOrder(current.getRightKnot());
            System.out.print(current.getContent() + ", ");
        }
    }

    public void showPreOrder() {
        System.out.println("\nExibindo pre ordem");
        showPreOrder(this.root);
    }

    private void showPreOrder(BinaryKnot<T> current) {
        if (current != null) {
            System.out.print(current.getContent() + ", ");
            showPreOrder(current.getLeftKnot());
            showPreOrder(current.getRightKnot());
        }
    }

    public void remove(T content) {
        try {
            BinaryKnot<T> current = this.root;
            BinaryKnot<T> parent = null;
            BinaryKnot<T> child = null;
            BinaryKnot<T> temporary = null;

            while(current != null && !current.getContent().equals(content)) {
                parent = current;
                if(content.compareTo(current.getContent()) < 0) {
                    current = current.getLeftKnot();
                } else {
                    current.getRightKnot();
                }
            }

            if(current == null) {
                System.out.println("Conteudo nao encontrado no bloco Try");
            }

            if(parent == null) {
                if(current.getRightKnot() == null) {
                    this.root = current.getLeftKnot();
                } else if (current.getLeftKnot() == null) {
                    this.root = current.getRightKnot();
                } else {
                    for(temporary = current, child = current.getLeftKnot();
                        child.getRightKnot() != null;
                        temporary = child, child = child.getLeftKnot()
                    ) {
                        if(child != current.getLeftKnot()) {
                            temporary.setRightKnot(child.getLeftKnot());
                            child.setLeftKnot(root.getLeftKnot());
                        }
                    }
                    child.setRightKnot(root.getRightKnot());
                    root = child;
                }
            } else if(current.getRightKnot() == null) {
                if(parent.getLeftKnot() == current) {
                    parent.setLeftKnot(current.getLeftKnot());
                } else {
                    parent.setRightKnot(current.getLeftKnot());
                }
            } else if(current.getLeftKnot() == null) {
                if(parent.getLeftKnot() == current) {
                    parent.setLeftKnot(current.getRightKnot());
                } else {
                    parent.setRightKnot(current.getRightKnot());
                }
            } else {
                for(
                        temporary = current, child = current.getLeftKnot();
                        child.getRightKnot() != null;
                        temporary = child, child = child.getRightKnot()
                ) {
                    if(child != current.getLeftKnot()) {
                        temporary.setRightKnot(child.getLeftKnot());
                        child.setLeftKnot(current.getLeftKnot());
                    }
                    child.setRightKnot(current.getRightKnot());
                    if(parent.getLeftKnot() == current) {
                        parent.setLeftKnot(child);
                    } else {
                        parent.setRightKnot(child);
                    }
                }
            }
        } catch (NullPointerException error) {
            System.out.println("Conteudo nao encontrado");
        }
    }

}
