package be.ae.controller;

import be.ae.models.Product;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Thomas.Petit on 21/09/2016.
 */
@NoArgsConstructor
public class ProductController {

    public void lowerPrice(Product product, double percentage) throws Exception {
        if (product == null || product.getPrice() == null) {
            throw new Exception("Invalid product");
        }
        product.setPrice(product.getPrice() * (1D - percentage));
    }

}
