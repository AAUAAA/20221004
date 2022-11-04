package com.geunho.study28;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.geunho.study28.Dao.ContentDao;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	ContentDao dao;
	
	
	@Autowired
	public void setDao(ContentDao dao) {
		this.dao = dao;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		
		return "list";
	}
	
	@RequestMapping(value = "list")
	public String list() {
		
		
		
		return "list";
	}
	
	
	@RequestMapping(value = "writeForm")
	public String writeForm() {
		return "writeForm";
	}
	
	@RequestMapping(value = "write")
	public String write(HttpServletRequest request) {
		
		
		String mwriter = request.getParameter("mwriter");
		String mcontent = request.getParameter("mcontent");
		
		dao.writeDao(mwriter, mcontent);
		
		
		return "redirect:list";
	}
	
	@RequestMapping(value = "delete")
	public String delete() {
		return "redirect:list";
	}
	
}
