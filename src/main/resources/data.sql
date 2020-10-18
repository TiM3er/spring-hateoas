drop table class;
drop table student;
create table class
(
    class_id   integer,
    class_name varchar(25)

);
create table student
(
    student_id      integer,
    student_name    varchar(50),
    student_clas_id integer
);
