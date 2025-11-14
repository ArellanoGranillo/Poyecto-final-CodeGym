# 🗂️ CodegymJira — Proyecto en Desarrollo (Módulo Final JRU)

Este proyecto es parte del módulo final del curso JavaRush University (JRU).  
A diferencia de trabajos anteriores, **CodegymJira es un proyecto grande y completamente funcional**, similar a herramientas como **Jira** o **Trello**, y el objetivo principal no es escribir todo desde cero, sino:

- Comprender una base de código existente.
- Modificarla sin romper su funcionamiento.
- Agregar nuevas funcionalidades solicitadas.
- Configurar su infraestructura.
- Trabajar como en un entorno real: debug, refactor, corregir, mejorar.

Este tipo de trabajo representa **el 50% del trabajo real de un programador**, donde la mayoría del tiempo se invierte en leer, analizar y modificar proyectos ya existentes.

---

# 🚧 Estado del Proyecto

🔧 **El proyecto está actualmente en proceso de desarrollo.**  
Se están implementando las tasks solicitadas en el tutorial oficial.  
Las actividades realizadas hasta ahora se listan más abajo.

---

# 🎯 Objetivo General

CodegymJira es un sistema de administración de tareas donde se pueden gestionar:

- Proyectos  
- Sprints  
- Tareas (tasks)  
- Usuarios  
- Roles y permisos  
- Actividad dentro del sistema  
- Archivos adjuntos  
- Contactos  
- Estado y avance de tareas  

Funciona como un tablero Kanban con backlog, administración de usuarios, reportes de sprint y herramientas administrativas.

---

# 🧰 Tecnologías Principales

| Tecnología | Propósito |
|-----------|-----------|
| **Spring Boot** | Backend principal |
| **Spring MVC** | Controladores y vistas |
| **Spring Security** | Login, roles y permisos |
| **Spring Data JPA / Hibernate** | ORM |
| **PostgreSQL** | Base de datos |
| **Liquibase** | Versionado de BD |
| **Docker / Docker Compose** | Infraestructura |
| **Thymeleaf** | Vistas |
| **jQuery** | Interactividad |
| **Swagger** | Documentación del API |
| **Caffeine Cache** | Cache interno |
| **Lombok** | Reducción de boilerplate |
| **MapStruct** | Mappers DTO ↔ Entity |
| **H2 (Tests)** | Base de datos en memoria |
| **JUnit + Spring Test** | Pruebas |

---

# 🗄️ Estructura Principal de la Base de Datos

Incluye tablas como:

- `task`, `project`, `sprint`, `user_belong`, `users`
- `activity` para registrar acciones
- `attachment` para archivos
- `reference` para catálogos
- `task_tag` para nuevas funcionalidades
- `profile`, `contact`, `user_role`

Todo bajo control de **Liquibase**.

---

# ▶️ Cómo Ejecutar el Proyecto

1. Clonar el repositorio  
2. Levantar contenedores Docker para PostgreSQL y la aplicación  
3. Ejecutar `mvn clean install`  
4. Correr la aplicación con perfil `prod`  
5. Llenar datos de prueba con `data.sql`  

---

# ✔️ Actividades Realizadas Hasta Ahora

## 🔹 1. Eliminar Facebook Login
Se eliminaron los accesos por Facebook en:
- `login.html`
- `register.html`

Se comentó la siguiente sección:

```html
<!--
</a>
<a class="btn btn-primary btn-lg me-2" href="/oauth2/authorization/facebook" style="padding-left: 17px;
padding-right: 17px;" type="button">
<i class="fa-brands fa-facebook"></i>
</a>
-->
🔹 2. Mover información sensible a un archivo separado

Se creó secrets.properties para almacenar:

credenciales de base de datos

credenciales de OAuth

configuración de correo

claves y valores sensibles

Y se implementó lectura de valores desde variables de entorno del sistema.

🔹 3. Agregar .dockerignore

Para evitar copiar archivos innecesarios a la imagen Docker.

🔹 4. Rehacer los tests usando H2 (en proceso)

Cambios realizados:

Configuración en application-test.properties y application-test.yaml

Creación de dos perfiles en DataSourceConfig

Migración de test-data.sql a sintaxis compatible con H2

Deshabilitar/rehabilitar Liquibase según el perfil

🔸 Nota actual:
Los tests todavía fallan con la configuración H2 y continúan en proceso de ajustes.

🔹 5. Configuración de Docker

Acciones completadas:

Creación de Dockerfile para el servidor principal

Creación de docker-compose.yml

Construcción de la imagen Docker

Arranque de los contenedores

🔹 6. Actualización del README

Refleja los cambios realizados en infraestructura, Docker, y manejo de propiedades sensibles.

📝 Próximas Tareas (pendientes)

Finalizar la migración completa a H2 para tests

Implementar funcionalidad de tags (task_tag)

Contabilizar tiempo de tareas por estado

Añadir localización (al menos 2 idiomas)

Migrar autenticación a JWT

Crear docker-compose completo con Nginx en producción
