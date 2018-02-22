package com.info.demo2;

import org.springframework.stereotype.Component;

@Component
public class GoodMorningService implements HiService {

	public String sayHi() {
		return "Good Morning";
	}

}
