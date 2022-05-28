import java.util.HashMap;
import java.util.HashSet;

public class TreeSet<T extends Comparable<? super T>> implements Set<T> {
    HashMap<Integer, T> uniqueValues = new HashMap<>();
    AVLTree<T> tree = new AVLTree<T>();
    int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        tree.clear();
        uniqueValues.clear();
        size = 0;
    }

    @Override
    public void add(T value) {
        uniqueValues.put(size, value);
        tree.put(uniqueValues.get(size));
        size = tree.size();
    }

    @Override
    public void remove(T value) {
        uniqueValues.remove(value);
        size = tree.size();
    }

    @Override
    public boolean contains(T value) {
        return tree.contains(value);
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
