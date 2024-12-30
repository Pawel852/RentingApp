CREATE TABLE IF NOT EXISTS client (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
    city VARCHAR(255),
    country VARCHAR(255),
    role VARCHAR(255),
    active BOOLEAN DEFAULT TRUE
);

CREATE TABLE IF NOT EXISTS car (
    id BIGSERIAL PRIMARY KEY,
    owner_id BIGINT,
    brand VARCHAR(255) NOT NULL,
    model VARCHAR(255) NOT NULL,
    type VARCHAR(255),
    seats INT,
    fuel VARCHAR(255),
    transmission VARCHAR(255),
    color VARCHAR(255),
    price_per_day NUMERIC(10, 2),
    image VARCHAR(255),
    description TEXT,
    available BOOLEAN DEFAULT TRUE,
    location VARCHAR(255),
    CONSTRAINT fk_owner FOREIGN KEY (owner_id) REFERENCES client (id) ON DELETE SET NULL
);
