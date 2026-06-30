# Difference between JPA, Hibernate, and Spring Data JPA

| Feature | JPA | Hibernate | Spring Data JPA |
|---------|-----|-----------|-----------------|
| Type | Specification | ORM Framework | Spring Module |
| Developed By | Jakarta EE | Hibernate | Spring |
| Purpose | Defines ORM standards | Implements JPA | Simplifies JPA usage |
| CRUD Operations | Manual | Manual | Automatic using Repository |
| Query Language | JPQL | HQL & JPQL | Derived Queries, JPQL |
| Boilerplate Code | More | Moderate | Very Less |
| Dependency | API | JPA Implementation | Built on JPA |

## Conclusion

- JPA is a specification for ORM.
- Hibernate is a popular implementation of JPA.
- Spring Data JPA builds on JPA and Hibernate to reduce boilerplate code by providing repository interfaces and automatic CRUD operations.