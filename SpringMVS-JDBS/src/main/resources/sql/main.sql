CREATE TABLE IF NOT EXISTS students
(
    id     bigint       NOT NULL PRIMARY KEY,
    name   varchar(255) NOT NULL,
    age    int          NOT NULL,
    rating int          NOT NULL
);

SELECT *
FROM students;