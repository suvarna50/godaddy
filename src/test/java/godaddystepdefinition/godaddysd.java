package godaddystepdefinition;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.godaddybase;
import pages.godaddylocators;

public class godaddysd extends godaddybase {
	godaddylocators godaddy;
	@Given("launch the browser and open the site")
	public void launch_the_browser_and_open_the_site() {
	    setup();
	}

	@Then("Click on the first link from the menu, it will open up the sub-menu with multiple sub-menu links")
	public void click_on_the_first_link_from_the_menu_it_will_open_up_the_sub_menu_with_multiple_sub_menu_links() throws InterruptedException {
		Thread.sleep(10000);
		godaddy = new godaddylocators();
		
		btnClick(godaddy.getDomain());
		Thread.sleep(10000);
		btnClick(godaddy.getFirstsubmenu());
	}

	

	@Then("Get the page title and validate it")
	public void get_the_page_title_and_validate_it() {
		getpagetitle();
		
	}

	@Then("Go back to the home page by clicking on the GoDaddy logo.")
	public void go_back_to_the_home_page_by_clicking_on_the_go_daddy_logo() throws InterruptedException {
		Thread.sleep(10000);
		logoclick(godaddy.getLogo());
	}

	
	}



