import org.junit.*

class JUnitAnnotation {
    @Before
    fun before() {
        println("before")
    }

    @After
    fun after() {
        println("after")
    }

    @Test
    fun test() {
        println("test")
    }

    @Ignore
    fun ignoreTest() {
        println("ignore test")
    }

    companion object {
        @BeforeClass
        fun beforeClass() {
            println("before class")
        }

        @AfterClass
        fun afterClass() {
            println("after class")
        }
    }
}