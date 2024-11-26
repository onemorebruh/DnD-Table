# DnD Table
## DiceRoller
Returns random number between 1 and after d number (d4, d6, etc.) <br>
For example:
``` java
D8 d8 = new D8();
d8.roll()//returns random number from 1 to 8
```

## Redis Integration
Used of saving data in redis database.

Before saving value to redis you have to init repository by
```java
RedisRepositoryImpl repository;
```
than you have to init an object of model. in this case i use `RedisSession` model
```java
RedisSession session = new RedisSession("key", "value");
```
now you can freely add, find and delete records in redis by
```java
repository.add(session);

repository.findOne(key);

reposityry.delete(key);
```

## TODO

### backend
- [ ] sessions
  - [x] redis integration
- [ ] auth
- [x] dice roller
- [ ] saving each game's progress

### database
- [ ] roles
- [ ] users

### frontend
- [ ] implement canvas with movable objects

### design
- [ ] draw design
- [ ] choose color scheme
- [ ] implement design in the front end's interface