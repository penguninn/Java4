create database if not exists polyoe;
use polyoe;
insert into view_count(Id, VisitorsCount) values (1, 0);
-- Thêm 10 bản ghi vào bảng Users
INSERT INTO Users (Id, Password, Email, Fullname, Admin) VALUE ('U001', 'pass123', 'user1@example.com', 'User One', 0);
INSERT INTO Users (Id, Password, Email, Fullname, Admin) VALUE ('U002', 'pass123', 'user2@example.com', 'User Two', 0);
INSERT INTO Users (Id, Password, Email, Fullname, Admin) VALUE ('U003', 'pass123', 'user3@example.com', 'User Three', 0);
INSERT INTO Users (Id, Password, Email, Fullname, Admin) VALUE ('U004', 'pass123', 'user4@example.com', 'User Four', 0);
INSERT INTO Users (Id, Password, Email, Fullname, Admin) VALUE ('U005', 'pass123', 'user5@example.com', 'User Five', 1);
INSERT INTO Users (Id, Password, Email, Fullname, Admin) VALUE ('U006', 'pass123', 'user6@example.com', 'User Six', 0);
INSERT INTO Users (Id, Password, Email, Fullname, Admin) VALUE ('U007', 'pass123', 'user7@example.com', 'User Seven', 0);
INSERT INTO Users (Id, Password, Email, Fullname, Admin) VALUE ('U008', 'pass123', 'user8@example.com', 'User Eight', 0);
INSERT INTO Users (Id, Password, Email, Fullname, Admin) VALUE ('U009', 'pass123', 'user9@example.com', 'User Nine', 0);
INSERT INTO Users (Id, Password, Email, Fullname, Admin) VALUE ('U010', 'pass123', 'user10@example.com', 'User Ten', 1);
-- Thêm 5 bản ghi vào bảng Video
INSERT INTO Video (Id, Title, Poster, Views, Description, Active) VALUE ('V001', 'Video One', 'poster1.jpg', 100, 'Description for Video One', 1);
INSERT INTO Video (Id, Title, Poster, Views, Description, Active) VALUE ('V002', 'Video Two', 'poster2.jpg', 200, 'Description for Video Two', 1);
INSERT INTO Video (Id, Title, Poster, Views, Description, Active) VALUE ('V003', 'Video Three', 'poster3.jpg', 300, 'Description for Video Three', 1);
INSERT INTO Video (Id, Title, Poster, Views, Description, Active) VALUE ('V004', 'Video Four', 'poster4.jpg', 400, 'Description for Video Four', 0);
INSERT INTO Video (Id, Title, Poster, Views, Description, Active) VALUE ('V005', 'Video Five', 'poster5.jpg', 500, 'Description for Video Five', 1);
-- Thêm 5 bản ghi vào bảng Favorite
INSERT INTO Favorite (Id, UserId, VideoId, LikeDate) VALUE (1, 'U001', 'V001', '2024-01-01');
INSERT INTO Favorite (Id, UserId, VideoId, LikeDate) VALUE (2, 'U002', 'V002', '2024-01-02');
INSERT INTO Favorite (Id, UserId, VideoId, LikeDate) VALUE (3, 'U003', 'V003', '2024-01-03');
INSERT INTO Favorite (Id, UserId, VideoId, LikeDate) VALUE (4, 'U004', 'V004', '2024-01-04');
INSERT INTO Favorite (Id, UserId, VideoId, LikeDate) VALUE (5, 'U005', 'V005', '2024-01-05');
-- Thêm 5 bản ghi vào bảng Share
INSERT INTO Share (Id, UserId, VideoId, Emails, ShareDate) VALUE (1, 'U001', 'V001', 'friend1@example.com,friend2@example.com', '2024-02-01');
INSERT INTO Share (Id, UserId, VideoId, Emails, ShareDate) VALUE (2, 'U002', 'V002', 'friend3@example.com,friend4@example.com', '2024-02-02');
INSERT INTO Share (Id, UserId, VideoId, Emails, ShareDate) VALUE (3, 'U003', 'V003', 'friend5@example.com,friend6@example.com', '2024-02-03');
INSERT INTO Share (Id, UserId, VideoId, Emails, ShareDate) VALUE (4, 'U004', 'V004', 'friend7@example.com,friend8@example.com', '2024-02-04');
INSERT INTO Share (Id, UserId, VideoId, Emails, ShareDate) VALUE (5, 'U005', 'V005', 'friend9@example.com,friend10@example.com', '2024-02-05');
