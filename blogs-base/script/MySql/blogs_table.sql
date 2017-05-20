DROP TABLE IF EXISTS `blogs_article`;
CREATE TABLE `blogs_article` (
  `id` int(11) NOT NULL,
  `title` varchar(50) default NULL,
  `auther` varchar(20) default NULL,
  `content` varchar(500) default NULL,
  `createTime` date default NULL,
  `lastUpdateTime` date default NULL,
  `likeNum` int(11) default NULL,
  `readTimes` int(11) default NULL,
  `isDel` int(11) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;