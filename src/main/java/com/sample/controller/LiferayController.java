package com.sample.controller;

import java.util.Date;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

/**
 * Controller
 *
 * @author Vianney FAIVRE
 */
@Controller
@RequestMapping("VIEW")
public class LiferayController {

	/**
	 * Default render phase
	 */
	@RenderMapping
	public String renderLandingPage(Model model, PortletRequest portletRequest, PortletResponse portletResponse) {

		model.addAttribute("today", new Date());

		return "demo-page";
	}
}
