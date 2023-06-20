-- create
CREATE TABLE classmates (
  id INTEGER PRIMARY KEY,
  name TEXT NOT NULL,
  age INTEGER NOT NULL,
  address TEXT NOT NULL
);

-- insert
INSERT INTO classmates VALUES (0001, 'Василий', 16, 'Тверь');
INSERT INTO classmates VALUES (0002, 'Мария', 25, 'С-Петербург');
INSERT INTO classmates VALUES (0003, 'Петр', 18, 'Москва');
INSERT INTO classmates VALUES (0004, 'София', 18, 'Владимир');
INSERT INTO classmates VALUES (0005, 'Илья', 31, 'Казань');
INSERT INTO classmates VALUES (0006, 'Надежда', 30, 'Москва');
INSERT INTO classmates VALUES (0007, 'Иван', 29, 'Москва');
INSERT INTO classmates VALUES (0008, 'Наталия', 43, 'Хабаровск');
INSERT INTO classmates VALUES (0009, 'Алексей', 28, 'Омск');
INSERT INTO classmates VALUES (0010, 'Анатолий', 21, 'Ульяновск');
INSERT INTO classmates VALUES (0011, 'Виктория', 32, 'Москва');

-- fetch 
SELECT name FROM classmates WHERE address = 'Москва' AND age >= 18 AND age < 45;