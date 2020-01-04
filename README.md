 ### Aplicación de migración de Datos de la SET
 
La aplicación esta desarrollada en java 8, la misma sirve para poder hacer las migraciones de los archivos txt que nos provee la SET para poder tener en nuestras bases de datos o la del cliente, todos los datos de contribuyentes registrados en la SET.
La misma hace los updates automáticos cuando en caso de que ya exista una base de datos con los datos de contribuyentes.

 ### Requisitos para ejecutar
 - Java 8 o Superior
 - Base de Datos Postgres
 - Tener todos los .TXT descargados de la SET
 - Tener creada la Base de Datos

 ### Formas de Uso

La aplicación en primer lugar pide los parámetros para poder conectarnos a la base de datos, por lo tanto ingresamos todos los datos que nos solicita, la aplicación valida que se carguen todos los datos.

https://github.com/jcazalELPAKOMICHI/migrationSET/blob/develop/capturas/img1.PNG

una vez cargados todos los datos nos saldra la pantalla de exito.

https://github.com/jcazalELPAKOMICHI/migrationSET/blob/develop/capturas/img2.PNG
