# GradeCalculator

GradeCalculator is a tool used to calculate your GPA. It offers a way to store classes, usernames/passwords, assignments, grades, and weights in table databases. ***Currently, there is no installer for this application meaning the directory for the embedded database cannot be set up on other machines. I am working to create an installer for this application that sets everything up for the user.***

## Technologies

The application utilizes [Apache Derby](https://db.apache.org/derby/) to create embedded databases. The application itself is in Java 17 and uses version 10.16.1.1 of Apache Derby.

## GUI for GradeCalculator
### Sign-In or Sign-Up
![Screenshot (297)](https://github.com/malik-jg/GradeCalculator/assets/119100640/8bcd6447-8ee6-436c-ac2c-de76b2e4b9b2)

Upon opening the application, the user can sign in to a current existing account or create a new account. Usernames must be unique. When a user's account is created, their name, username, password, and GPA (default to 0) are stored in a database table called **USERPASS**.
Users who sign into an existing account have all their information loaded upon reaching the home screen.

### Home Screen
![Screenshot (299)](https://github.com/malik-jg/GradeCalculator/assets/119100640/5176ced4-9203-490c-b903-bfb1e73dd34c)

On the home screen, the user's classes and current GPA are shown. The bottom left text box is used to type the names of classes they want to add, edit, or remove. Class names must be unique. Upon signing out,  all the user's classes, assignments, and grades are added or updated in the databases. A database table called *(username)-Classes* holds all the classes a user is in and their grade for those classes. Each class in that table corresponds to another table called *(username)-(classname)* which holds all the assignments, grades, and weights of assignments in that class.

### Class Screen
![Screenshot (300)](https://github.com/malik-jg/GradeCalculator/assets/119100640/78228729-8373-43c5-bb8d-77034f4d5bd7)

The class screen is where a new class is added or an existing class is edited. The *category* column is for the types of assignments in a class such as tests, homework, projects, etc. The values in the *grade* column are the grades for the assignments in the *category* column. The *weight* column is how heavily those assignments are weighed in the total grade. After adding an assignment, the user must hit update to update their grade for that class. If the sum of all weights is not 100, then the missing weight will automatically be added and treated as if the grade was 100. To remove an assignment, the user simply types in the name of the assignment they want to remove in the *category* column and hit the remove button.

## Final Notes

I will figure out how to create an installer that automatically creates a directory with the database tables, Apache Derby files, and JAVA files so that users can begin to utilize this application. Alternatively, I might also try to create a network database instead to avoid the troubles of having to set up directories for files. Also, I will try to improve the look of the application.
