CREATE DATABASE ASM;
GO
USE ASM;
GO


CREATE TABLE NguoiDung (
    ID INT PRIMARY KEY IDENTITY(1,1),
    TenNguoiDung NVARCHAR(100) NOT NULL,
    Email NVARCHAR(100) UNIQUE NOT NULL,
    MatKhau NVARCHAR(255) NOT NULL,
    VaiTro TINYINT NOT NULL,
    NgayDangKy DATETIME DEFAULT GETDATE()
);
GO

CREATE TABLE TieuPham (
    ID INT PRIMARY KEY IDENTITY(1,1),
    TieuDe NVARCHAR(255) NOT NULL,
    MoTa NVARCHAR(MAX),
    LinkVideo NVARCHAR(255),
    Poster NVARCHAR(255),
    LuotXem INT DEFAULT 0,
    NgayTao DATETIME DEFAULT GETDATE(),
    TrangThai bit
);
GO

CREATE TABLE YeuThich (
    ID INT PRIMARY KEY IDENTITY(1,1),
    IDNguoiDung INT,
    IDTieuPham INT,
    NgayYeuThich DATETIME DEFAULT GETDATE(),
    FOREIGN KEY (IDNguoiDung) REFERENCES NguoiDung(ID),
    FOREIGN KEY (IDTieuPham) REFERENCES TieuPham(ID)
);
GO

CREATE TABLE ChiaSe (
    ID INT PRIMARY KEY IDENTITY(1,1),
    IDNguoiDung INT,
    IDTieuPham INT,
    NgayChiaSe DATETIME DEFAULT GETDATE(),
    FOREIGN KEY (IDNguoiDung) REFERENCES NguoiDung(ID),
    FOREIGN KEY (IDTieuPham) REFERENCES TieuPham(ID)
);
GO

CREATE TABLE ChiaSeEmail (
    ID INT PRIMARY KEY IDENTITY(1,1),
    IDChiaSe INT,
    EmailNhan NVARCHAR(255),
    FOREIGN KEY (IDChiaSe) REFERENCES ChiaSe(ID)
);
GO

CREATE TABLE LuotXem (
    ID INT PRIMARY KEY IDENTITY(1,1),
    IDNguoiDung INT,
    IDTieuPham INT,
    NgayXem DATETIME DEFAULT GETDATE(),
    FOREIGN KEY (IDNguoiDung) REFERENCES NguoiDung(ID),
    FOREIGN KEY (IDTieuPham) REFERENCES TieuPham(ID)
);
GO

INSERT INTO NguoiDung (TenNguoiDung, Email, MatKhau, VaiTro) VALUES
(N'Nguyen Van A', 'nguyenvana@example.com', 'passwordA', 0),
(N'Tran Thi B', 'tranthib@example.com', 'passwordB', 0),
(N'Le Van C', 'levanc@example.com', 'passwordC', 0),
(N'Pham Thi D', 'phamthid@example.com', 'passwordD', 0),
(N'Nguyen Van E', 'nguyenvane@example.com', 'passwordE', 1);
GO

INSERT INTO TieuPham (TieuDe, MoTa, LinkVideo, Poster, LuotXem, TrangThai) VALUES
(N'BẤT QUÁ NHÂN GIAN - CHU THÚY QUỲNH live at Mây Lang Thang | Official Music Video', 
 N'Nhạc hoa lời Việt từ Nguyễn Duy Tùng, với lời bài hát về nỗi buồn và nỗi đau trong cuộc sống, nhấn mạnh sự cô đơn và sự thấu hiểu từ ánh trăng trên cao.', 
 'https://www.youtube.com/watch?v=A4xED6243Jw', 'thumbnail1.jpg', 100, 1),

(N'Tổng Hợp Tất Cả Các Video Hài Meme Phương Hữu Côn (TEAM PHD)', 
 N'Bộ sưu tập video hài meme của Phương Hữu Côn, kêu gọi ủng hộ và đăng ký kênh để đạt thành tích mới trên YouTube.', 
 'https://www.youtube.com/watch?v=IBFXTnoxYfg', 'thumbnail2.jpg', 200, 1),

(N'Tiktok gái xinh 😍 gái xinh 24k', 
 N'Kênh YouTube chia sẻ video của các cô gái xinh đẹp trên nhiều nền tảng mạng xã hội, giúp giải trí và giải tỏa stress.', 
 'https://www.youtube.com/watch?v=N9H2SjGoBTU', 'thumbnail3.jpg', 300, 1),

