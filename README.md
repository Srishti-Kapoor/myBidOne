# myBidOne
myBidOne uses selenium cucumber for writing automation tests in Java.

## Features
+ Java is used as a language  
+ Intellij is used to write the code 
+ Maven is used for manage dependencies and building the project
+ Cucumber is used to implement the BDD approach
+ Implemented Parallel execution 
+ FindWebElement class is behaving as wrapper class to reduce the duplication in code and also to ease the readability . 
+ Pico container is used for dependency injection
+ Design : Customise the Page object model by adding an extra layer in that( Action class)



## Installation
### Pre-requisites
+ Java
+ Maven
+ Intellij 
+ IntelliJ  Plugins
    - Maven
    - Cucumber
    
### Setting up selenium-cucumber-java
+ Install Java and set path
+ Install Maven and set path
+ Clone the respective repository or download zip. 
  - maven : https://github.com/Srishti-Kapoor/myBidOne.git
    
    
## Test Run

### Run through Command prompt 
+ Download Maven( Link : https://maven.apache.org/download.cgi)
+ Unzip to a folder on your computer
+ Add maven to the path variable(Please ensure Maven Home and bin are set in system variable)
+ Download/Clone the automation project
+ Open a command prompt window at the folder where Pom file resides
+ Execute command: mvn test -DtagName=@parallel "-Dbrowser=CHROME"

### Run through Intellij idea (IDE)
Download Maven( Link : https://maven.apache.org/download.cgi)
+ Unzip to a folder on your computer
+ Add the Maven to the path variable
+ Download/Clone the automation project
+ Open project on IDE(Intellij)
+ Build the Project (Build->BuildProject)
+ Run the Test case (Run-> Run either feature file/run an individual scenario)

