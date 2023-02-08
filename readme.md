
# SpringBoot-RabbitMQ Example

A simple Direct Exchange example was implemented using Spring boot and RabbitMQ. RabbitMQ runs on Docker.

# Project Dependencies

Libraries required for the project
- Java 11
- Lombok
- RabbitMQ
- Docker


# Project About

This project includes Spring Boot and RabbitMQ integration at a basic level, publishing a message and adding the message to the queue.
Handle the published messages is also provided.
Docker settings in Docker.yml
You can find the settings in application.properties.

# How to Run
After running the docker.yml file in the project directory, docker will install the necessary images. RabbitMQ image and RabbitMQ managament will also be installed for RabbitMQ management and monitoring.

Then you can run the project. Have fun! :) 



# API


| API   | Functions              |
|-------|------------------------|
| /send | [POST] Create New User |

