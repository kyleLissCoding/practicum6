set -u # or set -o nounset
: "$CONTAINER_REGISTRY"
: "$VERSION"
: "$CONTAINER_REGISTRY_UN"
: "$CONTAINER_REGISTRY_PW"

echo $REGISTRY_PW | docker login --username $CONTAINER_REGISTRY_UN --password-stdin $CONTAINER_REGISTRY
docker tag ghcr.io/kylelisscoding/arithmetic-service:$VERSION $CONTAINER_REGISTRY/arithmetic-service:$VERSION
docker push $CONTAINER_REGISTRY/arithmetic-service:$VERSION