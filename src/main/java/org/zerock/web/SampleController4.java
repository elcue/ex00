package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * SpringBoard 
 * 클래스명 : SampleController4.java
 * 작성자 : elcue
 * 작성일 : 2017. 2. 21.
 * 클래스 소개 : 컨트롤러 사용 예시 RedirectAttributes 형태
 */
@Controller
public class SampleController4 {

		private static final Logger logger=
				LoggerFactory.getLogger(SampleController4.class);
		
		@RequestMapping("/doE")
		public String doE(RedirectAttributes rttr){
			logger.info("doE called but redirect to / doF......................");
			
			rttr.addFlashAttribute("msg", "This is the Message!! with redirected");
			return "redirect:/doF";
		}
		
		@RequestMapping("/doF")
		public void doF(String msg){
			logger.info("doF called................................"+msg);
		}
}
