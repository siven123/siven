LIB=/root/.m2/repository/org/apache/logging/log4j/log4j-api/2.5/log4j-api-2.5.jar
LIB=$LIB:/root/.m2/repository/org/apache/logging/log4j/log4j-core/2.5/log4j-core-2.5.jar
LIB=$LIB:/root/.m2/repository/org/apache/logging/log4j/log4j-jcl/2.5/log4j-jcl-2.5.jar
LIB=$LIB:/root/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar
LIB=$LIB:

echo "$LIB"

java -cp "$LIB" com.hybrid.LogTest