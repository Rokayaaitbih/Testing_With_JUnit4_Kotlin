class PrimeNumberChecker {
    fun validate(primeNumber: Int): Boolean {
        for (i in 2 until primeNumber / 2) {
            if (primeNumber % i == 0) {
                return false
            }
        }
        return true
    }
}