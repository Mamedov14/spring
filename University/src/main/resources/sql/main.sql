SELECT *
FROM student;

SELECT *
FROM teacher;

TRUNCATE student;
TRUNCATE teacher;

INSERT INTO teacher(fio, subject)
VALUES ('Turbin', 'Algebra'),
       ('Zaligaeva', 'Matan'),
       ('Aleksandrov', 'Fiz-ra');

INSERT INTO student(age, course, email, last_name, name, teacher_id)
VALUES (19, 2, 'vagif_m@bk.ru', 'Mamedov', 'Vagif', 1),
       (20, 3, 'ruslan_m@bk.ru', 'Mamedov', 'Ruslan', 2);


INSERT INTO student(age, course, email, last_name, name)
VALUES (19, 2, 'vagif_m@bk.ru', 'Mamedov', 'Vagif'),
       (20, 3, 'ruslan_m@bk.ru', 'Mamedov', 'Ruslan');

INSERT INTO student(age, course, email, last_name, name, teacher_id)
VALUES (19, 1, 'vova_b@bk.ru', 'Vrazhnikov', 'Vova', 8);

SELECT name, age, fio, subject
FROM student
         INNER JOIN teacher on teacher.id = student.teacher_id;

DELETE
FROM teacher
WHERE id = 1;

DROP TABLE teacher_students;
DROP TABLE student_teachers;

DROP TABLE role;
DROP TABLE student;
DROP TABLE teacher;
DROP TABLE user_roles;

DROP SEQUENCE hibernate_sequence;