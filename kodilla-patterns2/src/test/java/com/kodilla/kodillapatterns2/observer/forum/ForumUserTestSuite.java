package com.kodilla.kodillapatterns2.observer.forum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForumUserTestSuite {

    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser ivonneEscobar = new ForumUser("Ivonne Escobar");
        ForumUser jessiePinkan = new ForumUser("Jessie Pinkman");
        javaHelpForum.registerObserver(johnSmith);
        javaHelpForum.registerObserver(jessiePinkan);
        javaToolsForum.registerObserver(ivonneEscobar);
        javaToolsForum.registerObserver(jessiePinkan);
        //When
        javaHelpForum.addPost("Hi everyone! Can you help me with loop?");
        javaHelpForum.addPost("Use while");
        javaToolsForum.addPost("MySQL doesnt work. HELP!");
        javaHelpForum.addPost("Why while???");
        javaToolsForum.addPost("When i try to log in I got 'bad credentials' messsage");
        //Then
        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(5, jessiePinkan.getUpdateCount());
        assertEquals(2, ivonneEscobar.getUpdateCount());
    }
}