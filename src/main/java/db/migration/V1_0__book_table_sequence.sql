CREATE TABLE IF NOT EXISTS "app-data".book
(
    book_id bigint NOT NULL,
    isin varchar(255),
    name varchar(255),
    type varchar(255)
);

ALTER TABLE "app-data".book ADD CONSTRAINT "PK_book_id" PRIMARY KEY ("book_id");

CREATE SEQUENCE IF NOT EXISTS "app-data".book_sequence
    INCREMENT 1
    START 1000
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;