import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class StudentListTest {
    var list: StudentList? = null
    @Before
    @Throws(Exception::class)
    fun setUp() {
        list = StudentList()
    }

    @After
    @Throws(Exception::class)
    fun tearDown() {
        println("After")
    }

    @Test
    fun testAdd() {
        list!!.add("Ali")
        list!!.add("Amal")
        list!!.add("Kamal")
        list!!.add("Amine")
        Assert.assertEquals("Ajout de 4 étudiants à la liste", 4, list!!.sizeOfStudent().toLong())
    }

    @Test
    fun testRemove() {
        list!!.add("Fatima")
        list!!.add("Amine")
        list!!.remove("Amine")
        Assert.assertEquals("Suppression d'un étudiant de la liste", 1, list!!.sizeOfStudent().toLong())
    }

    @Test
    fun removeAll() {
        list!!.removeAll()
    }
}