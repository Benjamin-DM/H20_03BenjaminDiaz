CREATE TABLE [dbo].[PERSONA]
(
[IDPER] [int] NOT NULL IDENTITY(1, 1),
[NOMPER] [char] (20) COLLATE Modern_Spanish_CI_AS NOT NULL,
[APEPER] [char] (20) COLLATE Modern_Spanish_CI_AS NOT NULL,
[TIPPER] [char] (10) COLLATE Modern_Spanish_CI_AS NOT NULL,
[DNIPER] [numeric] (8, 0) NOT NULL,
[TELPER] [numeric] (8, 0) NOT NULL,
[SEXPER] [char] (1) COLLATE Modern_Spanish_CI_AS NOT NULL,
[ESTPER] [char] (1) COLLATE Modern_Spanish_CI_AS NOT NULL,
[NICPER] [varchar] (40) COLLATE Modern_Spanish_CI_AS NULL,
[USEPER] [varchar] (40) COLLATE Modern_Spanish_CI_AS NULL,
[PASPER] [varchar] (40) COLLATE Modern_Spanish_CI_AS NULL
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[PERSONA] ADD CONSTRAINT [PERSONA_pk] PRIMARY KEY CLUSTERED  ([IDPER]) ON [PRIMARY]
GO
