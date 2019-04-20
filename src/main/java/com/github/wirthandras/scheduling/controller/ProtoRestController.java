package com.github.wirthandras.scheduling.controller;

import java.io.IOException;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProtoRestController {

	private final String PROTOBUF_MEDIA_TYPE_VALUE = "text/plain";

	@GetMapping("/api/Scheduling.proto")
	@ResponseBody
	public ResponseEntity<InputStreamResource> getApi() throws IOException {
		 ClassPathResource pdfFile = new ClassPathResource("Scheduling.proto");
		 
		    return ResponseEntity
		            .ok()
		            .contentLength(pdfFile.contentLength())
		            .contentType(MediaType.parseMediaType(PROTOBUF_MEDIA_TYPE_VALUE))
		            .header("Content-Disposition", "inline; filename=" + "Scheduling.proto")
		            .body(new InputStreamResource(pdfFile.getInputStream()));
	}

}
