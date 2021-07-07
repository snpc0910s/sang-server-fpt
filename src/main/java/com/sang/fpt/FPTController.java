package com.sang.fpt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/fpt")
public class FPTController {
	private Logger logger = LoggerFactory.getLogger(FPTController.class);
	
	@PostMapping("/sell")
	public ResponseEntity<InfoSellStockDTO> sellAction(@RequestBody InfoSellStockDTO data){
		try {
			this.logger.info(data.toString());
			return ResponseEntity.ok().body(data);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(null);
		}
	}
}
