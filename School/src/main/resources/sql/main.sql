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

INSERT INTO students(address, class_id, person_id)
VALUES (null, 1, 1),
       (null, 1, 2),
       (null, 2, 3),
       (null, 2, 4);

INSERT INTO subjects(subject_name)
VALUES ('Algebra'),
       ('Matan');

INSERT INTO class(title, teacher_id)
VALUES ('11A', 1),
       ('11Б', 2);

INSERT INTO ratings(student_id, subject_id, rating, period)
VALUES (1, 1, 5, null),
       (1, 2, 4, null),
       (2, 1, 3, null),
       (2, 2, 4, null),
       (3, 1, 2, null),
       (3, 2, 5, null),
       (4, 1, 4, null),
       (4, 2, 3, null);

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



SELECT students.id, persons.last_name, persons.first_name, subjects.subject_name, class.title, homeworks.content
FROM students
         JOIN persons ON students.person_id = persons.id
         JOIN class ON class.id = students.class_id
         JOIN teachers ON class.teacher_id = teachers.id
         JOIN homeworks ON teachers.id = homeworks.teacher_id
         JOIN subjects ON homeworks.subject_id = subjects.id
WHERE students.id = 1


SELECT students.id, last_name, first_name, patronymic, address, class.title, persons.phone_number
FROM students
         JOIN persons ON students.person_id = persons.id
         JOIN class ON students.class_id = class.id;

SELECT subject_name, content, date_start, date_end, title
FROM homeworks
         JOIN subjects ON homeworks.subject_id = subjects.id
         JOIN teachers ON teachers.id = homeworks.teacher_id
         JOIN class ON homeworks.teacher_id = class.teacher_id
WHERE subject_name = 'Algebra'