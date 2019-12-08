CREATE TABLE product
(
    id           INT(19) AUTO_INCREMENT NOT NULL,
    pid          VARCHAR(256)           NOT NULL,
    name         VARCHAR(100)           NOT NULL,
    price        INT(19)                NOT NULL,
    sales_rate   INT(19),
    promotion    VARCHAR(256),
    seller       VARCHAR(256)           NOT NULL,
    genre        VARCHAR(256)           NOT NULL,
    image        VARCHAR(256),
    stock        INT(19)                NOT NULL,
    score        INT(3),
    release_date DATETIME               NOT NULL,
    translator   VARCHAR(100),
    author       VARCHAR(100)           NOT NULL,
    publisher    VARCHAR(100)           NOT NULL,
    summary      VARCHAR(256),
    size         VARCHAR(100),
    weight       FLOAT(20),
    PRIMARY KEY (id),
    UNIQUE KEY (pid)
)
