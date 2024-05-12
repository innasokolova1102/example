
CREATE TABLE IF NOT EXISTS BOOKS
(
    ID                 bigserial NOT NULL,
    NAME               VARCHAR  ,
    AUTHOR             VARCHAR  ,
    PAGES              NUMERIC ,
    CONSTRAINT BOOKS_PK PRIMARY KEY ( ID )
  );

COMMENT ON TABLE BOOKS is 'Книги';
COMMENT ON COLUMN BOOKS.ID is 'ID книги';
COMMENT ON COLUMN BOOKS.NAME is 'Название книги';
COMMENT ON COLUMN BOOKS.AUTHOR is 'автор книги';
COMMENT ON COLUMN BOOKS.PAGES is 'кол-во страниц';


