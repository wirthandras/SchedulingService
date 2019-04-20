package com.github.wirthandras.scheduling.service;

import org.springframework.stereotype.Service;

import com.github.wirthandras.scheduling.domain.input.SchedulingOuterClass.Scheduling;
import com.github.wirthandras.scheduling.domain.output.Output;

@Service
public class Scheduler {

	public Output schedule(Scheduling employee) {
		return new Output();
	}

}
