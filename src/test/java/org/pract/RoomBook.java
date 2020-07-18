package org.pract;

import java.security.Key;
import java.util.Scanner;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.pages.ConfirmRoom;
import org.pages.Gmail;
import org.pages.GmailPass;
import org.pages.Login;
import org.pages.OpenMail;
import org.pages.Register;
import org.pages.RoomDetails;

public class RoomBook  extends BaseClass{

	public static void main(String[] args) {
		launch();
		implicitWait();
		loadUrl("http://adactinhotelapp.com/");	
		Login l=new Login();
		
		
		insert(l.getTxtUser(), "Abishapraba");
		insert(l.getTxtPass(), "shaabi97");
		click(l.getBthLogin());
		
		RoomDetails rd= new RoomDetails();
		select1OptionValue(rd.getOptLocation(), "Paris");
		select1OptionValue(rd.getOptHotel(), "Hotel Sunshine");
		select1OptionValue(rd.getOptRoomType(), "Super Deluxe");
		select1OptionValue(rd.getOptRoomNos(),"1");
		insert(rd.getTxtInDate(),"21/07/2020");
		insert(rd.getTxtOutDate(), "22/07/2020");
		
		select1OptionValue(rd.getOptAdultNos(), "2");
		select1OptionValue(rd.getOptChildNos(), "0");
		click(rd.getBtnSearch());
		
		ConfirmRoom cr= new ConfirmRoom();
		
		click(cr.getBtnRoom());
		click(cr.getBtnCont());
		
		
		/*Register r=new Register();
		insert(r.getTxtuser(), "Abishapraba");
		insert(r.getTxtPass(), "shaabi97");
		insert(r.getTxtRePass(), "shaabi97");
		insert(r.getTxtFullName(), "Abishaprabakaran");
		insert(r.getTxtEmail(), "abishapraba97@gmail.com");
		
		
		click(r.getTxtCap());
		Scanner s=new Scanner(System.in);
		String cap = s.next(); 
		
		insert(r.getTxtCap(),cap );
		
		
		
		click(r.getChckTnc());
		click(r.getBtnReg());*/
		
	
		
		
	

	}
	

}
