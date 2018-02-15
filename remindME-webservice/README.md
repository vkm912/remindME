Add User:-

URL : http://localhost:8080/remindME-webservice/Add
Request Type : POST
Request Body :
{
  "firstName" :	"VIVEK",
  "lastName" : "MISHRA",
  "emailId" : "vivek.mishrajbp@gmail",
  "message"	: "Test reminder",
  "startTime" :	"2018-02-15T15:53:12.571+0530",
  "iteration" : "0"
}
Response : true 

Get User:-

URL : http://localhost:8080/remindME-webservice/Get/{emailId}
Request Type : GET

Delete Notification:-

URL : http://localhost:8080/remindME-webservice/Removenot/{id}
Request Type : GET
Response : true 
