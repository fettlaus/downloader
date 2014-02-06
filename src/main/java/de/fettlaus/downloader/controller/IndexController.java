package de.fettlaus.downloader.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/")
public class IndexController extends SessionController {

	@RequestMapping
	public ModelAndView setUser() {
		return new ModelAndView("index");
	}
}
