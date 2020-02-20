package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User millenials = new Millenials("Steven");
        User yGeneration = new YGeneration("John");
        User zGeneration = new ZGeneration("Amanda");

        //When
        String mSocialPublisher = millenials.sharePost();
        System.out.println("Steven speak: " + mSocialPublisher);
        String ySocialPublisher = yGeneration.sharePost();
        System.out.println("John speak: " + ySocialPublisher);
        String zSocialPublisher = zGeneration.sharePost();
        System.out.println("Amanda speak: " + zSocialPublisher);

        //Then
        Assert.assertEquals("best twitter", mSocialPublisher);
        Assert.assertEquals("best facebook", ySocialPublisher);
        Assert.assertEquals("best snapchat", zSocialPublisher);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User millenials = new Millenials("Steven");

        //When
        String mSocialPublisher = millenials.sharePost();
        System.out.println("Steven speak: " + mSocialPublisher);
        millenials.setSocialPublisher(new FacebookPublisher());
        mSocialPublisher = millenials.sharePost();
        System.out.println("Steven now speak: " + mSocialPublisher);

        //Then
        Assert.assertEquals("best facebook", mSocialPublisher);
    }
}