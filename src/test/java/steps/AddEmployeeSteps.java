package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.ConfigReader;

public class AddEmployeeSteps extends CommonMethods {

    @Given("user is navigated to HRMS application")
    public void user_is_navigated_to_hrms_application() throws InterruptedException {

        openBrowserAndLaunchApplication();
    }

    @When("user enters valid admin username and password")
    public void user_enters_valid_admin_username_and_password() throws InterruptedException {

        sendText(login.usernameTextField, ConfigReader.getPropertyValue("username"));
        sendText(login.passwordTextField, ConfigReader.getPropertyValue("password"));

    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() throws InterruptedException {
        click(login.loginButton);
    }

    @Then("admin user is successfully logged in")
    public void admin_user_is_successfully_logged_in() {
        System.out.println("Test passed");
    }

    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
        click(dash.pimOption);
    }

    @When("user clicks on add employee option")
    public void user_clicks_on_add_employee_option() {
        click(dash.addEmployeeOption);
    }

    @When("user enters firstName , middleName , and lastName")
    public void user_enters_first_name_middle_name_and_last_name() {
        sendText(aep.firstName, "Jason");
        sendText(aep.middleName, "Jeremy");
        sendText(aep.lastName, "Kaminsky");
    }

    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        click(aep.saveButton);
    }

    @Then("employee added successfully")
    public void employee_added_successfully() {
        //homework - verify added employee
        System.out.println("Employee added");
    }

}
