package com.github.wirthandras.scheduling.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.wirthandras.scheduling.domain.input.SchedulingOuterClass.Scheduling;
import com.github.wirthandras.scheduling.domain.output.Output;
import com.github.wirthandras.scheduling.service.Scheduler;


@RestController
public class Controller {
	
	@Autowired
	private Scheduler scheduler;

	@PostMapping(path = "/api/planning")
	@ResponseBody
	public Output home(@RequestBody Scheduling employee) {
		return scheduler.schedule(employee);
	}

}
