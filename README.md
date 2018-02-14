# Preresquities

1. Install JHipster - http://www.jhipster.tech/installation/

1. [Docker installation](https://docs.docker.com/install/) is recommended.

1. This application requires [Keycloak](http://www.keycloak.org/) to run.

    * To run it locally you need to adjust your `hosts` file - [details](http://www.jhipster.tech/security/#oauth2).
    * Run Keycloak using the supplied `docker-compose` service-definition file (from the [bookstore](bookstore) directory):
  
            docker-compose -f src/main/docker/keycloak.yml up

# Running

Go to the [bookstore](bookstore) directory and run:

        yarn
        yarn webpack:build
        ./mvnw
