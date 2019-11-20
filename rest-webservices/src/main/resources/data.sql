insert into claim(user_id,username,claim_id,claim_description,claim_cost,is_approved,approved_date,claim_date) 
values('1007','minu','claim17','description',900,true,sysdate(),sysdate());

insert into claim(user_id,username,claim_id,claim_description,claim_cost,is_approved,approved_date,claim_date) 
values('1008','minu','claim18','description',900,true,sysdate(),sysdate());

insert into claim(user_id,username,claim_id,claim_description,claim_cost,is_approved,approved_date,claim_date) 
values('1009','minu','claim19','description',900,true,sysdate(),sysdate());

insert into user(email_id,name,is_verified,password,phone,sec_answer,sec_question,user_type)
values('test@test.com','aaa',false,'aaaa',1234,'dog','fav pet','Employee');

insert into user(email_id,name,is_verified,password,phone,sec_answer,sec_question,user_type)
values('test1@test.com','bbbb',false,'bbbbb',1234,'dog','fav pet','Employee');