Feature: Agregar elementos a la compra

Scenario: Aumentar cantidad y agregar garantia extendida 
Given El usuario se encuentra en la bolsa de compras y Tiene un producto en la bolsa
When El usuario presiona el boton aumentar la cantidad y el usuario agrega garantia extendida
Then Se agrego un producto mas a la bolsa y ambos con garantia extendida y Se actualiza precio

