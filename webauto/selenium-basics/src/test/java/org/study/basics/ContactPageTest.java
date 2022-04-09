package org.study.basics;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class ContactPageTest {

    private static ContactPage contactPage;

    @BeforeAll
    static void initPage(){
        contactPage = new ContactPage();
    }
    @AfterAll
    static void close() throws InterruptedException {
        contactPage.close();
    }
    @Test
    void addMember() {
        contactPage.loadCookies();
        contactPage.open();
        contactPage.addMember("141122199","安安","18636657011");
        contactPage.getMemeber("141122199").deleteCurrentMember();
    }

}