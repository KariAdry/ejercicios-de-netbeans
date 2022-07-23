<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Botones de Edicion</title>
    </head>
    <body>
        <h1>Acerca de:</h1>
        <form action="" method="">
            <p><label>NOMBRE:</label><input type="text" name="nombre"></p>
            <p><label>CIUDAD:</label><input type="text" name="ciudad"></p>
            <p><label>EMAIL:</label><input type="text" name="email"></p>
            <p><label>DESCRIPCION:</label><input type="text" name="descripcion"></p>
            <p>Si deseo enviar los datos hacer click en ENVIAR</p>
            <button type="submit">ENVIAR</button>
                 
        </form>
        
        <h1>Ver datos:</h1>
        <p>Si deseo ver todos los datos de la persona</p>
        <form action="" method="">            
            <button type="submit">MOSTRAR</button>
            
        </form>
        
        <h1>Eliminar datos:</h1>
            <p>Ingrese el dato a eliminar</p>
         <form action="" method="">
             <p><label>DESCRIPCION:</label><input type="text" name="DECRIPCION_elim" ></p>
             <button type="submit">ELIMINAR</button>
            
        </form>
    </body>
</html>
