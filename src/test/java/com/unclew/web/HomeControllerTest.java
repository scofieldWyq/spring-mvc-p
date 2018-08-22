package com.unclew.web;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by wuyingqiang
 * on 2018/8/23.
 */
public class HomeControllerTest {
    @Test
    public void testHomePage() throws Exception {
        HomeController controller = new HomeController();
        assertEquals("home", controller.home());
    }
}
