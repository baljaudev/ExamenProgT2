# ExamenProgT2
Examen final segunda evaluación CFGS DAM



Ejercicio 1:

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
