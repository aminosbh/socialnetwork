# Social Network Java Project

The `Social Network Java Project` is a training project that aims to help
students improve their Java programming skills and learn new programming
concepts and techniques.

This tutorial is divided into chapters. Each one of them will implement a part
of the project and let you learn a unique programming technique.

This tutorial is managed with [git][] which means that you can go through the
different commits to lean about the different steps and development decisions.
Each commit is self-documented.


## **Chapter 0:** Create a Maven project

This project uses [Maven][] as a build system and [Eclipse][Eclipse IDE] as
a main IDE.


## **Chapter 1:** Contacts management

In this chapter, we are going to implement the `Contacts management` module.  
We'll start by declaring the different necessary entities (classes, interfaces,
enumerations). This list will be enriched with further entities while developing
the other modules of this project.

### Coding style:

The implementation of our project should follows the [Google Coding Style][].
We can also find some details about that coding style in a [document][Twitter Coding Style]
written by Twitter as part of its [Java common libraries][Twitter common libraries]

### Best practices:

- Choosing the right collections
- Always using interface type when declaring a collection.
- Use generic type and diamond operator
- Specify initial capacity of a collection if possible
- Prefer `isEmpty()` over `size()`
- Do not use the classic for loop
- etc

[For more details][Collections and Generics Best Practices]

### Entities implementation

    class User implements ContactItem:
        login
        password
        firstName
        lastName
        dateOfBirth: Date
        gender: Gender
        photos: List<Photo>
        locations: List<Location>
        emails: List<Email>
        phoneNumbers: List<PhoneNumber>
        contacts: List<ContactItem>

    enum Gender:
        MALE, FEMALE

    class Photo:
        uri: URI
        title

    class Location:
        country
        address
        label

    class Email:
        address
        label

    class PhoneNumber:
        countryCallingCode: int
        number: long
        label

    interface ContactItem

    class Group implements ContactItem:
        name
        description
        contacts: List<ContactItem>

### MVC pattern

It's a good practice to follow the [MVC][] design pattern, so it's better that we
move the different entities in a dedicated package `entities`.

You can find a basic implement of the MVC design pattern here:  
https://www.geeksforgeeks.org/mvc-design-pattern

### Repository pattern:

The repository pattern abstracts the data store and enables your business logic
to define read and write operations on a logical level.  
So we'll dedicated a `repositories` package to contain all repository classes.

### Singleton pattern:

The singleton design pattern restricts the instantiation of a class to one
"single" instance. This is useful when exactly one unique object is needed
across the whole system. This will be useful for the repository classes and
later for the database connection handler.



[git]: https://git-scm.com
[Maven]: https://maven.apache.org
[Eclipse IDE]: https://www.eclipse.org
[Google Coding Style]: https://google.github.io/styleguide/javaguide.html
[Twitter Coding Style]: https://github.com/twitter/commons/blob/master/src/java/com/twitter/common/styleguide.md
[Twitter common libraries]: https://github.com/twitter/commons
[Collections and Generics Best Practices]: https://www.codejava.net/java-core/collections/18-java-collections-and-generics-best-practices
[MVC]: https://www.educba.com/what-is-mvc-design-pattern
