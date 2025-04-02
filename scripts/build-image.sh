set -u # or set -o nounset
: "$VERSION"

docker build -t ghcr.io/kylelisscoding/arithmetic-service:$VERSION --file ./Dockerfile .