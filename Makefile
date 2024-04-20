PACKAGE_DIR=src/main/java
COM=com.example
MAIN=App
JAVA_DIR=${PACKAGE_DIR}/com/example/${MAIN}



run:
	echo "Running ${JAVA_DIR}" && javac ${JAVA_DIR}.java && clear && java -cp src/main/java ${COM}.${MAIN}

