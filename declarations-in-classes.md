```
visibility generality  return type name
public     static      void        main
```

visibility

| visibility       | who can see this?                          |
| :--------------- | :----------------------------------------- |
| `public`         | everyone                                   |
| `default` ("")   | every class in this package (folder-ish)   |
| `protected`      | this class and its subclasses              |
| `private`        | this class                                 |

generality

| generality          | description                                                           |
| :------------------ | :-------------------------------------------------------------------- |
| `static`            | (static/class method) something that is the same for all dogs         |
| `non-static` ("")   | (non-static/instance method) something that differs from dog to dog   |
