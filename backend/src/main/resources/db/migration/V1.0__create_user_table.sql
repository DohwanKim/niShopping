CREATE TABLE user
(
    id                    INT(19) AUTO_INCREMENT NOT NULL,
    user_id               VARCHAR(256)           NOT NULL,
    name                  VARCHAR(256)           NOT NULL,
    nick_name             VARCHAR(256),
    user_image            VARCHAR(256),
    gender                INT(2)                 NOT NULL,
    address               VARCHAR(256)           NOT NULL,
    birth_date            DATETIME               NOT NULL,
    phone_number          VARCHAR(256),
    phone_number_verified BOOLEAN,
    email                 VARCHAR(256)           NOT NULL,
    email_verify          BOOLEAN                NOT NULL,
    register_date         DATETIME               NOT NULL,
    last_logged_in        DATETIME               NOT NULL,
    PRIMARY KEY (id),
    UNIQUE KEY (user_id)
)
