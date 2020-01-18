package com.learn.springCloud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rajes
 * date    Apr 7, 20171:27:33 AM
 *
 */
@RestController
public class WordController {
	private static final Logger log = LoggerFactory.getLogger(WordController.class);
	
	@Value("${words}")
	private String words;

	 @RequestMapping("/")
	  public @ResponseBody String getWord() {
		
	    String[] wordArray = words.split(",");
	    int i = (int)Math.round(Math.random() * (wordArray.length - 1));
	    log.info(String.valueOf(i));
	    log.info(wordArray[i]);
	    return wordArray[i];
	  }
}
