Add User:-

URL : http://localhost:8080/remindME-webservice/add
Request Type : POST
Request Body :
{
    "firstName": "VIVEK",
    "lastName": "MISHRA",
    "primaryEmailId": "vivek.mishrajbp@gmail",
    "emailIds": [
        "vivek.mishrajbp@gmail"
    ],
    "message": "TEST",
    "startTime": null,
    "iteration": 1
}
Response : true 

Get User:-

URL : http://localhost:8080/remindME-webservice/user/get/{emailId}
Request Type : GET

Delete Notification:-

URL : http://localhost:8080/remindME-webservice/Removenot/{id}
Request Type : GET
Response : true 

Sample Inserts :-

INSERT INTO remindme_db.user
(id,
first_name,
iteration,
last_name,
message,
email_id,
start_time)
VALUES
(1,
'VIVEK',
1,
'MISHRA',
'TEST',
'vivek.mishrajbp@gmail', null);


INSERT INTO remindme_db.user_email_details
(user_id,
email_address)
VALUES
(1,
'vivek.mishrajbp@gmail');
