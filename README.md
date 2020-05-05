# Build
mvn clean package && docker build -t it.tss.pw/Users .

# RUN

docker rm -f Users || true && docker run -d -p 8080:8080 -p 4848:4848 --name Users it.tss.pw/Users 