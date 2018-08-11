package com.cg.spring.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.spring.dto.ScheduledSessions;
import com.cg.spring.service.ScheduleService;

@Controller
public class ScheduleController {
	@Autowired
	ScheduleService scheduleService;
	
	@RequestMapping(value="/getSession",method=RequestMethod.GET)
	public String myEmployee(){
		return "redirect:/viewSchedule";
		
	}
	
	
	@RequestMapping(value="/viewSchedule",method=RequestMethod.GET)
	
   public ModelAndView viewScheduledSessions(@ModelAttribute("obj") ScheduledSessions emp){
   List<ScheduledSessions> list=scheduleService.viewScheduledSessions();		
	return new ModelAndView("ScheduledSessions","sessiondata",list);
	 
}
	
	@RequestMapping(value="/enroll/{id}" )
	public ModelAndView getUpdateEmployee( @PathVariable("id") int id) {
		
		ScheduledSessions scheduledSessions= scheduleService.searchScheduledSession(id);
			
		return new ModelAndView("Success","modeldata",scheduledSessions);
		
	}
	
	
}