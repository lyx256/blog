CREATE TABLE `back_user` (
  `id` int(32) primary key not null AUTO_INCREMENT COMMENT '用户id',
  `username` varchar(255) not null COMMENT '用户名',
  `password` varchar(255) not null COMMENT '密码',
  `email` varchar(255) default null COMMENT '邮箱',
  `spare1` varchar(255) default null COMMENT '备用字段1',
  `spare2` varchar(255) default null COMMENT '备用字段2',
  `spare3` varchar(255) default null COMMENT '备用字段3',
  `spare4` varchar(255) default null COMMENT '备用字段4',
  `spare5` varchar(255) default null COMMENT '备用字段5',
  `creata_time` timestamp not null default current_timestamp COMMENT '创建时间',
  `update_time` timestamp not null default current_timestamp COMMENT '更新时间'
) engine=InnoDB default charset=utf8 COMMENT='后台用户表';