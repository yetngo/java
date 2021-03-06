USE [J3.L.P0021]
GO
/****** Object:  Table [dbo].[Blog]    Script Date: 10/21/2020 3:22:29 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Blog](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[title] [nchar](30) NULL,
	[date] [date] NULL,
	[img] [nchar](100) NULL,
	[content] [nvarchar](max) NULL,
 CONSTRAINT [PK_Blog] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[GuestBook]    Script Date: 10/21/2020 3:22:29 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[GuestBook](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](30) NULL,
	[img] [nchar](100) NULL,
	[content] [nvarchar](max) NULL,
	[date] [date] NULL,
 CONSTRAINT [PK_GuestBook] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Photo]    Script Date: 10/21/2020 3:22:29 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Photo](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[img] [nchar](100) NULL,
 CONSTRAINT [PK_Photo] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET IDENTITY_INSERT [dbo].[Blog] ON 

INSERT [dbo].[Blog] ([id], [title], [date], [img], [content]) VALUES (1, N'Photo                         ', CAST(N'2014-06-04' AS Date), N'i282319414620601978._szw1280h1280_.jpg                                                              ', NULL)
INSERT [dbo].[Blog] ([id], [title], [date], [img], [content]) VALUES (2, N'Don''t Go Far Off              ', CAST(N'2012-11-20' AS Date), NULL, N'Don''t go far off, not even for a day, because -- because -- I don''t know how to say it: a day is long and I will be waiting for you, as in an empty station when the trains are parked off somewhere else, asleep. Don''t leave me, even for an hour, because then the little drops of anguish will all run together, the smoke that roams looking for a home will drift into me, choking my lost heart. Oh, may your silhouette never dissolve on the beach; may your eyelids never flutter into the empty distance. Don''t leave me for a second, my dearest, because in that moment you''ll have gone so far I''ll wander mazily over all the earth, asking, Will you come back? Will you leave me here, dying?')
INSERT [dbo].[Blog] ([id], [title], [date], [img], [content]) VALUES (3, N'Dolore magna aliquam          ', CAST(N'2012-11-20' AS Date), N'i282319414620602005._szw480h1280_.jpg                                                               ', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.
                                                            Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper
                                                            suscipit lobortis nisl ut aliquip ex ea commodo consequat.
                                                            Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis.&nbsp;Claritas est etiam processus dynamicus, qui sequitur
                                                            mutationem consuetudium lectorum.&nbsp;Mirum est notare quam littera gothica.')
INSERT [dbo].[Blog] ([id], [title], [date], [img], [content]) VALUES (4, N'Quote                         ', CAST(N'2012-11-20' AS Date), NULL, N'"If I had a flower for every time I thought of you ...I could walk through my garden forever."-
                                                            Alfred Tennyson')
SET IDENTITY_INSERT [dbo].[Blog] OFF
SET IDENTITY_INSERT [dbo].[GuestBook] ON 

INSERT [dbo].[GuestBook] ([id], [name], [img], [content], [date]) VALUES (1, N'Charlotte', N's7ae3b6c800a342ed95b955bd73ab42db.jpg                                                               ', N'Claritas est etiam processus dynamicus, qui sequitur mutationem consuetudium lectorum. Mirum est not...', CAST(N'2015-10-27' AS Date))
INSERT [dbo].[GuestBook] ([id], [name], [img], [content], [date]) VALUES (2, N'Andre Martin', NULL, N'Mirum est notare quam littera gothica, quam nunc putamus parum claram, anteposuerit litterarum formas humanitatis per seacula quarta decima et quinta decima. Eodem modo typi, qui nunc nobis videntur parum clari, fiant sollemnes in futurum.', CAST(N'2012-11-20' AS Date))
SET IDENTITY_INSERT [dbo].[GuestBook] OFF
SET IDENTITY_INSERT [dbo].[Photo] ON 

INSERT [dbo].[Photo] ([id], [img]) VALUES (1, N'i282319414620602093._rsw360h270_szw360h270_.jpg                                                     ')
INSERT [dbo].[Photo] ([id], [img]) VALUES (2, N'i282319414620602124._rsw360h270_szw360h270_.jpg                                                     ')
INSERT [dbo].[Photo] ([id], [img]) VALUES (3, N'i282319414620602125._rsw360h270_szw360h270_.jpg                                                     ')
INSERT [dbo].[Photo] ([id], [img]) VALUES (4, N'i282319414620602127._rsw360h270_szw360h270_.jpg                                                     ')
INSERT [dbo].[Photo] ([id], [img]) VALUES (5, N'i282319414620602131._rsw360h270_szw360h270_.jpg                                                     ')
INSERT [dbo].[Photo] ([id], [img]) VALUES (6, N'i282319414620602132._rsw360h270_szw360h270_.jpg                                                     ')
INSERT [dbo].[Photo] ([id], [img]) VALUES (7, N'i282319414620602133._rsw360h270_szw360h270_.jpg                                                     ')
INSERT [dbo].[Photo] ([id], [img]) VALUES (8, N'i282319414620602136._rsw360h270_szw360h270_.jpg                                                     ')
SET IDENTITY_INSERT [dbo].[Photo] OFF
