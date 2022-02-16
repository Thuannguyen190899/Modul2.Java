package _Module2_java._3_Array.exercise._12_JavaCollectionFramework.exercise.e1;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private List<Product> products = new ArrayList<>();
    public void create (Product product){
        products.add(product);
    }
    public void update (Product product){

    }
    public int delete (int id){

        return id;
    }
}
