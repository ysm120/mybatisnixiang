drop database if exists exam;
create database exam;
use exam;

-- 学生：学号，姓名，年级，班级，密码
DROP TABLE IF EXISTS student;
CREATE TABLE student(
sid varchar(12) NOT NULL,
sname varchar(20) NOT NULL,
sgrade varchar(4) NOT NULL,
sclass varchar(4) NOT NULL,
spwd varchar(50) NOT NULL,
PRIMARY KEY(sid)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci;

-- 教师：工号，姓名，密码
DROP TABLE IF EXISTS teacher;
CREATE TABLE teacher(
tid varchar(12) NOT NULL,
tname varchar(20) NOT NULL,
tpwd varchar(50) NOT NULL,
PRIMARY KEY(tid)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci;

-- 管理员：帐号，密码
DROP TABLE IF EXISTS adminstra;
CREATE TABLE adminstra(
aid varchar(12) NOT NULL,
apwd varchar(50) NOT NULL,
PRIMARY KEY(aid)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci;

-- 试卷：试卷ID，试卷名字，开考时间，时长，总分值，教师ID，一道题的分数
DROP TABLE IF EXISTS paper;
CREATE TABLE paper(
paperid int auto_increment NOT NULL,  -- 设置自增
papername varchar(100) NOT NULL,
starttime datetime NOT NULL,  -- 具体到多少
duration int NOT NULL,
totalscore int default 0,      -- 不需要教师写
tid  varchar(12) NOT NULL,
foreign key (tid) references teacher(tid) on delete cascade on update cascade,
singlescore int NOT NULL,
PRIMARY KEY(paperid)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci;

-- 题目表(题目ID，科目，题目内容,题目答案)
DROP TABLE IF EXISTS question;
CREATE TABLE question(
questionid int auto_increment NOT NULL,
subjectname varchar(20) NOT NULL,
content text NOT NULL,
answer varchar(10) not null,
PRIMARY KEY(questionid)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci;

-- 选项表(题目id, 选项号，选项)
DROP TABLE IF EXISTS choice;
CREATE TABLE choice(
choiceid int auto_increment NOT NULL,
questionid int NOT NULL,
choice TEXT NOT NULL,
foreign key (questionid) references question(questionid) on delete cascade on update cascade,
PRIMARY KEY(choiceid)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci;

-- 试卷-题目：试卷ID，题目ID
DROP TABLE IF EXISTS makepaper;
CREATE TABLE makepaper(
paperid int NOT NULL,
questionid int NOT NULL,
foreign key (paperid) references paper(paperid) on delete cascade on update cascade,
foreign key (questionid) references question(questionid) on delete cascade on update cascade
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci;

-- 学生-试卷：学号，试卷ID，试卷分数
DROP TABLE IF EXISTS answerpaper;
CREATE TABLE answerpaper(
sid varchar(12) NOT NULL,
paperid int NOT NULL,
sore int default 0,
foreign key (sid) references student(sid) on delete cascade on update cascade,
foreign key (paperid) references paper(paperid) on delete cascade on update cascade
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci;


-- 学生-题目：学号，试卷ID，题目ID，学生答案，学生答案是否正确
DROP TABLE IF EXISTS answerquestioin;
CREATE TABLE answerquestioin(
sid varchar(12) NOT NULL,
paperid int NOT NULL,
questionid int NOT NULL,
sanswer varchar(10) default NULL,
duicuo int NOT NULL default 0,
foreign key (sid) references student(sid) on delete cascade on update cascade,
foreign key (paperid) references paper(paperid) on delete cascade on update cascade,
foreign key (questionid) references question(questionid) on delete cascade on update cascade
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci;
