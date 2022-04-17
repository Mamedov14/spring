CREATE TABLE IF NOT EXISTS students
(
    id     bigint GENERATED BY DEFAULT AS IDENTITY,
    name   varchar(255) NOT NULL,
    age    int          NOT NULL,
    CHECK ( age > 0 ),
    rating int          NOT NULL,
    PRIMARY KEY (id)
);

SELECT *
FROM students;

INSERT INTO students(name, age, rating)
VALUES ('Vagif', 19, 10);

DELETE
FROM students
WHERE id = 4;