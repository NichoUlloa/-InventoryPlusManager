# Inventory Plus Manager (IPM)

En el entorno empresarial actual, caracterizado por su dinamismo y alta competitividad, la gestión eficiente de inventarios se ha convertido en un factor crucial para el éxito y la sostenibilidad de las pequeñas empresas. La capacidad de mantener un control preciso sobre los productos en stock es esencial para minimizar pérdidas económicas, optimizar el flujo de mercancías y responder adecuadamente a las demandas del mercado en constante cambio.

El proyecto **Inventory Plus Manager (IPM)** se presenta como una solución tecnológica integral diseñada para enfrentar estos desafíos. IPM tiene como objetivo principal optimizar el control y seguimiento de inventarios mediante la simplificación y agilización del proceso de gestión, lo que incluye la actualización y análisis de datos de inventario. Esta herramienta no solo minimiza pérdidas económicas, sino que también mejora la toma de decisiones estratégicas, potenciando la eficiencia operativa de las pequeñas empresas.

Con la proliferación de productos y la diversificación de las operaciones comerciales, la necesidad de una solución tecnológica como IPM se vuelve imperativa. El proyecto busca ofrecer a los usuarios una plataforma intuitiva y personalizable, que les permita gestionar sus inventarios de manera eficiente y en tiempo real, promoviendo así el crecimiento sostenible y la competitividad de las pequeñas empresas.

En el contexto descrito, IPM se posiciona como una solución integral y fácil de usar para las pequeñas empresas. Su objetivo principal es proporcionar a propietarios de empresas, empleados y administradores del sistema una plataforma que les permita gestionar eficientemente sus inventarios, ofreciendo informes detallados y alertas sobre el estado del stock en tiempo real.

La aplicación web IPM busca mejorar la eficiencia operativa de las pequeñas empresas al simplificar y automatizar tareas relacionadas con la gestión de inventarios. Al ofrecer una herramienta intuitiva y personalizable, IPM aspira a maximizar la productividad y contribuir al crecimiento sostenible de las empresas, permitiéndoles tomar decisiones informadas y estratégicas en su gestión de inventarios.

Con IPM, nos comprometemos a brindar a las pequeñas empresas una solución tecnológica que les ayude a enfrentar los desafíos del mercado actual, potenciando su competitividad y promoviendo su éxito a largo plazo.

## Estructura del Proyecto

El sistema **Inventory Plus Manager (IPM)** se organiza en diversos paquetes y clases, cada uno con responsabilidades específicas para garantizar una gestión eficiente y estructurada del inventario. A continuación, se presenta una descripción de cada paquete y las clases que los componen:

### Paquete `controller`

- **CategoriaController**: Gestiona las operaciones relacionadas con las categorías de productos, como creación, actualización y eliminación.
- **MarcaController**: Maneja las operaciones vinculadas a las marcas de productos, incluyendo su registro y modificación.
- **ProductoController**: Encargado de las acciones relacionadas con los productos, como su búsqueda, registro, modificación y eliminación.

### Paquete `gui`

- **RoundedButton**: Clase utilizada para crear botones con bordes redondeados en la interfaz gráfica.
- **Ventana**: Clase base para las diferentes ventanas de la aplicación.
- **VentanaBienvenida**: Pantalla de bienvenida que se muestra al iniciar la aplicación.
- **VentanaBuscarProducto**: Interfaz para la búsqueda de productos en el inventario.
- **VentanaEliminarProducto**: Ventana que permite la eliminación de productos del inventario.
- **VentanaModificarProducto**: Pantalla para modificar los datos de un producto existente.
- **VentanaRegistrarCategoria**: Interfaz para el registro de nuevas categorías de productos.
- **VentanaRegistrarMarca**: Pantalla para registrar nuevas marcas de productos.
- **VentanaRegistrarProducto**: Interfaz para el registro de nuevos productos en el inventario.
- **VentanaTabla**: Clase que maneja la visualización de tablas dentro de la aplicación, mostrando datos como listas de productos, categorías, etc.

### Paquete `model`

- **Categoria**: Clase que representa una categoría de productos, incluyendo atributos como nombre y descripción.
- **Marca**: Clase que define una marca de productos, con atributos como nombre y país de origen.
- **Producto**: Clase que representa un producto, incluyendo atributos como nombre, precio, cantidad en stock y su categoría y marca asociadas.

### Sub-paquete `model.data`

- **DBConnector**: Clase que maneja la conexión con la base de datos.
- **DBGenerator**: Clase responsable de generar las tablas necesarias en la base de datos al iniciar la aplicación.

### Sub-paquete `model.data.dao`

- **CategoriaDAO**: Objeto de Acceso a Datos para las categorías, maneja las operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en la base de datos.
- **MarcaDAO**: DAO para las marcas, gestionando las operaciones CRUD en la base de datos.
- **ProductoDAO**: DAO para los productos, encargado de las operaciones CRUD en la base de datos.

### Paquete principal

- **Principal**: Clase principal que inicializa y ejecuta la aplicación.
## Diagrama UML

A continuación se presenta el diagrama UML del proyecto **Inventory Plus Manager (IPM)**, que ilustra la estructura de clases y las relaciones entre ellas.
![InventoryPlusManager.png](InventoryPlusManager.png)

