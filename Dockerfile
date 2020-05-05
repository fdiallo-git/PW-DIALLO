FROM airhacks/glassfish
COPY ./target/Users.war ${DEPLOYMENT_DIR}
