# Demo DAO JDBC
![Static Badge](https://img.shields.io/badge/license-MIT-green?link=https%3A%2F%2Fgithub.com%2FRafa-Hoff%2Fdemo-dao-jdbc%2Fblob%2Fmain%2FLICENSE)

# About the project
My second project in [Professor Nelio Alves](https://github.com/acenelio) Java course.

The project consists of implementation of a seller in the respective department with search resources:
- findById, findAll, findByDepartment.
  
Manipulating data with:
- insert, delete, and update.

Using MySQL database with DAO to implements each entity, an object responsible for accessing the database and DAOFactory to implement the Dependency Injection concept.

# Resources Used

- JAVA 17
- JDBC
- MySQL 8

# How to test the program:

### Download and install:
- IDE of your preference (IntelliJ, Eclipse, etc.);
- [Java 17](https://www.azul.com/downloads/#downloads-table-zulu);
- [MySQL 8](https://dev.mysql.com/downloads/mysql/);

### Clone the project:
- Open the Git bash inside a folder of your preference;
- Writes and run the comand:
  ```
  git clone git@github.com:Rafa-Hoff/demo-dao-jdbc.git
  ```
- The project must be in your computer now.

### Configuring MySQL for the project:
- Open MySQL Workbench;
- Select a user with all administrative roles;
- Create a new database with the command:
  ```
  Create database coursejdbc;
  ```
- Select the database created;
- In MySQL, go to "file" options and selects "Open SQL script";
- In the folder of the project, search for "database.sql" and open it;
- You will see the commands to create the tables with the data, just run it.

### Last configurations:
- Open a IDE;
- Open the project folder;
- [Download the mysql connector](https://dev.mysql.com/downloads/connector/j/);
- You need to add the mysql connector on your IDE librarie;
- Now search for "db.properties"
- You will see something like this:
  ```bash
  user=developer
  password=1234567
  dburl=jdbc:mysql://localhost:3306/coursejdbc
  useSSL=false
  ```
- Change the user and password infos to the configured in your MySQL user;
- In "dburl" change the port number after the "localhost:" if it's diferent from your MySQL connection;

### Running the project:
- 1º Open MySQL Workbench and open the coursejdbc database;
- 2º Click with the right mouse button on the table "Seller" and select the option "Select Rows", you will see the Sellers data;
- 3º In IDE, go through files project and search "src > application > Program" to test the Seller commands;
- 4º After run the program, back to MySQL Workbench, click with the right mouse button again and select "Refresh All", you will see that the data changed
- 5º Repeat the 2º step, but now you will click on the Department table.
- 6º To test the Department commands, go through files project and search "src > application > Program2".
- 7º Repeat the 4º step.

# Author

Rafael Hoffmann do Amaral

LinkedIn: www.linkedin.com/in/rafael-hoff-amaral
