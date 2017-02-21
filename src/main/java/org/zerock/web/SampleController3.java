package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.ProductVO;

/**
 * SpringBoard 
 * 클래스명 : SampleController3.java
 * 작성자 : elcue
 * 작성일 : 2017. 2. 21.
 * 클래스 소개 : 컨트롤러 사용 예시 Model 형태
 */
@Controller
public class SampleController3 {

		private static final Logger logger=
				LoggerFactory.getLogger(SampleController3.class);
		
		@RequestMapping("/doD")
		public String doD(Model model){
			
			//make sample data
			ProductVO product = new ProductVO("Sample Product", 10000);
			
			logger.info("doD");
			model.addAttribute("doD", product);
			
			return "productDetail";
		}
}
