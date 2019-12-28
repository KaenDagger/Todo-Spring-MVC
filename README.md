# Todo-Spring-MVC
A Todo App showcasing Spring MVC

![Todo-mvc](https://user-images.githubusercontent.com/24780524/71545695-46fc1880-29b4-11ea-856a-e99be9fca91d.png)

## Pre-requisites
- Maven installed
- Minishift installed (To deploy it to local cluster)

## To run locally & deploy on minishift

- Start minishift with `minishift start`
- Run this command to configure your shell: `eval $(minishift oc-env)`
- Run `minishift console` to open console in web browser
- From top right corner ,`Copy login command`. It would be something like this `oc login https://192.168.42.137:8443 --token=<token value>`
- Create a new project in openshift `oc new-project <project-name> --display-name="Display name"
- Run `mvn package fabric8:deploy -Popenshift` to first package the application and then deploy it to openshift
  
