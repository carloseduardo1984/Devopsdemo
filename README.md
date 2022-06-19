# Devopsdemo

DevOps demo - ![Badge em Desenvolvimento](http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=GREEN&style=for-the-badge)

# Summary
This is an example BDD test automation Project for Java using the Cucumber-JVM framework and Cucumber report on output folder.
It contains a simple behavior scenario that performs a basic valid links verification.
This is an example BDD test automation Project for Java using the Cucumber-JVM framework, with Cucumber report.
It contains a simple behavior scenario that performs a basic valid links on webpage and Jenkins CI/CD with Maven trigger.

### Purpose
This project was developed by Carlos Eduardo de Oliveira SQA - CTFL.
This project was developed by Carlos Eduardo de Oliveira to show a simple demo with Jenkins Job trigged by Maven process, for CI/CD applications.

### Version
This project uses Cucumber-JVM 2.0.  -> `https://cucumber.io/`
If using IntelliJ IDEA, please make sure to update to the latest version of the

[Cucumber for Java plugin] `(https://plugins.jetbrains.com/plugin/7212-cucumber-for-java).`
Delete any old Run Configurations if updating, as well.

### Web Driver Setup - > `https://chromedriver.chromium.org/downloads`
This project uses Selenium WebDriver to interact with the Chrome web browser.
In order for the tests to work, [ChromeDriver] `(https://sites.google.com/a/chromium.org/chromedriver/)`
must be installed on the test machine and accessible from the system PATH.
(This means that it must be accessible from the command line.)
The source code may easily be changed to work with any other web browser.
Just remember to install the required web drivers.

### Running Tests
This project uses [Maven] `(https://maven.apache.org/).`
To run tests, simply run "mvn clean test".

### Practice Exercises
To practice BDD and automation, try the following exercises:
-1. The assertion for the "results for ___ are shown" step checks only the page title.
   Add more comprehensive assertions to strengthen the test.
-2. Add a new scenario to search any website.
-3. Add a new scenario to perform searches directly using URL query parameters.
-4. Add a new feature for basic tests against Wikipedia using a new page object class,
   a new step definition class, and dependency injection.
   * Picking a language from the home page.
   * Searching for articles.
   * Verifying that embedded links navigate to the correct articles.
   * Viewing page history.
-5. Make it possible to choose the web browser using a properties file.
   Classes to read the properties file and construct the appropriate web driver
   should be put in the framework package.
-6. Write a new feature for basic service-level testing.
-7. Create separate test runners that partition the set of features using tags.
-8. Add reports [Extent Reports](http://extentreports.com/).
-9. Tested with Maven jobs on Jenkins 2.303.1 (witrh the plugins: Maven, Email extension, and Git).

![1](https://user-images.githubusercontent.com/33332202/132147421-3462d342-8163-490a-9c75-45d961be150a.PNG)

Reports
-------------------------
![image](https://user-images.githubusercontent.com/33332202/132152161-35dcb9f3-6d36-47d5-a7d6-26b1e3f6993b.png)


## NEXT STEPS FOR COMPLETE CI/CD AUTOMATION
-----------------------------------------------------------------------------------------------------------------
![PIPELINES](https://user-images.githubusercontent.com/33332202/144241965-89fe6d0c-65be-4bb5-b54f-cc022ea7330d.png)

