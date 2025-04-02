set -u # or set -o nounset
: "$VERSION"
echo ${{secrets.ACCESS_TOKEN}} | docker login ghcr.io --username kyleLissCoding --password-stdin
docker push ghcr.io/kylelisscoding/arithmetic-service:$VERSION