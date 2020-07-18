package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.pract.BaseClass;

public class RoomDetails extends BaseClass{

	public RoomDetails() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location") private WebElement optLocation;
	
	@FindBy(id="hotels")  private WebElement optHotel;
	
	@FindBy(id="room_type") private WebElement optRoomType;
	
	@FindBy(name="room_nos") private WebElement optRoomNos;
	

	@FindBy(id="datepick_in") private WebElement txtInDate;
	
	@FindBy(id="datepick_in") private WebElement txtOutDate;
	
	@FindBy(id="adult_room") private WebElement optAdultNos;
	
	@FindBy(id="child_room")  private WebElement optChildNos;
	
	@FindBy(id="Submit")  private WebElement btnSearch;
	
	@FindBy(id="Reset") private WebElement btnReset;
	
	
	public WebElement getOptLocation() {
		return optLocation;
	}

	public WebElement getOptHotel() {
		return optHotel;
	}

	public WebElement getOptRoomType() {
		return optRoomType;
	}

	public WebElement getOptRoomNos() {
		return optRoomNos;
	}

	public WebElement getTxtInDate() {
		return txtInDate;
	}

	public WebElement getTxtOutDate() {
		return txtOutDate;
	}

	public WebElement getOptAdultNos() {
		return optAdultNos;
	}

	public WebElement getOptChildNos() {
		return optChildNos;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public WebElement getBtnReset() {
		return btnReset;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
