Outline Of Hibernate:=
CRUD Operations
This section covers how to perform basic CRUD (Create, Read, Update, Delete) operations using Hibernate:= 

Create: Learn how to save new entities to the database.
Read: Retrieve and query existing entities.
Update: Modify and update entities in the database.
Delete: Remove entities from the database.


Hibernate Mappings:=
Understanding Hibernate mappings is crucial for defining relationships between entities.

One-to-One Mapping
Learn how to create a one-to-one relationship between two entities, where each entity instance is related to exactly one instance of the other entity.

One-to-Many Mapping
Explore how to set up a one-to-many relationship, where a single entity instance can be related to multiple instances of another entity.

Many-to-One Mapping
Understand how to establish a many-to-one relationship, where multiple instances of an entity are related to a single instance of another entity.

Many-to-Many Mapping
Discover how to configure a many-to-many relationship, where multiple instances of one entity are related to multiple instances of another entity.


Summary:=

Create: save(), **persist()
Read: **get(), load(), HQL queries
Update: update(), **merge()
Delete: delete(), **remove() HQL queries

NOTE: ** Represents the recommanded methods for use.

One-to-One Mapping: @OneToOne()
One-to-Many Mapping: @OneToMany()
Many-to-One Mapping: @ManyToOne()
Many-to-Many Mapping: @ManyToMany()

### **Hibernate Annotations**

1. **`@Entity`**: Marks a class as an entity, which will be mapped to a database table.
   
2. **`@Table`**: Specifies the name of the database table to which the entity is mapped. If not specified, Hibernate uses the entity class name.

3. **`@Id`**: Denotes the primary key of an entity.

4. **`@GeneratedValue`**: Specifies the strategy for generating primary key values. Strategies include `AUTO`, `IDENTITY`, `SEQUENCE`, and `TABLE`.

5. **`@Column`**: Defines the details of the column in the database table, such as name, length, nullable, etc.

6. **`@Transient`**: Marks a field as not being persisted in the database.

7. **`@OneToOne`**: Specifies a one-to-one relationship between two entities.

8. **`@OneToMany`**: Specifies a one-to-many relationship where one entity is associated with multiple instances of another entity.

9. **`@ManyToOne`**: Specifies a many-to-one relationship where multiple instances of an entity are associated with a single instance of another entity.

10. **`@ManyToMany`**: Specifies a many-to-many relationship where multiple instances of one entity are associated with multiple instances of another entity.

11. **`@JoinColumn`**: Specifies a column for joining an entity association. Used with `@ManyToOne`, `@OneToOne`, and `@JoinTable`.

12. **`@JoinTable`**: Specifies the join table for many-to-many relationships, including join column names.

13. **`@Embeddable`**: Marks a class whose instances are stored as part of an entity in the database table.

14. **`@Embedded`**: Used to include an `@Embeddable` object within an entity.

15. **`@ElementCollection`**: Defines a collection of basic or embeddable types.

16. **`@Lob`**: Specifies that the annotated field should be treated as a large object (LOB), used for large text or binary data.

17. **`@Fetch`**: Specifies the fetch strategy for associations. Types include `FetchType.LAZY` and `FetchType.EAGER`.

18. **`@OrderBy`**: Specifies the order in which the elements of a collection are fetched from the database.

19. **`@SqlResultSetMapping`**: Defines a mapping between a SQL query result set and an entity or DTO.

20. **`@NamedQuery`**: Defines a static query with a name that can be referenced later in the code.

21. **`@NamedNativeQuery`**: Defines a native SQL query with a name that can be referenced later in the code.

22. **`@PostPersist`**: Callback annotation invoked after an entity has been persisted (inserted) into the database.

23. **`@PostUpdate`**: Callback annotation invoked after an entity has been updated in the database.

24. **`@PostRemove`**: Callback annotation invoked after an entity has been removed (deleted) from the database.

25. **`@PostLoad`**: Callback annotation invoked after an entity has been loaded from the database.

26. **`@PrePersist`**: Callback annotation invoked before an entity is persisted (inserted) into the database.

27. **`@PreUpdate`**: Callback annotation invoked before an entity is updated in the database.

28. **`@PreRemove`**: Callback annotation invoked before an entity is removed (deleted) from the database.

29. **`@PreLoad`**: Callback annotation invoked before an entity is loaded from the database.

30. **`@SequenceGenerator`**: Defines a primary key sequence generator for entity primary keys.

31. **`@TableGenerator`**: Defines a table-based primary key generator.

32. **`@GeneratorType`**: Defines a custom generator for primary key values.

33. **`@UniqueConstraint`**: Defines a unique constraint on columns in the database table.

34. **`@SecondaryTable`**: Maps an entity to multiple tables, specifying additional tables for the entity.

35. **`@AttributeOverride`**: Overrides the default mapping of attributes in an embedded class.

36. **`@AssociationOverride`**: Overrides the default mapping of associations in an embedded class.

These annotations cover most of the common use cases for mapping entities and managing relationships in Hibernate.
