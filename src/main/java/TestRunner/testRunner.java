package TestRunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		 features="E:\\Praveen_Automation\\Cucumber_BDD\\Cucumber_BDD\\src\\main\\java\\Features\\TaggedHooks.feature",
		 glue={"stepDefination"},
		 format={"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_output/cucumber.xml"},
		 monochrome=true,
		 strict=true,
		 dryRun=false,
		 tags={"~@smokeTest","~@RegressionTest","~@End2EndTest"}
		 )
 public class testRunner
{

}

   //OR --> tags={"@smokeTest,@RegressionTest"} --> Executes all tests as tagged @SmokeTest OR @RegressionTest
  //AND --> tags={"@smokeTest" ,"@RegressionTest"} --> Executes all tests as tagged @SmokeTest AND @RegressionTest

  //How to Ignore a specific Test case
  // use " ~ " symbol like tags={"~@smokeTest","@RegressionTest","@End2EndTest"}
  // here @smokeTest will ignored


