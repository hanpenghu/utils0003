package com.hanhan.utils0002;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hanhan.utils0002.Cnst.C;
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
//如果sql写在mybatis的方法上,可以不要xml文件,亲子实验,xml文件只是为了将sql吸收进来
@MapperScan(C.daoPath)
public class Utils0002Application {
	private static final Logger l = LoggerFactory.getLogger(Utils0002Application.class);
	public static void main(String[] args) {

		SpringApplication.run(Utils0002Application.class, args);

	}
}
