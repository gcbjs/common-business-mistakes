explain select * from person where NAME >'name84059' and create_time>'2020-09-23 13:27:00'
explain select * from person where NAME >'name84059' and create_time>'2020-01-24 00:00:00'


SET optimizer_trace="enabled=on";
explain select * from person where NAME >'name84059' and create_time>'2020-09-23 13:27:00';
select * from information_schema.OPTIMIZER_TRACE;
SET optimizer_trace="enabled=off";