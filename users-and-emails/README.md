# Users and Emails

## Description
This project contains a small HTTP server. Don't worry about not knowing anything related to the framework. You can ask as many questions as you want.

The server stores Users. A User has an identifier, a name and an email.

You can create, fetch and delete (but not update) users.

## Overview
This project has the following structure
```
.
├── Application.java
├── controllers
│   ├── UserController.java
│   └── UsersController.java
├── domain
│   ├── Backend.java
│   ├── User.java
│   └── repository
│       ├── UserRepository.java
│       └── UsersRepository.java
├── dto
│   └── UserCreationRequest.java
└── infrastructure
    ├── InMemoryUserRepository.java
    └── InMemoryUsersRepository.java
```

- `controllers` contain the definitions of our API
- `domain` is where the logic resides. This is also where `repository` is defined (but not implemented!). Repositories are how we interact with our entities
- `dto` contains whatever entities we need to define and map in our requests
- `infrastructure` contains the implementations of our repositories, so the persistence stays separated from our core business logic

## Task A: Update users
Implement an update endpoint so a user can have its name and email updated.

## Task B: Fetch users (and filter by email domain)
Implement a GET `/users?emailDomain=[null|domain]` endpoint. If `emailDomain` is null then the endpoint must return all users. If some domain was passed as a query parameter, then only users whose emails end with the given domain will be returned.

For instance, if our DB contains users with the following emails:
```
sergio@streamsets.com
joan@streamsets.com
grzegorz@streamsets.com
cat@house.com
goat@farm.com
```

`/users?emailDomain=streamsets.com` should return

```
sergio@streamsets.com
joan@streamsets.com
grzegorz@streamsets.com
```

And exclude `cat@house.com` and `goat@farm.com`.

- Bonus: should the endpoint return ALL users matching our search in a single call? What are the potential inconveniences? What can be done about it?

