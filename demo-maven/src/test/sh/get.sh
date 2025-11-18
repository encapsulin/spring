#get="?id=1"  work as default ""
#get="/"  Required request parameter 'id'

#get=""
#get="/1"
#get="/?id=1"
url=http://localhost:8080/items$get
echo $url
curl $url
