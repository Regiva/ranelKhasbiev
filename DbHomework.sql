CREATE DATABASE filmography;

CREATE TABLE movies
(
    movies_id SERIAL PRIMARY KEY,
    movies_name VARCHAR(50),
    movies_description TEXT,
    movies_year DATE,
    movies_genres INT,
    movies_country VARCHAR(20),
    movies_budget MONEY CONSTRAINT right_movies_budget CHECK (movies_budget !< 1000)
);

CREATE TYPE MOTHERLAND_ENUM AS ENUM ('USA', 'UK', 'Russia', 'France', 'Germany');

CREATE TABLE person
(
    surname VARCHAR(20),
    name VARCHAR(20),
    birthday DATE CONSTRAINT right_birthday CHECK (birthday < current_date),
    motherland MOTHERLAND_ENUM
);
CREATE INDEX index_person_name_surname ON person (name, surname);

CREATE TABLE actors
(
    actors_id SERIAL PRIMARY KEY,
    actors_number_of_movies INT
) INHERITS (person);

CREATE TABLE producers
(
    producers_id SERIAL PRIMARY KEY
) INHERITS (person);

CREATE TABLE movies_actors
(
    movies_name VARCHAR(50),
    movies_year DATE,
    actors_id INT
);
ALTER TABLE movies_actors
ADD CONSTRAINT fk_movies
FOREIGN KEY (movies_name, movies_year) REFERENCES movies (movies_name, movies_year);
ALTER TABLE movies_actors
ADD CONSTRAINT fk_actors
FOREIGN KEY (actors_id) REFERENCES actors (actors_id);

CREATE TABLE genres
(
    genres_id SERIAL PRIMARY KEY,
    genres_genre VARCHAR(20)
);

CREATE TABLE movies_genres
(
    movies_id INT,
    genres_id INT,
    CONSTRAINT fk_movies FOREIGN KEY (movies_id) REFERENCES movies (movies_id),
    CONSTRAINT fk_genres FOREIGN KEY (genres_id) REFERENCES genres (genres_id)
);

UPDATE movies SET movies_name = concat(movies_name, ' (', extract(YEAR FROM movies_year), ')');
