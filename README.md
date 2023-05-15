# domicilios.github.io
se  desea calcuar el promedio de domicilios entregados de cada domiciliarios de una planta de mensajeria de una empresa de productos de aseo  el cual maneja 15 domiciliarios como informacion basica  se debe registrar cedula del mensajero nombre y edad el cual nos ayudara a identificar  dentro de la empresa la rpoductividad de cada uno de ellos para toma de decisiones frente al promedio de domicilios entregados los datos se tomaran 3 veces al mes siendo que se toman los domicilios entregados de cada uno de diez dias por los tres meses 
![Captura de pantalla 2023-05-10 205928](https://github.com/spedraza1243/domicilios.github.io/assets/133063549/3e736389-3060-4edd-b641-a66afd231baf)
![Captura de pantalla 2023-05-10 205956](https://github.com/spedraza1243/domicilios.github.io/assets/133063549/3f8f7f2b-a861-45ba-a635-ecb4f12235e0)
![Captura de pantalla 2023-05-10 212705](https://github.com/spedraza1243/domicilios.github.io/assets/133063549/bff5a58f-2632-4f69-b0ad-2a9b03b919de)
![Sin título](https://github.com/spedraza1243/domicilios.github.io/assets/133063549/3af2ee8b-1dee-4416-b249-28915498c7f1)


Inicio
Caracteres: identificaciones [50], nombres [50], edad [50], 
Real: valoruno [50], valordos [50], valortres [50]
Caracteres: identificacion, nombre, edad, 
Entero: numerodomiciliarios, i
Real: valor1, valor2, valor3, promedio <- 0
Imprimir: ‘Digite el número de domiciliario:’
Asignar: numerodomiciliarios
Para i=0 hasta numerodomiciliarios - 1, 1
Imprimir: ‘Digite la identificación del domiciliarios:’
Asignar: identificacion
Imprimir: ‘Digite el nombre del domiciliario:’
Asignar: nombre
Imprimir: ‘Digite el edad del domiciliario:’
Asignar: curso
Imprimir: ‘Digite la valor 1 del estudiante:’
Asignar: nota1
Imprimir: ‘Digite la valor 2 del estudiante:’
Asignar: nota2
Imprimir: ‘Digite la valor 3 del estudiante:’
Asignar: valor 3
identificaciones[i] <- identificacion
nombres [i] <- nombre
edades [i] <- edad
notauno[i] <- valor1
notados[i] <- valor2
notatres[i] <- valor3
finPara
Para i=0 hasta numerodomiciliarios -1, 1
promedio <-
promedio +((valoruno[i]+valordos[i]+valortres[i])/3)numerodomiciliarios
finPara
Imprimir: ‘El promedio es:’ + promedio
Fin
