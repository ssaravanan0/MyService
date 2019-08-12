
package com.saran.ws;

import com.saran.bean.MyBean;

public class MyService {

	public String getData(String input) {
		return "Hello " + input;
	}

	public MyBean getObjectData(MyBean myBean) {

		String name = myBean.getName();
		int id = myBean.getId();
		myBean.setId(id + 100);
		myBean.setName("Output: " + name);

		return myBean;
	}
}
