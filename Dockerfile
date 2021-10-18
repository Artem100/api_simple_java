FROM maven:3.8-ibmjava-8

WORKDIR /usr/src/app

COPY . .
RUN chmod 100 allure-2.15.0/bin/allure
CMD mvn -q test
CMD ./allure-2.15.0/bin/allure generate "target/allure-results" -c -o "/bind"
