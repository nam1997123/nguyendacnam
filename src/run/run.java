/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

import Bussiness.ProductBussiness;
import entity.Category;
import entity.Product;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NAMND
 */
public class run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Category category1 = new Category("maytinh", "mt");
        Category category2 = new Category("dienlanh", "dl");

        Product p1 = new Product("maytinhxachtay A", "mt", category1, 12.0);
        Product p2 = new Product("laptop X", "mt", category1, 13.0);
        Product p3 = new Product("pc 2", "mt", category1, 13.0);
        Product p4 = new Product("ultrabook EZ", "mt", category1, 16.0);
        Product p5 = new Product("tu lanh e", "dl", category2, 11.5);
        Product p6 = new Product("dieu hoa nhiet do b", "dl", category2, 12.0);

        List<Category> listCat = new ArrayList<>();
        listCat.add(category1);
        listCat.add(category2);

        List<Product> listPro = new ArrayList<>();
        listPro.add(p1);
        listPro.add(p2);
        listPro.add(p3);
        listPro.add(p4);
        listPro.add(p5);
        listPro.add(p6);

        ProductBussiness proBuss = new ProductBussiness();

        List list = proBuss.getProductByTag("mt", listPro);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }

}
