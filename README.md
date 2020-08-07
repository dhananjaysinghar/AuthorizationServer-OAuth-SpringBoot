# AuthorizationServer-OAuth-SpringBoot

## Register a user
~~~
curl --location --request POST 'http://localhost:8080/oauth/users' \
--header 'Content-Type: application/json' \
--data-raw '{
  "firstName": "Dhananjaya",
  "lastName": "Samanta Singhar",
  "password": "Real@123",
  "userName": "dhananjaya"
}'

~~~

## Get Access Token
~~~
curl --location --request POST 'http://localhost:8080/oauth/token?username=dhananjaya&password=Real@123&grant_type=password' \
--header 'Authorization: Basic dGVzdDp0ZW1w'
~~~

## Get Access Token from Refresh Token
~~~
curl --location --request POST 'http://localhost:8080/oauth/token?grant_type=refresh_token&refresh_token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX25hbWUiOiJhZG1pbiIsInNjb3BlIjpbInJlYWQiLCJ3cml0ZSJdLCJhdGkiOiI0YTI3YzNhMS0wOTZlLTQ3NGQtOTFiMi1lYWY5OTE3MGY5MGEiLCJleHAiOjE1OTY3ODE4NDIsImF1dGhvcml0aWVzIjpbIlJPTEVfQURNSU4iLCJST0xFX1VTRVIiXSwianRpIjoiZDEyMzZlZjMtZWI4Zi00YjRmLTg2ZTQtMjhmZjQwMTc5MzUwIiwiY2xpZW50X2lkIjoidGVzdCJ9.p2DJwNt70vnNp-bi2RstWr_y86-6YBaE_8YMwD5xj04' \
--header 'Authorization: Basic dGVzdDp0ZW1w'
~~~

## Validate Access Token 
~~~
curl --location --request POST 'http://localhost:8080/oauth/check_token?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1OTY3ODIyNTksInVzZXJfbmFtZSI6ImRoYW5hbmpheWEiLCJhdXRob3JpdGllcyI6WyJST0xFX1VTRVIiXSwianRpIjoiMzY4MTcwZjgtOWRhMS00MGJjLTk3NzctNTQ1NGJmOTg0NmE1IiwiY2xpZW50X2lkIjoidGVzdCIsInNjb3BlIjpbInJlYWQiLCJ3cml0ZSJdfQ.rkr2DATNGiyUKurYLFQuNo_9a4RK9i_dSfsoh8htIXQ' \
--header 'Authorization: Basic dGVzdDp0ZW1w'
~~~


Note: When we will generate a access token through refresh token automatically old accesstoken will get blacklist

