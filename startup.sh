#!/bin/bash

starting=$(pwd)
echo -e "\n\nBuilding..."
echo -e "\n User-service..."
cd "$starting"/user-service && mvn clean package -DskipTests=true
echo -e "\n Order-service..."
cd "$starting"/order-service && mvn clean package -DskipTests=true
echo -e "\n Eureka-service..."
cd "$starting"/eureka-server && mvn clean package -DskipTests=true
echo -e "\n cloud-gateway..."
cd "$starting"/cloud-gateway && mvn clean package -DskipTests=true
cd "$starting"

# build images with latest version of services
echo -e "\n\nBuilding images..."
cd "$starting"/user-service && docker build -t user-service:current .
cd "$starting"/cloud-gateway && docker build -t cloud-gateway:current .
cd "$starting"/order-service && docker build -t order-service:current .
cd "$starting"/eureka-server && docker build -t eureka-server:current .
echo -e "\n\nRunning compose..."

# start containers
cd $starting
docker-compose up
