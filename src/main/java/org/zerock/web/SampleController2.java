package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * SpringBoard 
 * 클래스명 : SampleController2.java
 * 작성자 : elcue
 * 작성일 : 2017. 2. 21.
 * 클래스 소개 : 컨트롤러 사용 예시 String 형태
 */
@Controller
public class SampleController2 {

		private static final Logger logger=
				LoggerFactory.getLogger(SampleController2.class);
		
		@RequestMapping("/doC")
		public String doC(@ModelAttribute("msg") String msg){
			logger.info("doC called......................................");
			
			return "result";
		}
}
