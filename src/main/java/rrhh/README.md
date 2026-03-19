# Análisis y corrección SOLID — Paquete: rrhh

## 1) Principio SOLID vulnerado principalmente
**Principio vulnerado: DIP**

## 2) Justificación con evidencias
**Clase(s) y/o método(s) donde se concentra el problema:**
- AltaEmpleadoService

**Síntomas que lo delatan (marca y explica brevemente):**
- El servicio usa la palabra "new" para fabricar él mismo su base de datos y su generador de claves.

## 3) Inconvenientes del diseño actual
**Indica cambios futuros caros o arriesgados, partes difíciles de probar o mantener, errores fáciles de introducir si el proyecto crece...:**
- Es muy rígido
  Es difícil de probar: No puedes probar si el servicio funciona bien sin que use de verdad la memoria o el generador de claves original. 
  No puedes usar "piezas de mentira" para hacer pruebas rápidas.

## 4) Propuesta y aplicación de la corrección
**Describe la refactorización (qué extraes, qué conviertes en interfaz, qué separas, etc.):**
- Creamos una interfaz: Hemos inventado dos interfaces llamadas "EmpleadoRepository" y "PasswordGenerator". 
- para que el servicio no dependa de una clase fija, sino de una idea general.
- Uso de implements: He modificado las clases que ya existían para que sigan esas guías que he creado.
- Cambio en el constructor: He modificado el servicio "AltaEmpleadoService" para que ya no fabrique sus propias herramientas con la palabra new. 
- Ahora, al crear el servicio, hay que pasarle las herramientas desde fuera.