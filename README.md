# weather-app
An application to display temperatures and weather data for any city entered by user.

## Description
This App is a maven project based on Spring framework.\
The App's backend creates a rest end-point which uses Restful spring annotations.\
The App runs on maven configured embedded tomcat 7.

## Overview
The App consists of the following modules:
1. Spring RestFul Service at backend 
2. HTML, CSS and Javascript(Jquery) at frontend.
3. A free weather API provided by (https://openweathermap.org/api) is consumed at repository level.
4. The frontend interacts with backend at rest endpoint: "https://api.openweathermap.org/data/2.5/weather"
