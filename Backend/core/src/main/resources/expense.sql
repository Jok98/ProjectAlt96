
CREATE TABLE expense (
    id VARCHAR(255) PRIMARY KEY,
    name VARCHAR(255),
    description VARCHAR(255),
    amount DECIMAL(19, 2),
    date DATE,
    category VARCHAR(255)
);
INSERT INTO expense (id, name, description, amount, date, category) VALUES
('1', 'Expense 1', 'Description for Expense 1', 100.50, '2023-11-25', 'Category A'),
('2', 'Expense 2', 'Description for Expense 2', 75.25, '2023-11-24', 'Category B'),
('3', 'Expense 3', 'Description for Expense 3', 120.75, '2023-11-23', 'Category A'),
('4', 'Expense 4', 'Description for Expense 4', 50.00, '2023-11-22', 'Category C'),
('5', 'Expense 5', 'Description for Expense 5', 200.00, '2023-11-21', 'Category B');
