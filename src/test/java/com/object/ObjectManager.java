package com.object;

import com.pages.FirstPage;

public class ObjectManager {

	private FirstPage firstPage;

	public FirstPage getFirstPage() {
		return (firstPage == null ? new FirstPage() : firstPage);
	}

}
