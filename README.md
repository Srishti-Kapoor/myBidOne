# myBidOne Automation Project : What it does ?
myBidOne uses selenium cucumber for writing automation tests in Java. It contains
5 test cases to cover the "cart" and "search" feature of myBidOne website.



## Technology/Framework used 
+ Java is used as a language  
+ Intellij is used to write the code 
+ Maven is used for managing dependencies and building the project
+ Cucumber is used to implement the BDD approach
+ Implemented parallel execution 
+ FindWebElement class is behaving as wrapper class to reduce the duplication in code and also to ease the readability . 
+ Pico container is used for dependency injection
+ Design : Customise the Page object model by adding an extra layer in that( Action class)
+ Implemented reporting through surefire 

## Installation

+ Clone the respective repository or download zip. 
  Repo's Link: https://github.com/Srishti-Kapoor/myBidOne.git
    
    
## Test Run

### Run through Command prompt 
+ Download Java and set the environment variables(System variables) - JAVA_HOME (Enter the path for JDK)
+ Download Maven( Link : https://maven.apache.org/download.cgi)
+ Unzip to a folder on your computer
+ Add maven to the path variable
  - Add M2_HOME and MAVEN_HOME in the environment variable(System variable) . Enter a path of Maven folder in both of them.
+ Download/Clone the automation project
+ Open a command prompt window at the folder where Pom file resides
+ Execute command: mvn test -DtagName=@parallel "-Dbrowser=CHROME"

### Run through Intellij idea (IDE)

### Pre-requisites
+ Intellij
+ IntelliJ  Plugins
  - Maven
  - Cucumber
  
Download Maven( Link : https://maven.apache.org/download.cgi)
+ Unzip to a folder on your computer
+ Add the Maven to the path variable
+ Download/Clone the automation project
+ Open project on IDE(Intellij)
+ Build the Project (Build->BuildProject)
+ Run the Test case (Run-> Run either feature file/run an individual scenario)

## Test Report

+ Navigate to Target folder and open surefire report to see the detailed level 
test case execution report
  
  Path : myBidOne -> target folder->surefire-reports
