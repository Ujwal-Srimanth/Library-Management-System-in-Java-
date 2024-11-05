Library Management System
This Java-based Library Management System is designed to help manage library operations efficiently. It features classes for books, customers, and staff, with functionality for searching, issuing, reserving, and returning books, as well as handling fines. The system operates through a simple command-line interface where users can interact with the system by logging in and selecting options such as book management and fine payment.

Features:
Book Management:

Add new books with details such as ID, author, name, price, and type.
Search for books by name or type.
Issue, reserve, and return books.
Calculate and manage fines for late returns.
Customer Management:

Create customer profiles with ID, name, phone, age, and gender.
Assign a unique ID to each customer and manage book issues and returns.
Track and pay fines if applicable.
Staff Management:

Create staff profiles with ID, name, phone, age, gender, type, and salary.
Staff login and validation using unique ID and password.
Separate roles for staff and customers with multithreading support for handling multiple operations.
Technologies Used:
Java Collections: Lists and Dictionaries for storing books and user data.
Date Management: LocalDate for handling issue and return dates.
Multithreading: Staff operations are handled using Java threads for parallel processing.
Error Handling: Uses try-catch blocks for input validation and exception handling.
How to Run:
Compile and run the MainClass.java file.
Follow the prompts to input customer and staff information.
Choose from various options like searching for books, issuing, reserving, or returning them.
Staff can manage books and users by logging into the system with their credentials.
