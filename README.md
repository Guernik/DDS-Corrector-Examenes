# DDS 2020
## Corrector de Exámenes
Autor: Emilio Guernik  
Curso: Diseño de sistemas 2020, K3053

### Decisiones de diseño
* En principio se asume que el peso de cada pregunta es un entero, pero en realidad 
es algo que debería ser consultado
* Los criterios se modelaron mediante Strategies
* La nota mínima de aprobación se modeló con Enum,  ya que en principio son dos, pero pueden agregarse en un futuro. Además es poco probable que este tipo vaya a tener algún comportamiento complejo o la necesidad de guardar estado.
* En el criterio de tabla de conversión, la key del Map se eligío como String para aprovechar la inmutabilidad de este tipo
