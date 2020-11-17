#!/bin/bash
PATH_TEST_ROOT=..

cd ${PATH_TEST_ROOT}
echo "### Running from " $(pwd)

echo "### Removing target dir "
rm -rf ./target

echo "### Building docker image"
# building the image and assigning tag name
docker build -t myrun -f seleniumexercises.dockerfile .

echo "### Running docker image"
docker run --name testmaven $@ myrun
PASSED=$?

#sleep 1m
#echo "### Copying report folder from container to host"
#CONTAINER_ID=$(docker container list --all --last 1 --format "{{ .ID }}")

#echo "### Finished  tests"
#exit ${PASSED}
