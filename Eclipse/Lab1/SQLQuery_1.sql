CREATE DATABASE PolyOE;
GO

USE PolyOE;
GO

-- Tạo bảng User
CREATE TABLE Users (
    Id NVARCHAR(50) PRIMARY KEY,
    Password NVARCHAR(100) NOT NULL,
    Email NVARCHAR(100) UNIQUE NOT NULL,
    Fullname NVARCHAR(100) NOT NULL,
    Admin BIT NOT NULL
);

-- Tạo bảng Video
CREATE TABLE Video (
    Id NVARCHAR(50) PRIMARY KEY,
    Title NVARCHAR(200) NOT NULL,
    Poster NVARCHAR(200),
    Views INT DEFAULT 0,
    Description NVARCHAR(MAX),
    Active BIT NOT NULL
);

-- Tạo bảng Favorite
CREATE TABLE Favorite (
    Id BIGINT PRIMARY KEY IDENTITY,
    UserId NVARCHAR(50) NOT NULL,
    VideoId NVARCHAR(50) NOT NULL,
    LikeDate DATE,
    FOREIGN KEY (UserId) REFERENCES Users(Id),
    FOREIGN KEY (VideoId) REFERENCES Video(Id)
);
go
-- Tạo bảng Share
CREATE TABLE Share (
    Id BIGINT PRIMARY KEY IDENTITY,
    UserId NVARCHAR(50) NOT NULL,
    VideoId NVARCHAR(50) NOT NULL,
    Emails NVARCHAR(MAX) NOT NULL,
    ShareDate DATE,
    FOREIGN KEY (UserId) REFERENCES Users(Id),
    FOREIGN KEY (VideoId) REFERENCES Video(Id)
);
GO
-- Thêm 10 bản ghi vào bảng User
INSERT INTO Users (Id, Password, Email, Fullname, Admin) VALUES
('U001', 'pass123', 'user1@example.com', 'User One', 0),
('U002', 'pass123', 'user2@example.com', 'User Two', 0),
('U003', 'pass123', 'user3@example.com', 'User Three', 0),
('U004', 'pass123', 'user4@example.com', 'User Four', 0),
('U005', 'pass123', 'user5@example.com', 'User Five', 1),
('U006', 'pass123', 'user6@example.com', 'User Six', 0),
('U007', 'pass123', 'user7@example.com', 'User Seven', 0),
('U008', 'pass123', 'user8@example.com', 'User Eight', 0),
('U009', 'pass123', 'user9@example.com', 'User Nine', 0),
('U010', 'pass123', 'user10@example.com', 'User Ten', 1);
go
-- Thêm 5 bản ghi vào bảng Video
INSERT INTO Video (Id, Title, Poster, Views, Description, Active) VALUES
('V001', 'Video One', 'poster1.jpg', 100, 'Description for Video One', 1),
('V002', 'Video Two', 'poster2.jpg', 200, 'Description for Video Two', 1),
('V003', 'Video Three', 'poster3.jpg', 300, 'Description for Video Three', 1),
('V004', 'Video Four', 'poster4.jpg', 400, 'Description for Video Four', 0),
('V005', 'Video Five', 'poster5.jpg', 500, 'Description for Video Five', 1);
go
-- Thêm 5 bản ghi vào bảng Favorite
INSERT INTO Favorite (UserId, VideoId, LikeDate) VALUES
('U001', 'V001', '2024-01-01'),
('U002', 'V002', '2024-01-02'),
('U003', 'V003', '2024-01-03'),
('U004', 'V004', '2024-01-04'),
('U005', 'V005', '2024-01-05');
go
-- Thêm 5 bản ghi vào bảng Share
INSERT INTO Share (UserId, VideoId, Emails, ShareDate) VALUES
('U001', 'V001', 'friend1@example.com,friend2@example.com', '2024-02-01'),
('U002', 'V002', 'friend3@example.com,friend4@example.com', '2024-02-02'),
('U003', 'V003', 'friend5@example.com,friend6@example.com', '2024-02-03'),
('U004', 'V004', 'friend7@example.com,friend8@example.com', '2024-02-04'),
('U005', 'V005', 'friend9@example.com,friend10@example.com', '2024-02-05');
