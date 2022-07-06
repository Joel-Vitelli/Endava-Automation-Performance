Performance with Gatling plugin, Maven and Java project
============================================

## Tools needed for run the performance framework

- JDK 11 - 14
- Maven latest
- Docker

## To run a spesific simulation, Run the follow maven comand

```mvn gatling:test '-DclassName=example.simulations.YourSimulation'``` [^1]

## To clone and execute witout problem the docker-compose file, clone the project whit the follow comand:

```git clone https://github.com/Joel-Vitelli/Endava-Automation-Performance.git --config core.autocrlf=false```[^2]

## To use Grafana with Docker, follow this steps:

1. Put your cmd comand terminarl in the root of the project folder
2. Start the Docker service 
3. Run the comand ```docker-compose up```
4. Go to your favorite browser, and navigate to localhost in the port 3000 ```http://localhost:3000/```
5. Enter User and Password (admin, admin)
6. Enjoy![^3]

Repalce <com.yourSimulation> with your class in java with the mvn gatling:test '-DclassName=example.yourSimulation>simulation want to run (Most contain the reference path too)


Aditional Information.
[^1]: Rempalce the YourSimulation for the name of your own simulation.
[^2]: If you are using **Windows** maybe you have some problems when you try to run the *docker-compose up* por the encoding of the file. Clone whit this comand.
[^3]: In this step, in Grafana, search for the dashboard called **Endava Performance**, then, execute the performance framework from console.


