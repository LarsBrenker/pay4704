FROM payara/server-full:5.2020.3-jdk11
COPY  ./target/payara-4704-reproducer.war ${DEPLOY_DIR}