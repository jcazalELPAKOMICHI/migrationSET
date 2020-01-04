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

![alt text](https://github.com/jcazalELPAKOMICHI/migrationSET/blob/develop/capturas/img1.PNG)

una vez cargados todos los datos nos saldra la pantalla de exito.

![alt text](https://github.com/jcazalELPAKOMICHI/migrationSET/blob/develop/capturas/img2.PNG)

una vez establecida la conexión con la Base de Datos, se nos habilita el boton para poder realizar la importación de nuestro archivo txt a la BD, pero antes debemos enlazar nuestro txt a la aplicación, para ello debemos establecer si lo que enlazamos corresponde a una persona juridica o fisica, y su delimitador que por el momento trae dos tipos "|" y tabulador. Esto sirve a la base de datos para poder definir y filtrar en los querys al momento de tomar una persona fisica y juridica. Seguidamente vemos como se nos visualiza en la aplicación los datos del txt.

![alt text](https://github.com/jcazalELPAKOMICHI/migrationSET/blob/develop/capturas/img3.PNG)

una vez que le damos Import, la aplicación verifica si la tabla de contribuyentes existe en la base de datos, sino existe, hay una opción que la aplicación da al cliente para poder generar y luego continuar con la importación

![alt text](https://github.com/jcazalELPAKOMICHI/migrationSET/blob/develop/capturas/img4.PNG)

![alt text](https://github.com/jcazalELPAKOMICHI/migrationSET/blob/develop/capturas/img5.PNG)


una vez que le demos ok, comenzara la insercón o actualización de Datos en la Base de Datos, si se cierra la aplicación no hay problemas ya que cuando comienza a hacer el recorrido, lo que hace es generar un batch por medio de PreparedStatement, y el batch solamente se ejecuta cuando termina de recorrer toda la tabla de la aplicación; osease cuando el batch termina de ser cargado, lo que se inserta en la Base de datos es el Batch...

 ### Observaciones
 
 sugiero que los archivos de la SET se guarden nuevamente con codificacion UTF-8 para no tener problemas con los acentos, al momento de realizar la importación.
 
 ### OPTIONS
 En este apartado, agregue una opción para que puedan hacer el calculo de Dígito verificador y exportar a Excel.
 
 ### Paso Finalizado
 
 Cuando se termina de ejecutar el batch nos saldrá un mensaje de exito y podremos verificar en nuestra Base de Datos si los registros se encuentran en la misma. 
 ![alt text](https://github.com/jcazalELPAKOMICHI/migrationSET/blob/develop/capturas/img6.PNG)
 
 
