DROP TABLE IF EXISTS authors;

CREATE TABLE authors (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(250) NOT NULL
);

INSERT INTO authors (id, name) VALUES
  (1, 'Aliko Dangote'),
  (2, 'Bill Gates'),
  (3, 'Folrunsho Alakija');


DROP TABLE IF EXISTS books;

CREATE TABLE books (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(250) NOT NULL,
    author_id INT NOT NULL
);

INSERT INTO books (id, name, author_id) VALUES
  (1, 'Billionaire Tech Entrepreneur', 2),
  (2, 'Billionaire Oil Magnate', 3);