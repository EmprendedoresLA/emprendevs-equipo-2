# emprendevs-equipo-2

EasyParking es una aplicación web que facilita el pago del estacionamiento medido en la 
ciudad de Rosario.

La ventaja de EasyParking respecto de las aplicaciones existentes (www.moviltr.com.ar) radica 
en la posibilidad de pagar un estacionamiento por el tiempo que se desee. Incluso EasyParking 
permite pagar por tiempo indefinido, es decir, si al momento de estacionar el usuario no sabe 
con exactitud el tiempo de duración del estacionamiento puede pagar por tiempo indefinido y 
cancelar el pago cuando lo desee.
Otra característica que ofrece EasyParking es la detección automática del lugar donde se 
estaciona el vehículo.


Requerimientos funcionales:

1. Para poder utilizar EasyParking el usuario debe tener creada una cuenta en 
www.moviltr.com.ar. El acceso a la aplicación se realizara utilizando el usuario y 
contraseña de moviltr.com.ar

2. Si el login es exitoso el usuario verá cierta información de su cuenta como, por ejemplo, el saldo.

3. Para inciar el estacionamiento el usuario debe proporcionar:
 1. Lugar de estacionamiento. La aplicación sugerirá la ubicación detectada 
utilizando el gps del dispositivo (en caso de que el dispositivo tenga gps).
 2. Tiempo de duración del estacionamiento o indicar si el estacionamiento es por 
tiempo indefinido.

4. Una vez iniciado el estacionamiento la aplicación realiza los pagos necesarios vía 
www.moviltr.com.ar. Los pagos se realizan o hasta que caduque el tiempo seleccionado 
por el usuario o bien hasta que el usuario cancela el estacionamiento.

Arquitectura

<img src="https://docs.google.com/drawings/d/1j7fGHD1lHZElJiDE9oc1uM89t1FcVCaY2YI7Pl-m-JA/pub?w=960&amp;h=720">
