# TechEazy Assessment - Spring Boot Project

## Prerequisites
- Java 21
- Maven 3.9.8 must be installed
- Eclipse (Optional)
- Git
- curl 

## Getting Started

### Step 1: Clone the repository

Clone the below git repository with the help of the following command:

git clone https://github.com/tanishk141/TechEazy.git


### Step 2: Go to the directory

Navigate to the TechEazy directory with the help of the following command:

cd TechEazy/


### Step 3: Build the application

Build the application with the following Maven command:

mvn clean install -D maven.test.skip


### Step 4: Run the application

After a successful build, run the application with the following command:

#### Command to run on a Windows-based system:

java -cp "target/assessment-0.0.1-SNAPSHOT.jar;target/lib/*" com.techeazy.AppRunner


#### Command to run on a Linux-based distribution:

java -cp "target/assessment-0.0.1-SNAPSHOT.jar:target/lib/*" com.techeazy.AppRunner


### Step 5: Check the application

Verify whether the application is running with the following REST endpoint:

curl http://localhost:8080/app/ping
