Feature: Ver detalle de producto

/* dadas las caracteristicas de lo solicitado, se selecciona un producto electronico
 * para poder seleccionar la garantia extendida */


Scenario: Ingresar al detalle de un producto
Given el usuario se encuentra en el ecommerce
When el usuario selecciona el primer producto del ecommerce
Then usuario se encuentra en el detalle de un producto