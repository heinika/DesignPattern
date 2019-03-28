# 抽象工厂模式

抽象工厂模式（Abstract Factory Pattern）是围绕一个超级工厂创建其他工厂。该超级工厂又称为其他工厂的工厂。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。

在抽象工厂模式中，接口是负责创建一个相关对象的工厂，不需要显式指定它们的类。每个生成的工厂都能按照工厂模式提供对象。

# 意图

提供一个创建一系列 相关或相互依赖对象 的接口，而无需指定他们的具体类。

# 主要解决

主要解决接口的选择问题

# 何时使用

系统的产品有多于一个的产品族，而系统只消费其中某一类产品族。

# 如何解决

在一个产品族中定义多个产品。

# 关键代码

在一个工厂里聚集多个同类产品。

# **应用实例**

工作了，为了参加一些聚会，肯定有两套或多套衣服吧，比如说有商务装（成套，一系列具体产品）、时尚装（成套，一系列具体产品），甚至对于一个家庭来说，可能有商务女装、商务男装、时尚女装、时尚男装，这些也都是成套的，即一系列具体产品。假设一种情况（现实中是不存在的，要不然，没法进入共产主义了，但有利于说明抽象工厂模式），在您的家中，某一个衣柜（具体工厂）只能存放某一种这样的衣服（成套，一系列具体产品），每次拿这种成套的衣服时也自然要从这个衣柜中取出了。用 OO 的思想去理解，所有的衣柜（具体工厂）都是衣柜类的（抽象工厂）某一个，而每一件成套的衣服又包括具体的上衣（某一具体产品），裤子（某一具体产品），这些具体的上衣其实也都是上衣（抽象产品），具体的裤子也都是裤子（另一个抽象产品）。

# **优点**

当一个产品族中的多个对象被设计成一起工作时，他能保证客户端只使用一个产品族中的对象。

# 缺点

产品族扩展非常困难，要增加一个系列的某一产品，既要在抽象的 Creator 里加代码，又要在具体的里面加代码。

# **使用场景**

1. QQ 换皮肤，一整套一起换。

2. 生成不同操作系统的程序。

# **注意事项**

产品族难扩展，产品等级易扩展。

# 实现

![抽象工厂模式的 UML 图](../picture/abstractfactory_pattern_uml_diagram.jpg)

[Android 系统源码中的使用](http://nodlee.com/2016/04/27/design-pattern-abstract-factory/)

## 源码中的抽象工厂

### [WebViewFactoryProvider](https://android.googlesource.com/platform/frameworks/base/+/master/core/java/android/webkit/WebViewFactoryProvider.java)/[WebViewChromiumFactoryProvider](https://android.googlesource.com/platform/frameworks/webview/+/idea133/chromium/java/com/android/webview/chromium/WebViewChromiumFactoryProvider.java)

[WebViewFactoryProvider.java](https://android.googlesource.com/platform/frameworks/base/+/master/core/java/android/webkit/WebViewFactoryProvider.java)

```java
public interface WebViewFactoryProvider {
    
    ...
    
    WebViewProvider createWebView(WebView webView, WebView.PrivateAccess privateAccess);
    
    ...

    CookieManager getCookieManager();

    ...
}
```

[WebViewChromiumFactoryProvider.java](https://android.googlesource.com/platform/frameworks/webview/+/idea133/chromium/java/com/android/webview/chromium/WebViewChromiumFactoryProvider.java)

```java
public class WebViewChromiumFactoryProvider implements WebViewFactoryProvider {
    
    @Override
    public WebViewProvider createWebView(WebView webView, 
    	WebView.PrivateAccess privateAccess) {
        WebViewChromium wvc = new WebViewChromium(this, 
        	webView, privateAccess);
        
        ...

        return wvc;
    }
    
    @Override
    public CookieManager getCookieManager() {
        synchronized (mLock) {
            if (mCookieManager == null) {
                
                ...

                mCookieManager = new CookieManagerAdapter(new AwCookieManager());
            }
        }
        return mCookieManager;
    }

    ...
}
```

WebViewFactoryProvider是抽象工厂接口，定义了WebView及周边功能所需要对象的创建方法，这些方法大部分为工厂方法，它们返回的对象类型是抽象的，属于面向接口的编程风格。抽象工厂WebViewFactoryProvider创建的对象有：实现Webview核心功能的WebViewProvider，管理Cookie的CookieManager，地理位置相关的GeolocationPermissions和存储Web表单数据的WebviewDatabase等等。WebViewChromiumFactoryProvider是抽象工厂的具体实现者，它提供“Chromium”主题的产品族，也是目前最新版本Webview正在使用的产品族，在[这里][5]有说明。如果将来有新的浏览器引擎内核出现，那么只需按照WebViewFactoryProvider接口创建该主题下产品，然后替换现有的”Chromium”就可以完成换代，不用改动其他地方任何代码。

## 参考资料

- [维基百科-抽象工厂](https://zh.![img](https://upload.wikimedia.org/wikipedia/commons/thumb/9/9d/Abstract_factory_UML.svg/300px-Abstract_factory_UML.svg.png)wikipedia.org/wiki/%E6%8A%BD%E8%B1%A1%E5%B7%A5%E5%8E%82)

![img](../picture/1280px-Abstract_factory_UML.svg.png)