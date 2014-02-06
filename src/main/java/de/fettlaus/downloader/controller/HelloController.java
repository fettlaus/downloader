package de.fettlaus.downloader.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import de.fettlaus.downloader.service.model.Config;
import de.fettlaus.downloader.service.model.User;

@Controller
@RequestMapping(value = "/downloader")
public class HelloController extends SessionController {

	protected final Log logger = LogFactory.getLog(getClass());

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView handleRequest(@ModelAttribute("user") User user,
			ModelMap model) throws ServletException, IOException, SQLException {
		model.addAttribute(hello.getUsers());
		return new ModelAndView("list");
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView handlePost(@ModelAttribute("user") User user,
			ModelMap model) {
		hello.newUser(user.getName());
		model.addAttribute(hello.getUsers());
		return new ModelAndView("hello");
	}

	@RequestMapping(value = "/user/{usrid}/delete")
	public ModelAndView handleUsrDelete(@PathVariable("usrid") long usrid,
			Model model) {
		hello.deleteuser(usrid);
		model.addAttribute(hello.getUsers());
		return new ModelAndView("hello");
	}

	@RequestMapping(value = "/user/{usrid}/adminify")
	public ModelAndView handleMakeAdmin(@PathVariable("usrid") long usrid,
			Model model) {
		Config config = hello.makeAdmin(usrid);
		model.addAttribute(hello.getUsers());
		if (config != null)
			model.addAttribute(config);
		return new ModelAndView("hello");
	}

	@ModelAttribute
	public void loadConfig(Model model) {
		Config config = hello.getConfig();
		if (config != null) {
			model.addAttribute(config);
		}

	}

}
