public interface Set <T> {
    int size();

    void clear();

    void add(T value);

    void remove(T value);

    boolean contains(T value);

    boolean isEmpty();
}