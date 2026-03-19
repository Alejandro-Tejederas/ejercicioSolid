# Análisis y corrección SOLID — Paquete: biblioteca

## 1) Principio SOLID vulnerado principalmente
**Principio (SRP / OCP / LSP / DIP):**  

## 2) Justificación con evidencias
**Clase(s) y/o método(s) donde se concentra el problema:**
- LibroReferencia heredaba de Libro, pero anulaba la lógica del préstamo. 

**Síntomas que lo delatan (marca y explica brevemente):**
-Esto es un error porque si el código espera un Libro, espera poder prestarlo, y el de referencia rompe esa promesa.

## 3) Inconvenientes del diseño actual
**Indica cambios futuros caros o arriesgados, partes difíciles de probar o mantener, errores fáciles de introducir si el proyecto crece...:**
-El código es confuso y obliga a poner parches para que no de errores, lo cual puede provocar fallos de lógica.

## 4) Propuesta y aplicación de la corrección
**Describe la refactorización (qué extraes, qué conviertes en interfaz, qué separas, etc.):**
-He creado una jerarquía mejor. Libro es la base , LibroPrestable añade la función de préstamo, y LibroReferencia solo tiene datos de consulta. 
