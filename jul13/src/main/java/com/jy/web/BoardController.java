package com.jy.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {
	// 사용자가 /board라고 호출하면 동작할 메소드
	@GetMapping("/board")
	public String board() {
		return "board";
	}
	public ModelAndView mv() {
		ModelAndView mv = new ModelAndView("board");
		mv.addObject("board", "board");
		return mv;
	}

}
