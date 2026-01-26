package NIvelIntermediario.GenericsPt2;

import java.util.ArrayList;
import java.util.List;

public class ItemsBag<T> {
    private List<T> items;

    public ItemsBag() {
        this.items= new ArrayList<>();
    }
    public void addItems(T item){
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return items.toString();
    }
}
