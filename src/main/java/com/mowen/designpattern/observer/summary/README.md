# 第二章 观察者模式(Observer Pattern)
---

### 定义:
> 定义了对象之间的一对多依赖,这样一来,当一个对象改变状态时,它的所有依赖者都能收到通知并自动更新.

### 设计原则:
- 为了交互对象之间的松耦合设计而努力;

---

### 缘由与思考:
观察者模式提供了一种让主题和观察者之间松耦合的设计  
主题只知道观察者实现了某个接口（即依赖于抽象），并不知道观察者具体的类，从而将对象之间的互相依赖降低的最低。  

Java本身提供了对观察者的支持，java.util.Observable(主题)类，java.util.Observer接口  
Observable是一个类而不是接口，这就限制了其的复用，但由于其实现封装了notifyObservers()等方法，所以其又必须时类而不是接口，各有优劣。  

java.util.Observer中的update方法可以使获取消息有推拉之分，如果想用主题推送消息，则赋值arg，如果想让观察者自己拉信息，则赋值o,这样可以使用o.getXXX拉取信息，同时可以区分不同的Observable，至于拉取的选择具体问题具体分析了  
            
     void update(Observable o, Object arg);
     
---

![Observer](./Observer.jpg)
     