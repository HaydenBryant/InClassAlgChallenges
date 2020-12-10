/*
Enter your query here.
*/

SELECT IF(grade < 8, NULL, name), grade, marks FROM students
        LEFT JOIN grades ON students.marks BETWEEN grades.min_mark AND grades.max_mark
        ORDER BY grade DESC, name;
