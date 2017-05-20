DROP TABLE IF EXISTS blogs_article;
CREATE TABLE blogs_article (
  id 						int NOT NULL auto_increment,
  title 					varchar(50) default NULL,
  digest					varchar(100) default NULL,
  isDefaultDig				int default 0,
  content 					varchar(500) default NULL,
  createTime 				date default NULL,
  lastUpdateTime 			date default NULL,
  likeNum 					int default 0,
  readTimes 				int default 0,
  isDel 					int default 0,
  PRIMARY KEY  (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;