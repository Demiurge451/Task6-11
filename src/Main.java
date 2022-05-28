import org.w3c.dom.Node;

public class Main {
    public static void main(String[] args) {
        // вставка и удаление работают также как изначальные методы соломатина, причем скорость была оптимизирована
        // вставка элементов, если элемент был во множестве возвращает этот элемент, иначе возвращает null
        AVLTree<Integer> tree = new AVLTree<>();
        System.out.println(tree.put(2));
        System.out.println(tree.put(2));
        System.out.println(tree.put(3));
        System.out.println(tree.put(3));
        System.out.println(tree.put(4));
        System.out.println(tree.put(4));
        System.out.println(tree.put(5));
        System.out.println(tree.put(6));
        System.out.println(tree.put(11));
        System.out.println(tree.put(0));
        System.out.println(tree.put(15));
        System.out.println();

        //нахождение K-ого элемента в множестве, выполняется за log(n) так как на каждом шаге идет выбор из двух ветвей бинарного дерева
        for (int i = 1; i <= 8; i++) {
            System.out.println(tree.findK(i, tree.root));
        }


        // удаление элементов, аналогично вставке: null - не было такого элемента, иначе вернуть элемент
//        System.out.println();
//        System.out.println(tree.remove(2));
//        System.out.println(tree.remove(2));
//        System.out.println(tree.remove(3));
//        System.out.println(tree.remove(3));
//        System.out.println(tree.remove(4));
//        System.out.println(tree.remove(4));

    }
}
