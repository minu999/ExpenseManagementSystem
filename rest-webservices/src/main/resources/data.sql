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

insert into claim_register(claim_id,approver_email_id,claim_name,claim_status,email_id,is_approved,is_validated,project_id,travel_end_date_time,travel_start_date_time)
values(0,'bbbb@bb.cc','clam1','registered','test@test.com',false,false,'pis12',sysdate(),sysdate());