# inventrack

Inventrack es una aplicación que ayudará a la compañía a mantener un registro de los usuarios que están siendo activados, y su nivel de servicio con propósito de facturación.

Los usuarios de Soporte que activan a los usuarios en el sistema tendrán que llenar la siguiente información:

TicketID
Nombre de usuario
Número
SKU
Compañía

Esto les regresará una pantalla de raw text que podrán copiar y pegar para ejecutar los comandos para activar a los usuarios en PowerShell

En el back-end, la aplicación registrará esta información en la base de datos y creará un objeto de tipo userActivation que funcionará como entrada en la base de datos que contiene la información de cada activación individual.
