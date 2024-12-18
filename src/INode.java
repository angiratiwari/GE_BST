public interface INode<T> {
    T getKey();
    INode<T> getLeft();
    INode<T> getRight();
    void setLeft(INode<T> left);
    void setRight(INode<T> right);
}
