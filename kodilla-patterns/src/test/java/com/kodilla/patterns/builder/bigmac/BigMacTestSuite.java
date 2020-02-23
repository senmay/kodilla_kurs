package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;
//import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;

public class BigMacTestSuite {

    @Test
    public void testBicMacBuilder() {

        //given
        Bigmac bigmac = new Bigmac.BuilderBigMac()
                .roll(Bigmac.BuilderBigMac.ROLL_WITH_SESAME)
                .ingredients(Bigmac.BuilderBigMac.ONION)
                .sauce(Bigmac.BuilderBigMac.ONE_THOUSAND_ISLANDS_DRESSING)
                .ingredients(Bigmac.BuilderBigMac.CUCUMBER)
                .build();

        //when
        String chosenIngredient1 = Bigmac.BuilderBigMac.ONION;
        String chosenRoll = bigmac.getRoll();
        String chosenSauce = bigmac.getSauce();


        //then
        //Assert.assertThat(bigmac.getIngredients(), containsInAnyOrder(chosenIngredient1, chosenIngredient2));
        Assert.assertTrue(bigmac.getIngredients().contains(chosenIngredient1));
        Assert.assertEquals(Bigmac.BuilderBigMac.ROLL_WITH_SESAME, chosenRoll);
        Assert.assertEquals(Bigmac.BuilderBigMac.ONE_THOUSAND_ISLANDS_DRESSING, chosenSauce);

    }
}