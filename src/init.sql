insert into RESTAURANT
values (1, 'res1'),
       (2, 'res2');
insert into DISH (ID, ADD_DATE, NAME, PRICE, RESTAURANT_ID)
values (1, '2020-10-10', 'sosiska', 1000, 1),
       (2, '2020-10-11', 'kolbaska', 999, 1),
       (3, '2020-10-12', 'pelmeshka', 1000, 2),
       (4, '2020-10-14', 'sosiska1', 1000, 1);
select *
from RESTAURANT
         INNER JOIN DISH D on RESTAURANT.ID = D.RESTAURANT_ID
WHERE RESTAURANT_ID = 1;

INSERT INTO USERS (ID, EMAIL, PASSWORD)
VALUES (1, 'a@mail.ru', 111),
       (2, 'b@mail.ru', 222),
       (3, 'c@mail.ru', 333);
INSERT INTO VOTE (ID, VOTE_DATE, RESTAURANT_ID, USER_ID)
values (1, '2020-10-10', 1, 1),
       (2, '2020-10-10', 2, 2),
       (3, '2020-10-10', 1, 3);

SELECT NAME, count(V.RESTAURANT_ID)
FROM RESTAURANT R
         INNER JOIN VOTE V on R.ID = V.RESTAURANT_ID
GROUP BY R.NAME