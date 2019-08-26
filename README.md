# WealthPark
The Back-end test has been implemented using Spring boot.
As mentioned in the requirements it has a employee with fields:
* First name
* Last name
* Birthday date
* Address
* Boss
* Salary

Following are the endpoints which were required:  
* List employees  
https://8080-cade1adf-857d-4d7f-87d7-cb72a48eb8c2.ws-ap0.gitpod.io/employee/listall [GET]

* Create employee  
https://8080-cade1adf-857d-4d7f-87d7-cb72a48eb8c2.ws-ap0.gitpod.io/employee/create [POST]

* Update employee  
https://8080-cade1adf-857d-4d7f-87d7-cb72a48eb8c2.ws-ap0.gitpod.io/employee/update/{id} [PUT]

* Delete Employee  
https://8080-cade1adf-857d-4d7f-87d7-cb72a48eb8c2.ws-ap0.gitpod.io/employee/{id} [DELETE]

The additional requirement have been fullfilled as below:  

* Provide another endpoint to get only one employee  
https://8080-cade1adf-857d-4d7f-87d7-cb72a48eb8c2.ws-ap0.gitpod.io/employee/list/{id}

* Add filters to the list endpoint  
Not impletmented yet

* Add pagination to the list endpoint  
https://8080-cade1adf-857d-4d7f-87d7-cb72a48eb8c2.ws-ap0.gitpod.io/employee/listall?size=2&page=2&sort=id,desc
