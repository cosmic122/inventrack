# inventrack

*** Descripción y Resumen Ejecutivo ***

La compañía necesita un programa que pueda centralizar el registro de activaciones de usuarios para propósitos de facturación.

Inventrack es una aplicación que se propone como solución para esta problemática. Este programa le permitiría a los usuarios del equipo de Soporte que ejecutan las activaciones en el sistema, registrar cada vez que activen un usuario y de esta forma crear un registro de inventario (invLog), que luego sería accesible para los usuarios en el departamento de Facturación que requieran acceder a esta información.

Los usuarios de Soporte que activan a los usuarios en el sistema tendrán que llenar la siguiente información:

TicketID Nombre de usuario Número SKU Compañía

Esto les regresará una pantalla de raw text que podrán copiar y pegar para ejecutar los comandos para activar a los usuarios en PowerShell. Esta funcionalidad se implementa con la finalidad de que los usuarios tengan un beneficio para utilizar esta herramienta para activar nuevos usuarios.

Esta misma información sería entonces almacenada en una base de datos que sería accesible para el departamento de Facturación en una pantalla que serviría para buscar información aquí.

En el back-end, la aplicación registrará esta información en la base de datos y creará un objeto de tipo userActivation que funcionará como entrada en la base de datos que contiene la información de cada activación individual.

*** Requerimientos ***

Java versión 17 Servidores de aplicación: Tomcat 10.1

*** Instalación *** El ambiente de desarrollo se podrá instalar desde los archivos proporcionados en este repositorio durante la primera fase Beta

*** Configuración *** Los archivos de configuración estarán disponibles para

*** Uso *** 

Este software está diseñado para uso interno.

*** Contribución ***

Cualquier persona podría contribuir. Aprobación de cambios pendiente por parte de la empresa.

*** Roadmap *** 

En la versión actual Beta 0.2, las pantallas de index y resultados son funcionales. Los usuarios deberían poder obtener los scripts de activación sin problema. 

Actualmente estamos trabajando en las siguientes características:
Capacidad para guardar la información en servidor de base de datos SQL.

Características planeadas:
Agregar portal para usuarios de Facturación.
Implementar Cookies