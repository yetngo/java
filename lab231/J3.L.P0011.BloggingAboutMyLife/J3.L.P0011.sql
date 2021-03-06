USE [J3.L.P0011]
GO
/****** Object:  Table [dbo].[aboutMe]    Script Date: 9/17/2020 1:12:09 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[aboutMe](
	[detail] [nvarchar](50) NULL,
	[name] [nvarchar](50) NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[blog]    Script Date: 9/17/2020 1:12:10 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[blog](
	[id] [int] NULL,
	[name] [nvarchar](50) NULL,
	[image] [nvarchar](max) NULL,
	[detail] [nvarchar](max) NULL,
	[date] [date] NULL,
	[type] [nvarchar](50) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
INSERT [dbo].[aboutMe] ([detail], [name]) VALUES (N'Nhan is a student in SE1402. ', N'Nhan')
INSERT [dbo].[blog] ([id], [name], [image], [detail], [date], [type]) VALUES (1, N'linh', N'./home_files/i283445314544979646._szw480h1280_.jpg', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.

At eam doctus oportere, eam feugait delectus ne. Quo cu vulputate persecuti. Eum ut natum possim comprehensam, habeo dicta scaevola eu nec. Ea adhuc reformidans eam. Pri dolore epicuri eu, ne cum tantas fierent instructior. Pro ridens intellegam ut, sea at graecis scriptorem eloquentiam.

Per an labitur lucilius ullamcorper, esse erat ponderum ad vim. Possim laoreet suscipit ex pri, vix numquam eruditi feugait in. Nec maluisset complectitur te, at sea decore semper. Falli numquam perpetua sea et, tibique repudiandae an pro. Ut his solum persius postulant. Soluta nemore debitis ne eos, cum an scripta pericula partiendo.', CAST(N'2015-11-16' AS Date), N'blog')
INSERT [dbo].[blog] ([id], [name], [image], [detail], [date], [type]) VALUES (2, N'hoa', N'./home_files/i283445314544979644._szw1280h1280_.jpg', NULL, CAST(N'2015-11-16' AS Date), N'photo')
INSERT [dbo].[blog] ([id], [name], [image], [detail], [date], [type]) VALUES (3, N'duong', N'./home_files/i283445314544979646._szw480h1281_.jpg', N'"“You''ve gotta dance like there''s nobody watching,
Love like you''ll never be hurt,
Sing like there''s nobody listening,
And live like it''s heaven on earth.” "

', CAST(N'2015-11-16' AS Date), N'poem')
INSERT [dbo].[blog] ([id], [name], [image], [detail], [date], [type]) VALUES (4, N'Nhan', N'./home_files/Le Thi Thanh Nhan_29102000_N4.jpg', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.

At eam doctus oportere, eam feugait delectus ne. Quo cu vulputate persecuti. Eum ut natum possim comprehensam, habeo dicta scaevola eu nec. Ea adhuc reformidans eam. Pri dolore epicuri eu, ne cum tantas fierent instructior. Pro ridens intellegam ut, sea at graecis scriptorem eloquentiam.

Per an labitur lucilius ullamcorper, esse erat ponderum ad vim. Possim laoreet suscipit ex pri, vix numquam eruditi feugait in. Nec maluisset complectitur te, at sea decore semper. Falli numquam perpetua sea et, tibique repudiandae an pro. Ut his solum persius postulant. Soluta nemore debitis ne eos, cum an scripta pericula partiendo.', CAST(N'2015-11-16' AS Date), N'blog')
INSERT [dbo].[blog] ([id], [name], [image], [detail], [date], [type]) VALUES (2, N'hoa', N'./home_files/i283445314544979644._szw1280h1280_.jpg', NULL, CAST(N'2015-11-16' AS Date), N'photo')
INSERT [dbo].[blog] ([id], [name], [image], [detail], [date], [type]) VALUES (3, N'duong', N'./home_files/i283445314544979646._szw480h1281_.jpg', N'"“You''ve gotta dance like there''s nobody watching,
Love like you''ll never be hurt,
Sing like there''s nobody listening,
And live like it''s heaven on earth.” "

', CAST(N'2015-11-16' AS Date), N'poem')
INSERT [dbo].[blog] ([id], [name], [image], [detail], [date], [type]) VALUES (2, N'hoa', N'./home_files/i283445314544979644._szw1280h1280_.jpg', NULL, CAST(N'2015-11-16' AS Date), N'photo')
INSERT [dbo].[blog] ([id], [name], [image], [detail], [date], [type]) VALUES (3, N'duong', N'./home_files/i283445314544979646._szw480h1281_.jpg', N'"“You''ve gotta dance like there''s nobody watching,
Love like you''ll never be hurt,
Sing like there''s nobody listening,
And live like it''s heaven on earth.” "

', CAST(N'2015-11-16' AS Date), N'poem')
INSERT [dbo].[blog] ([id], [name], [image], [detail], [date], [type]) VALUES (2, N'hoa', N'./home_files/i283445314544979644._szw1280h1280_.jpg', NULL, CAST(N'2015-11-16' AS Date), N'photo')
INSERT [dbo].[blog] ([id], [name], [image], [detail], [date], [type]) VALUES (3, N'duong', N'./home_files/i283445314544979646._szw480h1281_.jpg', N'"“You''ve gotta dance like there''s nobody watching,
Love like you''ll never be hurt,
Sing like there''s nobody listening,
And live like it''s heaven on earth.” "

', CAST(N'2015-11-16' AS Date), N'poem')
INSERT [dbo].[blog] ([id], [name], [image], [detail], [date], [type]) VALUES (1, N'linh', N'./home_files/i283445314544979646._szw480h1280_.jpg', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.

At eam doctus oportere, eam feugait delectus ne. Quo cu vulputate persecuti. Eum ut natum possim comprehensam, habeo dicta scaevola eu nec. Ea adhuc reformidans eam. Pri dolore epicuri eu, ne cum tantas fierent instructior. Pro ridens intellegam ut, sea at graecis scriptorem eloquentiam.

Per an labitur lucilius ullamcorper, esse erat ponderum ad vim. Possim laoreet suscipit ex pri, vix numquam eruditi feugait in. Nec maluisset complectitur te, at sea decore semper. Falli numquam perpetua sea et, tibique repudiandae an pro. Ut his solum persius postulant. Soluta nemore debitis ne eos, cum an scripta pericula partiendo.', CAST(N'2015-11-16' AS Date), N'blog')
INSERT [dbo].[blog] ([id], [name], [image], [detail], [date], [type]) VALUES (1, N'linh', N'./home_files/i283445314544979646._szw480h1280_.jpg', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.

At eam doctus oportere, eam feugait delectus ne. Quo cu vulputate persecuti. Eum ut natum possim comprehensam, habeo dicta scaevola eu nec. Ea adhuc reformidans eam. Pri dolore epicuri eu, ne cum tantas fierent instructior. Pro ridens intellegam ut, sea at graecis scriptorem eloquentiam.

Per an labitur lucilius ullamcorper, esse erat ponderum ad vim. Possim laoreet suscipit ex pri, vix numquam eruditi feugait in. Nec maluisset complectitur te, at sea decore semper. Falli numquam perpetua sea et, tibique repudiandae an pro. Ut his solum persius postulant. Soluta nemore debitis ne eos, cum an scripta pericula partiendo.', CAST(N'2015-11-16' AS Date), N'blog')
