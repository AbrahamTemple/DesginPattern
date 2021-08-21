# 装饰器模式

# 案例概括

> 案例场景：不想改动旧版本的功能，从另一个接口添加新版本的功能，之后的迭代版本也如此

```java
    //第一代版本
    Component component = new ConcreteComponent();
    component.operation();

    //第二代版本
    Component component = new ConcreteDecoratorOne(new ConcreteComponent());
    component.operation();

    //第三代版本
    Component component = new ConcreteDecoratorTwo(new ConcreteDecoratorOne(new ConcreteComponent()));
    component.operation();

    ...
```

## 实际工作
 
HttpServletRequestWrapper类的源码应用了装饰者模式

