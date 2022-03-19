# ExamenProgT2
Examen final segunda evaluación CFGS DAM


## **Ejercicio 1:**

Desarrollar un programa Gestión Tarjeta Puntos para almacenar en un HashMap, tablaPuntos, los puntos acumulados al repostar gasolina.
El programa deberá:
-	Solicitará información hasta que el usuario diga que no quiere continuar (no tener en cuenta mayúsculas o minúsculas)
-	Para cada tarjeta se debe solicitar la matrícula del coche en el que se reposta y la cantidad de litros repostados.
-	Si la matrícula no existe en la tabla, se almacenarán los puntos que correspondan teniendo en cuenta que
    cada 10 litros de gasolina se obtiene 1 punto,
    y se mostrará el mensaje “NUEVA TARJETA, ACUMULADOS EN ESTE REPOSTAJE:  x  PUNTOS”.
-	Si la matrícula ya existe, se sumarán los puntos conseguidos en este repostaje a los puntos acumulados,
    y se mostrará el mensaje “ACUMULACIÓN DE PUNTOS, ACUMULADOS EN ESTE REPOSTAJE:  x  PUNTOS”.
-	Tras haber indicado que no desea continuar, se mostrarán el listado de tarjetas ordenadas por matrícula,
    y cuántas tarjetas tienen 10 o más puntos.
    
    Ejemplo de ejecución:
Indica la matrícula del vehículo repostado:
1234CXZ
Indica la cantidad de litros repostados:
47
NUEVA TARJETA, ACUMULADOS EN ESTE REPOSTAJE: 4 PUNTOS

¿Deseas continuar? (SI/NO)
si

Indica la matrícula del vehículo repostado:
2345CVB
Indica la cantidad de litros repostados:
52
NUEVA TARJETA, ACUMULADOS EN ESTE REPOSTAJE: 5 PUNTOS

¿Deseas continuar? (SI/NO)
si

Indica la matrícula del vehículo repostado:
1234CXZ
Indica la cantidad de litros repostados:
35
ACUMULACIÓN DE PUNTOS, ACUMULADOS EN ESTE REPOSTAJE: 3 PUNTOS

¿Deseas continuar? (SI/NO)
si

Indica la matrícula del vehículo repostado:
2345CVB
Indica la cantidad de litros repostados:
63
ACUMULACIÓN DE PUNTOS, ACUMULADOS EN ESTE REPOSTAJE: 6 PUNTOS

¿Deseas continuar? (SI/NO)
no

** Listado de tarjetas **
1234CXZ – 7 PUNTOS
2345CVB – 11 PUNTOS

Cantidad de tarjetas con 10 o más puntos: 1




## **Ejercicio 2:**

