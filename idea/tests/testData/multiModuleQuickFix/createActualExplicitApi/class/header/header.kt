// "Create actual class for module testModule_JVM (JVM)" "true"
// COMPILER_ARGUMENTS: -Xexplicit-api=strict

public expect class <caret>My {
    public fun foo(param: String): Int

    public fun String.bar(y: Double): Boolean

    public fun baz(): Unit

    public constructor(flag: Boolean)

    public val isGood: Boolean

    public var status: Int
}