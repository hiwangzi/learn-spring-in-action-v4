# 什么是bean的init-method

在Spring框架中，`init-method` 是bean定义中的一个属性，你可以在配置文件中使用它指定一个方法，该方法将在bean的创建和属性赋值之后立即被调用。这通常用于执行一些初始化的代码，比如打开资源或者构建某些必要的内部数据结构。

以下是一个如何使用 `init-method` 的例子:

**XML配置:**
```xml
<bean id="exampleBean" class="com.example.ExampleBean" init-method="init">
    <!-- bean的属性注入 -->
</bean>
```

**Java类:**
```java
package com.example;

public class ExampleBean {

    // bean的属性和setter方法

    public void init() {
        // 进行初始化操作，比如检查资源是否可用等
        System.out.println("Bean is going through init.");
    }
}
```

在上述例子中，`ExampleBean` 类有一个名为 `init` 的方法，它将作为bean的初始化方法。当Spring容器创建 `exampleBean` bean时，它将调用 `init` 方法。

从Spring Framework 5开始，除了使用 `init-method` 属性，还可以使用 `@PostConstruct` 注解来指示初始化方法，这是Java标准（JSR-250）的一部分。这种方式更加简洁，且与Spring的配置方式脱钩，使得代码更加依赖注入风格。

**使用 `@PostConstruct` 注解:**
```java
package com.example;

import javax.annotation.PostConstruct;

public class ExampleBean {

    // bean的属性和setter方法

    @PostConstruct
    public void init() {
        // 进行初始化操作
        System.out.println("Bean is going through init.");
    }
}
```

在这个版本中，`init` 方法上的 `@PostConstruct` 注解告诉Spring，这个方法应该在bean的所有属性被设置后调用，且只调用一次。使用注解的方式，不需要在XML配置文件中指定 `init-method`。