import java.util.*;

public class Buyer {
    private LinkedList<String> name = new LinkedList();
    private LinkedList<String> brand = new LinkedList();

    public int size() {
        return this.name.size();
    }

    public void setName(String name) {
        this.name.add(name);
    }

    public void setBrand(String brand) {
        this.brand.add(brand);
    }

    public String getName(int index) {
        return this.name.get(index);
    }

    public String getBrand(int index) {
        return this.brand.get(index);
    }
}