Add User:-

URL : http://localhost:8080/remindME-webservice/user/add
Request Type : POST
Request Body :
{
    "firstName": "VIVEK",
    "lastName": "MISHRA",
    "primaryEmailId": "vivek.mishrajbp@gmail",
    "emailIds": [
        "vivek.mishrajbp@gmail",
        "vivekkmishra912@gmail"
    ]
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
(id,first_name,last_name,email_id)
VALUES
(1,"VIVEK","MISHRA","vivek.mishrajbp@gmail");

INSERT INTO remindme_db.user_email_details
(user_id,email_address)
VALUES
(1,"vivek.mishrajbp@gmail");

INSERT INTO remindme_db.notifications
(id,email_id,error_message,iteration,last_sent_status,last_sent,message,start_time,status,user_id)
VALUES
(1,"vivek.mishrajbp@gmail",null,1,2,null,"Test",null,0,1);
