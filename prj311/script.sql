USE [PRJ321_DE140100]
GO
/****** Object:  Table [dbo].[Emp_DE140100]    Script Date: 4/3/2020 4:30:37 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Emp_DE140100](
	[Emp_id] [nchar](10) NOT NULL,
	[Last_Name] [nvarchar](50) NULL,
	[First_Name] [nvarchar](50) NULL,
	[Gender] [nchar](10) NULL,
	[Email] [nvarchar](50) NULL
) ON [PRIMARY]

GO
