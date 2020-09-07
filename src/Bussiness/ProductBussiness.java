/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussiness;

import entity.Product;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NAMND
 */
public class ProductBussiness {

    public List<Product> getProductByTag(String tag, List<Product> list) {
        List<Product> listPro = new ArrayList<>();
        for (Product listPro1 : list) {
            if (listPro1.getTag().equals(tag)) {
                listPro.add(listPro1);
            }
        }
        Product tg;
        for (int i = 0; i < listPro.size() - 1; i++) {
            for (int j = i + 1; j < listPro.size(); j++) {
                if (listPro.get(i).getPrice() < listPro.get(j).getPrice()) {
                    tg = listPro.get(i);
                    listPro.set(i, listPro.get(j));
                    listPro.set(j, tg);
                } else if (listPro.get(i).getPrice() == listPro.get(j).getPrice()) {
                    if (listPro.get(i).getName().compareTo(listPro.get(j).getName()) > 0) {
                        tg = listPro.get(i);
                        listPro.set(i, listPro.get(j));
                        listPro.set(j, tg);
                    }
                }
            }
        }
        return listPro;
    }

}
