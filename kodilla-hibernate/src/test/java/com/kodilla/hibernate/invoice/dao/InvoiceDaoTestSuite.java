package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.math.BigDecimal;
import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ProductDao productDao;
    @Autowired
    ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave(){
        //given
        Product product1 = new Product("Scyzoryk");
        Product product2 = new Product("Kapka");
        Product product3 = new Product("Rondel");

        BigDecimal priceForProduct1 = new BigDecimal("1500");
        BigDecimal priceForProduct2 = new BigDecimal("2500");
        BigDecimal priceForProduct3 = new BigDecimal("300");

        Item item1 = new Item(product1, priceForProduct1, 4);
        Item item2 = new Item(product2, priceForProduct2, 1);
        Item item3 = new Item(product3, priceForProduct3, 8);

        Invoice invoice1 = new Invoice("130/20/2020");
        invoice1.setItems(Arrays.asList(item1, item2, item3));

        //when
        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);
        invoiceDao.save(invoice1);
        int invoice1Id = invoice1.getId();

        //then
        Assert.assertEquals(3, productDao.count());
        Assert.assertEquals(3, itemDao.count());
        Assert.assertEquals(1, invoiceDao.count());
        Assert.assertNotEquals(0, invoice1Id);

        //cleanup
        try {
            productDao.deleteAll();
            itemDao.deleteAll();
            invoiceDao.deleteAll();
        } catch (Exception e) {
            //do nothing
        }
    }
}