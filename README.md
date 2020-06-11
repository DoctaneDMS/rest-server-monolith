# Monolithic server incorporating Document, Feed, and Authorization components

Monolithic Doctane server, built on top of the following modules:

* [rest-server-dms](https://projects.softwareplumbers.com/document-management/rest-server-dms), 
  which provides RESTFul document management service endpoints.
* [rest-server-feeds](https://projects.softwareplumbers.com/document-management/rest-server-feeds), 
  which provides RESTFul feed and messaging service endpoints.
* [authz-interface-core](https://projects.softwareplumbers.com/document-management/authz-interface-core), 
  which provides common classes and interfaces for interacting with external authorization services.

## Architecture

Although Doctane follows the microservices pattern and allows individual components to be separately 
deployed and scaled, sometimes it is convenient to have a single executable which encapsulates all
the services required for a running system. This package provides a standalone java executable, 
implemeted using Spring Boot, Jersey, and Jax-RS. The actual back ends are pluggable spring modules.

Build support is provided using gradle, and CI via Gitlab's native gitlab-ci.yml

## DMS Services

The monolithic REST server provides two basic groups of DMS services - Document Services (under the <tenant>/docs path) and Workspace Service (under the <tenant>/ws path). 

## Feed Services

The monolithic REST server provides feed services under the <tenant>/feed path. 

## Authentication Services
The monolithic REST server provides authentication services under <auth_tenant>/auth.