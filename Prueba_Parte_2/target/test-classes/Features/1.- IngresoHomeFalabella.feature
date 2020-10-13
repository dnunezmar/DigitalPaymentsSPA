Feature: Ingreso al home de falabella


Scenario: Ingresar al home de falabella desde google 
Given el usuario se encuentra en google
When el usuario busca por la palabra falabella y selecciona el primer resultado de google
Then Usuario ingresa al home de falabella y Productos son desplegados