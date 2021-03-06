USE [J3.L.P0027]
GO
/****** Object:  Table [dbo].[About]    Script Date: 11/4/2020 5:14:53 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[About](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[title] [nvarchar](50) NULL,
	[content] [nvarchar](max) NULL,
	[img] [nvarchar](100) NULL,
 CONSTRAINT [PK_About] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[home]    Script Date: 11/4/2020 5:14:53 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[home](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[title] [nvarchar](50) NULL,
	[img] [nvarchar](100) NULL,
	[content] [nvarchar](max) NULL,
	[date] [date] NULL,
	[link] [nvarchar](max) NULL,
 CONSTRAINT [PK_home] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Photo]    Script Date: 11/4/2020 5:14:53 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Photo](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[img] [nvarchar](max) NULL,
 CONSTRAINT [PK_Photo] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET IDENTITY_INSERT [dbo].[About] ON 

INSERT [dbo].[About] ([id], [title], [content], [img]) VALUES (1, N'About Our School', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum.

Typi non habent claritatem insitam; est usus legentis in iis qui facit eorum claritatem. Investigationes demonstraverunt lectores legere me lius quod ii legunt saepius. Claritas est etiam processus dynamicus, qui sequitur mutationem consuetudium lectorum. Mirum est notare quam littera gothica, quam nunc putamus parum claram, anteposuerit litterarum formas humanitatis per seacula quarta decima et quinta decima. Eodem modo typi, qui nunc nobis videntur parum clari, fiant sollemnes in futurum.', N'i285415639381953159._szw480h1280_.jpg')
INSERT [dbo].[About] ([id], [title], [content], [img]) VALUES (2, N'Volunteers', N'Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum.', NULL)
SET IDENTITY_INSERT [dbo].[About] OFF
SET IDENTITY_INSERT [dbo].[home] ON 

INSERT [dbo].[home] ([id], [title], [img], [content], [date], [link]) VALUES (1, N'Our school', N'i285415639381953156._szw1280h1280_.jpg', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.', CAST(N'2014-10-30' AS Date), NULL)
INSERT [dbo].[home] ([id], [title], [img], [content], [date], [link]) VALUES (2, N'We help children to get an education', N'i285415639381953158._szw480h1280_.jpg', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.

At eam doctus oportere, eam feugait delectus ne. Quo cu vulputate persecuti. Eum ut natum possim comprehensam, habeo dicta scaevola eu nec. Ea adhuc reformidans eam. Pri dolore epicuri eu, ne cum tantas fierent instructior. Pro ridens intellegam ut, sea at graecis scriptorem eloquentiam.

Per an labitur lucilius ullamcorper, esse erat ponderum ad vim. Possim laoreet suscipit ex pri, vix numquam eruditi feugait in. Nec maluisset complectitur te, at sea decore semper. Falli numquam perpetua sea et, tibique repudiandae an pro. Ut his solum persius postulant. Soluta nemore debitis ne eos, cum an scripta pericula partiendo.', CAST(N'2014-10-30' AS Date), N'http://en-123-charity.simplesite.com/422328015')
INSERT [dbo].[home] ([id], [title], [img], [content], [date], [link]) VALUES (3, N'Ullamcorper suscipit lobortis', NULL, N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.', CAST(N'2015-10-30' AS Date), NULL)
INSERT [dbo].[home] ([id], [title], [img], [content], [date], [link]) VALUES (4, N'Aliquip ex ea commodo', NULL, N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.', CAST(N'2015-09-08' AS Date), NULL)
SET IDENTITY_INSERT [dbo].[home] OFF
SET IDENTITY_INSERT [dbo].[Photo] ON 

INSERT [dbo].[Photo] ([id], [img]) VALUES (1, N'i285415639381953161._szw360h1280_.jpg')
INSERT [dbo].[Photo] ([id], [img]) VALUES (2, N'i285415639381953164._szw360h1280_.jpg')
INSERT [dbo].[Photo] ([id], [img]) VALUES (3, N'i285415639381953166._szw360h1280_.jpg')
INSERT [dbo].[Photo] ([id], [img]) VALUES (4, N'i285415639381953169._szw360h1280_.jpg')
INSERT [dbo].[Photo] ([id], [img]) VALUES (5, N'i285415639381953172._szw360h1280_.jpg')
INSERT [dbo].[Photo] ([id], [img]) VALUES (6, N'i285415639381953174._szw360h1280_.jpg')
INSERT [dbo].[Photo] ([id], [img]) VALUES (7, N'i285415639381953177._szw360h1280_.jpg')
SET IDENTITY_INSERT [dbo].[Photo] OFF
