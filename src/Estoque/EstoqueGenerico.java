package Estoque;

import java.util.ArrayList;
import java.util.List;

public class EstoqueGenerico<T> {
    List<T> estoque = new ArrayList<>();

    public List<T> getLista() {
        return estoque;
    }

    public void add(T t) {
        estoque.add(t);
    }


    public void remove(T t) {
        estoque.remove(t);
    }
}