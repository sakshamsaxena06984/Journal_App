package com.edigest.journalApp.service;

import com.edigest.journalApp.entity.User;
import com.edigest.journalApp.repository.UserRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserServiceTests {


    @Autowired
    private UserRepository userRepository;

    @Test
    public void testAdd(){
        assertEquals(5, 2+3);
    }

    @Disabled
    @Test
    public void testFindByUsername(){
//        assertNotNull(userRepository.findByUsername("rohan"));
//        assertTrue(5>3);
//
        User user = userRepository.findByUsername("rohan");
        assertTrue(!user.getJournalEntries().isEmpty());
        assertTrue(5 > 3);

    }

    @ParameterizedTest
    @CsvSource({
        "1, 2, 3",
        "2, 3, 5",
        "3, 4, 7"
    })
    public void test(int a,int b, int expected){
        assertEquals(expected, a + b);
    }
}
