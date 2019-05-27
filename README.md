# LyricService
## ExternalService
### Utilidad
Esta libreria permite solicitar la letra de una canción por medio del nombre de la canción y el nombre del artista autor de la misma.

### Metodos
1. `getLyricsFromService`
Parametros: Dos *Strings* que representan el nombre de la cancion y del artista autor.
Retorna: Un *Lyrics* de la canción solicitada.

## Lyrics
### Utilidad
Esta clase encapsula la letra de la canción solicitada junto con una imagen asociada. En caso de solicitarse un canción erronea o no existente se retorna un resultado de error.

### Metodos
1. `getImagePath`
Retorna: Un *String* con la ruta a la imagen adjunta a la letra de la canción.
(En caso de error retorna:*"https://source.unsplash.com/dQLgop4tnsc/300x300"*)
1. `getLyrics`
Retorna: Un *String* con la letra de la canción.
(En caso de error retorna:*"No se encontro letra para esta canción. Vuelva y pruebe otra vez."*)
