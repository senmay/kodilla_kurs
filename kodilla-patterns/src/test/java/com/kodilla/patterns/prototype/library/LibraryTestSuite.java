package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library theListLibrary = new Library("The list number 1");

        Book book1 = new Book("Title1", "Author1", LocalDate.now());
        Book book2 = new Book("Title2", "Author2", LocalDate.now());
        Book book3 = new Book("Title3", "Author3", LocalDate.now());
        Book book4 = new Book("Title4", "Author4", LocalDate.now());
        Book book5 = new Book("Title5", "Author5", LocalDate.now());
        theListLibrary.getBooks().add(book1);
        theListLibrary.getBooks().add(book2);
        theListLibrary.getBooks().add(book3);
        theListLibrary.getBooks().add(book4);
        theListLibrary.getBooks().add(book5);

        //making a shallow clone of object board
        Library clonedTheListLibrary = null;
        try {
            clonedTheListLibrary = theListLibrary.shallowCopy();
            clonedTheListLibrary.setName("The list number 2");
        } catch(CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object board
        Library deepClonedTheListLibrary = null;
        try {
            deepClonedTheListLibrary = theListLibrary.deepCopy();
            deepClonedTheListLibrary.setName("The list number 3");
        } catch(CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        theListLibrary.getBooks().remove(book1);


        //Then
        System.out.println(theListLibrary);
        System.out.println(clonedTheListLibrary);
        System.out.println(deepClonedTheListLibrary);
        Assert.assertEquals(4, theListLibrary.getBooks().size());
        Assert.assertEquals(4, clonedTheListLibrary.getBooks().size());
        Assert.assertEquals(5, deepClonedTheListLibrary.getBooks().size());
        Assert.assertEquals(clonedTheListLibrary.getBooks(), theListLibrary.getBooks());
        Assert.assertNotEquals(deepClonedTheListLibrary.getBooks(), theListLibrary.getBooks());
    }
}