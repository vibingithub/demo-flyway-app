CREATE TABLE IF NOT EXISTS "app-data".library
(
    library_id bigint NOT NULL,
    name varchar(255),
    address varchar(255)
);

ALTER TABLE "app-data".library ADD CONSTRAINT "PK_library_id" PRIMARY KEY ("library_id");

CREATE SEQUENCE IF NOT EXISTS "app-data".library_sequence
    INCREMENT 1
    START 1000
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;
    
ALTER TABLE "app-data".book ADD library_id bigint;

ALTER TABLE "app-data".book ADD CONSTRAINT "FK_library_id" FOREIGN KEY ("library_id") REFERENCES "app-data".library ("library_id");