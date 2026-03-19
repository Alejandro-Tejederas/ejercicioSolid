# Análisis y corrección SOLID — Paquete: mensajes

## 1) Principio SOLID vulnerado principalmente
**Principio (SRP / OCP / LSP / DIP):**

## 2) Justificación con evidencias
**Clase(s) y/o método(s) donde se concentra el problema:**
-  La clase GeneradorTextoMensajes tenía muchos if basados en un tipo de mensaje. 

**Síntomas que lo delatan (marca y explica brevemente):**
-Si queríamos un tipo nuevo, teníamos que modificar esa clase. Además, la clase Mensaje original tenía campos que no siempre se usaban como alumno o tutoría.

## 3) Inconvenientes del diseño actual
**Indica cambios futuros caros o arriesgados, partes difíciles de probar o mantener, errores fáciles de introducir si el proyecto crece...:**
- El código era difícil de ampliar y propenso a errores al tener que tocar una clase que ya funcionaba cada vez que añadíamos una función nueva.

## 4) Propuesta y aplicación de la corrección
**Describe la refactorización (qué extraes, qué conviertes en interfaz, qué separas, etc.):**
-He creado una interfaz Mensaje y clases distintas para cada tipo. Ahora, para añadir un mensaje nuevo, solo hay que crear una clase nueva sin tocar el generador.