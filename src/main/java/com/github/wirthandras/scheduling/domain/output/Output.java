package com.github.wirthandras.scheduling.domain.output;

import java.util.List;
import java.util.Map;

public class Output {

	private Map<String, List<String>> scheduled;

	public Map<String, List<String>> getScheduled() {
		return scheduled;
	}

	public void setScheduled(Map<String, List<String>> scheduled) {
		this.scheduled = scheduled;
	}

}
