package com.info.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Hi {

	// @Autowired
	// HiService goodMorningService;
	// HiService goodNightService;
	/*
	 * You can use the Interface name here in the Autowired annotation along with
	 * the implementation class name but in lower characters because its an object
	 */

	@Autowired
	@Qualifier(value = "goodMorningService")
	HiService service;

	public void dummyTest() {
		// System.out.println(goodMorningService.sayHi());
		// System.out.println(goodNightService.sayHi());
		System.out.println(service.sayHi());

	}

}
