# menu-project

### Devolution 2022 first group project

#### First Part of the Menu Project

<pre>
As a user we want to have a console application
with interactive input and output to manage our
users.

We need to realize:

1.  Register process - add a new user in userList.
    Every user must have filled all its fields.
    Fields name, lastname need to have a validation:
    * length not more than 25 symbols
    * does not begin with digit or special character
    * First character needs to be converted in uppercase
    Field password needs to have a validation:
    * length between 8 and 20 symbols
    * must have digits, special characters and letters
    Field age needs to have a validation:
    * not less than 0 and not more than 200
    Field money needs have a validation:
    * not less than 0
    Field username should be unique in list,
    different users does not have same username.
    If validation fails we need to print the error.

2.  Login process - we need to check the user password and
    username. If login fails we need to print the error.

3.  Add user process - after login user can add a new user like 
    in register process, same validations should be. If user is not 
    authorized this option should print the error.

4.  Print all users process - we need to print all users from 
    the list in console.
</pre>



