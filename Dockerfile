FROM payara/server-full:5.2021.4-jdk11
#FROM payara/micro:5.2020.4-jdk11
COPY  ./target/payara-4704-reproducer.war ${DEPLOY_DIR}