FROM maven:3.8-ibmjava-8

WORKDIR /usr/src/app

COPY . .

RUN chmod 007 bind_allure/allure