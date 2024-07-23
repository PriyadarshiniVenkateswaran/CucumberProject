package com.pages;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class FirstPage extends BaseClass {

	@FindBy(xpath = "//input[@class='Pke_EE']")
	private WebElement searchText;

	@FindBy(xpath = "//button[@class='_2iLD__']")
	private WebElement searchButton;

	public WebElement getSearchText() {
		return searchText;
	}

	public void setSearchText(WebElement searchText) {
		this.searchText = searchText;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public void setSearchButton(WebElement searchButton) {
		this.searchButton = searchButton;
	}

	public void searchbox(String data) {

		inputKeys(searchText, data);

	}

	public void clickSearchButton() {
		click(searchButton);
	}

}
