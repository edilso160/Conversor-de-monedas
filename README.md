Clase Menu
Esta clase maneja la lógica del menú y la interacción con el usuario. Aquí está la explicación detallada:

mostrar(): Este método es el punto de entrada para mostrar el menú y procesar las opciones del usuario.
Crea un objeto Scanner para leer la entrada del usuario.
Muestra el menú usando el método mostrarMenu().
Lee la opción ingresada por el usuario.
Utiliza un bucle while para mantener el menú mostrándose hasta que el usuario elija salir.
En cada iteración, utiliza un switch para ejecutar la acción correspondiente a la opción seleccionada.
mostrarMenu(): Este método muestra las opciones del menú al usuario.
Simplemente imprime en la consola las opciones disponibles para el usuario.
************************************************************************
Clase Conversor
Esta clase contiene los métodos para realizar las conversiones y obtener la tasa de cambio desde la API. Aquí está la explicación detallada:

convertirPesosADolares(String apiKey): Este método permite al usuario convertir una cantidad de Pesos Colombianos a Dólares.
Lee la cantidad de Pesos Colombianos ingresada por el usuario.
Llama al método obtenerTasaCambio(apiKey) para obtener la tasa de cambio USD-COP.
Realiza la conversión de Pesos a Dólares usando la tasa de cambio.
Imprime en la consola la cantidad en Pesos Colombianos, la tasa de cambio y la cantidad en Dólares.
convertirDolaresAPesos(String apiKey): Este método permite al usuario convertir una cantidad de Dólares a Pesos Colombianos.
Lee la cantidad de Dólares ingresada por el usuario.
Llama al método obtenerTasaCambio(apiKey) para obtener la tasa de cambio USD-COP.
Realiza la conversión de Dólares a Pesos Colombianos usando la tasa de cambio.
Imprime en la consola la cantidad en Dólares, la tasa de cambio y la cantidad en Pesos Colombianos.
obtenerTasaCambio(String apiKey): Este método obtiene la tasa de cambio USD-COP desde la API de Open Exchange Rates.
Crea una conexión HTTP con la URL de la API.
Lee la respuesta de la API y la convierte en un objeto JsonObject usando Gson.
Extrae la tasa de cambio USD-COP del objeto JSON y la retorna como un valor double.
*********************************************************************************
************************************************************************************
Clase Main
Esta es la clase principal que inicia la aplicación. Aquí está la explicación detallada:

main(String[] args): Este es el método principal que se ejecuta cuando inicias la aplicación.
Llama al método mostrar() de la clase Menu para mostrar el menú y comenzar la interacción con el usuario.
