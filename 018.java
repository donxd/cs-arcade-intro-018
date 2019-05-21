boolean palindromeRearranging(String inputString) {
    char [] letras = inputString.toCharArray();
    Arrays.sort( letras );

    int numeroParejaImpar = 0;
    char letraAnterior = letras[ 0 ];
    int repeticiones = 1;

    for ( int i = 1; i < letras.length; i++ ){
        if ( letraAnterior != letras[ i ] ){

            letraAnterior = letras[ i ];

            if ( repeticiones % 2 != 0 ){
                numeroParejaImpar++;
            }

            repeticiones = 1;

        } else {
            repeticiones++;
        }
    }

    if ( repeticiones % 2 != 0 ){
        numeroParejaImpar++;
    }

    if ( letras.length % 2 == 0 ){

        return numeroParejaImpar == 0;
    }

    return numeroParejaImpar < 2;
}
