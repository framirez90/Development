# [ROOT Data Analysis Framework](https://root.cern.ch/)

Guía de instalación para root cern en la versión 6.16.00 sobre Ubuntu Desktop 18.04.2.

## Instalación.

Entrar a sesión de root

```shell
sudo -i
```

> Ingresar contraseña del usuario en sesión.

Instalar librerías esenciales..

```shell
apt-get install git dpkg-dev cmake g++ gcc binutils libx11-dev libxpm-dev \
libxft-dev libxext-dev
```

Instalar librerías opcionales (recomendable)

```shell
apt-get install gfortran libssl-dev libpcre3-dev \
xlibmesa-glu-dev libglew1.5-dev libftgl-dev \
libmysqlclient-dev libfftw3-dev libcfitsio-dev \
graphviz-dev libavahi-compat-libdnssd-dev \
libldap2-dev python-dev libxml2-dev libkrb5-dev \
libgsl0-dev libqt4-dev
```

Crear un directorio donde se descargaran los archivos.

```shell
mkdir /home/USUARIO/Documentos/rootcern
```

Clonar el proyecto desde el [GitHub](https://github.com/root-project/root.git) de root cern

```shell
git clone https://github.com/root-project/root.git
```

Crear directorio **build** donde se generaran los compilados del proyecto.

```shell
mkdir build
```

Entrar al directorio **build** recién creado

```shell
cd build
```

Ejecutar el siguiente comando de cmake dentro del directorio **build**.

```sell
cmake ../root -DCMAKE_INSTALL_PREFIX=/usr -Dgnuinstall=ON
```

Consultar cuantos cores tiene nuestro procesador para asignar a la compilación.

```shell
nproc --all
```

Ejecutar el compilado con el numero de cores disponibles del comando anterior.

> N = numero de cores

```shell
make -jN
```

> Este proceso puede durar varios minutos o incluso horas, todo depende del numero de cores y velocidad del procesador.

Una vez terminado el proceso de compilación al 100%, ejecutar.

```shell
make install
```

Configurar las variables de ambiente para ejecutar el programa. 

Abrir el archivo .bashrc con algun editor como VI o NANO.

```shell
nano ~/.bashrc
```

Agregar al final del archivo las siguientes lineas.

```shell
export ROOTSYS=/home/DIR/build
export LD_LIBRARY_PATH=${LD_LIBRARY_PATH}:${ROOTSYS}/lib
export PATH=$PATH:$ROOTSYS/bin
```

> Cambiar DIR por directorio donde se encuentra el archivo build que contiene el compilado del codigo.

Recargar los cambios del archivo .bashrc

```shell
source ~/.bashrc
```

Verificar que las variables de entorno estes bien configuradas.

```shell
printenv | egrep 'LD_LIBRARY_PATH|ROOTSYS'
```

Nos deberia de arrojar las siguientes lineas con el valor de las variables de entorno.

```shell
LD_LIBRARY_PATH=:/home/USER/Documentos/rootCern/root_v6.16.00/build/lib
ROOTSYS=/home/USER/Documentos/rootCern/root_v6.16.00/build
```

> En caso de no obtener un resultado parecido revisar el el archivo .bashrc



En este punto, ya se tiene el código fuente ya se encuentra compilado en el directorio **build** y las variables de entorno configuradas correctamente, ahora solo hay que verificar que el archivo ejecutable **root.exe** este bien configurado.

```shell
ldd /usr/bin/root.exe
```

La salida del comando debe de ser similar a lo siguiente.

```
linux-vdso.so.1 (0x00007ffe8fd3a000)
libRint.so =>/home/acisneros/Documentos/rootCern/root_v6.16.00/build/lib/libRint.so(0X00) 
libCore.so => /home/acisneros/Documentos/rootCern/root_v6.16.00/build/lib/libCore.so(0X0) 
libstdc++.so.6 => /usr/lib/x86_64-linux-gnu/libstdc++.so.6 (0x00007f46feba3000)
libgcc_s.so.1 => /lib/x86_64-linux-gnu/libgcc_s.so.1 (0x00007f46fe98b000)
libc.so.6 => /lib/x86_64-linux-gnu/libc.so.6 (0x00007f46fe59a000)
/lib64/ld-linux-x86-64.so.2 (0x00007f46ffa22000)
libpcre.so.3 => /lib/x86_64-linux-gnu/libpcre.so.3 (0x00007f46fe328000)
libz.so.1 => /lib/x86_64-linux-gnu/libz.so.1 (0x00007f46fe10b000)
libdl.so.2 => /lib/x86_64-linux-gnu/libdl.so.2 (0x00007f46fdf07000)
libpthread.so.0 => /lib/x86_64-linux-gnu/libpthread.so.0 (0x00007f46fdce8000)
libm.so.6 => /lib/x86_64-linux-gnu/libm.so.6 (0x00007f46fd94a000)
```

Si la salida es similar, la instalación esta configurada corectamente.

En caso de que las variables de entorno no se hayan configurado correctamente, se encontrarán dos .so con salida NOT FOUND.

```shell
libRint.so => not found
libCore.so => not found
```

> Revisar las configuración de la variable de entorno LD_LIBRARY_PATH.



Una vez que todo este configurado, podemos iniciar el programa con el siguiente comando en una terminal.

```shell
root
```

Con este comando el programa debe de iniciarse mostrando algo parecido a esto.

```shell
  | Welcome to ROOT 6.17/01                  https://root.cern |
  |                               (c) 1995-2019, The ROOT Team |
  | Built for linuxx8664gcc on Feb 16 2019, 21:42:00           |
  | From heads/master@v6-16-00-rc1-955-g3b252c4edd             |

##   | Try '.help', '.demo', '.license', '.credits', '.quit'/'.q' |

root [0] 
```

Listo, con esto ya se tiene corriendo ROOT Data Analysis Framework.

Puedes ejectutar el siguiente comando para abrir

```shell
.demo
```

Con esto se abrira la ventana de demos.