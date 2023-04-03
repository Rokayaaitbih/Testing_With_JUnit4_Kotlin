import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import java.util.*

@RunWith(Parameterized::class)
class PrimeNumberCheckerTest    // Chaque paramètre doit être placé comme un argument ici.
// Chaque fois que le runner se déclenche, il passe les arguments
// à partir des paramètres définis dans la méthode primeNumbers().
    (
    private val numeroEntree: Int,
    private val resultatAttendu: Boolean
) {
    private var primeNumberChecker: PrimeNumberChecker? = null
    @Before
    fun initialize() {
        primeNumberChecker = PrimeNumberChecker()
    }

    // Ce test sera exécuté 7 fois puisque nous avons 7 paramètres définis.
    @Test
    fun testPrimeNumberChecker() {
        println("Nombre paramétré est : $numeroEntree")
        Assert.assertEquals(resultatAttendu, primeNumberChecker!!.validate(numeroEntree))
    }

    companion object {
        @Parameterized.Parameters
        fun primeNumbers(): Collection<*> {
            return Arrays.asList(
                *arrayOf(
                    arrayOf<Any>(2, true),
                    arrayOf<Any>(6, false),
                    arrayOf<Any>(19, true),
                    arrayOf<Any>(22, false),
                    arrayOf<Any>(23, true),
                    arrayOf<Any>(73, true),
                    arrayOf<Any>(121, false)
                )
            )
        }
    }
}