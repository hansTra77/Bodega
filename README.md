# Bodega

###Tarea de Sistemas Operacionales.
####Integrantes: Juan Pablo Medina Mora

**Solucion:** 
En la solucion se encuentra una clase principal que se encarga de inicializar las dos clases hilos (Descargador y Empacador) y la bodega. Por su parte las clases hilos solicitan servicios a la clase principal, que llama a la Bodega que es la que finalmente se encarga de poner las condiciones de espera tanto de descarga como de empaque de aticulos. En la clase Bodega existe un random que se encarga de dar los tiempos de espera a los servicios de los dos hilos, y en la clase Descargador se utiliza otro ramdom que genera el tipo de articulo.

**Resultado:**  
![alt text](https://github.com/hansTra77/Bodega/blob/master/resultado%20captura.PNG)  