Necesitamos realizar un programa para almacenar el conjunto de los socios del Brooklyn Fitboxing. El conjunto estará almacenado en una lista de socios. 
Para cada socio se deberá conocer un dni, el número de móvil y el email. 
Los socios pueden ser de bono o de pago mensual. 
Los socios de bono tendrán el número de sesiones que tienen cargadas en el bono.
Los socios de pago mensual tendrán el número de cuenta de domiciliación del pago y el plan contratado (2 sesiones/semana, 3 sesiones/semana, ilimitado) .
-	Los socios de bono podrán recargar el bono cuando hayan gastado las sesiones.
-	Los socios de mensualidad podrán cambiar de plan

 ![image](https://user-images.githubusercontent.com/83509336/159119714-2873f3f3-16f9-4eea-89b5-344899339dcf.png)


El programa debe mostrar un menú que permita:
-	Añadir un socio a la lista: comprobar que el socio no se encuentre ya en el listado por el dni.
-	Mostrar la lista de socios (mostrar toda la información de cada socio si es que hay alguno en la lista)
-	Recargar bono para un socio de bono: se deberá solicitar el dni y comprobar si es un socio de bono antes de continuar con el proceso de solicitar el número de sesiones con las que quiere recargar (1, 5, 10 o 20)
-	Cambiar el plan de un socio de mensualidad: se deberá solicitar el dni y comprobar si es un socio de mensualidad antes de continuar con el proceso de solicitar el plan al que se quiere cambiar
-	Salir del programa

Controlar los datos introducidos:
-	La opción introducida para indicar la acción a llevar a cabo debe encontrarse entre las opciones indicadas.
-	El dni debe tener 9 caracteres y el teléfono no debe superar los 12 caracteres.
-	El número de sesiones por bono puede ser 1, 5, 10 o 20
-	Los planes pueden ser 2 sesiones/semana, 3 sesiones/semana, ilimitado.
 
Ejemplo de ejecución: 
** Gestión de socios del Brooklyn Fitboxing **

Indica la acción que deseas realizar:
1 – para añadir un socio
2 – para mostrar el listado
3 – para recargar un bono
4 – para cambiar de plan
5 – para salir de la aplicación
1

Introduce el dni del nuevo socio
12345678Z
Introduce el número de teléfono
666777888
Introduce el email
Socio1@mail.com

Indica si el socio se va a acoger a bono o a mensualidad (B/M)
B

Introduce el número de sesiones que quiere cargar 
10

¡Socio registrado!

Indica la acción que deseas realizar:
1 – para añadir un socio
2 – para mostrar el listado
3 – para recargar un bono
4 – para cambiar de plan
5 – para salir de la aplicación
1

Introduce el dni del nuevo socio
12345678Z
Este dni corresponde a un socio que ya está en la cartera

Indica la acción que deseas realizar:
1 – para añadir un socio
2 – para mostrar el listado
3 – para recargar un bono
4 – para cambiar de plan
5 – para salir de la aplicación
1

Introduce el dni del nuevo socio
23456789X
Introduce el número de teléfono
678678678
Introduce el email
Socio2@mail.com

Indica si el socio se va a acoger a bono o a mensualidad (B/M)
M

Indica el plan al que se acoge:
2SS – 2 sesiones/semana
3SS – 3 sesiones/semana
SI – sesiones ilimitadas
2SS
Introduce la cuenta bancaria
1234 1234 12 1234567890

¡Socio registrado!

Indica la acción que deseas realizar:
1 – para añadir un socio
2 – para mostrar el listado
3 – para recargar un bono
4 – para cambiar de plan
5 – para salir de la aplicación
2

** Cartera de Socios **

Socio de Bono: 
DNI: 12345678Z
Teléfono: 666777888
Email: Socio1@mail.es
Sesiones en bono: 10

Socio de Mensualidad: 
DNI: 23456789X
Teléfono: 678678678
Email: Socio2@mail.es
Plan: 2 sesiones/semana
Número de cuenta: 1234 1234 12 1234567890

Indica la acción que deseas realizar:
1 – para añadir un socio
2 – para mostrar el listado
3 – para recargar un bono
4 – para cambiar de plan
5 – para salir de la aplicación
3

Introduce el dni del socio de bono
23456789X
El dni indicado no corresponde a un socio de bono.

Indica la acción que deseas realizar:
1 – para añadir un socio
2 – para mostrar el listado
3 – para recargar un bono
4 – para cambiar de plan
5 – para salir de la aplicación
3

Introduce el dni del socio de bono
12345678Z
Introduce el número de sesiones que quiere cargar 
5

¡Recarga de bono realizado!

Indica la acción que deseas realizar:
1 – para añadir un socio
2 – para mostrar el listado
3 – para recargar un bono
4 – para cambiar de plan
5 – para salir de la aplicación
4

Introduce el dni del socio de mensualidad
12345678Z
El dni indicado no corresponde a un socio de mensualidad.

Indica la acción que deseas realizar:
1 – para añadir un socio
2 – para mostrar el listado
3 – para recargar un bono
4 – para cambiar de plan
5 – para salir de la aplicación
4

Introduce el dni del socio de mensualidad
23456789X
Indica el nuevo plan
3SS

¡Cambio de plan realizado!

Indica la acción que deseas realizar:
1 – para añadir un socio
2 – para mostrar el listado
3 – para recargar un bono
4 – para cambiar de plan
5 – para salir de la aplicación
2

** Cartera de Socios **

Socio de Bono: 
DNI: 12345678Z
Teléfono: 666777888
Email: Socio1@mail.es
Sesiones en bono: 15

Socio de Mensualidad: 
DNI: 23456789X
Teléfono: 678678678
Email: Socio2@mail.es
Plan: 3 sesiones/semana
Número de cuenta: 1234 1234 12 1234567890

Indica la acción que deseas realizar:
1 – para añadir un socio
2 – para mostrar el listado
3 – para recargar un bono
4 – para cambiar de plan
5 – para salir de la aplicación
5

** CERRANDO LA APLICACIÓN **



