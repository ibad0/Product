package com.product.controller;

import com.product.model.Product;
import com.product.service.ProductService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;


//enable spring boot features like autowire..
@RunWith(SpringRunner.class)
@SpringBootTest
//needed to create the mockbeans and mockmvc
@AutoConfigureMockMvc
public class ProductControllerTest {

    private  List<Product> products = new ArrayList<>();
    private List<Product> check=new ArrayList<>();
    private Product p=new Product();
    private Product mockProduct;
    private Product mockProduct1;

    @Before
    public void setup(){
        mockProduct=new Product(1L,"ibad",200L,"stock");
        mockProduct1=new Product(1L,"ibad",200L,"stock");
        products.add(mockProduct);
        products.add(mockProduct1);
    }

    //creates the mock object which simulates the behaviour of real object
    @MockBean
    private ProductService productService;

    //check product returned is not null
    @Test
    public void getProduct() throws Exception{
        Mockito.when(productService.getProduct(Mockito.anyLong())).thenReturn(Optional.ofNullable(mockProduct));
        assertNotNull(productService.getProduct(Mockito.anyLong()));
    }

    //check whether the return type is arrayList
    @Test
    public void getALlProducts() throws Exception{
        Mockito.when(productService.getAllProducts()).thenReturn(products);
        assertEquals(check.getClass(),productService.getAllProducts().getClass());
    }

    //returns null if it is deleted successfully
    @Test
    public void deleteProduct() throws Exception{
        Mockito.when(productService.deleteProduct(Mockito.anyLong())).thenReturn(null);
        assertNull(productService.deleteProduct(Mockito.anyLong()));
    }

    //check returned product and added product are same
    @Test
    public void addProduct() throws Exception{
        Mockito.when(productService.addProduct(mockProduct)).thenReturn(mockProduct);
        assertEquals(mockProduct,productService.addProduct(mockProduct));
    }

    //check product returned is not null
    @Test
    public void updateProduct() throws Exception{
        Mockito.when(productService.updateProduct(mockProduct)).thenReturn(mockProduct);
        assertNotNull(productService.updateProduct(mockProduct));
    }


}
