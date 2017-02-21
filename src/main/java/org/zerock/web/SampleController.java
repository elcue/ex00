package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * SpringBoard 
 * 클래스명 : SampleController.java
 * 작성자 : elcue
 * 작성일 : 2017. 2. 21.
 * 클래스 소개 : 컨트롤러 사용 예시 void형태
 */
@Controller
public class SampleController {

		private static final Logger logger=
				LoggerFactory.getLogger(SampleController.class);
		
		@RequestMapping("doA")
		public void doA(){
			logger.info("doA called.......................................");
		}
		
		@RequestMapping("doB")
		public void doB(){
			logger.info("doB called.......................................");
		}

}