(N'NHÓC CAO THỦ QUÉT CHÙA - Trích Đoạn Bộ Phim TỰ CỔ ANH HÙNG XUẤT THIẾU NIÊN', 
 N'Phim kể về Thiết Bưu, một cậu bé hiền lành, siêng năng và kiên cường, đứng lên chống lại kẻ thù để bảo vệ chính nghĩa.', 
 'https://www.youtube.com/watch?v=5Oo_C23XSAA', 'thumbnail4.jpg', 150, 1),

(N'TÂY DU KÝ 1986 | Trọn Bộ 48 Tập Thuyết Minh', 
 N'Câu chuyện kinh điển của Tôn Ngộ Không, Trư Bát Giới và Sa Tăng phò Đường Tăng sang Tây Trúc, đối mặt với 81 kiếp nạn.', 
 'https://www.youtube.com/watch?v=hGhdUz8A4OI', 'thumbnail5.jpg', 500, 1),

(N'Song Ca Đầy Ấn Tượng - Bảo Anh & Táo Live "Từng Là Của Nhau" & Loạt Top Hit Gây Bão 2024', 
 N'Buổi biểu diễn trực tiếp của Bảo Anh và Táo với ca khúc "Từng Là Của Nhau" và các bản hit đình đám.', 
 'https://www.youtube.com/watch?v=99egXQYh8_Q&t=1079s', 'thumbnail6.jpg', 250, 1),

(N'Lớp học nhân phẩm - Test PBE!', 
 N'Video lớp học về game Đấu Trường Chân Lý (Teamfight Tactics), kêu gọi người xem nhấn Like và Sub để ủng hộ.', 
 'https://www.youtube.com/watch?v=0QM3wsVe-RM', 'thumbnail7.jpg', 180, 1),

(N'Last Christmas Remix 🎅 Merry Christmas - Nhạc Giáng Sinh Remix Mới Nhất', 
 N'Phiên bản remix các bài nhạc Giáng Sinh nổi tiếng như Last Christmas, We Wish You A Merry Christmas, Feliz Navidad.', 
 'https://www.youtube.com/watch?v=LipVmyQlypk', 'thumbnail8.jpg', 400, 1),

(N'Kim Jong un drives Putin during state visit to North Korea', 
 N'Tổng thống Putin thăm Việt Nam và hội đàm với Kim Jong-un về hỗ trợ lẫn nhau và chống lại trật tự quốc tế do Mỹ lãnh đạo.', 
 'https://www.youtube.com/watch?v=DNHHtFVibK8', 'thumbnail9.jpg', 350, 1),

(N'Spring Boot, Spring Security, JWT Course – Shopping Cart Backend Java Project', 
 N'Master spring boot and spring security by building a shopping cart backend project.', 
 'https://www.youtube.com/watch?v=oGhc5Z-WJSw&t=2154s', 'thumbnail10.jpg', 350, 1);

GO

INSERT INTO YeuThich (IDNguoiDung, IDTieuPham) VALUES
(1, 1),
(1, 2),
(2, 3),
(2, 4),
(3, 5),
(4, 6),
(5, 7),
(5, 8),
(4, 9),
(3, 10);
GO

INSERT INTO ChiaSe (IDNguoiDung, IDTieuPham) VALUES
(1, 1),
(1, 2),
(2, 3),
(3, 4),
(4, 5),
(5, 6),
(5, 7),
(3, 8),
(2, 9),
(1, 10);
GO

INSERT INTO ChiaSeEmail (IDChiaSe, EmailNhan) VALUES
(1, 'friend1@example.com'),
(2, 'friend2@example.com'),
(2, 'friend3@example.com'),
(3, 'friend4@example.com'),
(4, 'friend5@example.com'),
(5, 'friend6@example.com'),
(5, 'friend7@example.com'),
(6, 'friend8@example.com'),
(7, 'friend9@example.com'),
(7, 'friend10@example.com'),
(8, 'friend11@example.com'),
(9, 'friend12@example.com'),
(10, 'friend13@example.com');
GO

INSERT INTO LuotXem (IDNguoiDung, IDTieuPham, NgayXem) VALUES
(1, 1, '2024-11-01 10:00:00'),
(1, 3, '2024-11-02 11:00:00'),
(2, 2, '2024-11-03 12:00:00'),
(2, 5, '2024-11-03 13:00:00'),
(3, 4, '2024-11-04 14:00:00'),
(4, 6, '2024-11-05 15:00:00'),
(4, 8, '2024-11-05 16:00:00'),
(5, 7, '2024-11-06 17:00:00'),
(3, 9, '2024-11-07 18:00:00'),
(1, 10, '2024-11-08 19:00:00');
GO

SELECT * FROM NguoiDung;
SELECT * FROM TieuPham;
SELECT * FROM YeuThich;
SELECT * FROM ChiaSe;
SELECT * FROM LuotXem;
