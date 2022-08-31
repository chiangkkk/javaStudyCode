# Day15
记录一个反射获取方法名

# Day16
记录一个stream分类的demo

# Day17 
Q: SpringBoot 的装配？

A: 通过EnableAutoConfiguration注解，加载
metainfo/spring.factory下的xxxAutoConfiguation
当满足Condition时会自动加载

# Day31
Q: 事务级别

A:
1. 读未提交  脏读 不可重复读 幻读
2. 读已提交 不可重复读 幻读
3. 可重复度  幻读
4. 序列化

脏读 读了别人未提交的更新 
不可重复度 两次读的不一样
幻读 读的数量不一样（另一个事务执行了插入操作）

事务传播机制 
- progration_required 默认传播机制，必须在事务中运行，没有事务则新建事务
- progration_required_new 表示必须在自己的事务中运行，如果当前以及有事务了，则当前事务会被挂起
- progration_support 如果当前有事务，则会在事务中运行
- prograion_not_support 如果当前有事务，则会将事务挂起
- prograiont_never 当前有事务，抛出异常
- progration_mandatory 当前没事务，抛出异常
- progration_nested 有事务，嵌套事务，没有与progration_required 一样


