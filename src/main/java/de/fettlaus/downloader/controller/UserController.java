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
@RequestMapping(value = "/user")
public class UserController extends SessionController {

	protected final Log logger = LogFactory.getLog(getClass());

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView handleRequest(@ModelAttribute("user") User user,
			ModelMap model) throws ServletException, IOException, SQLException {
		model.addAttribute(userService.getUsers());
		return new ModelAndView("userlist");
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView handlePost(@ModelAttribute("user") User user,
			ModelMap model) {
		userService.newUser(user.getName());
		model.addAttribute(userService.getUsers());
		return new ModelAndView("userlist");
	}

	@RequestMapping(value = "/{usrid}/delete")
	public ModelAndView handleUsrDelete(@PathVariable("usrid") long usrid,
			Model model) {
		userService.deleteuser(usrid);
		model.addAttribute(userService.getUsers());
		return new ModelAndView("userlist");
	}

	@RequestMapping(value = "/{usrid}/adminify")
	public ModelAndView handleMakeAdmin(@PathVariable("usrid") long usrid,
			Model model) {
		Config config = userService.makeAdmin(usrid);
		model.addAttribute(userService.getUsers());
		if (config != null)
			model.addAttribute(config);
		return new ModelAndView("userlist");
	}

	@ModelAttribute
	public void loadConfig(Model model) {
		Config config = userService.getConfig();
		if (config != null) {
			model.addAttribute(config);
		}

	}

}
