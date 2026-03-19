# Análisis y corrección SOLID — Paquete: matricula

## 1) Principio SOLID vulnerado principalmente
**Principio vulnerado: SRP**

## 2) Justificación con evidencias
**Clase(s) y/o método(s) donde se concentra el problema:**
- MatriculaService: Esta clase intentaba hacer todo el trabajo del sistema de matrículas por sí sola.

**Síntomas que lo delatan (marca y explica brevemente):**
- Exceso de responsabilidades: En un solo archivo teníamos la validación del DNI, 
- la lógica de cálculo de precios (descuentos y tasas), 
- el almacenamiento de las matrículas y el envío de notificaciones por consola
- 

## 3) Inconvenientes del diseño actual
**Indica cambios futuros caros o arriesgados, partes difíciles de probar o mantener, errores fáciles de introducir si el proyecto crece...:**
- Difícil de mantener
- Frágil: Al tocar la lógica de los precios, podrías romper sin querer la parte de la validación o la de notificaciones, porque está todo mezclado

## 4) Propuesta y aplicación de la corrección
**Describe la refactorización (qué extraes, qué conviertes en interfaz, qué separas, etc.):**
- Reparto de tareas: He extraído las responsabilidades a tres clases nuevas especializadas:
  ValidadorDni: Solo se encarga de comprobar si el formato es correcto.
  CalculadoraCuota: Se encarga exclusivamente de las matemáticas (precios y descuentos).
  NotificadorMatricula: Gestiona los avisos al usuario.
- Simplificación del servicio: Ahora "MatriculaService" solo recibe los datos, llama a las piezas correspondientes y guarda el resultado.

