# Unit Test and Code Reuse & Reengineering

## Script:

### To run the application open it in an IDE (preferably in Intellij)

1. Open the hacs folder - it contains all the java files and the test files

2. Import the external libraries needed to execute unit tests - JUnit and jupiter

3. The information about student & prof login and course info is on txt files in data folder inside hacs folder (./hacs/data/)
	1. StuInfo.txt - Student username and password
	2. InsInfor.txt - Prof username and password
	3. CourseInfo.txt - List of available courses to choose from
	4. UserCourse.txt - List of prof/students with the courses they teach/registerd for

4. Run the code from Hacs.java -> it contains the main method

5. Select Student login

6. Enter student username and password (eg: username - aaditya, password - 9999)

7. Click on Login

8. The screen shows the student's upcomming and overdue assignments (It is empty now but will be filed later)

9. Click Ok to continue

10. The screen shows the courses slected by the student

11. Interact with the dropdown menu to see all the courses registered by the student

12. Select a course from dropdown and click on Ok to view assignments or click on Logout

13. Click on Change Subject to go back to step step 10 or click on Logout

14. Logout

15. Select Instructor login

16. Enter professor username and password (eg: username - findler, password - 1111)

17. Click on Login

18. The screen shows the courses offered by the prof

19. Interact with the dropdown menu to see all the courses offerd by the prof

20. Select a course from dropdown and click on Ok to view or add assignments or click on Logout

21. Click on Add to enter new assignment details - name, due date - and click on Report

22. Click on Change Subject to go back to step step 10 or click on Logout

23. Logout

24. Login as Student again (eg: username - aaditya, password - 9999)

25. The screen now shows upcomming assignments

26. Select a subject from dropdown (a subject with assigned assignments) and click on Ok

27. Click on View besides assignment to put a solution and click submit

28. Logout

29. Now login as the prof again

30. Select the subject with assigned assignment and you can view the student's assignment submission from point 27 above

31. Click on Grade and then Report

32. Logout and login as the student again

33. Go into the subject and View the assignment again to see the grade posted by the professor

34. Logout and click on Exit or continue exploring!
