package com.info.demo2;

import org.springframework.stereotype.Component;

@Component
public class GoodNightService implements HiService {

	public String sayHi() {
		return "Good Night";
	}

}
