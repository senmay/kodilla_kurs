package com.kodilla.kodillapatterns2.adapter.bookclasifier;

import com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryA.Classifier;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryB.BookSignature;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryA.Book> bookSet) {

        Map<BookSignature, com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryB.Book> bookMap =
                new HashMap<>();
        for (com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryA.Book book : bookSet) {
            com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryB.Book bookB =
                    new com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryB.Book(book.getAuthor(),
                            book.getTitle(), book.getPublicationYear());

            bookMap.put(new BookSignature(book.getSignature()), bookB);
        }
        return medianPublicationYear(bookMap);
    }
}