USE [quanlibansach]
GO
/****** Object:  Table [dbo].[Account]    Script Date: 5/31/2024 10:05:59 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account](
	[fullName] [nvarchar](50) NULL,
	[userName] [nvarchar](50) NOT NULL,
	[password] [nvarchar](60) NULL,
	[role] [nvarchar](50) NULL,
	[status] [int] NULL,
	[email] [nvarchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[userName] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ChiTietPhieuNhap]    Script Date: 5/31/2024 10:05:59 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietPhieuNhap](
	[maPhieu] [nvarchar](50) NOT NULL,
	[maSH] [nvarchar](50) NOT NULL,
	[soLuong] [int] NULL,
	[donGia] [float] NULL,
PRIMARY KEY CLUSTERED 
(
	[maPhieu] ASC,
	[maSH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ChiTietPhieuXuat]    Script Date: 5/31/2024 10:05:59 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietPhieuXuat](
	[maPhieu] [nvarchar](50) NOT NULL,
	[maSH] [nvarchar](50) NOT NULL,
	[soLuong] [int] NULL,
	[donGia] [float] NULL,
PRIMARY KEY CLUSTERED 
(
	[maPhieu] ASC,
	[maSH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 5/31/2024 10:05:59 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang](
	[maKH] [nvarchar](50) NOT NULL,
	[tenKH] [nvarchar](50) NULL,
	[dc] [nvarchar](150) NULL,
	[sdt] [nvarchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[maKH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhaCungCap]    Script Date: 5/31/2024 10:05:59 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhaCungCap](
	[maNhaCungCap] [nvarchar](50) NOT NULL,
	[tenNhaCungCap] [nvarchar](50) NULL,
	[Sdt] [nvarchar](50) NULL,
	[diaChi] [nvarchar](150) NULL,
PRIMARY KEY CLUSTERED 
(
	[maNhaCungCap] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PhieuNhap]    Script Date: 5/31/2024 10:05:59 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhieuNhap](
	[maPhieu] [nvarchar](50) NOT NULL,
	[thoiGianTao] [datetime] NULL,
	[nguoiTao] [nvarchar](50) NULL,
	[maNhaCungCap] [nvarchar](50) NULL,
	[tongTien] [float] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[maPhieu] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PhieuXuat]    Script Date: 5/31/2024 10:05:59 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhieuXuat](
	[maPhieu] [nvarchar](50) NOT NULL,
	[thoiGianTao] [datetime] NOT NULL,
	[nguoiTao] [nvarchar](50) NOT NULL,
	[tongTien] [float] NOT NULL,
	[maKH] [nvarchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[maPhieu] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Sach]    Script Date: 5/31/2024 10:05:59 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Sach](
	[maSH] [nvarchar](50) NOT NULL,
	[tenSH] [nvarchar](100) NULL,
	[soLuong] [int] NOT NULL,
	[Tacgia] [nvarchar](50) NOT NULL,
	[NXB] [nvarchar](50) NOT NULL,
	[MoTa] [nvarchar](500) NULL,
	[ngayphathanh] [nvarchar](50) NULL,
	[ngaytaiban] [nvarchar](50) NULL,
	[lantaiban] [int] NULL,
	[loaiSH] [nvarchar](50) NULL,
	[sochuong] [int] NULL,
	[trangthaiSH] [nvarchar](100) NULL,
	[sotrang] [int] NULL,
	[gia] [float] NULL,
	[trangThai] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[maSH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[Account] ([fullName], [userName], [password], [role], [status], [email]) VALUES (N'Admin', N'admin', N'$2a$12$Y87zSnx.tpFvieylSeXuo.agjb7swi3UVnoo6KVMY9xP5STj4zJhm', N'Admin', 1, N'phapphan110703@gmail.com')
INSERT [dbo].[Account] ([fullName], [userName], [password], [role], [status], [email]) VALUES (N'NhanVienNhap', N'nvnhap', N'$2a$12$MVoyprOjXzLo/eb.q13fDumElVbpFRXk0xqgHljiCBi1bG6RLZsF6', N'Nhân viên nhập', 1, N'phaptu@gmail.com')
INSERT [dbo].[Account] ([fullName], [userName], [password], [role], [status], [email]) VALUES (N'NhanVienXuat', N'nvxuat', N'$2a$12$tJQ/pZCTXwY/53zbq8H8MuffGGgqeXayQRS1.vHlZkrIuiYDu6.xK', N'Nhân viên xuất', 1, N'phapphan@gmail.com')
INSERT [dbo].[Account] ([fullName], [userName], [password], [role], [status], [email]) VALUES (N'QuanLyKho', N'qlkho', N'$2a$12$aVu8CbwiBXS10A7xbdsmV.66YpO3LzUI6YWXS5bE.2URF23pyze8G', N'Quản lý kho', 1, N'phap@gmail.com')
GO
INSERT [dbo].[ChiTietPhieuNhap] ([maPhieu], [maSH], [soLuong], [donGia]) VALUES (N'PN1', N'SGK', 1, 19490000)
INSERT [dbo].[ChiTietPhieuNhap] ([maPhieu], [maSH], [soLuong], [donGia]) VALUES (N'PN1', N'TT', 1, 23490000)
INSERT [dbo].[ChiTietPhieuNhap] ([maPhieu], [maSH], [soLuong], [donGia]) VALUES (N'PN2', N'TT', 2, 22990000)
INSERT [dbo].[ChiTietPhieuNhap] ([maPhieu], [maSH], [soLuong], [donGia]) VALUES (N'PN3', N'SGK', 2, 45000)
INSERT [dbo].[ChiTietPhieuNhap] ([maPhieu], [maSH], [soLuong], [donGia]) VALUES (N'PN4', N'TT4', 51, 125000)
INSERT [dbo].[ChiTietPhieuNhap] ([maPhieu], [maSH], [soLuong], [donGia]) VALUES (N'PN5', N'TT3', 50, 45000)
INSERT [dbo].[ChiTietPhieuNhap] ([maPhieu], [maSH], [soLuong], [donGia]) VALUES (N'PN6', N'SGK2', 50, 45000)
INSERT [dbo].[ChiTietPhieuNhap] ([maPhieu], [maSH], [soLuong], [donGia]) VALUES (N'PN6', N'SGK3', 50, 45000)
INSERT [dbo].[ChiTietPhieuNhap] ([maPhieu], [maSH], [soLuong], [donGia]) VALUES (N'PN6', N'TT2', 50, 125000)
GO
INSERT [dbo].[ChiTietPhieuXuat] ([maPhieu], [maSH], [soLuong], [donGia]) VALUES (N'PX1', N'SGK', 13, 19490000)
INSERT [dbo].[ChiTietPhieuXuat] ([maPhieu], [maSH], [soLuong], [donGia]) VALUES (N'PX1', N'TT', 1, 23490000)
INSERT [dbo].[ChiTietPhieuXuat] ([maPhieu], [maSH], [soLuong], [donGia]) VALUES (N'PX2', N'TT', 1, 15000000)
INSERT [dbo].[ChiTietPhieuXuat] ([maPhieu], [maSH], [soLuong], [donGia]) VALUES (N'PX3', N'TT', 3, 20790000)
INSERT [dbo].[ChiTietPhieuXuat] ([maPhieu], [maSH], [soLuong], [donGia]) VALUES (N'PX4', N'SGK2', 1, 45000)
INSERT [dbo].[ChiTietPhieuXuat] ([maPhieu], [maSH], [soLuong], [donGia]) VALUES (N'PX4', N'TT2', 1, 125000)
INSERT [dbo].[ChiTietPhieuXuat] ([maPhieu], [maSH], [soLuong], [donGia]) VALUES (N'PX4', N'TT3', 1, 45000)
INSERT [dbo].[ChiTietPhieuXuat] ([maPhieu], [maSH], [soLuong], [donGia]) VALUES (N'PX4', N'TT4', 2, 125000)
GO
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [dc], [sdt]) VALUES (N'KH01', N'Nguyễn Hữu Nghĩa', N'122 Trường Chinh , Tân Phú, HCM', N'0123456789')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [dc], [sdt]) VALUES (N'KH02', N'Trần Anh Tú', N'63/3 Đường số 7 , Bình Tân, Tân Phú, HCM', N'0987654321')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [dc], [sdt]) VALUES (N'KH03', N'Nguyễn Ngọc Ánh', N'755 Đường Dương Đức Hiền, Tân Phú, HCM', N'0369852147')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [dc], [sdt]) VALUES (N'KH04', N'Nguy?n H?u Nghia', N'122 Tru?ng Chinh, Tân Phú, HCM', N'0123456789')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [dc], [sdt]) VALUES (N'KH05', N'Tr?n Anh Tú', N'63/3 Ðu?ng s? 7, Bình Tân, Tân Phú, HCM', N'0987654321')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [dc], [sdt]) VALUES (N'KH06', N'Nguy?n Ng?c Ánh', N'755 Ðu?ng Duong Ð?c Hi?n, Tân Phú, HCM', N'0369852147')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [dc], [sdt]) VALUES (N'KH07', N'Lê Minh Tâm', N'45/3 Nguy?n Van C?, Qu?n 5, HCM', N'0912345678')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [dc], [sdt]) VALUES (N'KH08', N'Ph?m Th? H?ng', N'123 Lê L?i, Qu?n 1, HCM', N'0908765432')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [dc], [sdt]) VALUES (N'KH09', N'Hoàng Van Long', N'789 L?c Long Quân, Tân Bình, HCM', N'0987123456')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [dc], [sdt]) VALUES (N'KH10', N'Tr?n Van An', N'456 Ph?m Van B?ch, Gò V?p, HCM', N'0938761234')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [dc], [sdt]) VALUES (N'KH11', N'Ð?ng Th? Lan', N'321 Hu?nh T?n Phát, Qu?n 7, HCM', N'0945123456')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [dc], [sdt]) VALUES (N'KH12', N'Nguy?n Th? Mai', N'234 Phan Ðang Luu, Phú Nhu?n, HCM', N'0918765432')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [dc], [sdt]) VALUES (N'KH13', N'Lê H?ng Phúc', N'567 Cách M?ng Tháng Tám, Qu?n 3, HCM', N'0909123456')
GO
INSERT [dbo].[NhaCungCap] ([maNhaCungCap], [tenNhaCungCap], [Sdt], [diaChi]) VALUES (N'NSF', N'Nhà sách Fahasa', N'0987654321', N'456 Đường Cầu Giấy, Quận Cầu Giấy')
INSERT [dbo].[NhaCungCap] ([maNhaCungCap], [tenNhaCungCap], [Sdt], [diaChi]) VALUES (N'NSMK', N'Nhà sách Minh Khai', N'0123456789', N'123 Ðuờng Minh Khai, Quận Hai Bà Trung')
INSERT [dbo].[NhaCungCap] ([maNhaCungCap], [tenNhaCungCap], [Sdt], [diaChi]) VALUES (N'NSPN', N'Nhà sách Phuong Nam', N'0369852147', N'789 Ðuờng Nguyễn Văn Cừ, Quận 1')
GO
INSERT [dbo].[PhieuNhap] ([maPhieu], [thoiGianTao], [nguoiTao], [maNhaCungCap], [tongTien]) VALUES (N'PN1', CAST(N'2023-12-01T13:59:09.000' AS DateTime), N'admin', N'NSMK', 42980000)
INSERT [dbo].[PhieuNhap] ([maPhieu], [thoiGianTao], [nguoiTao], [maNhaCungCap], [tongTien]) VALUES (N'PN2', CAST(N'2022-12-07T18:04:19.000' AS DateTime), N'admin', N'NSPN', 112440000)
INSERT [dbo].[PhieuNhap] ([maPhieu], [thoiGianTao], [nguoiTao], [maNhaCungCap], [tongTien]) VALUES (N'PN3', CAST(N'2024-05-19T11:31:48.207' AS DateTime), N'admin', N'NSF', 90000)
INSERT [dbo].[PhieuNhap] ([maPhieu], [thoiGianTao], [nguoiTao], [maNhaCungCap], [tongTien]) VALUES (N'PN4', CAST(N'2024-05-31T18:23:43.090' AS DateTime), N'admin', N'NSMK', 6375000)
INSERT [dbo].[PhieuNhap] ([maPhieu], [thoiGianTao], [nguoiTao], [maNhaCungCap], [tongTien]) VALUES (N'PN5', CAST(N'2024-05-31T18:24:18.153' AS DateTime), N'admin', N'NSMK', 2250000)
INSERT [dbo].[PhieuNhap] ([maPhieu], [thoiGianTao], [nguoiTao], [maNhaCungCap], [tongTien]) VALUES (N'PN6', CAST(N'2024-05-31T18:24:40.607' AS DateTime), N'admin', N'NSMK', 10750000)
GO
INSERT [dbo].[PhieuXuat] ([maPhieu], [thoiGianTao], [nguoiTao], [tongTien], [maKH]) VALUES (N'PX1', CAST(N'2022-12-01T14:10:44.000' AS DateTime), N'admin', 291860000, N'KH01')
INSERT [dbo].[PhieuXuat] ([maPhieu], [thoiGianTao], [nguoiTao], [tongTien], [maKH]) VALUES (N'PX2', CAST(N'2022-12-04T16:45:43.000' AS DateTime), N'admin', 70660000, N'KH02')
INSERT [dbo].[PhieuXuat] ([maPhieu], [thoiGianTao], [nguoiTao], [tongTien], [maKH]) VALUES (N'PX3', CAST(N'2022-12-04T16:45:52.000' AS DateTime), N'admin', 89350000, N'KH03')
INSERT [dbo].[PhieuXuat] ([maPhieu], [thoiGianTao], [nguoiTao], [tongTien], [maKH]) VALUES (N'PX4', CAST(N'2024-05-31T18:25:39.517' AS DateTime), N'Admin', 465000, N'KH01')
GO
INSERT [dbo].[Sach] ([maSH], [tenSH], [soLuong], [Tacgia], [NXB], [MoTa], [ngayphathanh], [ngaytaiban], [lantaiban], [loaiSH], [sochuong], [trangthaiSH], [sotrang], [gia], [trangThai]) VALUES (N'SGK', N'Toán 12', 50, N'Nguyễn Văn Toản', N'Nhà Xuất Bản Giáo Dục', N'Sách giáo khoa Toán lớp 12', N'2010-01-01', N'2018-07-19', 7, N'Sách giáo khoa', NULL, NULL, 300, 45000, 1)
INSERT [dbo].[Sach] ([maSH], [tenSH], [soLuong], [Tacgia], [NXB], [MoTa], [ngayphathanh], [ngaytaiban], [lantaiban], [loaiSH], [sochuong], [trangthaiSH], [sotrang], [gia], [trangThai]) VALUES (N'SGK2', N'Đạo đức 5', 49, N'Ths.Nguyễn Văn Ánh', N'Nhà Xuất Bản giáo Dục', N'Sách giáo khoa Đạo đức lớp 5', N'11/02/2016', N'22/12/2022', 2, N'Sách giáo khoa', NULL, NULL, 56, 45000, 1)
INSERT [dbo].[Sach] ([maSH], [tenSH], [soLuong], [Tacgia], [NXB], [MoTa], [ngayphathanh], [ngaytaiban], [lantaiban], [loaiSH], [sochuong], [trangthaiSH], [sotrang], [gia], [trangThai]) VALUES (N'SGK3', N'Địa lý 12', 50, N'Ths. Trần Thanh Sơn', N'Nhà Xuất Bản Giáo Dục', N'Sách địa lý lớp 12', N'12/9/2016', N'22/8/2019', 3, N'Sách giáo khoa', NULL, NULL, 125, 45000, 1)
INSERT [dbo].[Sach] ([maSH], [tenSH], [soLuong], [Tacgia], [NXB], [MoTa], [ngayphathanh], [ngaytaiban], [lantaiban], [loaiSH], [sochuong], [trangthaiSH], [sotrang], [gia], [trangThai]) VALUES (N'SGK4', N'Hóa học 12', 25, N'Ths. Trần Thanh Sơn', N'Nhà Xuất Bản Giáo Dục', N'Sách hóa lớp 12', N'12/9/2016', N'22/12/2022', 4, N'Sách giáo khoa', NULL, NULL, 92, 37000, 1)
INSERT [dbo].[Sach] ([maSH], [tenSH], [soLuong], [Tacgia], [NXB], [MoTa], [ngayphathanh], [ngaytaiban], [lantaiban], [loaiSH], [sochuong], [trangthaiSH], [sotrang], [gia], [trangThai]) VALUES (N'TT', N'Tôi thấy hoa vàng trên cỏ xanh', 98, N'Nguyễn Nhật Ánh', N'Nhà Xuất Bản Giáo Dục', N'Tác phẩm nổi tiếng của Nhật Ánh', N'2005-01-01', NULL, NULL, N'Truyện - Tiểu thuyết', 200, N'Ðã hoàn thành', 1500, 250000, 1)
INSERT [dbo].[Sach] ([maSH], [tenSH], [soLuong], [Tacgia], [NXB], [MoTa], [ngayphathanh], [ngaytaiban], [lantaiban], [loaiSH], [sochuong], [trangthaiSH], [sotrang], [gia], [trangThai]) VALUES (N'TT2', N'Connan movie 18', 49, N'Ayama Gosho', N'Kim Đồng', N'Truyện trinh thám conan', N'12/2/2021', NULL, NULL, N'Truyện - Tiểu thuyết', 2, N'Hoàn thành', 97, 125000, 1)
INSERT [dbo].[Sach] ([maSH], [tenSH], [soLuong], [Tacgia], [NXB], [MoTa], [ngayphathanh], [ngaytaiban], [lantaiban], [loaiSH], [sochuong], [trangthaiSH], [sotrang], [gia], [trangThai]) VALUES (N'TT3', N'Doremon truyện dài', 49, N'Jujiko Jujio', N'Kim Đồng', N'Truyện tranh dài doremon ', N'21/8/2019', NULL, NULL, N'Truyện - Tiểu thuyết', 6, N'Hoàn thành', 136, 45000, 1)
INSERT [dbo].[Sach] ([maSH], [tenSH], [soLuong], [Tacgia], [NXB], [MoTa], [ngayphathanh], [ngaytaiban], [lantaiban], [loaiSH], [sochuong], [trangthaiSH], [sotrang], [gia], [trangThai]) VALUES (N'TT4', N'Doremon phiêu lưu ký', 49, N'Fujiko Jujio', N'Kim Đồng', N'Cuộc phiêu lưu của doremon tới vùng đất thần kì', N'22/12/2023', NULL, NULL, N'Truyện - Tiểu thuyết', 3, N'Hoàn thành', 89, 125000, 1)
INSERT [dbo].[Sach] ([maSH], [tenSH], [soLuong], [Tacgia], [NXB], [MoTa], [ngayphathanh], [ngaytaiban], [lantaiban], [loaiSH], [sochuong], [trangthaiSH], [sotrang], [gia], [trangThai]) VALUES (N'TT5', N'Dragon Ball', 25, N'Ajfuko', N'Kim Đồng', N'Truyện tranh Dragon Ball', N'21/8/2019', NULL, NULL, N'Truyện - Tiểu thuyết', 4, N'Hoàn thành', 152, 153000, 1)
GO
ALTER TABLE [dbo].[PhieuXuat] ADD  DEFAULT (getdate()) FOR [thoiGianTao]
GO
ALTER TABLE [dbo].[Sach] ADD  DEFAULT ((0)) FOR [soLuong]
GO
ALTER TABLE [dbo].[Sach] ADD  DEFAULT ('0') FOR [Tacgia]
GO
ALTER TABLE [dbo].[Sach] ADD  DEFAULT ('0') FOR [NXB]
GO
ALTER TABLE [dbo].[Sach] ADD  DEFAULT ((0)) FOR [gia]
GO
ALTER TABLE [dbo].[ChiTietPhieuNhap]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietPhieuNhap_PhieuNhap] FOREIGN KEY([maPhieu])
REFERENCES [dbo].[PhieuNhap] ([maPhieu])
GO
ALTER TABLE [dbo].[ChiTietPhieuNhap] CHECK CONSTRAINT [FK_ChiTietPhieuNhap_PhieuNhap]
GO
ALTER TABLE [dbo].[ChiTietPhieuNhap]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietPhieuNhap_Sach] FOREIGN KEY([maSH])
REFERENCES [dbo].[Sach] ([maSH])
GO
ALTER TABLE [dbo].[ChiTietPhieuNhap] CHECK CONSTRAINT [FK_ChiTietPhieuNhap_Sach]
GO
ALTER TABLE [dbo].[ChiTietPhieuXuat]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietPhieuXuat_PhieuXuat] FOREIGN KEY([maPhieu])
REFERENCES [dbo].[PhieuXuat] ([maPhieu])
GO
ALTER TABLE [dbo].[ChiTietPhieuXuat] CHECK CONSTRAINT [FK_ChiTietPhieuXuat_PhieuXuat]
GO
ALTER TABLE [dbo].[ChiTietPhieuXuat]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietPhieuXuat_Sach] FOREIGN KEY([maSH])
REFERENCES [dbo].[Sach] ([maSH])
GO
ALTER TABLE [dbo].[ChiTietPhieuXuat] CHECK CONSTRAINT [FK_ChiTietPhieuXuat_Sach]
GO
ALTER TABLE [dbo].[PhieuNhap]  WITH CHECK ADD  CONSTRAINT [FK_PhieuNhap_Account] FOREIGN KEY([nguoiTao])
REFERENCES [dbo].[Account] ([userName])
GO
ALTER TABLE [dbo].[PhieuNhap] CHECK CONSTRAINT [FK_PhieuNhap_Account]
GO
ALTER TABLE [dbo].[PhieuNhap]  WITH CHECK ADD  CONSTRAINT [FK_PhieuNhap_NhaCungCap] FOREIGN KEY([maNhaCungCap])
REFERENCES [dbo].[NhaCungCap] ([maNhaCungCap])
GO
ALTER TABLE [dbo].[PhieuNhap] CHECK CONSTRAINT [FK_PhieuNhap_NhaCungCap]
GO
ALTER TABLE [dbo].[PhieuXuat]  WITH CHECK ADD  CONSTRAINT [FK_PhieuXuat_Account] FOREIGN KEY([nguoiTao])
REFERENCES [dbo].[Account] ([userName])
GO
ALTER TABLE [dbo].[PhieuXuat] CHECK CONSTRAINT [FK_PhieuXuat_Account]
GO
ALTER TABLE [dbo].[PhieuXuat]  WITH CHECK ADD  CONSTRAINT [FK_PhieuXuat_KhachHang] FOREIGN KEY([maKH])
REFERENCES [dbo].[KhachHang] ([maKH])
GO
ALTER TABLE [dbo].[PhieuXuat] CHECK CONSTRAINT [FK_PhieuXuat_KhachHang]
GO
