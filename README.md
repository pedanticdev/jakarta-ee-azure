# What?
This repo acts as a sample of Jakarta EE code that shows how to deploy to Microsoft Azure through Docker and Azure Web Apps for Containers.

#Steps
1. Create an Azure account if you don't have one, and create an Azure Container Registry (Similar to Docker registry)
2. Enable Admin on the ACR and note the URL and password generated
3. Add the URL as id and password to your Maven settings.xml in ~/.m2/settings.xml similar to 
````XML
<servers>
      <server>
        <id>[Azure ACR URL]</id>
        <username>[Generated Username]</username>
        <password>[Generated Password]</password>
      </server>
</servers>
``````
4. Make similar changes in project pom.xml file
5. Create an Azure Web App for Containers and choose your container registry 
5. To push code to ACR, simply run 
```xml
mvn clean package
mvn deploy
```
Visit https://jakarta-ee.azurewebsites.net/hello-jakarta to see this sample in action!

