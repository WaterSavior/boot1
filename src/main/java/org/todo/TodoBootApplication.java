package org.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import java.util.logging.Logger;

/**
 * 안녕하세요
 * 반갑습니다
 * 이곳은 제가 테스트를 위해 생성한 프로젝트 application입니다.
 */

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class TodoBootApplication {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(TodoBootApplication.class.getName());
		int testNumber = 13;
		String logMsg = "My message=>"+testNumber;
		logger.info(logMsg);
		SpringApplication.run(TodoBootApplication.class, args);
	}
}

