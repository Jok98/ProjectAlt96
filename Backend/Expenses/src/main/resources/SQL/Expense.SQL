CREATE TABLE expense (
            id INT NOT NULL AUTO_INCREMENT,
            description VARCHAR(255) NOT NULL,
            expense DECIMAL(10,2) NOT NULL,
            category VARCHAR(255) NOT NULL,
            note VARCHAR(255) NOT NULL,
            user VARCHAR(255) NOT NULL,
            date VARCHAR(255) NOT NULL,
            PRIMARY KEY (id)
    );

-- create 3 row of data for testing for expense table
INSERT INTO expense (description, expense, category, note, user, date) VALUES ('Food', 10.00, 'Food', 'Lunch', 'user1', '2020-01-01');
INSERT INTO expense (description, expense, category, note, user, date) VALUES ('Food', 10.00, 'Food', 'Lunch', 'user1', '2020-01-01');
INSERT INTO expense (description, expense, category, note, user, date) VALUES ('Food', 10.00, 'Food', 'Lunch', 'user1', '2020-01-01');