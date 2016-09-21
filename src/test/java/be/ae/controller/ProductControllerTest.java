package be.ae.controller;

import be.ae.models.Product;
import be.ae.models.Time;
import org.junit.Before;
import org.junit.Test;

import java.util.TimeZone;

import static org.junit.Assert.assertEquals;

public class ProductControllerTest {

    private ProductController controller;

    private Product product1;

    @Before
    public void setup() {
        product1 = new Product();
        product1.setName("Google Pixel");
        product1.setReleaseDate(new Time());
        product1.setDescription("New google phone to be released also called Sailfish");
    }
    
    @Test
    public void testDiscount() throws Exception {
        //TODO Implement test code here
    }
}
