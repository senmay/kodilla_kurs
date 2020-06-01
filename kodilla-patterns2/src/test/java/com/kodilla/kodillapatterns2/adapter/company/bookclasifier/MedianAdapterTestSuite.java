package com.kodilla.kodillapatterns2.adapter.company.bookclasifier;

import com.kodilla.kodillapatterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryA.Book;
import org.junit.Assert;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> bookA = new HashSet<>();
        bookA.add(new Book("autor1",
                "tytul1",
                1998,
                "123456"));
        bookA.add(new Book("autor2",
                "tytul2",
                1980,
                "654321"));
        bookA.add(new Book("autor3",
                "tytul3",
                2000,
                "J32144d"));
        bookA.add(new Book("autor4",
                "tytul4",
                1977,
                "321555"));

        //When
        int median = medianAdapter.publicationYearMedian(bookA);

        //Then
        Assert.assertEquals(1998, median);
    }
}