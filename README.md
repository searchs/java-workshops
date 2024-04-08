# Fitness App Building

```bash
#Create the classes in preps
javac com/katchstyle/nlytics/steps/*.java  
#To create a jar file
jar cvf jar_file_name files_to_put
#e.g.
jar cvf fitness_app.jar com/katchstyle/nlytics/steps/*.class

#To decompress the JAR
jar xvf fitness_app.jar

#To view jar content
jar tf fitness_app.jar

# To run the app - if app contains a Main entry

java -jar fitness_app.jar

# Update manifest for Main class and recreate JAR
jar cvfe fitness_app.jar com.katchstyle.nlytics.steps.WeeklySteps com/katchstyle/nlytics/steps/*.class 



```