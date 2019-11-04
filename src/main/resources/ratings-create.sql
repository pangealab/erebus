CREATE TABLE ratings (
  id INT(10) NOT NULL AUTO_INCREMENT,
  sessionid VARCHAR(50) NOT NULL,
  theme VARCHAR(50) NOT NULL,
  name VARCHAR(50) NOT NULL,
  rating INT(10) NOT NULL,
  created TIMESTAMP,
  PRIMARY KEY (`id`)
);
