/*
 * ©  2019 Optum, Inc. - All Rights Reserved. Your use of this product is
 *  governed by the terms of your company's agreement. You may not use or
 *  disclose this product, or allow others to use it or disclose it, except as
 *  permitted by your agreement with Optum.
 */
package com.odx.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 *
 **/
@SpringBootApplication
@ComponentScan({"com.odx.test","com.odx.test.model"})
@Component
public class TestApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class);
    }
}
