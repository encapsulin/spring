#get="?id=1"  works as default empty path ""
#get="/"  Required request parameter 'id'
#get="/?ids=1&ids=3" #"Required parameter 'id' is not present."

#get=""
#get="?ids=1,3"

#get="/1"
get="/?id=1"

url=http://localhost:8080/items$get
echo $url
curl $url
