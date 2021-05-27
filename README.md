# This is a coding exercise for talech technical screening interview.

The goal is to complete a Spring Boot application with an API endpoint to fetch a user based off of an id.

Once completed, with these are the expected responses:

http://localhost:9040/user/1
```
{
  "id": 1,
  "name": "Leanne Graham",
  "username": "Bret",
  "email": "Sincere@april.biz"
}
```

http://localhost:9040/user/2
```
{
  "id": 2,
  "name": "Ervin Howell",
  "username": "Antonette",
  "email": "Shanna@melissa.tv"
}
```

There are two functions that you are asked to complete.
1. Create a REST GET function in the UserController which takes an id as a path parameter.
2. Complete the getUser function in the UserService, more info in the comments of that file.

Start the application with `mvn spring-boot:run` and test by hitting the links above in the browser or with curl.

You may refer to online resources such as Spring Boot documentation.
