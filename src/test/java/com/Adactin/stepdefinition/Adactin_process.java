package com.Adactin.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Adactin.Baseclass_Adactin;
import com.Adactin.Helper.File_Readermanager;
import com.Adactin.runner.Adactin_final;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Adactin_process extends Baseclass_Adactin {
	
	public static WebDriver driver = Adactin_final.driver;

		@Given("user can able to launch the url")
		public void user_can_able_to_launch_the_url() throws IOException {
			// driver.get("https://adactinhotelapp.com/index.php");
		  //	getUrl("https://adactinhotelapp.com/index.php");
			String url = File_Readermanager.getnInstance().getInstanceCR().getUrl(); 
			getUrl(url);
		   getmaxi();
		}

		@When("user can able to enter the username in the textbox")
		public void user_can_able_to_enter_the_username_in_the_textbox() {
			WebElement un = driver.findElement(By.xpath("//input[@type='text']"));
	                // un.sendKeys("sriram1999");
		    inputValue(un,"sriram1999");
		}

		@When("user can able to enter the password in the textbox")
		public void user_can_able_to_enter_the_password_in_the_textbox() {
			  WebElement pw = driver.findElement(By.xpath("//input[@type='password']"));
	                  // pw.sendKeys("LS126S");
			  inputValue(pw,"LS126S" );
		   
		}

		@Then("user can able to click login button and it is navigate to nextpage")
		public void user_can_able_to_click_login_button_and_it_is_navigate_to_nextpage() {
			 WebElement lg = driver.findElement(By.xpath("//input[@value='Login']"));
	             // lg.click();
		     clickonElement(lg);
		}

		@When("select the Location in textbox")
		public void select_the_location_in_textbox() {
			 WebElement loc = driver.findElement(By.xpath("//select[@name='location']"));
	          	// Select s = new Select(loc);
	        	// s.selectByIndex(3);
			 getindex(loc, 3);
		}

		@When("select the Hotel in textbox")
		public void select_the_hotel_in_textbox() {
			WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));
	       //	Select s1 = new Select(hotel);
	      // 	s1.selectByVisibleText("Hotel Creek");
			getvisibletext(hotel, "Hotel Creek");

		    
		}

		@When("select the Room Type in textbox")
		public void select_the_room_type_in_textbox() {
			WebElement room = driver.findElement(By.name("room_type"));
	     //  	Select s2 = new Select(room);
	     //  	s2.selectByVisibleText("Standard");
			getvisibletext(room, "Standard");
		}

		@When("select the Number of Rooms in textbox")
		public void select_the_number_of_rooms_in_textbox() {
			WebElement roomnum = driver.findElement(By.name("room_nos"));
	      // 	Select s3 = new Select(roomnum);
	      // 	s3.selectByVisibleText("2 - Two");
			getvisibletext(roomnum, "2 - Two");
		}

		@When("enter the Check In Date")
		public void enter_the_check_in_date() {
			WebElement checkin = driver.findElement(By.id("datepick_in"));
	      // 	checkin.sendKeys("23/04/2023");
			inputValue(checkin, "23/04/2023");
		   
		}

		@When("enter the Check Out Date")
		public void enter_the_check_out_date() {
			WebElement checkout = driver.findElement(By.name("datepick_out"));
	       // checkout.sendKeys("24/04/2023");
			inputValue(checkout,"24/04/2023" );

		}

		@When("select the Adult per Room in textbox")
		public void select_the_adult_per_room_in_textbox() {
			WebElement adult = driver.findElement(By.name("adult_room"));
	        //	Select s4 = new Select(adult);
	       // 	s4.selectByIndex(3);   
			getindex(adult, 3);
		}

		@When("select the Children per Room in textbox")
		public void select_the_children_per_room_in_textbox() {
			WebElement childroom = driver.findElement(By.xpath("//select[@id='child_room']"));
	     //  	Select s5 = new Select(childroom);
	     //  	s5.selectByIndex(4);
		   getindex(childroom, 4);
		}

		@Then("user can able to click Search button and it is navigate to nextpage")
		public void user_can_able_to_click_search_button_and_it_is_navigate_to_nextpage() {
			WebElement search = driver.findElement(By.id("Submit"));
	       // search.click();
		  clickonElement(search);	
		}

		@When("user can able to click the Radio button")
		public void user_can_able_to_click_the_radio_button() {
			WebElement dot = driver.findElement(By.id("radiobutton_0"));
	      //  dot.click();
			clickonElement(dot);
		    
		}

		@Then("user can able to click Continue button and it is navigate to nextpage")
		public void user_can_able_to_click_continue_button_and_it_is_navigate_to_nextpage() {
			WebElement con = driver.findElement(By.xpath("//input[@type='submit']"));
	            // con.click();
			clickonElement(con);
		}

		@When("user can able to enter First name in the textbox")
		public void user_can_able_to_enter_first_name_in_the_textbox() {
			 WebElement fn = driver.findElement(By.name("first_name"));
		       //   fn.sendKeys("saran");
		    inputValue(fn, "saran");
		}

		@When("user can able to enter Last name in the textbox")
		public void user_can_able_to_enter_last_name_in_the_textbox() {
			WebElement ln = driver.findElement(By.name("last_name"));
	          // ln.sendKeys("raj");
			inputValue(ln, "raj");
		}

		@When("user can able to enter Billing address in the textbox")
		public void user_can_able_to_enter_billing_address_in_the_textbox() {
			 WebElement addr = driver.findElement(By.name("address"));
		       // addr.sendKeys("No 43,balaji nagar,2nd cross ,salem"); 
			 inputValue(addr, "No 43,balaji nagar,2nd cross ,salem");
		}

		@When("user can able to enter Credit Card No in the textbox")
		public void user_can_able_to_enter_credit_card_no_in_the_textbox() {
			WebElement cvv = driver.findElement(By.id("cc_num"));
	           // cvv.sendKeys("3452775654327865");
		    inputValue(cvv, "3452775654327865");
		}

		@When("user can able to select Credit Card Type in the textbox")
		public void user_can_able_to_select_credit_card_type_in_the_textbox() {
			WebElement ct = driver.findElement(By.name("cc_type"));
	       // Select s6 = new Select(ct);
	       //	s6.selectByIndex(3);
			getindex(ct, 3);
		}

		@When("user can able to select Expiry Month in the textbox")
		public void user_can_able_to_select_expiry_month_in_the_textbox() {
			 WebElement month = driver.findElement(By.id("cc_exp_month"));
		      //  Select s7 = new Select(month);
		      // 	s7.selectByVisibleText("May");
			 getvisibletext(month,"May" );
		}

		@When("user can able to select Expiry Year in the textbox")
		public void user_can_able_to_select_expiry_year_in_the_textbox() {
			WebElement year = driver.findElement(By.id("cc_exp_year"));
	          // Select s8 = new Select(year);
	         // s8.selectByValue("2020");
			getvalue(year, "2020");
		}

		@When("user can able to enter CVV in the number textbox")
		public void user_can_able_to_enter_cvv_in_the_number_textbox() {
			WebElement cn = driver.findElement(By.name("cc_cvv"));
	       // cn.sendKeys("754");
			inputValue(cn,"754" );
		}

		@Then("user can able to click the Book button and it is navigate to nextpage")
		public void user_can_able_to_click_the_book_button_and_it_is_navigate_to_nextpage() {
			 WebElement book = driver.findElement(By.name("book_now"));
		      //  book.click();
			 clickonElement(book);
		}

		@Then("user can able to click the My Itinerary button and it is navigate to nextpage")
		public void user_can_able_to_click_the_my_itinerary_button_and_it_is_navigate_to_nextpage() {
			 WebElement booked = driver.findElement(By.xpath("//input[@type='button']"));
		         // booked.click();
              clickonElement(booked);
		}

		@Then("user can able to click the Logout button")
		public void user_can_able_to_click_the_logout_button() {
			WebElement finish = driver.findElement(By.xpath("//a[text()='Logout']"));
	       // finish.click();
			clickonElement(finish);
		}

}
