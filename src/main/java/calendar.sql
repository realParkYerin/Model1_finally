drop table calendar;

create table calendar(
	seq int auto_increment primary key, -- auto_increment 옵션은 int나 float같은 숫자값에만 사용할 수 있다
	id varchar(50) not null,
	title varchar(200) not null,
	content varchar(4000),
	rdate varchar(12) not null,		-- 202302160945
	wdate timestamp not null
);

alter table calendar
add
constraint fk_cal_id foreign key(id)
references member(id);

select * from calendar;

-- ?월의 일정에서 5개만 갖고 온다
select seq, id, title, content, rdate, wdate
from
	(select row_number()over(partition by substr(rdate, 1, 8) order by rdate asc) as rnum,
		seq, id, title, content, rdate, wdate
	from calendar
	where id='abc' and substr(rdate, 1, 6) = '20230216123525') a
where rnum between 1 and 5;















