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

Request:
-----------
curl --location --request POST 'http://localhost:8080/oauth/token?username=dhananjaya&password=Real@123&grant_type=password' \
--header 'Authorization: Basic dGVzdDp0ZW1w'


Response:
-----------
{
    "access_token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1OTY3ODIzOTYsInVzZXJfbmFtZSI6ImRoYW5hbmpheWEiLCJhdXRob3JpdGllcyI6WyJST0xFX1VTRVIiXSwianRpIjoiNTFkZTEzNDYtMzRjNS00MThhLWI2ZmYtODU4YTU3OTc3OTQxIiwiY2xpZW50X2lkIjoidGVzdCIsInNjb3BlIjpbInJlYWQiLCJ3cml0ZSJdfQ.lcShaWVmARQzvZkT1R_F9s6L0wBVKnfrE0NZEC00tEk",
    "token_type": "bearer",
    "refresh_token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX25hbWUiOiJkaGFuYW5qYXlhIiwic2NvcGUiOlsicmVhZCIsIndyaXRlIl0sImF0aSI6IjUxZGUxMzQ2LTM0YzUtNDE4YS1iNmZmLTg1OGE1Nzk3Nzk0MSIsImV4cCI6MTU5Njc4Mzg5NiwiYXV0aG9yaXRpZXMiOlsiUk9MRV9VU0VSIl0sImp0aSI6ImY2MTIzNmQ0LWY5YTItNGY2Ni04NGVlLWQ0ZTA3ZjUxZDQzZiIsImNsaWVudF9pZCI6InRlc3QifQ.9teUKWXfodg47O7t6BZQi_GLm9Ox5rmDYmhRlKRsYI0",
    "expires_in": 299,
    "scope": "read write",
    "jti": "51de1346-34c5-418a-b6ff-858a57977941"
}


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

