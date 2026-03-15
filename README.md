### Get started
  - docker run --name postgres -e POSTGRES_PASSWORD=mangalsathi_password -e POSTGRES_DB=mangalsathi_db -e POSTGRES_USER=mangalsathi_user -p 5432:5432 -d postgres:18.1-alpine3.22
  - docker exec -it postgres psql -U mangalsathi_user -d mangalsathi_db
  - show tables : \dt
### OpenID spec
![img_7.png](img_7.png)

### Flow
  - When you are authenticated but don't have right authority.  
    ![img.png](img.png)
  - Redirect back to browser and negotiate to authorzation server and return auth code.  
    ![img_1.png](img_1.png)  
  - Exchange auth code for access token and refresh token.  
    ![img_2.png](img_2.png)
  - Access protected resource with access token.  
    ![img_3.png](img_3.png)

### Architecture
- Spring Security OAuth2 Resource Server
- Spring Security OAuth2 Client
- Spring Security OAuth2 Authorization Server
![img_5.png](img_5.png)




### Single Tenant vs Multi Tenant
![img_6.png](img_6.png)


### Code
- Allow multiple issuer in SecurityConfig.java
![img_8.png](img_8.png)  
![img_9.png](img_9.png)
  - AuthorizationConfiguration.java
  ![img_10.png](img_10.png) 