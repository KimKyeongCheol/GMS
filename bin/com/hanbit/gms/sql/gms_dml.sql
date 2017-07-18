-- String id,ssn,name,regdate;
SELECT * from MEMBER;
INSERT INTO MEMBER(id,name,password,ssn,regdate)
VALUES('JOJO','조조','1','570619-1336491',SYSDATE);
SELECT COUNT(*) AS COUNT FROM MEMBER;
SELECT * from BOARD;
SELECT * FROM Member WHERE id='dsd';
INSERT INTO Board(article_seq,id,title,content,hitcount,regdate) VALUES(article_seq.nextval,'kia','날씨가 좋다',
'무한한 가슴이 기쁘며, 힘있다..',57,SYSDATE);

INSERT INTO Member(id,name,password,ssn,regdate)
VALUES('hong','홍길동','1','000102-1234562',SYSDATE);
INSERT INTO Member(id,name,password,ssn,regdate)
VALUES('kim','김씨','1','010000-1231230',SYSDATE);
INSERT INTO Member(id,name,password,ssn,regdate)
VALUES('ki','기성용','1','091101-1252120',SYSDATE);
INSERT INTO Member(id,name,password,ssn,regdate)
VALUES('lee','이청용','1','870414-1395142',SYSDATE);
INSERT INTO Member(id,name,password,ssn,regdate)
VALUES('kia','김기태','1','070817-1221010',SYSDATE);
INSERT INTO Member(id,name,password,ssn,regdate)
VALUES('tiger','김선빈','1','071719-2213612',SYSDATE);
INSERT INTO Member(id,name,password,ssn,regdate)
VALUES('sun','선동열','1','851104-2213410',SYSDATE);
INSERT INTO Member(id,name,password,ssn,regdate)
VALUES('ki01','기성용','1','931231-2333333',SYSDATE);
INSERT INTO Member(id,name,password,ssn,regdate)
VALUES('youn','이청용','1','790315-2334741',SYSDATE);
INSERT INTO Member(id,name,password,ssn,regdate)
VALUES('na','나성범','1','710108-2111111',SYSDATE);
INSERT INTO Member(id,name,password,ssn,regdate)
VALUES('dsd','선동열','1','536050-253200',SYSDATE);
INSERT INTO Member(id,name,password,ssn,regdate)
VALUES('admin','관리자','admin','990101-1002312',SYSDATE);

UPDATE MEMBER
SET password='1'
WHERE id='dsd';

DELETE FROM Member WHERE id='dsd';

SELECT * FROM BOARD;

SELECT * FROM all_tables;
