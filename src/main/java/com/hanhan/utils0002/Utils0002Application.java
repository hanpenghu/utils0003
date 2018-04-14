package com.hanhan.utils0002;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
@EnableScheduling
//@MapperScan(InterFaceCnst.daoCnst)
public class Utils0002Application {
	private static final Logger l = LoggerFactory.getLogger(Utils0002Application.class);
	public static void main(String[] args) {




		SpringApplication.run(Utils0002Application.class, args);





	}
}
