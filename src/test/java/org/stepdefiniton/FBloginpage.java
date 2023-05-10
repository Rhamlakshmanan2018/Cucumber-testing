package org.stepdefiniton;

import org.base.Baseclass;
import org.fbpojo.fblogin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FBloginpage extends Baseclass {
	fblogin f;

	@Given("To launch the chromebrowser and maximise window")
	public void to_launch_the_chromebrowser_and_maximise_window() {
		launchBrowser();
		windowmaximize();
	}

	@When("To launch the url of the facebook application")
	public void to_launch_the_url_of_the_facebook_application() {
		launchurl("https://en-gb.facebook.com/");
	}

	@When("To pass valid username in email field")
	public void to_pass_valid_username_in_email_field() {
		f = new fblogin();
		passText("rhamlakshmanan@gmail.com", f.getEmail());
	}

	@When("To pass valid password in password field")
	public void to_pass_valid_password_in_password_field() throws InterruptedException {
		Thread.sleep(2000);
		f = new fblogin();
		passText("", f.getPassword());
	}

	@When("To click the login button")
	public void to_click_the_login_button() throws InterruptedException {
		Thread.sleep(2000);
		f = new fblogin();
		click_btn(f.getLogin());
	}

	@When("To check whether navigate to the home page or not")
	public void to_check_whether_navigate_to_the_home_page_or_not() {
		System.out.println("To check the login page credentinal");
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		closeEntireBrowse();
	}

}
