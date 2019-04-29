# 第一章笔记

## 概述

* Spring框架是以简化Java EE应用程序的开发为目标而创建的。
* 为了降低Java开发的复杂性，Spring采取了以下4种关键策略:
  * 基于POJO的轻量级和最小侵入性编程; 
  * 通过依赖注入和面向接口实现松耦合; 
  * 基于切面和惯例进行声明式编程; 
  * 通过切面和模板减少样板式代码。

## 依赖注入

* 耦合具有两面性(two-headed beast)，耦合是必须的，但应当被小心谨慎地管理：
  * 一方面，紧密耦合的代码难以测试、难以复用、难以理解，并且典型地表现出“打地鼠”式的bug特性(修复一个bug，将会出现一个或者更多新的bug)。
  * 另一方面，一定程度的耦合又是必须的——完全没有耦合的代码什么也做不了。为了完成有实际意义的功能，不同的类必须以适当的方式进行交互。
* DI所带来的最大收益——松耦合。如果一个对象只通过接口(而不是具体实现或初始化过程)来表明依赖关系，那么这种依赖就能够在对象本身毫不知情的情况下，用不同的具体实现进行替换（[例如 BraveKnight 关联 Quest](https://github.com/zill057/learn-spring-in-action/blob/ae30c84b9f26e6eeeec7170c3f92369ec0f10277/chapter1/src/main/java/knight/impl/BraveKnight.java#L10)）。
* 创建应用组件之间协作的行为通常称为装配（wiring）
  * [基于 XML 的配置](https://github.com/zill057/learn-spring-in-action/blob/084d96870ddb2bc032c5f23db13ebc49c6f72d75/chapter1/src/main/resources/knights.xml)
  * [基于 Java 的配置]()
