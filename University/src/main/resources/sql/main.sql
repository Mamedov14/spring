SELECT *
FROM student;

SELECT *
FROM teacher;

TRUNCATE student;


INSERT INTO teacher(fio, subject)
VALUES ('Turbin', 'Algebra'), ('Zaligaeva', 'Matan');

INSERT INTO student(age, course, email, last_name, name, teacher_id)
VALUES (19, 2, 'vagif_m@bk.ru', 'Mamedov', 'Vagif', 1),
       (20, 3, 'ruslan_m@bk.ru', 'Mamedov', 'Ruslan', 1);


INSERT INTO student(age, course, email, last_name, name, teacher_id)
VALUES (19, 2, 'vagif_m@bk.ru', 'Mamedov', 'Vagif', 2),
       (20, 3, 'ruslan_m@bk.ru', 'Mamedov', 'Ruslan', 2);

INSERT INTO student(age, course, email, last_name, name, teacher_id)
VALUES (19, 2, 'vagif_m@bk.ru', 'Mamedov', 'Vagif', 1);

SELECT * FROM student LEFT JOIN teacher t on t.id = student.teacher_id;