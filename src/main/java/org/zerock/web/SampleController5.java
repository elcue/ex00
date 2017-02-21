package org.zerock.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.domain.ProductVO;

/**
 * SpringBoard 
 * 클래스명 : SampleController5.java
 * 작성자 : elcue
 * 작성일 : 2017. 2. 21.
 * 클래스 소개 : 컨트롤러 사용 예시 json 형태
 */
@Controller
public class SampleController5 {

		
		@RequestMapping("/doJSON")
		public @ResponseBody ProductVO doJSON(){
			ProductVO vo = new ProductVO("샘플상품", 30000);
			
			return vo;
		}
		
}
