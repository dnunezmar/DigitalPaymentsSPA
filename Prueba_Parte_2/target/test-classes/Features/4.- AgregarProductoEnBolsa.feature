Feature: Agregar Producto a la bolsa

Scenario: Agregar Producto a la bolsa
Given el usuario se encuentra en el detalle de un producto
When usuario presiona boton agregar a la bolsa de compras y luego presiona el boton ver la bolsa de compras
Then usuario se encuentra en la bolsa de compras