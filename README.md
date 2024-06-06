# FinalProject-TaskManagementSystem
## Overview
Our project is a text based task management system that supports multiple projects with regular and priority tasks. You can create projects or tasks, display projects, edit tasks, delete projects or tasks, and sort projects alphabetically or by size.

## Functionality
We use a Task abstract class to create the general task object used for both regular and priority tasks, which are then added to an arrayList stored in each unique project object. The project objects are then in turn stored in an arrayList in the main file that also handles the UI as well as sorting the project objects.

## Flow/class Diagram

![Flow Diagram](/home/landond/Downloads/Screenshot_20240605_204057.png)

## Implementation
The project is implemented using two levels of arrayLists, the first level inside each project object storing that projects task objects, and the second inside the ProjectManagementSystem object storing each of the projects. The UI menu is a simple switch statement which takes the number the user typed and selects the necessary function

## Screenshots

```
--------------------
Welcome to Project Management Software 1.0

What is your name? Landon

1. Create New Project
2. Add New Task
3. View Projects and Tasks
4. Edit a Task
5. Remove a Task
6. Remove a Project
7. Exit
Please enter which action you would like to take: 1

Please enter a name for your new project: Final Project

1. Create New Project
2. Add New Task
3. View Projects and Tasks
4. Edit a Task
5. Remove a Task
6. Remove a Project
7. Exit
Please enter which action you would like to take: 1

Please enter a name for your new project: Math Test

1. Create New Project
2. Add New Task
3. View Projects and Tasks
4. Edit a Task
5. Remove a Task
6. Remove a Project
7. Exit
Please enter which action you would like to take: 2

1. Final Project
2. Math Test

Which project would you like to add a task to? 1

Project: Final Project

What is the task you want to add? Record Presentation
is this a priority task? (true or false) true

1. Create New Project
2. Add New Task
3. View Projects and Tasks
4. Edit a Task
5. Remove a Task
6. Remove a Project
7. Exit
Please enter which action you would like to take: 2

1. Final Project
2. Math Test

Which project would you like to add a task to? 1

Project: Final Project
  Priority Task: Record Presentation

What is the task you want to add? Take Screenshots for report
is this a priority task? (true or false) false

1. Create New Project
2. Add New Task
3. View Projects and Tasks
4. Edit a Task
5. Remove a Task
6. Remove a Project
7. Exit
Please enter which action you would like to take: 2

1. Final Project
2. Math Test

Which project would you like to add a task to? 1

Project: Final Project
  Priority Task: Record Presentation
  Task: Take Screenshots for report

What is the task you want to add? Edit Presentation
is this a priority task? (true or false) false

1. Create New Project
2. Add New Task
3. View Projects and Tasks
4. Edit a Task
5. Remove a Task
6. Remove a Project
7. Exit
Please enter which action you would like to take: 3

1. Alphabetically
2. Amount of tasks (most first)
Would you like to print projects alphabetically or by amount of tasks? 2

-----Printing projects now-----

Project: Final Project
  Priority Task: Record Presentation
  Task: Take Screenshots for report
  Task: Edit Presentation

Project: Math Test

Press enter to continue


1. Create New Project
2. Add New Task
3. View Projects and Tasks
4. Edit a Task
5. Remove a Task
6. Remove a Project
7. Exit
Please enter which action you would like to take: 2

1. Final Project
2. Math Test

Which project would you like to add a task to? 2

Project: Math Test

What is the task you want to add? Study chapter 5
is this a priority task? (true or false) true

1. Create New Project
2. Add New Task
3. View Projects and Tasks
4. Edit a Task
5. Remove a Task
6. Remove a Project
7. Exit
Please enter which action you would like to take: 2

1. Final Project
2. Math Test

Which project would you like to add a task to? 2

Project: Math Test
  Priority Task: Study chapter 5

What is the task you want to add? Create notes sheet
is this a priority task? (true or false) false

1. Create New Project
2. Add New Task
3. View Projects and Tasks
4. Edit a Task
5. Remove a Task
6. Remove a Project
7. Exit
Please enter which action you would like to take: 3

1. Alphabetically
2. Amount of tasks (most first)
Would you like to print projects alphabetically or by amount of tasks? 1

-----Printing projects now-----

Project: Final Project
  Priority Task: Record Presentation
  Task: Take Screenshots for report
  Task: Edit Presentation

Project: Math Test
  Priority Task: Study chapter 5
  Task: Create notes sheet

Press enter to continue


1. Create New Project
2. Add New Task
3. View Projects and Tasks
4. Edit a Task
5. Remove a Task
6. Remove a Project
7. Exit
Please enter which action you would like to take: 1

Please enter a name for your new project: A Test

1. Create New Project
2. Add New Task
3. View Projects and Tasks
4. Edit a Task
5. Remove a Task
6. Remove a Project
7. Exit
Please enter which action you would like to take: 3

1. Alphabetically
2. Amount of tasks (most first)
Would you like to print projects alphabetically or by amount of tasks? 1

-----Printing projects now-----

Project: A Test

Project: Final Project
  Priority Task: Record Presentation
  Task: Take Screenshots for report
  Task: Edit Presentation

Project: Math Test
  Priority Task: Study chapter 5
  Task: Create notes sheet

Press enter to continue


1. Create New Project
2. Add New Task
3. View Projects and Tasks
4. Edit a Task
5. Remove a Task
6. Remove a Project
7. Exit
Please enter which action you would like to take: 3

1. Alphabetically
2. Amount of tasks (most first)
Would you like to print projects alphabetically or by amount of tasks? 2

-----Printing projects now-----

Project: Final Project
  Priority Task: Record Presentation
  Task: Take Screenshots for report
  Task: Edit Presentation

Project: Math Test
  Priority Task: Study chapter 5
  Task: Create notes sheet

Project: A Test

Press enter to continue


1. Create New Project
2. Add New Task
3. View Projects and Tasks
4. Edit a Task
5. Remove a Task
6. Remove a Project
7. Exit
Please enter which action you would like to take: 4

1. Final Project
2. Math Test
3. A Test

Which project would you like to add a task to? 2

Project: Math Test
  Priority Task: Study chapter 5
  Task: Create notes sheet

Which task would you like to edit? (Enter the full task name) Study chapter 5

1. Name: Study chapter 5
2. Priority: true
3. Cancel
Which Property would you like to edit? 1
What is the new task name? Study chapter 6
What is the new priority? (true or false) true

1. Create New Project
2. Add New Task
3. View Projects and Tasks
4. Edit a Task
5. Remove a Task
6. Remove a Project
7. Exit
Please enter which action you would like to take: 5

1. Final Project
2. Math Test
3. A Test
Which project would you like to remove a task from? 1

Project: Final Project
  Priority Task: Record Presentation
  Task: Take Screenshots for report
  Task: Edit Presentation

Which task would you like to remove? (Enter the full task name) Take Screenshots for report
Current Task list:

Project: Final Project
  Priority Task: Record Presentation
  Task: Edit Presentation

1. Create New Project
2. Add New Task
3. View Projects and Tasks
4. Edit a Task
5. Remove a Task
6. Remove a Project
7. Exit
Please enter which action you would like to take: 3

1. Alphabetically
2. Amount of tasks (most first)
Would you like to print projects alphabetically or by amount of tasks? 1

-----Printing projects now-----

Project: A Test

Project: Final Project
  Priority Task: Record Presentation
  Task: Edit Presentation

Project: Math Test
  Priority Task: Study chapter 6
  Task: Create notes sheet

Press enter to continue


1. Create New Project
2. Add New Task
3. View Projects and Tasks
4. Edit a Task
5. Remove a Task
6. Remove a Project
7. Exit
Please enter which action you would like to take: 6

1. A Test
2. Final Project
3. Math Test
Which project would you like to remove? 1

1. Create New Project
2. Add New Task
3. View Projects and Tasks
4. Edit a Task
5. Remove a Task
6. Remove a Project
7. Exit
Please enter which action you would like to take: 3

1. Alphabetically
2. Amount of tasks (most first)
Would you like to print projects alphabetically or by amount of tasks? 2

-----Printing projects now-----

Project: Final Project
  Priority Task: Record Presentation
  Task: Edit Presentation

Project: Math Test
  Priority Task: Study chapter 6
  Task: Create notes sheet

Press enter to continue


1. Create New Project
2. Add New Task
3. View Projects and Tasks
4. Edit a Task
5. Remove a Task
6. Remove a Project
7. Exit
Please enter which action you would like to take: 7
```

## Participation
Code: Landon and Andy(jar file?)
Report: Landon
Presentation:
- Speakers: Jon and Shaya
- Editor: ?(Probably Avante)