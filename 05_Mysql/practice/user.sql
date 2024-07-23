ause user_ex;

CREATE TABLE users{

    id INT AUTO_INCREMENT PRIMARY KEY,
    email  VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL
    };


INSERT INTO users (email,password) VALUES {
    (  'tetz'  ,'1234'),
    ('siwan',  '1234'),
    (' na' , '1234')

}