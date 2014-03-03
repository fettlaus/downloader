package de.fettlaus.downloader.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import de.fettlaus.downloader.service.UserService;
import de.fettlaus.downloader.service.model.User;

@Controller
@SessionAttributes({ "user", "userList" })
public class SessionController {

	@Inject
	protected UserService userService;

	@ModelAttribute
	public void newUser(Model model) {
		if (!model.containsAttribute("user"))
			model.addAttribute("user", new User());
	}

}
