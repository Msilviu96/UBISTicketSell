# Ubis Tickets Sell

Web app developed for Ubis internship programme

## Technologies and Frameworks used

* Java 1.8
* Spring framework(boot, security, devtools, data JPA)
* Maven
* Materialize css


## Database

* Mysql
## Description
This is a web application where logged in users can buy/cancel tickets for some events. Every unauthorized request will be reidirrected to /login page.

Login page
![alt text](http://i.imgur.com/qg6ZowI.png)

A list with all available events is displayed on the homepage.
![alt text](http://i.imgur.com/83e8Yad.png)

This page contains a dropdown with all the events. Only id of the event is passed on form submission.
![alt text](http://i.imgur.com/tBwRox8.png)

On this page the user can see all his tickets, being able to cancel them.
![alt text](http://i.imgur.com/mNDWjrA.png)

Also, short details of the ticket can be seen.
![alt text](http://i.imgur.com/dxb6RYJ.png)

## Endpoints


```
/buy_ticket POST
```

```
/list_events GET
```

```
/ticket_details GET
```

```
/cancel_ticket POST
```
```
/get_user_tickets GET
```
## Examples
* /buy_ticket
```
[  
   {  
      "id":1,
      "name":"UNTOLD",
      "date":1495919298000,
      "organizer":"Cluj",
      "photoUrl":"http://content.eventim.com/static/uploaded/at/ou4s_960_360.jpg"
   },
   {  
      "id":2,
      "name":"Electric Castle",
      "date":1495919299000,
      "organizer":"Cluj",
      "photoUrl":"https://static.infomusic.ro/media/2015/08/afis-electric-castle-2016-1.jpg"
   },
   {  
      "id":3,
      "name":"Dinamo-Steaua",
      "date":1495919299000,
      "organizer":"Bucuresti",
      "photoUrl":"http://media.hotnews.ro/media_server1/image-2016-08-20-21237393-70-steaua-dinamo.jpg"
   },
   {  
      "id":4,
      "name":"DevExperience",
      "date":1496013623000,
      "organizer":"Iasi",
      "photoUrl":"https://felix.vatuiu.com/wp-content/uploads/2016/02/dev_experience-2016.png"
   }
]
```

* /ticket_details?ticketId=1
```
{  
   "id":1,
   "buytime":1495924258000,
   "account":{  
      "username":"silviu",
      "password":"silviu"
   },
   "event":{  
      "id":3,
      "name":"Dinamo-Steaua",
      "date":1495919299000,
      "organizer":"Bucuresti",
      "photoUrl":"http://media.hotnews.ro/media_server1/image-2016-08-20-21237393-70-steaua-dinamo.jpg"
   }
}
```
## Versioning

Git was used for versioning. 

## Authors

* **Munteanu Silviu Constantin** 



