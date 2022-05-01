INSERT INTO persons(last_name, first_name, patronymic, date_of_birth, phone_number)
VALUES ('Mamedov', 'Vagif', 'Vagifovich', '2002-10-14', '+79991002222'),
       ('Mamedov', 'Ruslan', 'Vagifovich', '2001-07-12', '+79991002222'),
       ('Danilov', 'Maks', 'Sergeevich', null, '+79991002222'),
       ('Anisimov', 'Pavel', 'Sergeevich', null, '+79991002222');

INSERT INTO persons(last_name, first_name, patronymic, date_of_birth, phone_number)
VALUES ('Shvedun', 'Denis', 'Vladimirovich', null, null);

INSERT INTO persons(last_name, first_name, patronymic, date_of_birth, phone_number)
VALUES ('Turbin', 'Mihail', 'Vyacheslavovich', null, null),
       ('Zaligaeva', 'Marina', 'Evgenia', null, null);

INSERT INTO directors(person_id)
VALUES (5);
INSERT INTO teachers(person_id, cool_guide)
VALUES (6, false),
       (7, false);
INSERT INTO students(person_id, address, class_id)
VALUES (1, null, 1),
       (2, null, 1),
       (3, null, 2),
       (4, null, 2);

INSERT INTO subjects(subject_name)
VALUES ('Algebra'),
       ('Matan');

INSERT INTO class(title, teacher_id)
VALUES ('11A', 1),
       ('11Б', 2);

INSERT INTO ratings(student_id, subject_id, rating, period)
VALUES (5, 1, 5, null),
       (5, 2, 4, null),
       (6, 1, 3, null),
       (6, 2, 4, null),
       (7, 1, 2, null),
       (7, 2, 5, null),
       (8, 1, 4, null),
       (8, 2, 3, null);

INSERT INTO leads(teacher_id, subject_id, class_id)
VALUES (1, 1, 1),
       (1, 2, 2),
       (2, 1, 1),
       (2, 2, 2);

INSERT INTO homeworks(teacher_id, subject_id, content, date_start, date_end)
VALUES (1, 1, '№1-10', null, null),
       (1, 2, '№5-10', null, null),
       (2, 1, 'ничего не задал', null, null),
       (2, 2, '№25-36', null, null);

SELECT *
FROM persons;
SELECT *
FROM directors;
SELECT *
FROM students;
SELECT *
FROM teachers;
SELECT *
FROM class;
SELECT *
FROM subjects;
SELECT *
FROM ratings;
SELECT *
FROM leads;
SELECT *
FROM homeworks;


SELECT last_name, first_name, content
FROM students
         JOIN persons ON students.person_id = persons.id
         JOIN "class" ON class.id = students.class_id
         JOIN teachers ON class.teacher_id = teachers.id
         JOIN homeworks ON teachers.id = homeworks.teacher_id;