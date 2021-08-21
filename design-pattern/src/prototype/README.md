# 原型模式

## 对象的拷贝

> 假如想实例n个相同对象，直接new实例n个是不太合理的

- 用克隆机制（Clone）对实例对象进行拷贝

## 深拷贝

> 原始对象中的成员对象值改变会导致克隆对象值改变

> 所以直接返回super.clone()是不够的

- 虽然对象本身是独立，但对象的成员对象却是共享的

- 所以作为成员变量的对象也必须经过克隆

## 序列化深拷贝

> 假如有多层这样的成员对象，每一个都克隆会十分麻烦

- 优化：在复杂的清空可用java序列化实现深拷贝

- 缺点：是CPU运行的，性能会被消耗，相对会慢