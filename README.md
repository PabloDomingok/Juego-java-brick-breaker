# Juego Java: Brick Breaker

Este repositorio contiene el código fuente de un juego clásico de Brick Breaker desarrollado en Java. El juego consiste en romper ladrillos utilizando una bola que rebota en una plataforma controlada por el jugador. El objetivo es romper todos los ladrillos sin dejar que la bola caiga al suelo.

## Características

- Interfaz gráfica sencilla y atractiva.
- Control de la plataforma mediante teclas de flecha izquierda y derecha.
- Conteo de puntuación basado en la cantidad de ladrillos rotos.
- Mensajes de victoria y derrota con opción de reiniciar el juego.

## Cómo jugar

1. Utiliza las teclas de flecha izquierda (`←`) y derecha (`→`) para mover la plataforma y evitar que la bola caiga.
2. Rompe todos los ladrillos rebotando la bola contra ellos.
3. El juego termina cuando todos los ladrillos son destruidos (victoria) o cuando la bola cae al suelo (derrota).
4. Para reiniciar el juego después de terminar, presiona la tecla `Enter`.

## Cómo ejecutar

Para ejecutar el juego, necesitas tener instalado Java en tu sistema. Sigue estos pasos:

1. Clona el repositorio en tu máquina local.
2. Abre una terminal o línea de comandos.
3. Navega al directorio del proyecto.
4. Ejecuta el comando `java -jar BrickBreaker.jar` o compila y ejecuta el archivo `Main.java` utilizando tu IDE o compilador de Java preferido.

## Estructura del proyecto

El proyecto está estructurado de la siguiente manera:

- `src/Game/Gameplay.java`: Contiene la lógica principal del juego, incluyendo el dibujo de la interfaz gráfica y el manejo de eventos.
- `src/Game/Main.java`: Punto de entrada del juego que crea la ventana y añade el componente de juego.
- `.project`, `.classpath`, y `.settings/`: Archivos de configuración para Eclipse IDE.

## Contribuciones

Las contribuciones son bienvenidas. Si deseas agregar nuevas características, mejorar la interfaz o corregir errores, no dudes en crear un pull request.

## Licencia

Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo `LICENSE` para más detalles.
