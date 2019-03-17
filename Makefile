run: clean
	./mvnw spring-boot:run

pkg: clean
	./mvnw package -Dmaven.test.skip=true

clean:
	./mvnw clean

test:
	./mvnw test
