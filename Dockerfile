FROM airhacks/glassfish
COPY ./target/pw-diallo.war ${DEPLOYMENT_DIR}
