create table payment_details
(id int primary key not null auto_increment,
amount decimal,deleted tinyint default 0,
create_time timestamp default now(),
update_time timestamp default now())
engein innodb default charset=utf8;