package override

    interface MyTrait {
        fun foo()
    }

    abstract class MyAbstractClass {
        abstract fun bar()
    }

    open class MyClass : MyTrait, MyAbstractClass() {
        override fun foo() {}
        override fun bar() {}
    }

    class MyChildClass : MyClass() {}

    <error descr="[ABSTRACT_MEMBER_NOT_IMPLEMENTED] Class MyIllegalClass is not abstract and does not implement abstract member org.jetbrains.kotlin.fir.declarations.impl.FirSimpleFunctionImpl@dae9e3: public abstract fun override/MyTrait.foo(): R|kotlin/Unit|
">class MyIllegalClass</error> : MyTrait, MyAbstractClass() {}

    <error descr="[ABSTRACT_CLASS_MEMBER_NOT_IMPLEMENTED] Class MyIllegalClass2 is not abstract and does not implement abstract base class member org.jetbrains.kotlin.fir.declarations.impl.FirSimpleFunctionImpl@62434f8c: public abstract fun override/MyAbstractClass.bar(): R|kotlin/Unit|
">class MyIllegalClass2</error> : MyTrait, MyAbstractClass() {
        override fun foo() {}
    }

    <error descr="[ABSTRACT_MEMBER_NOT_IMPLEMENTED] Class MyIllegalClass3 is not abstract and does not implement abstract member org.jetbrains.kotlin.fir.declarations.impl.FirSimpleFunctionImpl@dae9e3: public abstract fun override/MyTrait.foo(): R|kotlin/Unit|
">class MyIllegalClass3</error> : MyTrait, MyAbstractClass() {
        override fun bar() {}
    }

    <error descr="[ABSTRACT_CLASS_MEMBER_NOT_IMPLEMENTED] Class MyIllegalClass4 is not abstract and does not implement abstract base class member org.jetbrains.kotlin.fir.declarations.impl.FirSimpleFunctionImpl@62434f8c: public abstract fun override/MyAbstractClass.bar(): R|kotlin/Unit|
">class MyIllegalClass4</error> : MyTrait, MyAbstractClass() {
        fun foo() {}
        override fun other() {}
    }

    class MyChildClass1 : MyClass() {
        fun foo() {}
        override fun bar() {}
    }
