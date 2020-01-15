insert into User values(default,'ashu@gmail','Ashwini','Ashu','+919874563210','ADMIN'),
(default,'praju@gmail','Prajakta','Praju','+919847563210','LIBRARIAN'),
(default,'anushka@gmail','Anushka','Anu','+919874536210','USER'),
(default,'mayur@gmail','Mayur','mayur','+919874653210','USER');

insert into Payment values(default,500,'2020-01-29','2019-12-12','fee',3),
(default,400,'2020-02-12','2019-1-11','fee',3),
(default,700,'2020-03-20','2019-11-11','fee',4);

insert into Book values(default,'Yashwant Kanetkar',12345,'C Programming',250,'C'),
(default,'Yashwant Kanetkar',65345,'C++ Programming',350,'C++'),
(default,'Forohzon',165245,'Networking',650,'CN');

insert into Copies values(default,11,'AVAILABLE','2'),
(default,12,'ISSUED','2'),
(default,11,'AVAILABLE','3'),
(default,12,'ISSUED','1');

insert into IssueRecord values(default,100,'2019-11-10','2019-12-11','2019-12-20',1,3),
(default,150,'2019-10-11','2019-12-10','2019-12-15',2,3),
(default,120,'2019-11-09','2019-11-12','2020-1-15',3,4);
